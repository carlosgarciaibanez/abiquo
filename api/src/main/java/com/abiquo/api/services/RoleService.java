/**
 * Abiquo community edition
 * cloud management application for hybrid clouds
 * Copyright (C) 2008-2010 - Abiquo Holdings S.L.
 *
 * This application is free software; you can redistribute it and/or
 * modify it under the terms of the GNU LESSER GENERAL PUBLIC
 * LICENSE as published by the Free Software Foundation under
 * version 3 of the License
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * LESSER GENERAL PUBLIC LICENSE v.3 for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */

package com.abiquo.api.services;

import static com.abiquo.api.util.URIResolver.buildPath;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.ws.rs.core.MultivaluedMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.abiquo.api.exceptions.APIError;
import com.abiquo.api.exceptions.NotFoundException;
import com.abiquo.api.resources.EnterpriseResource;
import com.abiquo.api.resources.EnterprisesResource;
import com.abiquo.api.resources.config.PrivilegeResource;
import com.abiquo.api.resources.config.PrivilegesResource;
import com.abiquo.api.util.URIResolver;
import com.abiquo.model.rest.RESTLink;
import com.abiquo.server.core.enterprise.Enterprise;
import com.abiquo.server.core.enterprise.EnterpriseRep;
import com.abiquo.server.core.enterprise.Privilege;
import com.abiquo.server.core.enterprise.Role;
import com.abiquo.server.core.enterprise.RoleDto;

@Service
@Transactional(readOnly = true)
public class RoleService extends DefaultApiService
{
    @Autowired
    EnterpriseRep enterpriseRep;

    public RoleService()
    {

    }

    // use this to initialize it for tests
    public RoleService(final EntityManager em)
    {
        enterpriseRep = new EnterpriseRep(em);
    }

    public Collection<Role> getRoles()
    {
        return enterpriseRep.findAllRoles();
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public Role addRole(final RoleDto dto)
    {
        RESTLink enterpriseId = dto.searchLink(EnterpriseResource.ENTERPRISE);

        if (enterpriseId == null)
        {
            return addRole(dto, null);
        }
        Enterprise enterprise = findEnterprise(dto);

        if (enterprise == null)
        {
            throw new NotFoundException(APIError.NON_EXISTENT_ENTERPRISE);
        }
        return addRole(dto, enterprise);
    }

    private Enterprise findEnterprise(final RoleDto dto)
    {
        return enterpriseRep.findById(getEnterpriseId(dto));
    }

    private Integer getEnterpriseId(final RoleDto dto)
    {
        RESTLink enterprise = dto.searchLink(EnterpriseResource.ENTERPRISE);

        if (enterprise != null)
        {

            String buildPath =
                buildPath(EnterprisesResource.ENTERPRISES_PATH, EnterpriseResource.ENTERPRISE_PARAM);
            MultivaluedMap<String, String> enterpriseValues =
                URIResolver.resolveFromURI(buildPath, enterprise.getHref());

            if (enterpriseValues == null
                || !enterpriseValues.containsKey(EnterpriseResource.ENTERPRISE))
            {
                throw new NotFoundException(APIError.ROLE_PARAM_NOT_FOUND);
            }

            Integer roleId =
                Integer.valueOf(enterpriseValues.getFirst(EnterpriseResource.ENTERPRISE));
            return roleId;
        }
        return null;
    }

    private List<Integer> getPrivilegeIds(final RoleDto dto)
    {
        List<Integer> idList = new ArrayList<Integer>();
        for (RESTLink rsl : dto.getLinks())
        {
            if (rsl.getRel().contains(PrivilegeResource.PRIVILEGE))
            {
                String buildPath =
                    buildPath(PrivilegesResource.PRIVILEGES_PATH, PrivilegeResource.PRIVILEGE_PARAM);
                MultivaluedMap<String, String> privilegeValues =
                    URIResolver.resolveFromURI(buildPath, rsl.getHref());
                if (privilegeValues == null
                    || !privilegeValues.containsKey(PrivilegeResource.PRIVILEGE))
                {
                    throw new NotFoundException(APIError.PRIVILEGE_PARAM_NOT_FOUND);
                }
                idList.add(Integer.valueOf(privilegeValues.getFirst(PrivilegeResource.PRIVILEGE)));
            }
        }

        return idList;
    }

    public Role addRole(final RoleDto dto, final Enterprise enterprise)
    {

        Role role = new Role(dto.getName(), enterprise);

        if (!role.isValid())
        {
            addValidationErrors(role.getValidationErrors());
            flushErrors();
        }

        enterpriseRep.insertRole(role);
        return role;
    }

    public Role getRole(final Integer id)
    {
        return enterpriseRep.findRoleById(id);
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public Role modifyRole(final Integer roleId, final RoleDto dto)
    {
        Role old = getRole(roleId);
        if (old == null)
        {
            throw new NotFoundException(APIError.NON_EXISTENT_ROLE);
        }

        if (old.isBlocked())
        {
            throw new NotFoundException(APIError.NON_MODIFICABLE_ROLE);
        }

        old.setName(dto.getName());

        if (!old.isValid())
        {
            addValidationErrors(old.getValidationErrors());
            flushErrors();
        }

        Integer entId = getEnterpriseId(dto);
        if (entId != null)
        {
            Enterprise ent = enterpriseRep.findById(entId);
            if (ent == null)
            {
                throw new NotFoundException(APIError.NON_EXISTENT_ENTERPRISE);
            }
            old.setEnterprise(ent);
        }

        old.setPrivileges(new ArrayList<Privilege>());
        if (dto.getLinks() != null)
        {
            for (Integer pId : getPrivilegeIds(dto))
            {
                Privilege p = enterpriseRep.findPrivilegeById(pId);
                if (p == null)
                {
                    throw new NotFoundException(APIError.NON_EXISTENT_PRIVILEGE);
                }
                old.addPrivilege(p);
            }
        }

        enterpriseRep.updateRole(old);
        return old;
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void removeRole(final Integer id)
    {
        Role role = getRole(id);
        if (role == null)
        {
            throw new NotFoundException(APIError.NON_EXISTENT_ROLE);
        }
        enterpriseRep.deleteRole(role);
    }

    private Enterprise findEnterprise(final Integer enterpriseId)
    {
        Enterprise enterprise = enterpriseRep.findById(enterpriseId);
        if (enterprise == null)
        {
            throw new NotFoundException(APIError.NON_EXISTENT_ENTERPRISE);
        }
        return enterprise;
    }

    public Collection<Role> getRolesByEnterprise(final int enterpriseId, final String filter,
        final String order, final boolean desc)
    {
        return getRolesByEnterprise(enterpriseId, filter, order, desc, 0, 25);
    }

    public Collection<Role> getRolesByEnterprise(final int enterpriseId, final String filter,
        final String order, final boolean desc, final Integer page, final Integer numResults)
    {

        Enterprise enterprise = null;
        if (enterpriseId != 0)
        {
            enterprise = findEnterprise(enterpriseId);
        }
        return enterpriseRep.findRolesByEnterprise(enterprise, filter, order, desc, 0, 25);
    }

}
