
package tsg.ns.wsdl.coop;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReturnAuthorizationItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnAuthorizationItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="job" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="item" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="orderLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="quantityReceived" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="quantityBilled" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="units" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="inventoryDetail" type="{urn:common_2022_2.platform.webservices.netsuite.com}InventoryDetail" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serialNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="options" type="{urn:core_2022_2.platform.webservices.netsuite.com}CustomFieldList" minOccurs="0"/&gt;
 *         &lt;element name="revRecTermInMonths" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="deferRevRec" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isDropShipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="inventoryLocation" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="inventorySubsidiary" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="catchUpPeriod" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="department" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="costEstimateType" type="{urn:types.common_2022_2.platform.webservices.netsuite.com}ItemCostEstimateType" minOccurs="0"/&gt;
 *         &lt;element name="costEstimate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="taxDetailsReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="class" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="revRecSchedule" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="revRecStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="revRecEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="taxCode" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="taxRate1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="taxRate2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="tax1Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="grossAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="isTaxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="giftCertFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="giftCertRecipientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="giftCertRecipientEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="giftCertMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="giftCertNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vsoeSopGroup" type="{urn:types.common_2022_2.platform.webservices.netsuite.com}VsoeSopGroup" minOccurs="0"/&gt;
 *         &lt;element name="vsoeIsEstimate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="vsoePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vsoeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="altSalesAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vsoeAllocation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vsoeDeferral" type="{urn:types.common_2022_2.platform.webservices.netsuite.com}VsoeDeferral" minOccurs="0"/&gt;
 *         &lt;element name="vsoePermitDiscount" type="{urn:types.common_2022_2.platform.webservices.netsuite.com}VsoePermitDiscount" minOccurs="0"/&gt;
 *         &lt;element name="vsoeDelivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="customFieldList" type="{urn:core_2022_2.platform.webservices.netsuite.com}CustomFieldList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnAuthorizationItem", namespace = "urn:customers_2022_2.transactions.webservices.netsuite.com", propOrder = {
    "job",
    "item",
    "orderLine",
    "line",
    "quantity",
    "quantityReceived",
    "quantityBilled",
    "units",
    "inventoryDetail",
    "description",
    "serialNumbers",
    "price",
    "rate",
    "amount",
    "options",
    "revRecTermInMonths",
    "deferRevRec",
    "isClosed",
    "isDropShipment",
    "inventoryLocation",
    "inventorySubsidiary",
    "catchUpPeriod",
    "department",
    "costEstimateType",
    "costEstimate",
    "taxDetailsReference",
    "clazz",
    "location",
    "revRecSchedule",
    "revRecStartDate",
    "revRecEndDate",
    "taxCode",
    "taxRate1",
    "taxRate2",
    "tax1Amt",
    "grossAmt",
    "isTaxable",
    "giftCertFrom",
    "giftCertRecipientName",
    "giftCertRecipientEmail",
    "giftCertMessage",
    "giftCertNumber",
    "vsoeSopGroup",
    "vsoeIsEstimate",
    "vsoePrice",
    "vsoeAmount",
    "altSalesAmt",
    "taxAmount",
    "vsoeAllocation",
    "vsoeDeferral",
    "vsoePermitDiscount",
    "vsoeDelivered",
    "customFieldList"
})
public class ReturnAuthorizationItem {

    protected RecordRef job;
    protected RecordRef item;
    protected Long orderLine;
    protected Long line;
    protected Double quantity;
    protected Double quantityReceived;
    protected Double quantityBilled;
    protected RecordRef units;
    protected InventoryDetail inventoryDetail;
    protected String description;
    protected String serialNumbers;
    protected RecordRef price;
    protected String rate;
    protected Double amount;
    protected CustomFieldList options;
    protected Long revRecTermInMonths;
    protected Boolean deferRevRec;
    protected Boolean isClosed;
    protected Boolean isDropShipment;
    protected RecordRef inventoryLocation;
    protected RecordRef inventorySubsidiary;
    protected RecordRef catchUpPeriod;
    protected RecordRef department;
    @XmlSchemaType(name = "string")
    protected ItemCostEstimateType costEstimateType;
    protected Double costEstimate;
    protected String taxDetailsReference;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected RecordRef location;
    protected RecordRef revRecSchedule;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar revRecStartDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar revRecEndDate;
    protected RecordRef taxCode;
    protected Double taxRate1;
    protected Double taxRate2;
    protected Double tax1Amt;
    protected Double grossAmt;
    protected Boolean isTaxable;
    protected String giftCertFrom;
    protected String giftCertRecipientName;
    protected String giftCertRecipientEmail;
    protected String giftCertMessage;
    protected String giftCertNumber;
    @XmlSchemaType(name = "string")
    protected VsoeSopGroup vsoeSopGroup;
    protected Boolean vsoeIsEstimate;
    protected Double vsoePrice;
    protected Double vsoeAmount;
    protected Double altSalesAmt;
    protected Double taxAmount;
    protected Double vsoeAllocation;
    @XmlSchemaType(name = "string")
    protected VsoeDeferral vsoeDeferral;
    @XmlSchemaType(name = "string")
    protected VsoePermitDiscount vsoePermitDiscount;
    protected Boolean vsoeDelivered;
    protected CustomFieldList customFieldList;

