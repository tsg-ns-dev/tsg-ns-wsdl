
package tsg.ns.wsdl.coop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InboundShipmentSearchRowBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InboundShipmentSearchRowBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}SearchRowBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actualDeliveryDate" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="actualShippingDate" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billOfLading" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="createdDate" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="expectedDeliveryDate" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="expectedRate" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="expectedShippingDate" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="externalDocumentNumber" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="incoterm" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="internalId" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="item" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="itemEffectiveDate" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="itemExchangeRate" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="landedCostAllocationMethod" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="landedCostAmount" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="landedCostCostCategory" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="landedCostCurrency" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="landedCostEffectiveDate" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="landedCostExchangeRate" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="memo" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="poAmount" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="poRate" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrder" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quantityBilled" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quantityExpected" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quantityReceived" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quantityRemaining" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="receivingLocation" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipmentBaseCurrency" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipmentNumber" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="totalUnitCost" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="unit" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="unitLandedCost" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vendor" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vesselNumber" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="customFieldList" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnCustomFieldList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InboundShipmentSearchRowBasic", namespace = "urn:common_2022_2.platform.webservices.netsuite.com", propOrder = {
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
    "incoterm",
    "internalId",
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
public class InboundShipmentSearchRowBasic
    extends SearchRowBasic
{

    protected List<SearchColumnDateField> actualDeliveryDate;
    protected List<SearchColumnDateField> actualShippingDate;
    protected List<SearchColumnStringField> billOfLading;
    protected List<SearchColumnDateField> createdDate;
    protected List<SearchColumnSelectField> currency;
    protected List<SearchColumnStringField> description;
    protected List<SearchColumnDateField> expectedDeliveryDate;
    protected List<SearchColumnDoubleField> expectedRate;
    protected List<SearchColumnDateField> expectedShippingDate;
    protected List<SearchColumnStringField> externalDocumentNumber;
    protected List<SearchColumnSelectField> externalId;
    protected List<SearchColumnSelectField> incoterm;
    protected List<SearchColumnSelectField> internalId;
    protected List<SearchColumnSelectField> item;
    protected List<SearchColumnDateField> itemEffectiveDate;
    protected List<SearchColumnDoubleField> itemExchangeRate;
    protected List<SearchColumnEnumSelectField> landedCostAllocationMethod;
    protected List<SearchColumnDoubleField> landedCostAmount;
    protected List<SearchColumnSelectField> landedCostCostCategory;
    protected List<SearchColumnSelectField> landedCostCurrency;
    protected List<SearchColumnDateField> landedCostEffectiveDate;
    protected List<SearchColumnDoubleField> landedCostExchangeRate;
    protected List<SearchColumnStringField> memo;
    protected List<SearchColumnDoubleField> poAmount;
    protected List<SearchColumnDoubleField> poRate;
    protected List<SearchColumnSelectField> purchaseOrder;
    protected List<SearchColumnDoubleField> quantityBilled;
    protected List<SearchColumnDoubleField> quantityExpected;
    protected List<SearchColumnDoubleField> quantityReceived;
    protected List<SearchColumnDoubleField> quantityRemaining;
    protected List<SearchColumnSelectField> receivingLocation;
    protected List<SearchColumnSelectField> shipmentBaseCurrency;
    protected List<SearchColumnStringField> shipmentNumber;
    protected List<SearchColumnStringField> status;
    protected List<SearchColumnDoubleField> totalUnitCost;
    protected List<SearchColumnSelectField> unit;
    protected List<SearchColumnDoubleField> unitLandedCost;
    protected List<SearchColumnSelectField> vendor;
    protected List<SearchColumnStringField> vesselNumber;
    protected SearchColumnCustomFieldList customFieldList;

    /**
     * Gets the value of the actualDeliveryDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the actualDeliveryDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActualDeliveryDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getActualDeliveryDate() {
        if (actualDeliveryDate == null) {
            actualDeliveryDate = new ArrayList<SearchColumnDateField>();
        }
        return this.actualDeliveryDate;
    }

    /**
     * Gets the value of the actualShippingDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the actualShippingDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActualShippingDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getActualShippingDate() {
        if (actualShippingDate == null) {
            actualShippingDate = new ArrayList<SearchColumnDateField>();
        }
        return this.actualShippingDate;
    }

    /**
     * Gets the value of the billOfLading property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the billOfLading property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillOfLading().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillOfLading() {
        if (billOfLading == null) {
            billOfLading = new ArrayList<SearchColumnStringField>();
        }
        return this.billOfLading;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the createdDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreatedDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getCreatedDate() {
        if (createdDate == null) {
            createdDate = new ArrayList<SearchColumnDateField>();
        }
        return this.createdDate;
    }

    /**
     * Gets the value of the currency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the currency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getCurrency() {
        if (currency == null) {
            currency = new ArrayList<SearchColumnSelectField>();
        }
        return this.currency;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getDescription() {
        if (description == null) {
            description = new ArrayList<SearchColumnStringField>();
        }
        return this.description;
    }

    /**
     * Gets the value of the expectedDeliveryDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the expectedDeliveryDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpectedDeliveryDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getExpectedDeliveryDate() {
        if (expectedDeliveryDate == null) {
            expectedDeliveryDate = new ArrayList<SearchColumnDateField>();
        }
        return this.expectedDeliveryDate;
    }

    /**
     * Gets the value of the expectedRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the expectedRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpectedRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getExpectedRate() {
        if (expectedRate == null) {
            expectedRate = new ArrayList<SearchColumnDoubleField>();
        }
        return this.expectedRate;
    }

    /**
     * Gets the value of the expectedShippingDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the expectedShippingDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpectedShippingDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getExpectedShippingDate() {
        if (expectedShippingDate == null) {
            expectedShippingDate = new ArrayList<SearchColumnDateField>();
        }
        return this.expectedShippingDate;
    }

    /**
     * Gets the value of the externalDocumentNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the externalDocumentNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalDocumentNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getExternalDocumentNumber() {
        if (externalDocumentNumber == null) {
            externalDocumentNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.externalDocumentNumber;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the externalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getExternalId() {
        if (externalId == null) {
            externalId = new ArrayList<SearchColumnSelectField>();
        }
        return this.externalId;
    }

    /**
     * Gets the value of the incoterm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the incoterm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncoterm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getIncoterm() {
        if (incoterm == null) {
            incoterm = new ArrayList<SearchColumnSelectField>();
        }
        return this.incoterm;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the internalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getInternalId() {
        if (internalId == null) {
            internalId = new ArrayList<SearchColumnSelectField>();
        }
        return this.internalId;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getItem() {
        if (item == null) {
            item = new ArrayList<SearchColumnSelectField>();
        }
        return this.item;
    }

    /**
     * Gets the value of the itemEffectiveDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the itemEffectiveDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemEffectiveDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getItemEffectiveDate() {
        if (itemEffectiveDate == null) {
            itemEffectiveDate = new ArrayList<SearchColumnDateField>();
        }
        return this.itemEffectiveDate;
    }

    /**
     * Gets the value of the itemExchangeRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the itemExchangeRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemExchangeRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getItemExchangeRate() {
        if (itemExchangeRate == null) {
            itemExchangeRate = new ArrayList<SearchColumnDoubleField>();
        }
        return this.itemExchangeRate;
    }

    /**
     * Gets the value of the landedCostAllocationMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the landedCostAllocationMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLandedCostAllocationMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getLandedCostAllocationMethod() {
        if (landedCostAllocationMethod == null) {
            landedCostAllocationMethod = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.landedCostAllocationMethod;
    }

    /**
     * Gets the value of the landedCostAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the landedCostAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLandedCostAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLandedCostAmount() {
        if (landedCostAmount == null) {
            landedCostAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.landedCostAmount;
    }

    /**
     * Gets the value of the landedCostCostCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the landedCostCostCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLandedCostCostCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getLandedCostCostCategory() {
        if (landedCostCostCategory == null) {
            landedCostCostCategory = new ArrayList<SearchColumnSelectField>();
        }
        return this.landedCostCostCategory;
    }

    /**
     * Gets the value of the landedCostCurrency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the landedCostCurrency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLandedCostCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getLandedCostCurrency() {
        if (landedCostCurrency == null) {
            landedCostCurrency = new ArrayList<SearchColumnSelectField>();
        }
        return this.landedCostCurrency;
    }

    /**
     * Gets the value of the landedCostEffectiveDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the landedCostEffectiveDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLandedCostEffectiveDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getLandedCostEffectiveDate() {
        if (landedCostEffectiveDate == null) {
            landedCostEffectiveDate = new ArrayList<SearchColumnDateField>();
        }
        return this.landedCostEffectiveDate;
    }

    /**
     * Gets the value of the landedCostExchangeRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the landedCostExchangeRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLandedCostExchangeRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLandedCostExchangeRate() {
        if (landedCostExchangeRate == null) {
            landedCostExchangeRate = new ArrayList<SearchColumnDoubleField>();
        }
        return this.landedCostExchangeRate;
    }

    /**
     * Gets the value of the memo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the memo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getMemo() {
        if (memo == null) {
            memo = new ArrayList<SearchColumnStringField>();
        }
        return this.memo;
    }

    /**
     * Gets the value of the poAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the poAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getPoAmount() {
        if (poAmount == null) {
            poAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.poAmount;
    }

    /**
     * Gets the value of the poRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the poRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getPoRate() {
        if (poRate == null) {
            poRate = new ArrayList<SearchColumnDoubleField>();
        }
        return this.poRate;
    }

    /**
     * Gets the value of the purchaseOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPurchaseOrder() {
        if (purchaseOrder == null) {
            purchaseOrder = new ArrayList<SearchColumnSelectField>();
        }
        return this.purchaseOrder;
    }

    /**
     * Gets the value of the quantityBilled property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the quantityBilled property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityBilled().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getQuantityBilled() {
        if (quantityBilled == null) {
            quantityBilled = new ArrayList<SearchColumnDoubleField>();
        }
        return this.quantityBilled;
    }

    /**
     * Gets the value of the quantityExpected property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the quantityExpected property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityExpected().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getQuantityExpected() {
        if (quantityExpected == null) {
            quantityExpected = new ArrayList<SearchColumnDoubleField>();
        }
        return this.quantityExpected;
    }

    /**
     * Gets the value of the quantityReceived property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the quantityReceived property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityReceived().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getQuantityReceived() {
        if (quantityReceived == null) {
            quantityReceived = new ArrayList<SearchColumnDoubleField>();
        }
        return this.quantityReceived;
    }

    /**
     * Gets the value of the quantityRemaining property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the quantityRemaining property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityRemaining().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getQuantityRemaining() {
        if (quantityRemaining == null) {
            quantityRemaining = new ArrayList<SearchColumnDoubleField>();
        }
        return this.quantityRemaining;
    }

    /**
     * Gets the value of the receivingLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the receivingLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivingLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getReceivingLocation() {
        if (receivingLocation == null) {
            receivingLocation = new ArrayList<SearchColumnSelectField>();
        }
        return this.receivingLocation;
    }

    /**
     * Gets the value of the shipmentBaseCurrency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentBaseCurrency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentBaseCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getShipmentBaseCurrency() {
        if (shipmentBaseCurrency == null) {
            shipmentBaseCurrency = new ArrayList<SearchColumnSelectField>();
        }
        return this.shipmentBaseCurrency;
    }

    /**
     * Gets the value of the shipmentNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipmentNumber() {
        if (shipmentNumber == null) {
            shipmentNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.shipmentNumber;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getStatus() {
        if (status == null) {
            status = new ArrayList<SearchColumnStringField>();
        }
        return this.status;
    }

    /**
     * Gets the value of the totalUnitCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the totalUnitCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalUnitCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getTotalUnitCost() {
        if (totalUnitCost == null) {
            totalUnitCost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.totalUnitCost;
    }

    /**
     * Gets the value of the unit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the unit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getUnit() {
        if (unit == null) {
            unit = new ArrayList<SearchColumnSelectField>();
        }
        return this.unit;
    }

    /**
     * Gets the value of the unitLandedCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the unitLandedCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitLandedCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getUnitLandedCost() {
        if (unitLandedCost == null) {
            unitLandedCost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.unitLandedCost;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vendor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getVendor() {
        if (vendor == null) {
            vendor = new ArrayList<SearchColumnSelectField>();
        }
        return this.vendor;
    }

    /**
     * Gets the value of the vesselNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vesselNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVesselNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getVesselNumber() {
        if (vesselNumber == null) {
            vesselNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.vesselNumber;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link SearchColumnCustomFieldList }
     *     
     */
    public SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchColumnCustomFieldList }
     *     
     */
    public void setCustomFieldList(SearchColumnCustomFieldList value) {
        this.customFieldList = value;
    }

}
