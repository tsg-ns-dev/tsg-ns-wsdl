
package com.netsuite.webservices.transactions.purchases_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.common_2022_1.InventoryDetail;
import com.netsuite.webservices.platform.core_2022_1.RecordRef;


/**
 * <p>Java class for InboundShipmentItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InboundShipmentItems"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrder" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="shipmentItem" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="shipmentItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="poVendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receivingLocation" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="quantityReceived" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="quantityExpected" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="quantityRemaining" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="unit" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="poRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="expectedRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="shipmentItemExchangeRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="shipmentItemEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="unitLandedCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalUnitCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="shipmentItemAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="poCurrency" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="incoterm" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="inventoryDetail" type="{urn:common_2022_1.platform.webservices.netsuite.com}InventoryDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InboundShipmentItems", propOrder = {
    "id",
    "purchaseOrder",
    "shipmentItem",
    "shipmentItemDescription",
    "poVendor",
    "receivingLocation",
    "quantityReceived",
    "quantityExpected",
    "quantityRemaining",
    "unit",
    "poRate",
    "expectedRate",
    "shipmentItemExchangeRate",
    "shipmentItemEffectiveDate",
    "unitLandedCost",
    "totalUnitCost",
    "shipmentItemAmount",
    "poCurrency",
    "incoterm",
    "inventoryDetail"
})
public class InboundShipmentItems {

    protected Long id;
    protected RecordRef purchaseOrder;
    protected RecordRef shipmentItem;
    protected String shipmentItemDescription;
    protected String poVendor;
    protected RecordRef receivingLocation;
    protected Double quantityReceived;
    protected Double quantityExpected;
    protected Double quantityRemaining;
    protected RecordRef unit;
    protected Double poRate;
    protected Double expectedRate;
    protected Double shipmentItemExchangeRate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipmentItemEffectiveDate;
    protected Double unitLandedCost;
    protected Double totalUnitCost;
    protected Double shipmentItemAmount;
    protected RecordRef poCurrency;
    protected RecordRef incoterm;
    protected InventoryDetail inventoryDetail;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the purchaseOrder property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPurchaseOrder() {
        return purchaseOrder;
    }

    /**
     * Sets the value of the purchaseOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPurchaseOrder(RecordRef value) {
        this.purchaseOrder = value;
    }

    /**
     * Gets the value of the shipmentItem property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShipmentItem() {
        return shipmentItem;
    }

    /**
     * Sets the value of the shipmentItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShipmentItem(RecordRef value) {
        this.shipmentItem = value;
    }

    /**
     * Gets the value of the shipmentItemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentItemDescription() {
        return shipmentItemDescription;
    }

    /**
     * Sets the value of the shipmentItemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentItemDescription(String value) {
        this.shipmentItemDescription = value;
    }

    /**
     * Gets the value of the poVendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoVendor() {
        return poVendor;
    }

    /**
     * Sets the value of the poVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoVendor(String value) {
        this.poVendor = value;
    }

    /**
     * Gets the value of the receivingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getReceivingLocation() {
        return receivingLocation;
    }

    /**
     * Sets the value of the receivingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setReceivingLocation(RecordRef value) {
        this.receivingLocation = value;
    }

    /**
     * Gets the value of the quantityReceived property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityReceived() {
        return quantityReceived;
    }

    /**
     * Sets the value of the quantityReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityReceived(Double value) {
        this.quantityReceived = value;
    }

    /**
     * Gets the value of the quantityExpected property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityExpected() {
        return quantityExpected;
    }

    /**
     * Sets the value of the quantityExpected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityExpected(Double value) {
        this.quantityExpected = value;
    }

    /**
     * Gets the value of the quantityRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityRemaining() {
        return quantityRemaining;
    }

    /**
     * Sets the value of the quantityRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityRemaining(Double value) {
        this.quantityRemaining = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setUnit(RecordRef value) {
        this.unit = value;
    }

    /**
     * Gets the value of the poRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPoRate() {
        return poRate;
    }

    /**
     * Sets the value of the poRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPoRate(Double value) {
        this.poRate = value;
    }

    /**
     * Gets the value of the expectedRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExpectedRate() {
        return expectedRate;
    }

    /**
     * Sets the value of the expectedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExpectedRate(Double value) {
        this.expectedRate = value;
    }

    /**
     * Gets the value of the shipmentItemExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShipmentItemExchangeRate() {
        return shipmentItemExchangeRate;
    }

    /**
     * Sets the value of the shipmentItemExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShipmentItemExchangeRate(Double value) {
        this.shipmentItemExchangeRate = value;
    }

    /**
     * Gets the value of the shipmentItemEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipmentItemEffectiveDate() {
        return shipmentItemEffectiveDate;
    }

    /**
     * Sets the value of the shipmentItemEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipmentItemEffectiveDate(XMLGregorianCalendar value) {
        this.shipmentItemEffectiveDate = value;
    }

    /**
     * Gets the value of the unitLandedCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitLandedCost() {
        return unitLandedCost;
    }

    /**
     * Sets the value of the unitLandedCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitLandedCost(Double value) {
        this.unitLandedCost = value;
    }

    /**
     * Gets the value of the totalUnitCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalUnitCost() {
        return totalUnitCost;
    }

    /**
     * Sets the value of the totalUnitCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalUnitCost(Double value) {
        this.totalUnitCost = value;
    }

    /**
     * Gets the value of the shipmentItemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShipmentItemAmount() {
        return shipmentItemAmount;
    }

    /**
     * Sets the value of the shipmentItemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShipmentItemAmount(Double value) {
        this.shipmentItemAmount = value;
    }

    /**
     * Gets the value of the poCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPoCurrency() {
        return poCurrency;
    }

    /**
     * Sets the value of the poCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPoCurrency(RecordRef value) {
        this.poCurrency = value;
    }

    /**
     * Gets the value of the incoterm property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIncoterm() {
        return incoterm;
    }

    /**
     * Sets the value of the incoterm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIncoterm(RecordRef value) {
        this.incoterm = value;
    }

    /**
     * Gets the value of the inventoryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryDetail }
     *     
     */
    public InventoryDetail getInventoryDetail() {
        return inventoryDetail;
    }

    /**
     * Sets the value of the inventoryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryDetail }
     *     
     */
    public void setInventoryDetail(InventoryDetail value) {
        this.inventoryDetail = value;
    }

}
