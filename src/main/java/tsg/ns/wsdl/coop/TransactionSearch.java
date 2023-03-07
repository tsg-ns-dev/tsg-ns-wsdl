
package tsg.ns.wsdl.coop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="accountJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}AccountSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="accountingPeriodJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}AccountingPeriodSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="accountingTransactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}AccountingTransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="advanceToApplyAccountJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}AccountSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="appliedToTransactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="applyingTransactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="assemblyJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="billingAddressJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}AddressSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="billingTransactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="binNumberJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}BinSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="bomJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}BomSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="bomRevisionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}BomRevisionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="callJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}PhoneCallSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="caseJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}SupportCaseSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="classJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ClassificationSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="cogsPurchaseJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="cogsSaleJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="contactPrimaryJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ContactSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="createdFromJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="customerJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="customerMainJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="departmentJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}DepartmentSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="depositTransactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="employeeJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="eventJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}CalendarEventSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="expenseCategoryJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ExpenseCategorySearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="fileJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}FileSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="fromLocationJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}LocationSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="fulfillingTransactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="headerBillingAccountJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}BillingAccountSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="installmentJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}InstallmentSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="inventoryDetailJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}InventoryDetailSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="itemJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="itemNumberJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}InventoryNumberSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="jobJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}JobSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="jobMainJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}JobSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="leadSourceJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}CampaignSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="lineBillingAccountJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}BillingAccountSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="lineFileJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}FileSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="locationJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}LocationSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="manufacturingOperationTaskJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ManufacturingOperationTaskSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="messagesJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}MessageSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="nextApproverJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}EntitySearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="opportunityJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}OpportunitySearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="outsourcingVendorJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}VendorSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="paidTransactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="partnerJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}PartnerSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="payingTransactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="paymentInstrumentJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}PaymentInstrumentSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="paymentOptionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}PaymentOptionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="payrollItemJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}PayrollItemSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="projectTaskJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ProjectTaskSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="requestorJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="revCommittingTransactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="revisionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ItemRevisionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="revRecScheduleJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}RevRecScheduleSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="rgPostingTransactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="salesOrderJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="salesRepJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="shippingAddressJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}AddressSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="subsidiaryJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}SubsidiarySearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="taskJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TaskSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="taxCodeJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}SalesTaxItemSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="taxDetailJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TaxDetailSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="taxItemJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}SalesTaxItemSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="timeJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TimeBillSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="toLocationJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}LocationSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="userJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="userNotesJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}NoteSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="vendorJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}VendorSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="vendorLineJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}VendorSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="customSearchJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}CustomSearchJoin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionSearch", namespace = "urn:sales_2022_2.transactions.webservices.netsuite.com", propOrder = {
    "basic",
    "accountJoin",
    "accountingPeriodJoin",
    "accountingTransactionJoin",
    "advanceToApplyAccountJoin",
    "appliedToTransactionJoin",
    "applyingTransactionJoin",
    "assemblyJoin",
    "billingAddressJoin",
    "billingTransactionJoin",
    "binNumberJoin",
    "bomJoin",
    "bomRevisionJoin",
    "callJoin",
    "caseJoin",
    "classJoin",
    "cogsPurchaseJoin",
    "cogsSaleJoin",
    "contactPrimaryJoin",
    "createdFromJoin",
    "customerJoin",
    "customerMainJoin",
    "departmentJoin",
    "depositTransactionJoin",
    "employeeJoin",
    "eventJoin",
    "expenseCategoryJoin",
    "fileJoin",
    "fromLocationJoin",
    "fulfillingTransactionJoin",
    "headerBillingAccountJoin",
    "installmentJoin",
    "inventoryDetailJoin",
    "itemJoin",
    "itemNumberJoin",
    "jobJoin",
    "jobMainJoin",
    "leadSourceJoin",
    "lineBillingAccountJoin",
    "lineFileJoin",
    "locationJoin",
    "manufacturingOperationTaskJoin",
    "messagesJoin",
    "nextApproverJoin",
    "opportunityJoin",
    "outsourcingVendorJoin",
    "paidTransactionJoin",
    "partnerJoin",
    "payingTransactionJoin",
    "paymentInstrumentJoin",
    "paymentOptionJoin",
    "payrollItemJoin",
    "projectTaskJoin",
    "purchaseOrderJoin",
    "requestorJoin",
    "revCommittingTransactionJoin",
    "revisionJoin",
    "revRecScheduleJoin",
    "rgPostingTransactionJoin",
    "salesOrderJoin",
    "salesRepJoin",
    "shippingAddressJoin",
    "subsidiaryJoin",
    "taskJoin",
    "taxCodeJoin",
    "taxDetailJoin",
    "taxItemJoin",
    "timeJoin",
    "toLocationJoin",
    "userJoin",
    "userNotesJoin",
    "vendorJoin",
    "vendorLineJoin",
    "customSearchJoin"
})
public class TransactionSearch
    extends SearchRecord
{

    protected TransactionSearchBasic basic;
    protected AccountSearchBasic accountJoin;
    protected AccountingPeriodSearchBasic accountingPeriodJoin;
    protected AccountingTransactionSearchBasic accountingTransactionJoin;
    protected AccountSearchBasic advanceToApplyAccountJoin;
    protected TransactionSearchBasic appliedToTransactionJoin;
    protected TransactionSearchBasic applyingTransactionJoin;
    protected ItemSearchBasic assemblyJoin;
    protected AddressSearchBasic billingAddressJoin;
    protected TransactionSearchBasic billingTransactionJoin;
    protected BinSearchBasic binNumberJoin;
    protected BomSearchBasic bomJoin;
    protected BomRevisionSearchBasic bomRevisionJoin;
    protected PhoneCallSearchBasic callJoin;
    protected SupportCaseSearchBasic caseJoin;
    protected ClassificationSearchBasic classJoin;
    protected TransactionSearchBasic cogsPurchaseJoin;
    protected TransactionSearchBasic cogsSaleJoin;
    protected ContactSearchBasic contactPrimaryJoin;
    protected TransactionSearchBasic createdFromJoin;
    protected CustomerSearchBasic customerJoin;
    protected CustomerSearchBasic customerMainJoin;
    protected DepartmentSearchBasic departmentJoin;
    protected TransactionSearchBasic depositTransactionJoin;
    protected EmployeeSearchBasic employeeJoin;
    protected CalendarEventSearchBasic eventJoin;
    protected ExpenseCategorySearchBasic expenseCategoryJoin;
    protected FileSearchBasic fileJoin;
    protected LocationSearchBasic fromLocationJoin;
    protected TransactionSearchBasic fulfillingTransactionJoin;
    protected BillingAccountSearchBasic headerBillingAccountJoin;
    protected InstallmentSearchBasic installmentJoin;
    protected InventoryDetailSearchBasic inventoryDetailJoin;
    protected ItemSearchBasic itemJoin;
    protected InventoryNumberSearchBasic itemNumberJoin;
    protected JobSearchBasic jobJoin;
    protected JobSearchBasic jobMainJoin;
    protected CampaignSearchBasic leadSourceJoin;
    protected BillingAccountSearchBasic lineBillingAccountJoin;
    protected FileSearchBasic lineFileJoin;
    protected LocationSearchBasic locationJoin;
    protected ManufacturingOperationTaskSearchBasic manufacturingOperationTaskJoin;
    protected MessageSearchBasic messagesJoin;
    protected EntitySearchBasic nextApproverJoin;
    protected OpportunitySearchBasic opportunityJoin;
    protected VendorSearchBasic outsourcingVendorJoin;
    protected TransactionSearchBasic paidTransactionJoin;
    protected PartnerSearchBasic partnerJoin;
    protected TransactionSearchBasic payingTransactionJoin;
    protected PaymentInstrumentSearchBasic paymentInstrumentJoin;
    protected PaymentOptionSearchBasic paymentOptionJoin;
    protected PayrollItemSearchBasic payrollItemJoin;
    protected ProjectTaskSearchBasic projectTaskJoin;
    protected TransactionSearchBasic purchaseOrderJoin;
    protected EmployeeSearchBasic requestorJoin;
    protected TransactionSearchBasic revCommittingTransactionJoin;
    protected ItemRevisionSearchBasic revisionJoin;
    protected RevRecScheduleSearchBasic revRecScheduleJoin;
    protected TransactionSearchBasic rgPostingTransactionJoin;
    protected TransactionSearchBasic salesOrderJoin;
    protected EmployeeSearchBasic salesRepJoin;
    protected AddressSearchBasic shippingAddressJoin;
    protected SubsidiarySearchBasic subsidiaryJoin;
    protected TaskSearchBasic taskJoin;
    protected SalesTaxItemSearchBasic taxCodeJoin;
    protected TaxDetailSearchBasic taxDetailJoin;
    protected SalesTaxItemSearchBasic taxItemJoin;
    protected TimeBillSearchBasic timeJoin;
    protected LocationSearchBasic toLocationJoin;
    protected EmployeeSearchBasic userJoin;
    protected NoteSearchBasic userNotesJoin;
    protected VendorSearchBasic vendorJoin;
    protected VendorSearchBasic vendorLineJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setBasic(TransactionSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the accountJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchBasic }
     *     
     */
    public AccountSearchBasic getAccountJoin() {
        return accountJoin;
    }

    /**
     * Sets the value of the accountJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchBasic }
     *     
     */
    public void setAccountJoin(AccountSearchBasic value) {
        this.accountJoin = value;
    }

    /**
     * Gets the value of the accountingPeriodJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingPeriodSearchBasic }
     *     
     */
    public AccountingPeriodSearchBasic getAccountingPeriodJoin() {
        return accountingPeriodJoin;
    }

    /**
     * Sets the value of the accountingPeriodJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingPeriodSearchBasic }
     *     
     */
    public void setAccountingPeriodJoin(AccountingPeriodSearchBasic value) {
        this.accountingPeriodJoin = value;
    }

    /**
     * Gets the value of the accountingTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingTransactionSearchBasic }
     *     
     */
    public AccountingTransactionSearchBasic getAccountingTransactionJoin() {
        return accountingTransactionJoin;
    }

    /**
     * Sets the value of the accountingTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingTransactionSearchBasic }
     *     
     */
    public void setAccountingTransactionJoin(AccountingTransactionSearchBasic value) {
        this.accountingTransactionJoin = value;
    }

    /**
     * Gets the value of the advanceToApplyAccountJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchBasic }
     *     
     */
    public AccountSearchBasic getAdvanceToApplyAccountJoin() {
        return advanceToApplyAccountJoin;
    }

    /**
     * Sets the value of the advanceToApplyAccountJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchBasic }
     *     
     */
    public void setAdvanceToApplyAccountJoin(AccountSearchBasic value) {
        this.advanceToApplyAccountJoin = value;
    }

    /**
     * Gets the value of the appliedToTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getAppliedToTransactionJoin() {
        return appliedToTransactionJoin;
    }

    /**
     * Sets the value of the appliedToTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setAppliedToTransactionJoin(TransactionSearchBasic value) {
        this.appliedToTransactionJoin = value;
    }

    /**
     * Gets the value of the applyingTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getApplyingTransactionJoin() {
        return applyingTransactionJoin;
    }

    /**
     * Sets the value of the applyingTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setApplyingTransactionJoin(TransactionSearchBasic value) {
        this.applyingTransactionJoin = value;
    }

    /**
     * Gets the value of the assemblyJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getAssemblyJoin() {
        return assemblyJoin;
    }

    /**
     * Sets the value of the assemblyJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setAssemblyJoin(ItemSearchBasic value) {
        this.assemblyJoin = value;
    }

    /**
     * Gets the value of the billingAddressJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AddressSearchBasic }
     *     
     */
    public AddressSearchBasic getBillingAddressJoin() {
        return billingAddressJoin;
    }

    /**
     * Sets the value of the billingAddressJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressSearchBasic }
     *     
     */
    public void setBillingAddressJoin(AddressSearchBasic value) {
        this.billingAddressJoin = value;
    }

    /**
     * Gets the value of the billingTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getBillingTransactionJoin() {
        return billingTransactionJoin;
    }

    /**
     * Sets the value of the billingTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setBillingTransactionJoin(TransactionSearchBasic value) {
        this.billingTransactionJoin = value;
    }

    /**
     * Gets the value of the binNumberJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BinSearchBasic }
     *     
     */
    public BinSearchBasic getBinNumberJoin() {
        return binNumberJoin;
    }

    /**
     * Sets the value of the binNumberJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinSearchBasic }
     *     
     */
    public void setBinNumberJoin(BinSearchBasic value) {
        this.binNumberJoin = value;
    }

    /**
     * Gets the value of the bomJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BomSearchBasic }
     *     
     */
    public BomSearchBasic getBomJoin() {
        return bomJoin;
    }

    /**
     * Sets the value of the bomJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BomSearchBasic }
     *     
     */
    public void setBomJoin(BomSearchBasic value) {
        this.bomJoin = value;
    }

    /**
     * Gets the value of the bomRevisionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BomRevisionSearchBasic }
     *     
     */
    public BomRevisionSearchBasic getBomRevisionJoin() {
        return bomRevisionJoin;
    }

    /**
     * Sets the value of the bomRevisionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BomRevisionSearchBasic }
     *     
     */
    public void setBomRevisionJoin(BomRevisionSearchBasic value) {
        this.bomRevisionJoin = value;
    }

    /**
     * Gets the value of the callJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneCallSearchBasic }
     *     
     */
    public PhoneCallSearchBasic getCallJoin() {
        return callJoin;
    }

    /**
     * Sets the value of the callJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneCallSearchBasic }
     *     
     */
    public void setCallJoin(PhoneCallSearchBasic value) {
        this.callJoin = value;
    }

    /**
     * Gets the value of the caseJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SupportCaseSearchBasic }
     *     
     */
    public SupportCaseSearchBasic getCaseJoin() {
        return caseJoin;
    }

    /**
     * Sets the value of the caseJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportCaseSearchBasic }
     *     
     */
    public void setCaseJoin(SupportCaseSearchBasic value) {
        this.caseJoin = value;
    }

    /**
     * Gets the value of the classJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSearchBasic }
     *     
     */
    public ClassificationSearchBasic getClassJoin() {
        return classJoin;
    }

    /**
     * Sets the value of the classJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSearchBasic }
     *     
     */
    public void setClassJoin(ClassificationSearchBasic value) {
        this.classJoin = value;
    }

    /**
     * Gets the value of the cogsPurchaseJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getCogsPurchaseJoin() {
        return cogsPurchaseJoin;
    }

    /**
     * Sets the value of the cogsPurchaseJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setCogsPurchaseJoin(TransactionSearchBasic value) {
        this.cogsPurchaseJoin = value;
    }

    /**
     * Gets the value of the cogsSaleJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getCogsSaleJoin() {
        return cogsSaleJoin;
    }

    /**
     * Sets the value of the cogsSaleJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setCogsSaleJoin(TransactionSearchBasic value) {
        this.cogsSaleJoin = value;
    }

    /**
     * Gets the value of the contactPrimaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchBasic }
     *     
     */
    public ContactSearchBasic getContactPrimaryJoin() {
        return contactPrimaryJoin;
    }

    /**
     * Sets the value of the contactPrimaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchBasic }
     *     
     */
    public void setContactPrimaryJoin(ContactSearchBasic value) {
        this.contactPrimaryJoin = value;
    }

    /**
     * Gets the value of the createdFromJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getCreatedFromJoin() {
        return createdFromJoin;
    }

    /**
     * Sets the value of the createdFromJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setCreatedFromJoin(TransactionSearchBasic value) {
        this.createdFromJoin = value;
    }

    /**
     * Gets the value of the customerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public CustomerSearchBasic getCustomerJoin() {
        return customerJoin;
    }

    /**
     * Sets the value of the customerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public void setCustomerJoin(CustomerSearchBasic value) {
        this.customerJoin = value;
    }

    /**
     * Gets the value of the customerMainJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public CustomerSearchBasic getCustomerMainJoin() {
        return customerMainJoin;
    }

    /**
     * Sets the value of the customerMainJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public void setCustomerMainJoin(CustomerSearchBasic value) {
        this.customerMainJoin = value;
    }

    /**
     * Gets the value of the departmentJoin property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentSearchBasic }
     *     
     */
    public DepartmentSearchBasic getDepartmentJoin() {
        return departmentJoin;
    }

    /**
     * Sets the value of the departmentJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentSearchBasic }
     *     
     */
    public void setDepartmentJoin(DepartmentSearchBasic value) {
        this.departmentJoin = value;
    }

    /**
     * Gets the value of the depositTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getDepositTransactionJoin() {
        return depositTransactionJoin;
    }

    /**
     * Sets the value of the depositTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setDepositTransactionJoin(TransactionSearchBasic value) {
        this.depositTransactionJoin = value;
    }

    /**
     * Gets the value of the employeeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getEmployeeJoin() {
        return employeeJoin;
    }

    /**
     * Sets the value of the employeeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setEmployeeJoin(EmployeeSearchBasic value) {
        this.employeeJoin = value;
    }

    /**
     * Gets the value of the eventJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventSearchBasic }
     *     
     */
    public CalendarEventSearchBasic getEventJoin() {
        return eventJoin;
    }

    /**
     * Sets the value of the eventJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventSearchBasic }
     *     
     */
    public void setEventJoin(CalendarEventSearchBasic value) {
        this.eventJoin = value;
    }

    /**
     * Gets the value of the expenseCategoryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ExpenseCategorySearchBasic }
     *     
     */
    public ExpenseCategorySearchBasic getExpenseCategoryJoin() {
        return expenseCategoryJoin;
    }

    /**
     * Sets the value of the expenseCategoryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpenseCategorySearchBasic }
     *     
     */
    public void setExpenseCategoryJoin(ExpenseCategorySearchBasic value) {
        this.expenseCategoryJoin = value;
    }

    /**
     * Gets the value of the fileJoin property.
     * 
     * @return
     *     possible object is
     *     {@link FileSearchBasic }
     *     
     */
    public FileSearchBasic getFileJoin() {
        return fileJoin;
    }

    /**
     * Sets the value of the fileJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchBasic }
     *     
     */
    public void setFileJoin(FileSearchBasic value) {
        this.fileJoin = value;
    }

    /**
     * Gets the value of the fromLocationJoin property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchBasic }
     *     
     */
    public LocationSearchBasic getFromLocationJoin() {
        return fromLocationJoin;
    }

    /**
     * Sets the value of the fromLocationJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchBasic }
     *     
     */
    public void setFromLocationJoin(LocationSearchBasic value) {
        this.fromLocationJoin = value;
    }

    /**
     * Gets the value of the fulfillingTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getFulfillingTransactionJoin() {
        return fulfillingTransactionJoin;
    }

    /**
     * Sets the value of the fulfillingTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setFulfillingTransactionJoin(TransactionSearchBasic value) {
        this.fulfillingTransactionJoin = value;
    }

    /**
     * Gets the value of the headerBillingAccountJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BillingAccountSearchBasic }
     *     
     */
    public BillingAccountSearchBasic getHeaderBillingAccountJoin() {
        return headerBillingAccountJoin;
    }

    /**
     * Sets the value of the headerBillingAccountJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAccountSearchBasic }
     *     
     */
    public void setHeaderBillingAccountJoin(BillingAccountSearchBasic value) {
        this.headerBillingAccountJoin = value;
    }

    /**
     * Gets the value of the installmentJoin property.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentSearchBasic }
     *     
     */
    public InstallmentSearchBasic getInstallmentJoin() {
        return installmentJoin;
    }

    /**
     * Sets the value of the installmentJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentSearchBasic }
     *     
     */
    public void setInstallmentJoin(InstallmentSearchBasic value) {
        this.installmentJoin = value;
    }

    /**
     * Gets the value of the inventoryDetailJoin property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryDetailSearchBasic }
     *     
     */
    public InventoryDetailSearchBasic getInventoryDetailJoin() {
        return inventoryDetailJoin;
    }

    /**
     * Sets the value of the inventoryDetailJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryDetailSearchBasic }
     *     
     */
    public void setInventoryDetailJoin(InventoryDetailSearchBasic value) {
        this.inventoryDetailJoin = value;
    }

    /**
     * Gets the value of the itemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getItemJoin() {
        return itemJoin;
    }

    /**
     * Sets the value of the itemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setItemJoin(ItemSearchBasic value) {
        this.itemJoin = value;
    }

    /**
     * Gets the value of the itemNumberJoin property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryNumberSearchBasic }
     *     
     */
    public InventoryNumberSearchBasic getItemNumberJoin() {
        return itemNumberJoin;
    }

    /**
     * Sets the value of the itemNumberJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryNumberSearchBasic }
     *     
     */
    public void setItemNumberJoin(InventoryNumberSearchBasic value) {
        this.itemNumberJoin = value;
    }

    /**
     * Gets the value of the jobJoin property.
     * 
     * @return
     *     possible object is
     *     {@link JobSearchBasic }
     *     
     */
    public JobSearchBasic getJobJoin() {
        return jobJoin;
    }

    /**
     * Sets the value of the jobJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchBasic }
     *     
     */
    public void setJobJoin(JobSearchBasic value) {
        this.jobJoin = value;
    }

    /**
     * Gets the value of the jobMainJoin property.
     * 
     * @return
     *     possible object is
     *     {@link JobSearchBasic }
     *     
     */
    public JobSearchBasic getJobMainJoin() {
        return jobMainJoin;
    }

    /**
     * Sets the value of the jobMainJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchBasic }
     *     
     */
    public void setJobMainJoin(JobSearchBasic value) {
        this.jobMainJoin = value;
    }

    /**
     * Gets the value of the leadSourceJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignSearchBasic }
     *     
     */
    public CampaignSearchBasic getLeadSourceJoin() {
        return leadSourceJoin;
    }

    /**
     * Sets the value of the leadSourceJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSearchBasic }
     *     
     */
    public void setLeadSourceJoin(CampaignSearchBasic value) {
        this.leadSourceJoin = value;
    }

    /**
     * Gets the value of the lineBillingAccountJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BillingAccountSearchBasic }
     *     
     */
    public BillingAccountSearchBasic getLineBillingAccountJoin() {
        return lineBillingAccountJoin;
    }

    /**
     * Sets the value of the lineBillingAccountJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAccountSearchBasic }
     *     
     */
    public void setLineBillingAccountJoin(BillingAccountSearchBasic value) {
        this.lineBillingAccountJoin = value;
    }

    /**
     * Gets the value of the lineFileJoin property.
     * 
     * @return
     *     possible object is
     *     {@link FileSearchBasic }
     *     
     */
    public FileSearchBasic getLineFileJoin() {
        return lineFileJoin;
    }

    /**
     * Sets the value of the lineFileJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchBasic }
     *     
     */
    public void setLineFileJoin(FileSearchBasic value) {
        this.lineFileJoin = value;
    }

    /**
     * Gets the value of the locationJoin property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchBasic }
     *     
     */
    public LocationSearchBasic getLocationJoin() {
        return locationJoin;
    }

    /**
     * Sets the value of the locationJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchBasic }
     *     
     */
    public void setLocationJoin(LocationSearchBasic value) {
        this.locationJoin = value;
    }

    /**
     * Gets the value of the manufacturingOperationTaskJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingOperationTaskSearchBasic }
     *     
     */
    public ManufacturingOperationTaskSearchBasic getManufacturingOperationTaskJoin() {
        return manufacturingOperationTaskJoin;
    }

    /**
     * Sets the value of the manufacturingOperationTaskJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingOperationTaskSearchBasic }
     *     
     */
    public void setManufacturingOperationTaskJoin(ManufacturingOperationTaskSearchBasic value) {
        this.manufacturingOperationTaskJoin = value;
    }

    /**
     * Gets the value of the messagesJoin property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchBasic }
     *     
     */
    public MessageSearchBasic getMessagesJoin() {
        return messagesJoin;
    }

    /**
     * Sets the value of the messagesJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchBasic }
     *     
     */
    public void setMessagesJoin(MessageSearchBasic value) {
        this.messagesJoin = value;
    }

    /**
     * Gets the value of the nextApproverJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EntitySearchBasic }
     *     
     */
    public EntitySearchBasic getNextApproverJoin() {
        return nextApproverJoin;
    }

    /**
     * Sets the value of the nextApproverJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitySearchBasic }
     *     
     */
    public void setNextApproverJoin(EntitySearchBasic value) {
        this.nextApproverJoin = value;
    }

    /**
     * Gets the value of the opportunityJoin property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunitySearchBasic }
     *     
     */
    public OpportunitySearchBasic getOpportunityJoin() {
        return opportunityJoin;
    }

    /**
     * Sets the value of the opportunityJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunitySearchBasic }
     *     
     */
    public void setOpportunityJoin(OpportunitySearchBasic value) {
        this.opportunityJoin = value;
    }

    /**
     * Gets the value of the outsourcingVendorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchBasic }
     *     
     */
    public VendorSearchBasic getOutsourcingVendorJoin() {
        return outsourcingVendorJoin;
    }

    /**
     * Sets the value of the outsourcingVendorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchBasic }
     *     
     */
    public void setOutsourcingVendorJoin(VendorSearchBasic value) {
        this.outsourcingVendorJoin = value;
    }

    /**
     * Gets the value of the paidTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getPaidTransactionJoin() {
        return paidTransactionJoin;
    }

    /**
     * Sets the value of the paidTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setPaidTransactionJoin(TransactionSearchBasic value) {
        this.paidTransactionJoin = value;
    }

    /**
     * Gets the value of the partnerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerSearchBasic }
     *     
     */
    public PartnerSearchBasic getPartnerJoin() {
        return partnerJoin;
    }

    /**
     * Sets the value of the partnerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerSearchBasic }
     *     
     */
    public void setPartnerJoin(PartnerSearchBasic value) {
        this.partnerJoin = value;
    }

    /**
     * Gets the value of the payingTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getPayingTransactionJoin() {
        return payingTransactionJoin;
    }

    /**
     * Sets the value of the payingTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setPayingTransactionJoin(TransactionSearchBasic value) {
        this.payingTransactionJoin = value;
    }

    /**
     * Gets the value of the paymentInstrumentJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrumentSearchBasic }
     *     
     */
    public PaymentInstrumentSearchBasic getPaymentInstrumentJoin() {
        return paymentInstrumentJoin;
    }

    /**
     * Sets the value of the paymentInstrumentJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrumentSearchBasic }
     *     
     */
    public void setPaymentInstrumentJoin(PaymentInstrumentSearchBasic value) {
        this.paymentInstrumentJoin = value;
    }

    /**
     * Gets the value of the paymentOptionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentOptionSearchBasic }
     *     
     */
    public PaymentOptionSearchBasic getPaymentOptionJoin() {
        return paymentOptionJoin;
    }

    /**
     * Sets the value of the paymentOptionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentOptionSearchBasic }
     *     
     */
    public void setPaymentOptionJoin(PaymentOptionSearchBasic value) {
        this.paymentOptionJoin = value;
    }

    /**
     * Gets the value of the payrollItemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollItemSearchBasic }
     *     
     */
    public PayrollItemSearchBasic getPayrollItemJoin() {
        return payrollItemJoin;
    }

    /**
     * Sets the value of the payrollItemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollItemSearchBasic }
     *     
     */
    public void setPayrollItemJoin(PayrollItemSearchBasic value) {
        this.payrollItemJoin = value;
    }

    /**
     * Gets the value of the projectTaskJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskSearchBasic }
     *     
     */
    public ProjectTaskSearchBasic getProjectTaskJoin() {
        return projectTaskJoin;
    }

    /**
     * Sets the value of the projectTaskJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskSearchBasic }
     *     
     */
    public void setProjectTaskJoin(ProjectTaskSearchBasic value) {
        this.projectTaskJoin = value;
    }

    /**
     * Gets the value of the purchaseOrderJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getPurchaseOrderJoin() {
        return purchaseOrderJoin;
    }

    /**
     * Sets the value of the purchaseOrderJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setPurchaseOrderJoin(TransactionSearchBasic value) {
        this.purchaseOrderJoin = value;
    }

    /**
     * Gets the value of the requestorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getRequestorJoin() {
        return requestorJoin;
    }

    /**
     * Sets the value of the requestorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setRequestorJoin(EmployeeSearchBasic value) {
        this.requestorJoin = value;
    }

    /**
     * Gets the value of the revCommittingTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getRevCommittingTransactionJoin() {
        return revCommittingTransactionJoin;
    }

    /**
     * Sets the value of the revCommittingTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setRevCommittingTransactionJoin(TransactionSearchBasic value) {
        this.revCommittingTransactionJoin = value;
    }

    /**
     * Gets the value of the revisionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemRevisionSearchBasic }
     *     
     */
    public ItemRevisionSearchBasic getRevisionJoin() {
        return revisionJoin;
    }

    /**
     * Sets the value of the revisionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRevisionSearchBasic }
     *     
     */
    public void setRevisionJoin(ItemRevisionSearchBasic value) {
        this.revisionJoin = value;
    }

    /**
     * Gets the value of the revRecScheduleJoin property.
     * 
     * @return
     *     possible object is
     *     {@link RevRecScheduleSearchBasic }
     *     
     */
    public RevRecScheduleSearchBasic getRevRecScheduleJoin() {
        return revRecScheduleJoin;
    }

    /**
     * Sets the value of the revRecScheduleJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevRecScheduleSearchBasic }
     *     
     */
    public void setRevRecScheduleJoin(RevRecScheduleSearchBasic value) {
        this.revRecScheduleJoin = value;
    }

    /**
     * Gets the value of the rgPostingTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getRgPostingTransactionJoin() {
        return rgPostingTransactionJoin;
    }

    /**
     * Sets the value of the rgPostingTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setRgPostingTransactionJoin(TransactionSearchBasic value) {
        this.rgPostingTransactionJoin = value;
    }

    /**
     * Gets the value of the salesOrderJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getSalesOrderJoin() {
        return salesOrderJoin;
    }

    /**
     * Sets the value of the salesOrderJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setSalesOrderJoin(TransactionSearchBasic value) {
        this.salesOrderJoin = value;
    }

    /**
     * Gets the value of the salesRepJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getSalesRepJoin() {
        return salesRepJoin;
    }

    /**
     * Sets the value of the salesRepJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setSalesRepJoin(EmployeeSearchBasic value) {
        this.salesRepJoin = value;
    }

    /**
     * Gets the value of the shippingAddressJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AddressSearchBasic }
     *     
     */
    public AddressSearchBasic getShippingAddressJoin() {
        return shippingAddressJoin;
    }

    /**
     * Sets the value of the shippingAddressJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressSearchBasic }
     *     
     */
    public void setShippingAddressJoin(AddressSearchBasic value) {
        this.shippingAddressJoin = value;
    }

    /**
     * Gets the value of the subsidiaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SubsidiarySearchBasic }
     *     
     */
    public SubsidiarySearchBasic getSubsidiaryJoin() {
        return subsidiaryJoin;
    }

    /**
     * Sets the value of the subsidiaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiarySearchBasic }
     *     
     */
    public void setSubsidiaryJoin(SubsidiarySearchBasic value) {
        this.subsidiaryJoin = value;
    }

    /**
     * Gets the value of the taskJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TaskSearchBasic }
     *     
     */
    public TaskSearchBasic getTaskJoin() {
        return taskJoin;
    }

    /**
     * Sets the value of the taskJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSearchBasic }
     *     
     */
    public void setTaskJoin(TaskSearchBasic value) {
        this.taskJoin = value;
    }

    /**
     * Gets the value of the taxCodeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxItemSearchBasic }
     *     
     */
    public SalesTaxItemSearchBasic getTaxCodeJoin() {
        return taxCodeJoin;
    }

    /**
     * Sets the value of the taxCodeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxItemSearchBasic }
     *     
     */
    public void setTaxCodeJoin(SalesTaxItemSearchBasic value) {
        this.taxCodeJoin = value;
    }

    /**
     * Gets the value of the taxDetailJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailSearchBasic }
     *     
     */
    public TaxDetailSearchBasic getTaxDetailJoin() {
        return taxDetailJoin;
    }

    /**
     * Sets the value of the taxDetailJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailSearchBasic }
     *     
     */
    public void setTaxDetailJoin(TaxDetailSearchBasic value) {
        this.taxDetailJoin = value;
    }

    /**
     * Gets the value of the taxItemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxItemSearchBasic }
     *     
     */
    public SalesTaxItemSearchBasic getTaxItemJoin() {
        return taxItemJoin;
    }

    /**
     * Sets the value of the taxItemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxItemSearchBasic }
     *     
     */
    public void setTaxItemJoin(SalesTaxItemSearchBasic value) {
        this.taxItemJoin = value;
    }

    /**
     * Gets the value of the timeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TimeBillSearchBasic }
     *     
     */
    public TimeBillSearchBasic getTimeJoin() {
        return timeJoin;
    }

    /**
     * Sets the value of the timeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBillSearchBasic }
     *     
     */
    public void setTimeJoin(TimeBillSearchBasic value) {
        this.timeJoin = value;
    }

    /**
     * Gets the value of the toLocationJoin property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchBasic }
     *     
     */
    public LocationSearchBasic getToLocationJoin() {
        return toLocationJoin;
    }

    /**
     * Sets the value of the toLocationJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchBasic }
     *     
     */
    public void setToLocationJoin(LocationSearchBasic value) {
        this.toLocationJoin = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchBasic value) {
        this.userJoin = value;
    }

    /**
     * Gets the value of the userNotesJoin property.
     * 
     * @return
     *     possible object is
     *     {@link NoteSearchBasic }
     *     
     */
    public NoteSearchBasic getUserNotesJoin() {
        return userNotesJoin;
    }

    /**
     * Sets the value of the userNotesJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteSearchBasic }
     *     
     */
    public void setUserNotesJoin(NoteSearchBasic value) {
        this.userNotesJoin = value;
    }

    /**
     * Gets the value of the vendorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchBasic }
     *     
     */
    public VendorSearchBasic getVendorJoin() {
        return vendorJoin;
    }

    /**
     * Sets the value of the vendorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchBasic }
     *     
     */
    public void setVendorJoin(VendorSearchBasic value) {
        this.vendorJoin = value;
    }

    /**
     * Gets the value of the vendorLineJoin property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchBasic }
     *     
     */
    public VendorSearchBasic getVendorLineJoin() {
        return vendorLineJoin;
    }

    /**
     * Sets the value of the vendorLineJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchBasic }
     *     
     */
    public void setVendorLineJoin(VendorSearchBasic value) {
        this.vendorLineJoin = value;
    }

    /**
     * Gets the value of the customSearchJoin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the customSearchJoin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomSearchJoin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomSearchJoin }
     * 
     * 
     */
    public List<CustomSearchJoin> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchJoin>();
        }
        return this.customSearchJoin;
    }

}
