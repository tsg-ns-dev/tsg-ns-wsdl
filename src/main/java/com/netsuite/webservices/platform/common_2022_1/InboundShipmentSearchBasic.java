
package com.netsuite.webservices.platform.common_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2022_1.SearchCustomFieldList;
import com.netsuite.webservices.platform.core_2022_1.SearchDateField;
import com.netsuite.webservices.platform.core_2022_1.SearchDoubleField;
import com.netsuite.webservices.platform.core_2022_1.SearchEnumMultiSelectField;
import com.netsuite.webservices.platform.core_2022_1.SearchLongField;
import com.netsuite.webservices.platform.core_2022_1.SearchMultiSelectField;
import com.netsuite.webservices.platform.core_2022_1.SearchRecordBasic;
import com.netsuite.webservices.platform.core_2022_1.SearchStringField;


/**
 * <p>Java class for InboundShipmentSearchBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InboundShipmentSearchBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRecordBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actualDeliveryDate" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="actualShippingDate" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="billOfLading" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="createdDate" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="expectedDeliveryDate" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="expectedRate" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="expectedShippingDate" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="externalDocumentNumber" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="externalIdString" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="incoterm" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="internalId" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="internalIdNumber" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="item" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="itemEffectiveDate" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="itemExchangeRate" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="landedCostAllocationMethod" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="landedCostAmount" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="landedCostCostCategory" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="landedCostCurrency" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="landedCostEffectiveDate" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="landedCostExchangeRate" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="memo" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="poAmount" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="poRate" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrder" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="quantityBilled" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="quantityExpected" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="quantityReceived" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="quantityRemaining" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="receivingLocation" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="shipmentBaseCurrency" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="shipmentNumber" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="totalUnitCost" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="unit" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="unitLandedCost" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="vendor" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="vesselNumber" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="customFieldList" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchCustomFieldList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InboundShipmentSearchBasic", propOrder = {
    "actualDeliveryDate",
    "actualShippingDate",
    "billOfLading",
    "createdDate",
    "currency",
    "description",
    "expectedDeliveryDate",
    "expectedRate",
    "expectedShippingDate",
    "externalDocumentNumber",
    "externalId",
    "externalIdString",
    "incoterm",
    "internalId",
    "internalIdNumber",
    "item",
    "itemEffectiveDate",
    "itemExchangeRate",
    "landedCostAllocationMethod",
    "landedCostAmount",
    "landedCostCostCategory",
    "landedCostCurrency",
    "landedCostEffectiveDate",
    "landedCostExchangeRate",
    "memo",
    "poAmount",
    "poRate",
    "purchaseOrder",
    "quantityBilled",
    "quantityExpected",
    "quantityReceived",
    "quantityRemaining",
    "receivingLocation",
    "shipmentBaseCurrency",
    "shipmentNumber",
    "status",
    "totalUnitCost",
    "unit",
    "unitLandedCost",
    "vendor",
    "vesselNumber",
    "customFieldList"
})
public class InboundShipmentSearchBasic
    extends SearchRecordBasic
{

    protected SearchDateField actualDeliveryDate;
    protected SearchDateField actualShippingDate;
    protected SearchStringField billOfLading;
    protected SearchDateField createdDate;
    protected SearchMultiSelectField currency;
    protected SearchStringField description;
    protected SearchDateField expectedDeliveryDate;
    protected SearchDoubleField expectedRate;
    protected SearchDateField expectedShippingDate;
    protected SearchMultiSelectField externalDocumentNumber;
    protected SearchMultiSelectField externalId;
    protected SearchStringField externalIdString;
    protected SearchMultiSelectField incoterm;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchMultiSelectField item;
    protected SearchDateField itemEffectiveDate;
    protected SearchDoubleField itemExchangeRate;
    protected SearchEnumMultiSelectField landedCostAllocationMethod;
    protected SearchDoubleField landedCostAmount;
    protected SearchMultiSelectField landedCostCostCategory;
    protected SearchMultiSelectField landedCostCurrency;
    protected SearchDateField landedCostEffectiveDate;
    protected SearchDoubleField landedCostExchangeRate;
    protected SearchStringField memo;
    protected SearchDoubleField poAmount;
    protected SearchDoubleField poRate;
    protected SearchMultiSelectField purchaseOrder;
    protected SearchDoubleField quantityBilled;
    protected SearchDoubleField quantityExpected;
    protected SearchDoubleField quantityReceived;
    protected SearchDoubleField quantityRemaining;
    protected SearchMultiSelectField receivingLocation;
    protected SearchMultiSelectField shipmentBaseCurrency;
    protected SearchMultiSelectField shipmentNumber;
    protected SearchEnumMultiSelectField status;
    protected SearchDoubleField totalUnitCost;
    protected SearchMultiSelectField unit;
    protected SearchDoubleField unitLandedCost;
    protected SearchMultiSelectField vendor;
    protected SearchStringField vesselNumber;
    protected SearchCustomFieldList customFieldList;

    /**
     * Gets the value of the actualDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    /**
     * Sets the value of the actualDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setActualDeliveryDate(SearchDateField value) {
        this.actualDeliveryDate = value;
    }

    /**
     * Gets the value of the actualShippingDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getActualShippingDate() {
        return actualShippingDate;
    }

    /**
     * Sets the value of the actualShippingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setActualShippingDate(SearchDateField value) {
        this.actualShippingDate = value;
    }

    /**
     * Gets the value of the billOfLading property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBillOfLading() {
        return billOfLading;
    }

    /**
     * Sets the value of the billOfLading property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBillOfLading(SearchStringField value) {
        this.billOfLading = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setCreatedDate(SearchDateField value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCurrency(SearchMultiSelectField value) {
        this.currency = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setDescription(SearchStringField value) {
        this.description = value;
    }

    /**
     * Gets the value of the expectedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    /**
     * Sets the value of the expectedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setExpectedDeliveryDate(SearchDateField value) {
        this.expectedDeliveryDate = value;
    }

    /**
     * Gets the value of the expectedRate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getExpectedRate() {
        return expectedRate;
    }

    /**
     * Sets the value of the expectedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setExpectedRate(SearchDoubleField value) {
        this.expectedRate = value;
    }

    /**
     * Gets the value of the expectedShippingDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getExpectedShippingDate() {
        return expectedShippingDate;
    }

    /**
     * Sets the value of the expectedShippingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setExpectedShippingDate(SearchDateField value) {
        this.expectedShippingDate = value;
    }

    /**
     * Gets the value of the externalDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getExternalDocumentNumber() {
        return externalDocumentNumber;
    }

    /**
     * Sets the value of the externalDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setExternalDocumentNumber(SearchMultiSelectField value) {
        this.externalDocumentNumber = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setExternalId(SearchMultiSelectField value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the externalIdString property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getExternalIdString() {
        return externalIdString;
    }

    /**
     * Sets the value of the externalIdString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setExternalIdString(SearchStringField value) {
        this.externalIdString = value;
    }

    /**
     * Gets the value of the incoterm property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getIncoterm() {
        return incoterm;
    }

    /**
     * Sets the value of the incoterm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setIncoterm(SearchMultiSelectField value) {
        this.incoterm = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setInternalId(SearchMultiSelectField value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the internalIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }

    /**
     * Sets the value of the internalIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setInternalIdNumber(SearchLongField value) {
        this.internalIdNumber = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setItem(SearchMultiSelectField value) {
        this.item = value;
    }

    /**
     * Gets the value of the itemEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getItemEffectiveDate() {
        return itemEffectiveDate;
    }

    /**
     * Sets the value of the itemEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setItemEffectiveDate(SearchDateField value) {
        this.itemEffectiveDate = value;
    }

    /**
     * Gets the value of the itemExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getItemExchangeRate() {
        return itemExchangeRate;
    }

    /**
     * Sets the value of the itemExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setItemExchangeRate(SearchDoubleField value) {
        this.itemExchangeRate = value;
    }

    /**
     * Gets the value of the landedCostAllocationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getLandedCostAllocationMethod() {
        return landedCostAllocationMethod;
    }

    /**
     * Sets the value of the landedCostAllocationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setLandedCostAllocationMethod(SearchEnumMultiSelectField value) {
        this.landedCostAllocationMethod = value;
    }

    /**
     * Gets the value of the landedCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLandedCostAmount() {
        return landedCostAmount;
    }

    /**
     * Sets the value of the landedCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLandedCostAmount(SearchDoubleField value) {
        this.landedCostAmount = value;
    }

    /**
     * Gets the value of the landedCostCostCategory property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getLandedCostCostCategory() {
        return landedCostCostCategory;
    }

    /**
     * Sets the value of the landedCostCostCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setLandedCostCostCategory(SearchMultiSelectField value) {
        this.landedCostCostCategory = value;
    }

    /**
     * Gets the value of the landedCostCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getLandedCostCurrency() {
        return landedCostCurrency;
    }

    /**
     * Sets the value of the landedCostCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setLandedCostCurrency(SearchMultiSelectField value) {
        this.landedCostCurrency = value;
    }

    /**
     * Gets the value of the landedCostEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getLandedCostEffectiveDate() {
        return landedCostEffectiveDate;
    }

    /**
     * Sets the value of the landedCostEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setLandedCostEffectiveDate(SearchDateField value) {
        this.landedCostEffectiveDate = value;
    }

    /**
     * Gets the value of the landedCostExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLandedCostExchangeRate() {
        return landedCostExchangeRate;
    }

    /**
     * Sets the value of the landedCostExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLandedCostExchangeRate(SearchDoubleField value) {
        this.landedCostExchangeRate = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setMemo(SearchStringField value) {
        this.memo = value;
    }

    /**
     * Gets the value of the poAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getPoAmount() {
        return poAmount;
    }

    /**
     * Sets the value of the poAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setPoAmount(SearchDoubleField value) {
        this.poAmount = value;
    }

    /**
     * Gets the value of the poRate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getPoRate() {
        return poRate;
    }

    /**
     * Sets the value of the poRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setPoRate(SearchDoubleField value) {
        this.poRate = value;
    }

    /**
     * Gets the value of the purchaseOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPurchaseOrder() {
        return purchaseOrder;
    }

    /**
     * Sets the value of the purchaseOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPurchaseOrder(SearchMultiSelectField value) {
        this.purchaseOrder = value;
    }

    /**
     * Gets the value of the quantityBilled property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityBilled() {
        return quantityBilled;
    }

    /**
     * Sets the value of the quantityBilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityBilled(SearchDoubleField value) {
        this.quantityBilled = value;
    }

    /**
     * Gets the value of the quantityExpected property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityExpected() {
        return quantityExpected;
    }

    /**
     * Sets the value of the quantityExpected property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityExpected(SearchDoubleField value) {
        this.quantityExpected = value;
    }

    /**
     * Gets the value of the quantityReceived property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityReceived() {
        return quantityReceived;
    }

    /**
     * Sets the value of the quantityReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityReceived(SearchDoubleField value) {
        this.quantityReceived = value;
    }

    /**
     * Gets the value of the quantityRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityRemaining() {
        return quantityRemaining;
    }

    /**
     * Sets the value of the quantityRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityRemaining(SearchDoubleField value) {
        this.quantityRemaining = value;
    }

    /**
     * Gets the value of the receivingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getReceivingLocation() {
        return receivingLocation;
    }

    /**
     * Sets the value of the receivingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setReceivingLocation(SearchMultiSelectField value) {
        this.receivingLocation = value;
    }

    /**
     * Gets the value of the shipmentBaseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getShipmentBaseCurrency() {
        return shipmentBaseCurrency;
    }

    /**
     * Sets the value of the shipmentBaseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setShipmentBaseCurrency(SearchMultiSelectField value) {
        this.shipmentBaseCurrency = value;
    }

    /**
     * Gets the value of the shipmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getShipmentNumber() {
        return shipmentNumber;
    }

    /**
     * Sets the value of the shipmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setShipmentNumber(SearchMultiSelectField value) {
        this.shipmentNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setStatus(SearchEnumMultiSelectField value) {
        this.status = value;
    }

    /**
     * Gets the value of the totalUnitCost property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTotalUnitCost() {
        return totalUnitCost;
    }

    /**
     * Sets the value of the totalUnitCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTotalUnitCost(SearchDoubleField value) {
        this.totalUnitCost = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setUnit(SearchMultiSelectField value) {
        this.unit = value;
    }

    /**
     * Gets the value of the unitLandedCost property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getUnitLandedCost() {
        return unitLandedCost;
    }

    /**
     * Sets the value of the unitLandedCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setUnitLandedCost(SearchDoubleField value) {
        this.unitLandedCost = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setVendor(SearchMultiSelectField value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the vesselNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getVesselNumber() {
        return vesselNumber;
    }

    /**
     * Sets the value of the vesselNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setVesselNumber(SearchStringField value) {
        this.vesselNumber = value;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCustomFieldList }
     *     
     */
    public SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCustomFieldList }
     *     
     */
    public void setCustomFieldList(SearchCustomFieldList value) {
        this.customFieldList = value;
    }

}