    /**
     * Gets the value of the job property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getJob() {
        return job;
    }

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setJob(RecordRef value) {
        this.job = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setItem(RecordRef value) {
        this.item = value;
    }

    /**
     * Gets the value of the orderLine property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderLine() {
        return orderLine;
    }

    /**
     * Sets the value of the orderLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderLine(Long value) {
        this.orderLine = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLine(Long value) {
        this.line = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity(Double value) {
        this.quantity = value;
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
     * Gets the value of the quantityBilled property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityBilled() {
        return quantityBilled;
    }

    /**
     * Sets the value of the quantityBilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityBilled(Double value) {
        this.quantityBilled = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setUnits(RecordRef value) {
        this.units = value;
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

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the serialNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumbers() {
        return serialNumbers;
    }

    /**
     * Sets the value of the serialNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumbers(String value) {
        this.serialNumbers = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPrice(RecordRef value) {
        this.price = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate(String value) {
        this.rate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldList }
     *     
     */
    public CustomFieldList getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldList }
     *     
     */
    public void setOptions(CustomFieldList value) {
        this.options = value;
    }

    /**
     * Gets the value of the revRecTermInMonths property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRevRecTermInMonths() {
        return revRecTermInMonths;
    }

    /**
     * Sets the value of the revRecTermInMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRevRecTermInMonths(Long value) {
        this.revRecTermInMonths = value;
    }

    /**
     * Gets the value of the deferRevRec property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeferRevRec() {
        return deferRevRec;
    }

    /**
     * Sets the value of the deferRevRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeferRevRec(Boolean value) {
        this.deferRevRec = value;
    }

    /**
     * Gets the value of the isClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsClosed() {
        return isClosed;
    }

    /**
     * Sets the value of the isClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsClosed(Boolean value) {
        this.isClosed = value;
    }

    /**
     * Gets the value of the isDropShipment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDropShipment() {
        return isDropShipment;
    }

    /**
     * Sets the value of the isDropShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDropShipment(Boolean value) {
        this.isDropShipment = value;
    }

    /**
     * Gets the value of the inventoryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getInventoryLocation() {
        return inventoryLocation;
    }

    /**
     * Sets the value of the inventoryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setInventoryLocation(RecordRef value) {
        this.inventoryLocation = value;
    }

    /**
     * Gets the value of the inventorySubsidiary property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getInventorySubsidiary() {
        return inventorySubsidiary;
    }

    /**
     * Sets the value of the inventorySubsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setInventorySubsidiary(RecordRef value) {
        this.inventorySubsidiary = value;
    }

    /**
     * Gets the value of the catchUpPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCatchUpPeriod() {
        return catchUpPeriod;
    }

    /**
     * Sets the value of the catchUpPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCatchUpPeriod(RecordRef value) {
        this.catchUpPeriod = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDepartment(RecordRef value) {
        this.department = value;
    }

    /**
     * Gets the value of the costEstimateType property.
     * 
     * @return
     *     possible object is
     *     {@link ItemCostEstimateType }
     *     
     */
    public ItemCostEstimateType getCostEstimateType() {
        return costEstimateType;
    }

    /**
     * Sets the value of the costEstimateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemCostEstimateType }
     *     
     */
    public void setCostEstimateType(ItemCostEstimateType value) {
        this.costEstimateType = value;
    }

    /**
     * Gets the value of the costEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCostEstimate() {
        return costEstimate;
    }

    /**
     * Sets the value of the costEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCostEstimate(Double value) {
        this.costEstimate = value;
    }

    /**
     * Gets the value of the taxDetailsReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDetailsReference() {
        return taxDetailsReference;
    }

    /**
     * Sets the value of the taxDetailsReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDetailsReference(String value) {
        this.taxDetailsReference = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setClazz(RecordRef value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLocation(RecordRef value) {
        this.location = value;
    }

    /**
     * Gets the value of the revRecSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRevRecSchedule() {
        return revRecSchedule;
    }

    /**
     * Sets the value of the revRecSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRevRecSchedule(RecordRef value) {
        this.revRecSchedule = value;
    }

    /**
     * Gets the value of the revRecStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRevRecStartDate() {
        return revRecStartDate;
    }

    /**
     * Sets the value of the revRecStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRevRecStartDate(XMLGregorianCalendar value) {
        this.revRecStartDate = value;
    }

    /**
     * Gets the value of the revRecEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRevRecEndDate() {
        return revRecEndDate;
    }

    /**
     * Sets the value of the revRecEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRevRecEndDate(XMLGregorianCalendar value) {
        this.revRecEndDate = value;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTaxCode(RecordRef value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the taxRate1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxRate1() {
        return taxRate1;
    }

    /**
     * Sets the value of the taxRate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxRate1(Double value) {
        this.taxRate1 = value;
    }

    /**
     * Gets the value of the taxRate2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxRate2() {
        return taxRate2;
    }

    /**
     * Sets the value of the taxRate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxRate2(Double value) {
        this.taxRate2 = value;
    }

    /**
     * Gets the value of the tax1Amt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTax1Amt() {
        return tax1Amt;
    }

    /**
     * Sets the value of the tax1Amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTax1Amt(Double value) {
        this.tax1Amt = value;
    }

    /**
     * Gets the value of the grossAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGrossAmt() {
        return grossAmt;
    }

    /**
     * Sets the value of the grossAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGrossAmt(Double value) {
        this.grossAmt = value;
    }

    /**
     * Gets the value of the isTaxable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTaxable() {
        return isTaxable;
    }

    /**
     * Sets the value of the isTaxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTaxable(Boolean value) {
        this.isTaxable = value;
    }

    /**
     * Gets the value of the giftCertFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertFrom() {
        return giftCertFrom;
    }

    /**
     * Sets the value of the giftCertFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertFrom(String value) {
        this.giftCertFrom = value;
    }

    /**
     * Gets the value of the giftCertRecipientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertRecipientName() {
        return giftCertRecipientName;
    }

    /**
     * Sets the value of the giftCertRecipientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertRecipientName(String value) {
        this.giftCertRecipientName = value;
    }

    /**
     * Gets the value of the giftCertRecipientEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertRecipientEmail() {
        return giftCertRecipientEmail;
    }

    /**
     * Sets the value of the giftCertRecipientEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertRecipientEmail(String value) {
        this.giftCertRecipientEmail = value;
    }

    /**
     * Gets the value of the giftCertMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertMessage() {
        return giftCertMessage;
    }

    /**
     * Sets the value of the giftCertMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertMessage(String value) {
        this.giftCertMessage = value;
    }

    /**
     * Gets the value of the giftCertNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertNumber() {
        return giftCertNumber;
    }

    /**
     * Sets the value of the giftCertNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertNumber(String value) {
        this.giftCertNumber = value;
    }

    /**
     * Gets the value of the vsoeSopGroup property.
     * 
     * @return
     *     possible object is
     *     {@link VsoeSopGroup }
     *     
     */
    public VsoeSopGroup getVsoeSopGroup() {
        return vsoeSopGroup;
    }

    /**
     * Sets the value of the vsoeSopGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link VsoeSopGroup }
     *     
     */
    public void setVsoeSopGroup(VsoeSopGroup value) {
        this.vsoeSopGroup = value;
    }

    /**
     * Gets the value of the vsoeIsEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVsoeIsEstimate() {
        return vsoeIsEstimate;
    }

    /**
     * Sets the value of the vsoeIsEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVsoeIsEstimate(Boolean value) {
        this.vsoeIsEstimate = value;
    }

    /**
     * Gets the value of the vsoePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVsoePrice() {
        return vsoePrice;
    }

    /**
     * Sets the value of the vsoePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVsoePrice(Double value) {
        this.vsoePrice = value;
    }

    /**
     * Gets the value of the vsoeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVsoeAmount() {
        return vsoeAmount;
    }

    /**
     * Sets the value of the vsoeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVsoeAmount(Double value) {
        this.vsoeAmount = value;
    }

    /**
     * Gets the value of the altSalesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAltSalesAmt() {
        return altSalesAmt;
    }

    /**
     * Sets the value of the altSalesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAltSalesAmt(Double value) {
        this.altSalesAmt = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxAmount(Double value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the vsoeAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVsoeAllocation() {
        return vsoeAllocation;
    }

    /**
     * Sets the value of the vsoeAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVsoeAllocation(Double value) {
        this.vsoeAllocation = value;
    }

    /**
     * Gets the value of the vsoeDeferral property.
     * 
     * @return
     *     possible object is
     *     {@link VsoeDeferral }
     *     
     */
    public VsoeDeferral getVsoeDeferral() {
        return vsoeDeferral;
    }

    /**
     * Sets the value of the vsoeDeferral property.
     * 
     * @param value
     *     allowed object is
     *     {@link VsoeDeferral }
     *     
     */
    public void setVsoeDeferral(VsoeDeferral value) {
        this.vsoeDeferral = value;
    }

    /**
     * Gets the value of the vsoePermitDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link VsoePermitDiscount }
     *     
     */
    public VsoePermitDiscount getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }

    /**
     * Sets the value of the vsoePermitDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link VsoePermitDiscount }
     *     
     */
    public void setVsoePermitDiscount(VsoePermitDiscount value) {
        this.vsoePermitDiscount = value;
    }

    /**
     * Gets the value of the vsoeDelivered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVsoeDelivered() {
        return vsoeDelivered;
    }

    /**
     * Sets the value of the vsoeDelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVsoeDelivered(Boolean value) {
        this.vsoeDelivered = value;
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

}
