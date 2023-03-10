
package tsg.ns.wsdl.coop;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OtherChargeResaleItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherChargeResaleItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="purchaseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="manufacturingChargeItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="costUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expenseAccount" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="intercoExpenseAccount" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="salesDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="includeChildren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="incomeAccount" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="intercoIncomeAccount" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="isTaxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="matrixType" type="{urn:types.accounting_2022_2.lists.webservices.netsuite.com}ItemMatrixType" minOccurs="0"/&gt;
 *         &lt;element name="taxSchedule" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="costEstimateType" type="{urn:types.common_2022_2.platform.webservices.netsuite.com}ItemCostEstimateType" minOccurs="0"/&gt;
 *         &lt;element name="costEstimate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="unitsType" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="purchaseUnit" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="saleUnit" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="costEstimateUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issueProduct" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="billingSchedule" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="deferredRevenueAccount" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="intercoDefRevAccount" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="revRecSchedule" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="deferralAccount" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="amortizationTemplate" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="residual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deferRevRec" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="revenueRecognitionRule" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="revRecForecastRule" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="revenueAllocationGroup" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="createRevenuePlansOn" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="directRevenuePosting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="contingentRevenueHandling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="revReclassFXAccount" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="amortizationPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="minimumQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="minimumQuantityUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enforceMinQtyInternally" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="maximumQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="softDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isFulfillable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="generateAccruals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="costCategory" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderQuantityDiff" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="receiptQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="receiptAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="receiptQuantityDiff" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="pricesIncludeTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="quantityPricingSchedule" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="useMarginalRates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="overallQuantityPricingType" type="{urn:types.accounting_2022_2.lists.webservices.netsuite.com}ItemOverallQuantityPricingType" minOccurs="0"/&gt;
 *         &lt;element name="pricingGroup" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="customForm" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="upcCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parent" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="isOnline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isGcoCompliant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="offerSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="matrixItemNameTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availableToPartners" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="department" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="class" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="subsidiaryList" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/&gt;
 *         &lt;element name="vsoePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vsoeSopGroup" type="{urn:types.common_2022_2.platform.webservices.netsuite.com}VsoeSopGroup" minOccurs="0"/&gt;
 *         &lt;element name="vsoeDeferral" type="{urn:types.common_2022_2.platform.webservices.netsuite.com}VsoeDeferral" minOccurs="0"/&gt;
 *         &lt;element name="vsoePermitDiscount" type="{urn:types.common_2022_2.platform.webservices.netsuite.com}VsoePermitDiscount" minOccurs="0"/&gt;
 *         &lt;element name="vsoeDelivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="itemRevenueCategory" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemOptionsList" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}ItemOptionsList" minOccurs="0"/&gt;
 *         &lt;element name="matrixOptionList" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}MatrixOptionList" minOccurs="0"/&gt;
 *         &lt;element name="itemVendorList" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}ItemVendorList" minOccurs="0"/&gt;
 *         &lt;element name="pricingMatrix" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}PricingMatrix" minOccurs="0"/&gt;
 *         &lt;element name="accountingBookDetailList" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}ItemAccountingBookDetailList" minOccurs="0"/&gt;
 *         &lt;element name="purchaseTaxCode" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="salesTaxCode" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="translationsList" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}TranslationList" minOccurs="0"/&gt;
 *         &lt;element name="vendor" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="hierarchyVersionsList" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}OtherChargeResaleItemHierarchyVersionsList" minOccurs="0"/&gt;
 *         &lt;element name="consumptionUnit" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="billQtyVarianceAcct" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="billPriceVarianceAcct" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="billExchRateVarianceAcct" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="customFieldList" type="{urn:core_2022_2.platform.webservices.netsuite.com}CustomFieldList" minOccurs="0"/&gt;
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
@XmlType(name = "OtherChargeResaleItem", propOrder = {
    "createdDate",
    "lastModifiedDate",
    "purchaseDescription",
    "manufacturingChargeItem",
    "cost",
    "costUnits",
    "expenseAccount",
    "intercoExpenseAccount",
    "salesDescription",
    "includeChildren",
    "incomeAccount",
    "intercoIncomeAccount",
    "isTaxable",
    "matrixType",
    "taxSchedule",
    "costEstimateType",
    "costEstimate",
    "unitsType",
    "purchaseUnit",
    "saleUnit",
    "costEstimateUnits",
    "issueProduct",
    "billingSchedule",
    "deferredRevenueAccount",
    "intercoDefRevAccount",
    "revRecSchedule",
    "deferralAccount",
    "amortizationTemplate",
    "residual",
    "deferRevRec",
    "revenueRecognitionRule",
    "revRecForecastRule",
    "revenueAllocationGroup",
    "createRevenuePlansOn",
    "directRevenuePosting",
    "contingentRevenueHandling",
    "revReclassFXAccount",
    "amortizationPeriod",
    "minimumQuantity",
    "minimumQuantityUnits",
    "enforceMinQtyInternally",
    "maximumQuantity",
    "softDescriptor",
    "isFulfillable",
    "generateAccruals",
    "costCategory",
    "purchaseOrderQuantity",
    "purchaseOrderAmount",
    "purchaseOrderQuantityDiff",
    "receiptQuantity",
    "receiptAmount",
    "receiptQuantityDiff",
    "pricesIncludeTax",
    "quantityPricingSchedule",
    "useMarginalRates",
    "overallQuantityPricingType",
    "pricingGroup",
    "customForm",
    "itemId",
    "upcCode",
    "displayName",
    "vendorName",
    "parent",
    "isOnline",
    "isGcoCompliant",
    "offerSupport",
    "isInactive",
    "matrixItemNameTemplate",
    "availableToPartners",
    "department",
    "clazz",
    "location",
    "subsidiaryList",
    "vsoePrice",
    "vsoeSopGroup",
    "vsoeDeferral",
    "vsoePermitDiscount",
    "vsoeDelivered",
    "itemRevenueCategory",
    "currency",
    "itemOptionsList",
    "matrixOptionList",
    "itemVendorList",
    "pricingMatrix",
    "accountingBookDetailList",
    "purchaseTaxCode",
    "rate",
    "salesTaxCode",
    "translationsList",
    "vendor",
    "hierarchyVersionsList",
    "consumptionUnit",
    "billQtyVarianceAcct",
    "billPriceVarianceAcct",
    "billExchRateVarianceAcct",
    "customFieldList"
})
public class OtherChargeResaleItem
    extends Record
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected String purchaseDescription;
    protected Boolean manufacturingChargeItem;
    protected Double cost;
    protected String costUnits;
    protected RecordRef expenseAccount;
    protected RecordRef intercoExpenseAccount;
    protected String salesDescription;
    protected Boolean includeChildren;
    protected RecordRef incomeAccount;
    protected RecordRef intercoIncomeAccount;
    protected Boolean isTaxable;
    @XmlSchemaType(name = "string")
    protected ItemMatrixType matrixType;
    protected RecordRef taxSchedule;
    @XmlSchemaType(name = "string")
    protected ItemCostEstimateType costEstimateType;
    protected Double costEstimate;
    protected RecordRef unitsType;
    protected RecordRef purchaseUnit;
    protected RecordRef saleUnit;
    protected String costEstimateUnits;
    protected RecordRef issueProduct;
    protected RecordRef billingSchedule;
    protected RecordRef deferredRevenueAccount;
    protected RecordRef intercoDefRevAccount;
    protected RecordRef revRecSchedule;
    protected RecordRef deferralAccount;
    protected RecordRef amortizationTemplate;
    protected String residual;
    protected Boolean deferRevRec;
    protected RecordRef revenueRecognitionRule;
    protected RecordRef revRecForecastRule;
    protected RecordRef revenueAllocationGroup;
    protected RecordRef createRevenuePlansOn;
    protected Boolean directRevenuePosting;
    protected Boolean contingentRevenueHandling;
    protected RecordRef revReclassFXAccount;
    protected Long amortizationPeriod;
    protected Long minimumQuantity;
    protected String minimumQuantityUnits;
    protected Boolean enforceMinQtyInternally;
    protected Long maximumQuantity;
    protected String softDescriptor;
    protected Boolean isFulfillable;
    protected Boolean generateAccruals;
    protected RecordRef costCategory;
    protected Double purchaseOrderQuantity;
    protected Double purchaseOrderAmount;
    protected Double purchaseOrderQuantityDiff;
    protected Double receiptQuantity;
    protected Double receiptAmount;
    protected Double receiptQuantityDiff;
    protected Boolean pricesIncludeTax;
    protected RecordRef quantityPricingSchedule;
    protected Boolean useMarginalRates;
    @XmlSchemaType(name = "string")
    protected ItemOverallQuantityPricingType overallQuantityPricingType;
    protected RecordRef pricingGroup;
    protected RecordRef customForm;
    protected String itemId;
    protected String upcCode;
    protected String displayName;
    protected String vendorName;
    protected RecordRef parent;
    protected Boolean isOnline;
    protected Boolean isGcoCompliant;
    protected Boolean offerSupport;
    protected Boolean isInactive;
    protected String matrixItemNameTemplate;
    protected Boolean availableToPartners;
    protected RecordRef department;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected RecordRef location;
    protected RecordRefList subsidiaryList;
    protected Double vsoePrice;
    @XmlSchemaType(name = "string")
    protected VsoeSopGroup vsoeSopGroup;
    @XmlSchemaType(name = "string")
    protected VsoeDeferral vsoeDeferral;
    @XmlSchemaType(name = "string")
    protected VsoePermitDiscount vsoePermitDiscount;
    protected Boolean vsoeDelivered;
    protected RecordRef itemRevenueCategory;
    protected String currency;
    protected ItemOptionsList itemOptionsList;
    protected MatrixOptionList matrixOptionList;
    protected ItemVendorList itemVendorList;
    protected PricingMatrix pricingMatrix;
    protected ItemAccountingBookDetailList accountingBookDetailList;
    protected RecordRef purchaseTaxCode;
    protected Double rate;
    protected RecordRef salesTaxCode;
    protected TranslationList translationsList;
    protected RecordRef vendor;
    protected OtherChargeResaleItemHierarchyVersionsList hierarchyVersionsList;
    protected RecordRef consumptionUnit;
    protected RecordRef billQtyVarianceAcct;
    protected RecordRef billPriceVarianceAcct;
    protected RecordRef billExchRateVarianceAcct;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the purchaseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseDescription() {
        return purchaseDescription;
    }

    /**
     * Sets the value of the purchaseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseDescription(String value) {
        this.purchaseDescription = value;
    }

    /**
     * Gets the value of the manufacturingChargeItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManufacturingChargeItem() {
        return manufacturingChargeItem;
    }

    /**
     * Sets the value of the manufacturingChargeItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManufacturingChargeItem(Boolean value) {
        this.manufacturingChargeItem = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCost(Double value) {
        this.cost = value;
    }

    /**
     * Gets the value of the costUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostUnits() {
        return costUnits;
    }

    /**
     * Sets the value of the costUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostUnits(String value) {
        this.costUnits = value;
    }

    /**
     * Gets the value of the expenseAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getExpenseAccount() {
        return expenseAccount;
    }

    /**
     * Sets the value of the expenseAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setExpenseAccount(RecordRef value) {
        this.expenseAccount = value;
    }

    /**
     * Gets the value of the intercoExpenseAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIntercoExpenseAccount() {
        return intercoExpenseAccount;
    }

    /**
     * Sets the value of the intercoExpenseAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIntercoExpenseAccount(RecordRef value) {
        this.intercoExpenseAccount = value;
    }

    /**
     * Gets the value of the salesDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesDescription() {
        return salesDescription;
    }

    /**
     * Sets the value of the salesDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesDescription(String value) {
        this.salesDescription = value;
    }

    /**
     * Gets the value of the includeChildren property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeChildren() {
        return includeChildren;
    }

    /**
     * Sets the value of the includeChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeChildren(Boolean value) {
        this.includeChildren = value;
    }

    /**
     * Gets the value of the incomeAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIncomeAccount() {
        return incomeAccount;
    }

    /**
     * Sets the value of the incomeAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIncomeAccount(RecordRef value) {
        this.incomeAccount = value;
    }

    /**
     * Gets the value of the intercoIncomeAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIntercoIncomeAccount() {
        return intercoIncomeAccount;
    }

    /**
     * Sets the value of the intercoIncomeAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIntercoIncomeAccount(RecordRef value) {
        this.intercoIncomeAccount = value;
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
     * Gets the value of the matrixType property.
     * 
     * @return
     *     possible object is
     *     {@link ItemMatrixType }
     *     
     */
    public ItemMatrixType getMatrixType() {
        return matrixType;
    }

    /**
     * Sets the value of the matrixType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemMatrixType }
     *     
     */
    public void setMatrixType(ItemMatrixType value) {
        this.matrixType = value;
    }

    /**
     * Gets the value of the taxSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTaxSchedule() {
        return taxSchedule;
    }

    /**
     * Sets the value of the taxSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTaxSchedule(RecordRef value) {
        this.taxSchedule = value;
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
     * Gets the value of the unitsType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getUnitsType() {
        return unitsType;
    }

    /**
     * Sets the value of the unitsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setUnitsType(RecordRef value) {
        this.unitsType = value;
    }

    /**
     * Gets the value of the purchaseUnit property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPurchaseUnit() {
        return purchaseUnit;
    }

    /**
     * Sets the value of the purchaseUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPurchaseUnit(RecordRef value) {
        this.purchaseUnit = value;
    }

    /**
     * Gets the value of the saleUnit property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSaleUnit() {
        return saleUnit;
    }

    /**
     * Sets the value of the saleUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSaleUnit(RecordRef value) {
        this.saleUnit = value;
    }

    /**
     * Gets the value of the costEstimateUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostEstimateUnits() {
        return costEstimateUnits;
    }

    /**
     * Sets the value of the costEstimateUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostEstimateUnits(String value) {
        this.costEstimateUnits = value;
    }

    /**
     * Gets the value of the issueProduct property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIssueProduct() {
        return issueProduct;
    }

    /**
     * Sets the value of the issueProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIssueProduct(RecordRef value) {
        this.issueProduct = value;
    }

    /**
     * Gets the value of the billingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillingSchedule() {
        return billingSchedule;
    }

    /**
     * Sets the value of the billingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillingSchedule(RecordRef value) {
        this.billingSchedule = value;
    }

    /**
     * Gets the value of the deferredRevenueAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDeferredRevenueAccount() {
        return deferredRevenueAccount;
    }

    /**
     * Sets the value of the deferredRevenueAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDeferredRevenueAccount(RecordRef value) {
        this.deferredRevenueAccount = value;
    }

    /**
     * Gets the value of the intercoDefRevAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIntercoDefRevAccount() {
        return intercoDefRevAccount;
    }

    /**
     * Sets the value of the intercoDefRevAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIntercoDefRevAccount(RecordRef value) {
        this.intercoDefRevAccount = value;
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
     * Gets the value of the deferralAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDeferralAccount() {
        return deferralAccount;
    }

    /**
     * Sets the value of the deferralAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDeferralAccount(RecordRef value) {
        this.deferralAccount = value;
    }

    /**
     * Gets the value of the amortizationTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAmortizationTemplate() {
        return amortizationTemplate;
    }

    /**
     * Sets the value of the amortizationTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAmortizationTemplate(RecordRef value) {
        this.amortizationTemplate = value;
    }

    /**
     * Gets the value of the residual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidual() {
        return residual;
    }

    /**
     * Sets the value of the residual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidual(String value) {
        this.residual = value;
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
     * Gets the value of the revenueRecognitionRule property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRevenueRecognitionRule() {
        return revenueRecognitionRule;
    }

    /**
     * Sets the value of the revenueRecognitionRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRevenueRecognitionRule(RecordRef value) {
        this.revenueRecognitionRule = value;
    }

    /**
     * Gets the value of the revRecForecastRule property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRevRecForecastRule() {
        return revRecForecastRule;
    }

    /**
     * Sets the value of the revRecForecastRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRevRecForecastRule(RecordRef value) {
        this.revRecForecastRule = value;
    }

    /**
     * Gets the value of the revenueAllocationGroup property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRevenueAllocationGroup() {
        return revenueAllocationGroup;
    }

    /**
     * Sets the value of the revenueAllocationGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRevenueAllocationGroup(RecordRef value) {
        this.revenueAllocationGroup = value;
    }

    /**
     * Gets the value of the createRevenuePlansOn property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCreateRevenuePlansOn() {
        return createRevenuePlansOn;
    }

    /**
     * Sets the value of the createRevenuePlansOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCreateRevenuePlansOn(RecordRef value) {
        this.createRevenuePlansOn = value;
    }

    /**
     * Gets the value of the directRevenuePosting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirectRevenuePosting() {
        return directRevenuePosting;
    }

    /**
     * Sets the value of the directRevenuePosting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectRevenuePosting(Boolean value) {
        this.directRevenuePosting = value;
    }

    /**
     * Gets the value of the contingentRevenueHandling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContingentRevenueHandling() {
        return contingentRevenueHandling;
    }

    /**
     * Sets the value of the contingentRevenueHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContingentRevenueHandling(Boolean value) {
        this.contingentRevenueHandling = value;
    }

    /**
     * Gets the value of the revReclassFXAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRevReclassFXAccount() {
        return revReclassFXAccount;
    }

    /**
     * Sets the value of the revReclassFXAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRevReclassFXAccount(RecordRef value) {
        this.revReclassFXAccount = value;
    }

    /**
     * Gets the value of the amortizationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmortizationPeriod() {
        return amortizationPeriod;
    }

    /**
     * Sets the value of the amortizationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmortizationPeriod(Long value) {
        this.amortizationPeriod = value;
    }

    /**
     * Gets the value of the minimumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Sets the value of the minimumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinimumQuantity(Long value) {
        this.minimumQuantity = value;
    }

    /**
     * Gets the value of the minimumQuantityUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumQuantityUnits() {
        return minimumQuantityUnits;
    }

    /**
     * Sets the value of the minimumQuantityUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumQuantityUnits(String value) {
        this.minimumQuantityUnits = value;
    }

    /**
     * Gets the value of the enforceMinQtyInternally property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnforceMinQtyInternally() {
        return enforceMinQtyInternally;
    }

    /**
     * Sets the value of the enforceMinQtyInternally property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnforceMinQtyInternally(Boolean value) {
        this.enforceMinQtyInternally = value;
    }

    /**
     * Gets the value of the maximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * Sets the value of the maximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximumQuantity(Long value) {
        this.maximumQuantity = value;
    }

    /**
     * Gets the value of the softDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftDescriptor() {
        return softDescriptor;
    }

    /**
     * Sets the value of the softDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftDescriptor(String value) {
        this.softDescriptor = value;
    }

    /**
     * Gets the value of the isFulfillable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFulfillable() {
        return isFulfillable;
    }

    /**
     * Sets the value of the isFulfillable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFulfillable(Boolean value) {
        this.isFulfillable = value;
    }

    /**
     * Gets the value of the generateAccruals property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenerateAccruals() {
        return generateAccruals;
    }

    /**
     * Sets the value of the generateAccruals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerateAccruals(Boolean value) {
        this.generateAccruals = value;
    }

    /**
     * Gets the value of the costCategory property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCostCategory() {
        return costCategory;
    }

    /**
     * Sets the value of the costCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCostCategory(RecordRef value) {
        this.costCategory = value;
    }

    /**
     * Gets the value of the purchaseOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseOrderQuantity() {
        return purchaseOrderQuantity;
    }

    /**
     * Sets the value of the purchaseOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseOrderQuantity(Double value) {
        this.purchaseOrderQuantity = value;
    }

    /**
     * Gets the value of the purchaseOrderAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseOrderAmount() {
        return purchaseOrderAmount;
    }

    /**
     * Sets the value of the purchaseOrderAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseOrderAmount(Double value) {
        this.purchaseOrderAmount = value;
    }

    /**
     * Gets the value of the purchaseOrderQuantityDiff property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseOrderQuantityDiff() {
        return purchaseOrderQuantityDiff;
    }

    /**
     * Sets the value of the purchaseOrderQuantityDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseOrderQuantityDiff(Double value) {
        this.purchaseOrderQuantityDiff = value;
    }

    /**
     * Gets the value of the receiptQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReceiptQuantity() {
        return receiptQuantity;
    }

    /**
     * Sets the value of the receiptQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReceiptQuantity(Double value) {
        this.receiptQuantity = value;
    }

    /**
     * Gets the value of the receiptAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReceiptAmount() {
        return receiptAmount;
    }

    /**
     * Sets the value of the receiptAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReceiptAmount(Double value) {
        this.receiptAmount = value;
    }

    /**
     * Gets the value of the receiptQuantityDiff property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReceiptQuantityDiff() {
        return receiptQuantityDiff;
    }

    /**
     * Sets the value of the receiptQuantityDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReceiptQuantityDiff(Double value) {
        this.receiptQuantityDiff = value;
    }

    /**
     * Gets the value of the pricesIncludeTax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPricesIncludeTax() {
        return pricesIncludeTax;
    }

    /**
     * Sets the value of the pricesIncludeTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPricesIncludeTax(Boolean value) {
        this.pricesIncludeTax = value;
    }

    /**
     * Gets the value of the quantityPricingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getQuantityPricingSchedule() {
        return quantityPricingSchedule;
    }

    /**
     * Sets the value of the quantityPricingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setQuantityPricingSchedule(RecordRef value) {
        this.quantityPricingSchedule = value;
    }

    /**
     * Gets the value of the useMarginalRates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseMarginalRates() {
        return useMarginalRates;
    }

    /**
     * Sets the value of the useMarginalRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseMarginalRates(Boolean value) {
        this.useMarginalRates = value;
    }

    /**
     * Gets the value of the overallQuantityPricingType property.
     * 
     * @return
     *     possible object is
     *     {@link ItemOverallQuantityPricingType }
     *     
     */
    public ItemOverallQuantityPricingType getOverallQuantityPricingType() {
        return overallQuantityPricingType;
    }

    /**
     * Sets the value of the overallQuantityPricingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemOverallQuantityPricingType }
     *     
     */
    public void setOverallQuantityPricingType(ItemOverallQuantityPricingType value) {
        this.overallQuantityPricingType = value;
    }

    /**
     * Gets the value of the pricingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPricingGroup() {
        return pricingGroup;
    }

    /**
     * Sets the value of the pricingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPricingGroup(RecordRef value) {
        this.pricingGroup = value;
    }

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
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the upcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpcCode() {
        return upcCode;
    }

    /**
     * Sets the value of the upcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpcCode(String value) {
        this.upcCode = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setParent(RecordRef value) {
        this.parent = value;
    }

    /**
     * Gets the value of the isOnline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOnline() {
        return isOnline;
    }

    /**
     * Sets the value of the isOnline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOnline(Boolean value) {
        this.isOnline = value;
    }

    /**
     * Gets the value of the isGcoCompliant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGcoCompliant() {
        return isGcoCompliant;
    }

    /**
     * Sets the value of the isGcoCompliant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGcoCompliant(Boolean value) {
        this.isGcoCompliant = value;
    }

    /**
     * Gets the value of the offerSupport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfferSupport() {
        return offerSupport;
    }

    /**
     * Sets the value of the offerSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferSupport(Boolean value) {
        this.offerSupport = value;
    }

    /**
     * Gets the value of the isInactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInactive() {
        return isInactive;
    }

    /**
     * Sets the value of the isInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInactive(Boolean value) {
        this.isInactive = value;
    }

    /**
     * Gets the value of the matrixItemNameTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatrixItemNameTemplate() {
        return matrixItemNameTemplate;
    }

    /**
     * Sets the value of the matrixItemNameTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatrixItemNameTemplate(String value) {
        this.matrixItemNameTemplate = value;
    }

    /**
     * Gets the value of the availableToPartners property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailableToPartners() {
        return availableToPartners;
    }

    /**
     * Sets the value of the availableToPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailableToPartners(Boolean value) {
        this.availableToPartners = value;
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
     * Gets the value of the subsidiaryList property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRefList }
     *     
     */
    public RecordRefList getSubsidiaryList() {
        return subsidiaryList;
    }

    /**
     * Sets the value of the subsidiaryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRefList }
     *     
     */
    public void setSubsidiaryList(RecordRefList value) {
        this.subsidiaryList = value;
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
     * Gets the value of the itemRevenueCategory property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getItemRevenueCategory() {
        return itemRevenueCategory;
    }

    /**
     * Sets the value of the itemRevenueCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setItemRevenueCategory(RecordRef value) {
        this.itemRevenueCategory = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the itemOptionsList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemOptionsList }
     *     
     */
    public ItemOptionsList getItemOptionsList() {
        return itemOptionsList;
    }

    /**
     * Sets the value of the itemOptionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemOptionsList }
     *     
     */
    public void setItemOptionsList(ItemOptionsList value) {
        this.itemOptionsList = value;
    }

    /**
     * Gets the value of the matrixOptionList property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixOptionList }
     *     
     */
    public MatrixOptionList getMatrixOptionList() {
        return matrixOptionList;
    }

    /**
     * Sets the value of the matrixOptionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixOptionList }
     *     
     */
    public void setMatrixOptionList(MatrixOptionList value) {
        this.matrixOptionList = value;
    }

    /**
     * Gets the value of the itemVendorList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemVendorList }
     *     
     */
    public ItemVendorList getItemVendorList() {
        return itemVendorList;
    }

    /**
     * Sets the value of the itemVendorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemVendorList }
     *     
     */
    public void setItemVendorList(ItemVendorList value) {
        this.itemVendorList = value;
    }

    /**
     * Gets the value of the pricingMatrix property.
     * 
     * @return
     *     possible object is
     *     {@link PricingMatrix }
     *     
     */
    public PricingMatrix getPricingMatrix() {
        return pricingMatrix;
    }

    /**
     * Sets the value of the pricingMatrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingMatrix }
     *     
     */
    public void setPricingMatrix(PricingMatrix value) {
        this.pricingMatrix = value;
    }

    /**
     * Gets the value of the accountingBookDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemAccountingBookDetailList }
     *     
     */
    public ItemAccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }

    /**
     * Sets the value of the accountingBookDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemAccountingBookDetailList }
     *     
     */
    public void setAccountingBookDetailList(ItemAccountingBookDetailList value) {
        this.accountingBookDetailList = value;
    }

    /**
     * Gets the value of the purchaseTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPurchaseTaxCode() {
        return purchaseTaxCode;
    }

    /**
     * Sets the value of the purchaseTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPurchaseTaxCode(RecordRef value) {
        this.purchaseTaxCode = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRate(Double value) {
        this.rate = value;
    }

    /**
     * Gets the value of the salesTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSalesTaxCode() {
        return salesTaxCode;
    }

    /**
     * Sets the value of the salesTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSalesTaxCode(RecordRef value) {
        this.salesTaxCode = value;
    }

    /**
     * Gets the value of the translationsList property.
     * 
     * @return
     *     possible object is
     *     {@link TranslationList }
     *     
     */
    public TranslationList getTranslationsList() {
        return translationsList;
    }

    /**
     * Sets the value of the translationsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslationList }
     *     
     */
    public void setTranslationsList(TranslationList value) {
        this.translationsList = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setVendor(RecordRef value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the hierarchyVersionsList property.
     * 
     * @return
     *     possible object is
     *     {@link OtherChargeResaleItemHierarchyVersionsList }
     *     
     */
    public OtherChargeResaleItemHierarchyVersionsList getHierarchyVersionsList() {
        return hierarchyVersionsList;
    }

    /**
     * Sets the value of the hierarchyVersionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherChargeResaleItemHierarchyVersionsList }
     *     
     */
    public void setHierarchyVersionsList(OtherChargeResaleItemHierarchyVersionsList value) {
        this.hierarchyVersionsList = value;
    }

    /**
     * Gets the value of the consumptionUnit property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getConsumptionUnit() {
        return consumptionUnit;
    }

    /**
     * Sets the value of the consumptionUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setConsumptionUnit(RecordRef value) {
        this.consumptionUnit = value;
    }

    /**
     * Gets the value of the billQtyVarianceAcct property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillQtyVarianceAcct() {
        return billQtyVarianceAcct;
    }

    /**
     * Sets the value of the billQtyVarianceAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillQtyVarianceAcct(RecordRef value) {
        this.billQtyVarianceAcct = value;
    }

    /**
     * Gets the value of the billPriceVarianceAcct property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillPriceVarianceAcct() {
        return billPriceVarianceAcct;
    }

    /**
     * Sets the value of the billPriceVarianceAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillPriceVarianceAcct(RecordRef value) {
        this.billPriceVarianceAcct = value;
    }

    /**
     * Gets the value of the billExchRateVarianceAcct property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillExchRateVarianceAcct() {
        return billExchRateVarianceAcct;
    }

    /**
     * Sets the value of the billExchRateVarianceAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillExchRateVarianceAcct(RecordRef value) {
        this.billExchRateVarianceAcct = value;
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
