
package com.netsuite.webservices.transactions.purchases_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.core_2022_1.RecordRef;
import com.netsuite.webservices.platform.core_2022_1.RecordRefList;
import com.netsuite.webservices.transactions.purchases_2022_1.types.InboundShipmentLandedCostAllocationMethod;


/**
 * <p>Java class for InboundShipmentLandedCost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InboundShipmentLandedCost"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="landedCostCostCategory" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="landedCostAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="landedCostCurrency" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="landedCostExchangeRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="landedCostEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="landedCostAllocationMethod" type="{urn:types.purchases_2022_1.transactions.webservices.netsuite.com}InboundShipmentLandedCostAllocationMethod" minOccurs="0"/&gt;
 *         &lt;element name="landedCostShipmentItemsList" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InboundShipmentLandedCost", propOrder = {
    "landedCostCostCategory",
    "landedCostAmount",
    "landedCostCurrency",
    "landedCostExchangeRate",
    "landedCostEffectiveDate",
    "landedCostAllocationMethod",
    "landedCostShipmentItemsList"
})
public class InboundShipmentLandedCost {

    protected RecordRef landedCostCostCategory;
    protected Double landedCostAmount;
    protected RecordRef landedCostCurrency;
    protected Double landedCostExchangeRate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar landedCostEffectiveDate;
    @XmlSchemaType(name = "string")
    protected InboundShipmentLandedCostAllocationMethod landedCostAllocationMethod;
    protected RecordRefList landedCostShipmentItemsList;

    /**
     * Gets the value of the landedCostCostCategory property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLandedCostCostCategory() {
        return landedCostCostCategory;
    }

    /**
     * Sets the value of the landedCostCostCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLandedCostCostCategory(RecordRef value) {
        this.landedCostCostCategory = value;
    }

    /**
     * Gets the value of the landedCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLandedCostAmount() {
        return landedCostAmount;
    }

    /**
     * Sets the value of the landedCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLandedCostAmount(Double value) {
        this.landedCostAmount = value;
    }

    /**
     * Gets the value of the landedCostCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLandedCostCurrency() {
        return landedCostCurrency;
    }

    /**
     * Sets the value of the landedCostCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLandedCostCurrency(RecordRef value) {
        this.landedCostCurrency = value;
    }

    /**
     * Gets the value of the landedCostExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLandedCostExchangeRate() {
        return landedCostExchangeRate;
    }

    /**
     * Sets the value of the landedCostExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLandedCostExchangeRate(Double value) {
        this.landedCostExchangeRate = value;
    }

    /**
     * Gets the value of the landedCostEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLandedCostEffectiveDate() {
        return landedCostEffectiveDate;
    }

    /**
     * Sets the value of the landedCostEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLandedCostEffectiveDate(XMLGregorianCalendar value) {
        this.landedCostEffectiveDate = value;
    }

    /**
     * Gets the value of the landedCostAllocationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link InboundShipmentLandedCostAllocationMethod }
     *     
     */
    public InboundShipmentLandedCostAllocationMethod getLandedCostAllocationMethod() {
        return landedCostAllocationMethod;
    }

    /**
     * Sets the value of the landedCostAllocationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link InboundShipmentLandedCostAllocationMethod }
     *     
     */
    public void setLandedCostAllocationMethod(InboundShipmentLandedCostAllocationMethod value) {
        this.landedCostAllocationMethod = value;
    }

    /**
     * Gets the value of the landedCostShipmentItemsList property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRefList }
     *     
     */
    public RecordRefList getLandedCostShipmentItemsList() {
        return landedCostShipmentItemsList;
    }

    /**
     * Sets the value of the landedCostShipmentItemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRefList }
     *     
     */
    public void setLandedCostShipmentItemsList(RecordRefList value) {
        this.landedCostShipmentItemsList = value;
    }

}
