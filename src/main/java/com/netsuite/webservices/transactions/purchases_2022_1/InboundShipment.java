
package com.netsuite.webservices.transactions.purchases_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.core_2022_1.CustomFieldList;
import com.netsuite.webservices.platform.core_2022_1.Record;
import com.netsuite.webservices.platform.core_2022_1.RecordRef;
import com.netsuite.webservices.transactions.purchases_2022_1.types.InboundShipmentShipmentStatus;


/**
 * <p>Java class for InboundShipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InboundShipment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customForm" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="shipmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="externalDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipmentStatus" type="{urn:types.purchases_2022_1.transactions.webservices.netsuite.com}InboundShipmentShipmentStatus" minOccurs="0"/&gt;
 *         &lt;element name="expectedShippingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="actualShippingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="expectedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="actualDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="shipmentMemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vesselNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billOfLading" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="landedCostList" type="{urn:purchases_2022_1.transactions.webservices.netsuite.com}InboundShipmentLandedCostList" minOccurs="0"/&gt;
 *         &lt;element name="itemsList" type="{urn:purchases_2022_1.transactions.webservices.netsuite.com}InboundShipmentItemsList" minOccurs="0"/&gt;
 *         &lt;element name="shipmentBaseCurrency" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="customFieldList" type="{urn:core_2022_1.platform.webservices.netsuite.com}CustomFieldList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InboundShipment", propOrder = {
    "customForm",
    "shipmentNumber",
    "externalDocumentNumber",
    "shipmentStatus",
    "expectedShippingDate",
    "actualShippingDate",
    "expectedDeliveryDate",
    "actualDeliveryDate",
    "shipmentMemo",
    "vesselNumber",
    "billOfLading",
    "landedCostList",
    "itemsList",
    "shipmentBaseCurrency",
    "customFieldList"
})
public class InboundShipment
    extends Record
{

    protected RecordRef customForm;
    protected String shipmentNumber;
    protected String externalDocumentNumber;
    @XmlSchemaType(name = "string")
    protected InboundShipmentShipmentStatus shipmentStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedShippingDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualShippingDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedDeliveryDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualDeliveryDate;
    protected String shipmentMemo;
    protected String vesselNumber;
    protected String billOfLading;
    protected InboundShipmentLandedCostList landedCostList;
    protected InboundShipmentItemsList itemsList;
    protected RecordRef shipmentBaseCurrency;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * Gets the value of the customForm property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomForm() {
        return customForm;
    }

    /**
     * Sets the value of the customForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomForm(RecordRef value) {
        this.customForm = value;
    }

    /**
     * Gets the value of the shipmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentNumber() {
        return shipmentNumber;
    }

    /**
     * Sets the value of the shipmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentNumber(String value) {
        this.shipmentNumber = value;
    }

    /**
     * Gets the value of the externalDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalDocumentNumber() {
        return externalDocumentNumber;
    }

    /**
     * Sets the value of the externalDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalDocumentNumber(String value) {
        this.externalDocumentNumber = value;
    }

    /**
     * Gets the value of the shipmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InboundShipmentShipmentStatus }
     *     
     */
    public InboundShipmentShipmentStatus getShipmentStatus() {
        return shipmentStatus;
    }

    /**
     * Sets the value of the shipmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InboundShipmentShipmentStatus }
     *     
     */
    public void setShipmentStatus(InboundShipmentShipmentStatus value) {
        this.shipmentStatus = value;
    }

    /**
     * Gets the value of the expectedShippingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedShippingDate() {
        return expectedShippingDate;
    }

    /**
     * Sets the value of the expectedShippingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedShippingDate(XMLGregorianCalendar value) {
        this.expectedShippingDate = value;
    }

    /**
     * Gets the value of the actualShippingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualShippingDate() {
        return actualShippingDate;
    }

    /**
     * Sets the value of the actualShippingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualShippingDate(XMLGregorianCalendar value) {
        this.actualShippingDate = value;
    }

    /**
     * Gets the value of the expectedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    /**
     * Sets the value of the expectedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDeliveryDate(XMLGregorianCalendar value) {
        this.expectedDeliveryDate = value;
    }

    /**
     * Gets the value of the actualDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    /**
     * Sets the value of the actualDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDeliveryDate(XMLGregorianCalendar value) {
        this.actualDeliveryDate = value;
    }

    /**
     * Gets the value of the shipmentMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentMemo() {
        return shipmentMemo;
    }

    /**
     * Sets the value of the shipmentMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentMemo(String value) {
        this.shipmentMemo = value;
    }

    /**
     * Gets the value of the vesselNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselNumber() {
        return vesselNumber;
    }

    /**
     * Sets the value of the vesselNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselNumber(String value) {
        this.vesselNumber = value;
    }

    /**
     * Gets the value of the billOfLading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillOfLading() {
        return billOfLading;
    }

    /**
     * Sets the value of the billOfLading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillOfLading(String value) {
        this.billOfLading = value;
    }

    /**
     * Gets the value of the landedCostList property.
     * 
     * @return
     *     possible object is
     *     {@link InboundShipmentLandedCostList }
     *     
     */
    public InboundShipmentLandedCostList getLandedCostList() {
        return landedCostList;
    }

    /**
     * Sets the value of the landedCostList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InboundShipmentLandedCostList }
     *     
     */
    public void setLandedCostList(InboundShipmentLandedCostList value) {
        this.landedCostList = value;
    }

    /**
     * Gets the value of the itemsList property.
     * 
     * @return
     *     possible object is
     *     {@link InboundShipmentItemsList }
     *     
     */
    public InboundShipmentItemsList getItemsList() {
        return itemsList;
    }

    /**
     * Sets the value of the itemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InboundShipmentItemsList }
     *     
     */
    public void setItemsList(InboundShipmentItemsList value) {
        this.itemsList = value;
    }

    /**
     * Gets the value of the shipmentBaseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShipmentBaseCurrency() {
        return shipmentBaseCurrency;
    }

    /**
     * Sets the value of the shipmentBaseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShipmentBaseCurrency(RecordRef value) {
        this.shipmentBaseCurrency = value;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldList }
     *     
     */
    public CustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldList }
     *     
     */
    public void setCustomFieldList(CustomFieldList value) {
        this.customFieldList = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

}
