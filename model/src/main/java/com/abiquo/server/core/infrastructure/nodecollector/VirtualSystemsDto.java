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
package com.abiquo.server.core.infrastructure.nodecollector;

import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.abiquo.model.transport.WrapperDto;

/**
 * Represents a collection of {@link VirtualSystemDto}.
 * 
 * @author ibarrera
 */
@XmlRootElement(name = "vsc")
public class VirtualSystemsDto extends WrapperDto<VirtualSystemDto>
{
    /** Serial UID. */
    private static final long serialVersionUID = 1L;

    @Override
    @XmlElement(name = "vms")
    public List<VirtualSystemDto> getCollection()
    {
        return collection;
    }

    @Override
    public String getMediaType()
    {
        return MediaType.APPLICATION_XML;
    }
}
