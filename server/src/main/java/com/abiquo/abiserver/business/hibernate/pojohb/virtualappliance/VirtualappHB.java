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

package com.abiquo.abiserver.business.hibernate.pojohb.virtualappliance;

// Generated 16-oct-2008 16:52:14 by Hibernate Tools 3.2.1.GA

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import com.abiquo.abiserver.business.hibernate.pojohb.IPojoHB;
import com.abiquo.abiserver.business.hibernate.pojohb.infrastructure.StateEnum;
import com.abiquo.abiserver.business.hibernate.pojohb.user.EnterpriseHB;
import com.abiquo.abiserver.pojo.infrastructure.State;
import com.abiquo.abiserver.pojo.virtualappliance.Log;
import com.abiquo.abiserver.pojo.virtualappliance.Node;
import com.abiquo.abiserver.pojo.virtualappliance.VirtualAppliance;

/**
 * Virtualapp generated by hbm2java
 */
public class VirtualappHB implements java.io.Serializable, IPojoHB<VirtualAppliance>
{

    private static final long serialVersionUID = 4088733370483687503L;

    private Integer idVirtualApp;

    private StateEnum state;

    private StateEnum subState;

    private String name;

    private int public_;

    private Collection<NodeHB< ? >> nodesHB;

    private String nodeConnections;

    private int highDisponibility;

    /**
     * 0 - No errors 1 - There are errors
     */
    private Integer error;

    /**
     * The virtualDataCenter identification.
     */
    private VirtualDataCenterHB virtualDataCenterHB;

    /**
     * The Enterprise to which this Virtual Appliance belongs
     */
    private EnterpriseHB enterpriseHB;

    /**
     * LogHB list, with the log entries for this Virtual Appliance
     * 
     * @return
     */
    private Set<LogHB> logsHB;

    public Integer getIdVirtualApp()
    {
        return idVirtualApp;
    }

    public void setIdVirtualApp(Integer idVirtualApp)
    {
        this.idVirtualApp = idVirtualApp;
    }

    public StateEnum getState()
    {
        return state;
    }

    public void setState(StateEnum state)
    {
        this.state = state;
    }

    /**
     * @param subState the subState to set
     */
    public void setSubState(StateEnum subState)
    {
        this.subState = subState;
    }

    /**
     * @return the subState
     */
    public StateEnum getSubState()
    {
        return subState;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPublic_()
    {
        return public_;
    }

    public void setPublic_(int public_)
    {
        this.public_ = public_;
    }

    public int getHighDisponibility()
    {
        return highDisponibility;
    }

    public void setHighDisponibility(int highDisponibility)
    {
        this.highDisponibility = highDisponibility;
    }

    public Integer getError()
    {
        return error;
    }

    public void setError(Integer error)
    {
        this.error = error;
    }

    public VirtualDataCenterHB getVirtualDataCenterHB()
    {
        return virtualDataCenterHB;
    }

    public void setVirtualDataCenterHB(VirtualDataCenterHB virtualDataCenterHB)
    {
        this.virtualDataCenterHB = virtualDataCenterHB;
    }

    public EnterpriseHB getEnterpriseHB()
    {
        return enterpriseHB;
    }

    public void setEnterpriseHB(EnterpriseHB enterpriseHB)
    {
        this.enterpriseHB = enterpriseHB;
    }

    public Collection<NodeHB< ? >> getNodesHB()
    {
        return nodesHB;
    }

    public void setNodesHB(Collection<NodeHB< ? >> nodesHB)
    {
        this.nodesHB = nodesHB;
    }

    public String getNodeConnections()
    {
        return nodeConnections;
    }

    public void setNodeConnections(String nodeConnections)
    {
        this.nodeConnections = nodeConnections;
    }

    public Set<LogHB> getLogsHB()
    {
        return logsHB;
    }

    public void setLogsHB(Set<LogHB> logsHB)
    {
        this.logsHB = logsHB;
    }

    /**
     * This method transform the hibernate pojo to normal pojo object
     */
    public VirtualAppliance toPojo()
    {
        VirtualAppliance virtualAppliance = new VirtualAppliance();
        virtualAppliance.setHighDisponibility(highDisponibility != 0);
        virtualAppliance.setId(idVirtualApp);
        virtualAppliance.setIsPublic(public_ != 0);
        virtualAppliance.setName(name);
        virtualAppliance.setState(new State(state));
        virtualAppliance.setSubState(new State(subState));
        virtualAppliance.setError(error != 0);
        virtualAppliance.setVirtualDataCenter(virtualDataCenterHB != null ? virtualDataCenterHB
                .toPojo() : null);
        virtualAppliance.setNodeConnections(nodeConnections);

        if (enterpriseHB != null)
        {
            virtualAppliance.setEnterprise(enterpriseHB.toPojo());
        }

        if (logsHB != null)
        {
            ArrayList<Log> logs = new ArrayList<Log>();
            for (LogHB logHB : logsHB)
            {
                logs.add(logHB.toPojo());
            }

            virtualAppliance.setLogs(logs);
        }
        else
        {
            virtualAppliance.setLogs(null);
        }

        if (nodesHB != null)
        {
            ArrayList<Node> nodes = new ArrayList<Node>();
            for (NodeHB< ? > nodeHB : nodesHB)
            {
                nodes.add(nodeHB.toPojo());
            }

            virtualAppliance.setNodes(nodes);
        }/*
          * else { virtualAppliance.setNodes(null); }
          */

        return virtualAppliance;
    }

}
