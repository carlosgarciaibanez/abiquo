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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.23 at 01:07:44 PM CET 
//


package org.dmtf.schemas.wbem.wscim._1.cim_schema._2.cim_resourceallocationsettingdata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.dmtf.schemas.wbem.wscim._1.common.CimBoolean;
import org.dmtf.schemas.wbem.wscim._1.common.CimString;
import org.dmtf.schemas.wbem.wscim._1.common.CimUnsignedInt;
import org.dmtf.schemas.wbem.wscim._1.common.CimUnsignedLong;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.dmtf.schemas.wbem.wscim._1.cim_schema._2.cim_resourceallocationsettingdata package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ElementName_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "ElementName");
    private final static QName _CIMResourceAllocationSettingData_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "CIM_ResourceAllocationSettingData");
    private final static QName _PoolID_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "PoolID");
    private final static QName _Weight_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "Weight");
    private final static QName _AddressOnParent_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "AddressOnParent");
    private final static QName _Parent_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "Parent");
    private final static QName _ResourceSubType_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "ResourceSubType");
    private final static QName _Limit_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "Limit");
    private final static QName _AutomaticAllocation_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "AutomaticAllocation");
    private final static QName _ChangeableType_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "ChangeableType");
    private final static QName _Reservation_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "Reservation");
    private final static QName _OtherResourceType_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "OtherResourceType");
    private final static QName _Connection_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "Connection");
    private final static QName _Caption_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "Caption");
    private final static QName _ConfigurationName_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "ConfigurationName");
    private final static QName _ResourceType_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "ResourceType");
    private final static QName _ConsumerVisibility_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "ConsumerVisibility");
    private final static QName _AllocationUnits_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "AllocationUnits");
    private final static QName _Generation_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "Generation");
    private final static QName _VirtualQuantity_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "VirtualQuantity");
    private final static QName _InstanceID_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "InstanceID");
    private final static QName _HostResource_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "HostResource");
    private final static QName _Description_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "Description");
    private final static QName _AutomaticDeallocation_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "AutomaticDeallocation");
    private final static QName _MappingBehavior_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "MappingBehavior");
    private final static QName _Address_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", "Address");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.dmtf.schemas.wbem.wscim._1.cim_schema._2.cim_resourceallocationsettingdata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsumerVisibility }
     * 
     */
    public ConsumerVisibility createConsumerVisibility() {
        return new ConsumerVisibility();
    }

    /**
     * Create an instance of {@link MappingBehavior }
     * 
     */
    public MappingBehavior createMappingBehavior() {
        return new MappingBehavior();
    }

    /**
     * Create an instance of {@link ChangeableType }
     * 
     */
    public ChangeableType createChangeableType() {
        return new ChangeableType();
    }

    /**
     * Create an instance of {@link Caption }
     * 
     */
    public Caption createCaption() {
        return new Caption();
    }

    /**
     * Create an instance of {@link CIMResourceAllocationSettingDataType }
     * 
     */
    public CIMResourceAllocationSettingDataType createCIMResourceAllocationSettingDataType() {
        return new CIMResourceAllocationSettingDataType();
    }

    /**
     * Create an instance of {@link ResourceType }
     * 
     */
    public ResourceType createResourceType() {
        return new ResourceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "ElementName")
    public JAXBElement<CimString> createElementName(CimString value) {
        return new JAXBElement<CimString>(_ElementName_QNAME, CimString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CIMResourceAllocationSettingDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "CIM_ResourceAllocationSettingData")
    public JAXBElement<CIMResourceAllocationSettingDataType> createCIMResourceAllocationSettingData(CIMResourceAllocationSettingDataType value) {
        return new JAXBElement<CIMResourceAllocationSettingDataType>(_CIMResourceAllocationSettingData_QNAME, CIMResourceAllocationSettingDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "PoolID")
    public JAXBElement<CimString> createPoolID(CimString value) {
        return new JAXBElement<CimString>(_PoolID_QNAME, CimString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimUnsignedInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "Weight")
    public JAXBElement<CimUnsignedInt> createWeight(CimUnsignedInt value) {
        return new JAXBElement<CimUnsignedInt>(_Weight_QNAME, CimUnsignedInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "AddressOnParent")
    public JAXBElement<CimString> createAddressOnParent(CimString value) {
        return new JAXBElement<CimString>(_AddressOnParent_QNAME, CimString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "Parent")
    public JAXBElement<CimString> createParent(CimString value) {
        return new JAXBElement<CimString>(_Parent_QNAME, CimString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "ResourceSubType")
    public JAXBElement<CimString> createResourceSubType(CimString value) {
        return new JAXBElement<CimString>(_ResourceSubType_QNAME, CimString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimUnsignedLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "Limit")
    public JAXBElement<CimUnsignedLong> createLimit(CimUnsignedLong value) {
        return new JAXBElement<CimUnsignedLong>(_Limit_QNAME, CimUnsignedLong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimBoolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "AutomaticAllocation")
    public JAXBElement<CimBoolean> createAutomaticAllocation(CimBoolean value) {
        return new JAXBElement<CimBoolean>(_AutomaticAllocation_QNAME, CimBoolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "ChangeableType")
    public JAXBElement<ChangeableType> createChangeableType(ChangeableType value) {
        return new JAXBElement<ChangeableType>(_ChangeableType_QNAME, ChangeableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimUnsignedLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "Reservation")
    public JAXBElement<CimUnsignedLong> createReservation(CimUnsignedLong value) {
        return new JAXBElement<CimUnsignedLong>(_Reservation_QNAME, CimUnsignedLong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "OtherResourceType")
    public JAXBElement<CimString> createOtherResourceType(CimString value) {
        return new JAXBElement<CimString>(_OtherResourceType_QNAME, CimString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "Connection")
    public JAXBElement<CimString> createConnection(CimString value) {
        return new JAXBElement<CimString>(_Connection_QNAME, CimString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Caption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "Caption")
    public JAXBElement<Caption> createCaption(Caption value) {
        return new JAXBElement<Caption>(_Caption_QNAME, Caption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "ConfigurationName")
    public JAXBElement<CimString> createConfigurationName(CimString value) {
        return new JAXBElement<CimString>(_ConfigurationName_QNAME, CimString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "ResourceType")
    public JAXBElement<ResourceType> createResourceType(ResourceType value) {
        return new JAXBElement<ResourceType>(_ResourceType_QNAME, ResourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumerVisibility }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "ConsumerVisibility")
    public JAXBElement<ConsumerVisibility> createConsumerVisibility(ConsumerVisibility value) {
        return new JAXBElement<ConsumerVisibility>(_ConsumerVisibility_QNAME, ConsumerVisibility.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "AllocationUnits")
    public JAXBElement<CimString> createAllocationUnits(CimString value) {
        return new JAXBElement<CimString>(_AllocationUnits_QNAME, CimString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimUnsignedLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "Generation")
    public JAXBElement<CimUnsignedLong> createGeneration(CimUnsignedLong value) {
        return new JAXBElement<CimUnsignedLong>(_Generation_QNAME, CimUnsignedLong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimUnsignedLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "VirtualQuantity")
    public JAXBElement<CimUnsignedLong> createVirtualQuantity(CimUnsignedLong value) {
        return new JAXBElement<CimUnsignedLong>(_VirtualQuantity_QNAME, CimUnsignedLong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "InstanceID")
    public JAXBElement<CimString> createInstanceID(CimString value) {
        return new JAXBElement<CimString>(_InstanceID_QNAME, CimString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "HostResource")
    public JAXBElement<CimString> createHostResource(CimString value) {
        return new JAXBElement<CimString>(_HostResource_QNAME, CimString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "Description")
    public JAXBElement<CimString> createDescription(CimString value) {
        return new JAXBElement<CimString>(_Description_QNAME, CimString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimBoolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "AutomaticDeallocation")
    public JAXBElement<CimBoolean> createAutomaticDeallocation(CimBoolean value) {
        return new JAXBElement<CimBoolean>(_AutomaticDeallocation_QNAME, CimBoolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MappingBehavior }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "MappingBehavior")
    public JAXBElement<MappingBehavior> createMappingBehavior(MappingBehavior value) {
        return new JAXBElement<MappingBehavior>(_MappingBehavior_QNAME, MappingBehavior.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData", name = "Address")
    public JAXBElement<CimString> createAddress(CimString value) {
        return new JAXBElement<CimString>(_Address_QNAME, CimString.class, null, value);
    }

}
