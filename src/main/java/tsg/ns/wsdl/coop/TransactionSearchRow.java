
package tsg.ns.wsdl.coop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="accountJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}AccountSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="accountingPeriodJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}AccountingPeriodSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="accountingTransactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}AccountingTransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="advanceToApplyAccountJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}AccountSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="appliedToTransactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="applyingTransactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="assemblyJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="billingAddressJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}AddressSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="billingTransactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="binNumberJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}BinSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="bomJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}BomSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="bomRevisionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}BomRevisionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="callJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}PhoneCallSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="caseJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}SupportCaseSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="classJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ClassificationSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="cogsPurchaseJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="cogsSaleJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="contactPrimaryJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ContactSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="createdFromJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="customerJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="customerMainJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="departmentJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}DepartmentSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="depositTransactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="employeeJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="eventJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}CalendarEventSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="expenseCategoryJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ExpenseCategorySearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="fileJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}FileSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="fromLocationJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}LocationSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="fulfillingTransactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="headerBillingAccountJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}BillingAccountSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="installmentJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}InstallmentSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="inventoryDetailJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}InventoryDetailSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="itemJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="itemNumberJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}InventoryNumberSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="jobJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}JobSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="jobMainJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}JobSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="leadSourceJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}CampaignSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="lineBillingAccountJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}BillingAccountSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="lineFileJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}FileSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="locationJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}LocationSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="manufacturingOperationTaskJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ManufacturingOperationTaskSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="messagesJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}MessageSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="nextApproverJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}EntitySearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="opportunityJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}OpportunitySearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="outsourcingVendorJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}VendorSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="paidTransactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="partnerJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}PartnerSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="payingTransactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="paymentInstrumentJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}PaymentInstrumentSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="paymentOptionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}PaymentOptionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="payrollItemJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}PayrollItemSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="projectTaskJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ProjectTaskSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="requestorJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="revCommittingTransactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="revisionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ItemRevisionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="revRecScheduleJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}RevRecScheduleSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="rgPostingTransactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="salesOrderJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="salesRepJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="shippingAddressJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}AddressSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="subsidiaryJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}SubsidiarySearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="taskJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TaskSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="taxCodeJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}SalesTaxItemSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="taxDetailJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TaxDetailSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="taxItemJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}SalesTaxItemSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="timeJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TimeBillSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="toLocationJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}LocationSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="userJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="userNotesJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}NoteSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="vendorJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}VendorSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="vendorLineJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}VendorSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="customSearchJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}CustomSearchRowBasic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionSearchRow", namespace = "urn:sales_2022_2.transactions.webservices.netsuite.com", propOrder = {
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
public class TransactionSearchRow
    extends SearchRow
{

    protected TransactionSearchRowBasic basic;
    protected AccountSearchRowBasic accountJoin;
    protected AccountingPeriodSearchRowBasic accountingPeriodJoin;
    protected AccountingTransactionSearchRowBasic accountingTransactionJoin;
    protected AccountSearchRowBasic advanceToApplyAccountJoin;
    protected TransactionSearchRowBasic appliedToTransactionJoin;
    protected TransactionSearchRowBasic applyingTransactionJoin;
    protected ItemSearchRowBasic assemblyJoin;
    protected AddressSearchRowBasic billingAddressJoin;
    protected TransactionSearchRowBasic billingTransactionJoin;
    protected BinSearchRowBasic binNumberJoin;
    protected BomSearchRowBasic bomJoin;
    protected BomRevisionSearchRowBasic bomRevisionJoin;
    protected PhoneCallSearchRowBasic callJoin;
    protected SupportCaseSearchRowBasic caseJoin;
    protected ClassificationSearchRowBasic classJoin;
    protected TransactionSearchRowBasic cogsPurchaseJoin;
    protected TransactionSearchRowBasic cogsSaleJoin;
    protected ContactSearchRowBasic contactPrimaryJoin;
    protected TransactionSearchRowBasic createdFromJoin;
    protected CustomerSearchRowBasic customerJoin;
    protected CustomerSearchRowBasic customerMainJoin;
    protected DepartmentSearchRowBasic departmentJoin;
    protected TransactionSearchRowBasic depositTransactionJoin;
    protected EmployeeSearchRowBasic employeeJoin;
    protected CalendarEventSearchRowBasic eventJoin;
    protected ExpenseCategorySearchRowBasic expenseCategoryJoin;
    protected FileSearchRowBasic fileJoin;
    protected LocationSearchRowBasic fromLocationJoin;
    protected TransactionSearchRowBasic fulfillingTransactionJoin;
    protected BillingAccountSearchRowBasic headerBillingAccountJoin;
    protected InstallmentSearchRowBasic installmentJoin;
    protected InventoryDetailSearchRowBasic inventoryDetailJoin;
    protected ItemSearchRowBasic itemJoin;
    protected InventoryNumberSearchRowBasic itemNumberJoin;
    protected JobSearchRowBasic jobJoin;
    protected JobSearchRowBasic jobMainJoin;
    protected CampaignSearchRowBasic leadSourceJoin;
    protected BillingAccountSearchRowBasic lineBillingAccountJoin;
    protected FileSearchRowBasic lineFileJoin;
    protected LocationSearchRowBasic locationJoin;
    protected ManufacturingOperationTaskSearchRowBasic manufacturingOperationTaskJoin;
    protected MessageSearchRowBasic messagesJoin;
    protected EntitySearchRowBasic nextApproverJoin;
    protected OpportunitySearchRowBasic opportunityJoin;
    protected VendorSearchRowBasic outsourcingVendorJoin;
    protected TransactionSearchRowBasic paidTransactionJoin;
    protected PartnerSearchRowBasic partnerJoin;
    protected TransactionSearchRowBasic payingTransactionJoin;
    protected PaymentInstrumentSearchRowBasic paymentInstrumentJoin;
    protected PaymentOptionSearchRowBasic paymentOptionJoin;
    protected PayrollItemSearchRowBasic payrollItemJoin;
    protected ProjectTaskSearchRowBasic projectTaskJoin;
    protected TransactionSearchRowBasic purchaseOrderJoin;
    protected EmployeeSearchRowBasic requestorJoin;
    protected TransactionSearchRowBasic revCommittingTransactionJoin;
    protected ItemRevisionSearchRowBasic revisionJoin;
    protected RevRecScheduleSearchRowBasic revRecScheduleJoin;
    protected TransactionSearchRowBasic rgPostingTransactionJoin;
    protected TransactionSearchRowBasic salesOrderJoin;
    protected EmployeeSearchRowBasic salesRepJoin;
    protected AddressSearchRowBasic shippingAddressJoin;
    protected SubsidiarySearchRowBasic subsidiaryJoin;
    protected TaskSearchRowBasic taskJoin;
    protected SalesTaxItemSearchRowBasic taxCodeJoin;
    protected TaxDetailSearchRowBasic taxDetailJoin;
    protected SalesTaxItemSearchRowBasic taxItemJoin;
    protected TimeBillSearchRowBasic timeJoin;
    protected LocationSearchRowBasic toLocationJoin;
    protected EmployeeSearchRowBasic userJoin;
    protected NoteSearchRowBasic userNotesJoin;
    protected VendorSearchRowBasic vendorJoin;
    protected VendorSearchRowBasic vendorLineJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setBasic(TransactionSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the accountJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public AccountSearchRowBasic getAccountJoin() {
        return accountJoin;
    }

    /**
     * Sets the value of the accountJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public void setAccountJoin(AccountSearchRowBasic value) {
        this.accountJoin = value;
    }

    /**
     * Gets the value of the accountingPeriodJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingPeriodSearchRowBasic }
     *     
     */
    public AccountingPeriodSearchRowBasic getAccountingPeriodJoin() {
        return accountingPeriodJoin;
    }

    /**
     * Sets the value of the accountingPeriodJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingPeriodSearchRowBasic }
     *     
     */
    public void setAccountingPeriodJoin(AccountingPeriodSearchRowBasic value) {
        this.accountingPeriodJoin = value;
    }

    /**
     * Gets the value of the accountingTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingTransactionSearchRowBasic }
     *     
     */
    public AccountingTransactionSearchRowBasic getAccountingTransactionJoin() {
        return accountingTransactionJoin;
    }

    /**
     * Sets the value of the accountingTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingTransactionSearchRowBasic }
     *     
     */
    public void setAccountingTransactionJoin(AccountingTransactionSearchRowBasic value) {
        this.accountingTransactionJoin = value;
    }

    /**
     * Gets the value of the advanceToApplyAccountJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public AccountSearchRowBasic getAdvanceToApplyAccountJoin() {
        return advanceToApplyAccountJoin;
    }

    /**
     * Sets the value of the advanceToApplyAccountJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public void setAdvanceToApplyAccountJoin(AccountSearchRowBasic value) {
        this.advanceToApplyAccountJoin = value;
    }

    /**
     * Gets the value of the appliedToTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getAppliedToTransactionJoin() {
        return appliedToTransactionJoin;
    }

    /**
     * Sets the value of the appliedToTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setAppliedToTransactionJoin(TransactionSearchRowBasic value) {
        this.appliedToTransactionJoin = value;
    }

    /**
     * Gets the value of the applyingTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getApplyingTransactionJoin() {
        return applyingTransactionJoin;
    }

    /**
     * Sets the value of the applyingTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setApplyingTransactionJoin(TransactionSearchRowBasic value) {
        this.applyingTransactionJoin = value;
    }

    /**
     * Gets the value of the assemblyJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getAssemblyJoin() {
        return assemblyJoin;
    }

    /**
     * Sets the value of the assemblyJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setAssemblyJoin(ItemSearchRowBasic value) {
        this.assemblyJoin = value;
    }

    /**
     * Gets the value of the billingAddressJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AddressSearchRowBasic }
     *     
     */
    public AddressSearchRowBasic getBillingAddressJoin() {
        return billingAddressJoin;
    }

    /**
     * Sets the value of the billingAddressJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressSearchRowBasic }
     *     
     */
    public void setBillingAddressJoin(AddressSearchRowBasic value) {
        this.billingAddressJoin = value;
    }

    /**
     * Gets the value of the billingTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getBillingTransactionJoin() {
        return billingTransactionJoin;
    }

    /**
     * Sets the value of the billingTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setBillingTransactionJoin(TransactionSearchRowBasic value) {
        this.billingTransactionJoin = value;
    }

    /**
     * Gets the value of the binNumberJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BinSearchRowBasic }
     *     
     */
    public BinSearchRowBasic getBinNumberJoin() {
        return binNumberJoin;
    }

    /**
     * Sets the value of the binNumberJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinSearchRowBasic }
     *     
     */
    public void setBinNumberJoin(BinSearchRowBasic value) {
        this.binNumberJoin = value;
    }

    /**
     * Gets the value of the bomJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BomSearchRowBasic }
     *     
     */
    public BomSearchRowBasic getBomJoin() {
        return bomJoin;
    }

    /**
     * Sets the value of the bomJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BomSearchRowBasic }
     *     
     */
    public void setBomJoin(BomSearchRowBasic value) {
        this.bomJoin = value;
    }

    /**
     * Gets the value of the bomRevisionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BomRevisionSearchRowBasic }
     *     
     */
    public BomRevisionSearchRowBasic getBomRevisionJoin() {
        return bomRevisionJoin;
    }

    /**
     * Sets the value of the bomRevisionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BomRevisionSearchRowBasic }
     *     
     */
    public void setBomRevisionJoin(BomRevisionSearchRowBasic value) {
        this.bomRevisionJoin = value;
    }

    /**
     * Gets the value of the callJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneCallSearchRowBasic }
     *     
     */
    public PhoneCallSearchRowBasic getCallJoin() {
        return callJoin;
    }

    /**
     * Sets the value of the callJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneCallSearchRowBasic }
     *     
     */
    public void setCallJoin(PhoneCallSearchRowBasic value) {
        this.callJoin = value;
    }

    /**
     * Gets the value of the caseJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SupportCaseSearchRowBasic }
     *     
     */
    public SupportCaseSearchRowBasic getCaseJoin() {
        return caseJoin;
    }

    /**
     * Sets the value of the caseJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportCaseSearchRowBasic }
     *     
     */
    public void setCaseJoin(SupportCaseSearchRowBasic value) {
        this.caseJoin = value;
    }

    /**
     * Gets the value of the classJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSearchRowBasic }
     *     
     */
    public ClassificationSearchRowBasic getClassJoin() {
        return classJoin;
    }

    /**
     * Sets the value of the classJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSearchRowBasic }
     *     
     */
    public void setClassJoin(ClassificationSearchRowBasic value) {
        this.classJoin = value;
    }

    /**
     * Gets the value of the cogsPurchaseJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getCogsPurchaseJoin() {
        return cogsPurchaseJoin;
    }

    /**
     * Sets the value of the cogsPurchaseJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setCogsPurchaseJoin(TransactionSearchRowBasic value) {
        this.cogsPurchaseJoin = value;
    }

    /**
     * Gets the value of the cogsSaleJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getCogsSaleJoin() {
        return cogsSaleJoin;
    }

    /**
     * Sets the value of the cogsSaleJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setCogsSaleJoin(TransactionSearchRowBasic value) {
        this.cogsSaleJoin = value;
    }

    /**
     * Gets the value of the contactPrimaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public ContactSearchRowBasic getContactPrimaryJoin() {
        return contactPrimaryJoin;
    }

    /**
     * Sets the value of the contactPrimaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public void setContactPrimaryJoin(ContactSearchRowBasic value) {
        this.contactPrimaryJoin = value;
    }

    /**
     * Gets the value of the createdFromJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getCreatedFromJoin() {
        return createdFromJoin;
    }

    /**
     * Sets the value of the createdFromJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setCreatedFromJoin(TransactionSearchRowBasic value) {
        this.createdFromJoin = value;
    }

    /**
     * Gets the value of the customerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public CustomerSearchRowBasic getCustomerJoin() {
        return customerJoin;
    }

    /**
     * Sets the value of the customerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public void setCustomerJoin(CustomerSearchRowBasic value) {
        this.customerJoin = value;
    }

    /**
     * Gets the value of the customerMainJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public CustomerSearchRowBasic getCustomerMainJoin() {
        return customerMainJoin;
    }

    /**
     * Sets the value of the customerMainJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public void setCustomerMainJoin(CustomerSearchRowBasic value) {
        this.customerMainJoin = value;
    }

    /**
     * Gets the value of the departmentJoin property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentSearchRowBasic }
     *     
     */
    public DepartmentSearchRowBasic getDepartmentJoin() {
        return departmentJoin;
    }

    /**
     * Sets the value of the departmentJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentSearchRowBasic }
     *     
     */
    public void setDepartmentJoin(DepartmentSearchRowBasic value) {
        this.departmentJoin = value;
    }

    /**
     * Gets the value of the depositTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getDepositTransactionJoin() {
        return depositTransactionJoin;
    }

    /**
     * Sets the value of the depositTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setDepositTransactionJoin(TransactionSearchRowBasic value) {
        this.depositTransactionJoin = value;
    }

    /**
     * Gets the value of the employeeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getEmployeeJoin() {
        return employeeJoin;
    }

    /**
     * Sets the value of the employeeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setEmployeeJoin(EmployeeSearchRowBasic value) {
        this.employeeJoin = value;
    }

    /**
     * Gets the value of the eventJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventSearchRowBasic }
     *     
     */
    public CalendarEventSearchRowBasic getEventJoin() {
        return eventJoin;
    }

    /**
     * Sets the value of the eventJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventSearchRowBasic }
     *     
     */
    public void setEventJoin(CalendarEventSearchRowBasic value) {
        this.eventJoin = value;
    }

    /**
     * Gets the value of the expenseCategoryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ExpenseCategorySearchRowBasic }
     *     
     */
    public ExpenseCategorySearchRowBasic getExpenseCategoryJoin() {
        return expenseCategoryJoin;
    }

    /**
     * Sets the value of the expenseCategoryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpenseCategorySearchRowBasic }
     *     
     */
    public void setExpenseCategoryJoin(ExpenseCategorySearchRowBasic value) {
        this.expenseCategoryJoin = value;
    }

    /**
     * Gets the value of the fileJoin property.
     * 
     * @return
     *     possible object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public FileSearchRowBasic getFileJoin() {
        return fileJoin;
    }

    /**
     * Sets the value of the fileJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public void setFileJoin(FileSearchRowBasic value) {
        this.fileJoin = value;
    }

    /**
     * Gets the value of the fromLocationJoin property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public LocationSearchRowBasic getFromLocationJoin() {
        return fromLocationJoin;
    }

    /**
     * Sets the value of the fromLocationJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public void setFromLocationJoin(LocationSearchRowBasic value) {
        this.fromLocationJoin = value;
    }

    /**
     * Gets the value of the fulfillingTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getFulfillingTransactionJoin() {
        return fulfillingTransactionJoin;
    }

    /**
     * Sets the value of the fulfillingTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setFulfillingTransactionJoin(TransactionSearchRowBasic value) {
        this.fulfillingTransactionJoin = value;
    }

    /**
     * Gets the value of the headerBillingAccountJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BillingAccountSearchRowBasic }
     *     
     */
    public BillingAccountSearchRowBasic getHeaderBillingAccountJoin() {
        return headerBillingAccountJoin;
    }

    /**
     * Sets the value of the headerBillingAccountJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAccountSearchRowBasic }
     *     
     */
    public void setHeaderBillingAccountJoin(BillingAccountSearchRowBasic value) {
        this.headerBillingAccountJoin = value;
    }

    /**
     * Gets the value of the installmentJoin property.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentSearchRowBasic }
     *     
     */
    public InstallmentSearchRowBasic getInstallmentJoin() {
        return installmentJoin;
    }

    /**
     * Sets the value of the installmentJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentSearchRowBasic }
     *     
     */
    public void setInstallmentJoin(InstallmentSearchRowBasic value) {
        this.installmentJoin = value;
    }

    /**
     * Gets the value of the inventoryDetailJoin property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryDetailSearchRowBasic }
     *     
     */
    public InventoryDetailSearchRowBasic getInventoryDetailJoin() {
        return inventoryDetailJoin;
    }

    /**
     * Sets the value of the inventoryDetailJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryDetailSearchRowBasic }
     *     
     */
    public void setInventoryDetailJoin(InventoryDetailSearchRowBasic value) {
        this.inventoryDetailJoin = value;
    }

    /**
     * Gets the value of the itemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getItemJoin() {
        return itemJoin;
    }

    /**
     * Sets the value of the itemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setItemJoin(ItemSearchRowBasic value) {
        this.itemJoin = value;
    }

    /**
     * Gets the value of the itemNumberJoin property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryNumberSearchRowBasic }
     *     
     */
    public InventoryNumberSearchRowBasic getItemNumberJoin() {
        return itemNumberJoin;
    }

    /**
     * Sets the value of the itemNumberJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryNumberSearchRowBasic }
     *     
     */
    public void setItemNumberJoin(InventoryNumberSearchRowBasic value) {
        this.itemNumberJoin = value;
    }

    /**
     * Gets the value of the jobJoin property.
     * 
     * @return
     *     possible object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public JobSearchRowBasic getJobJoin() {
        return jobJoin;
    }

    /**
     * Sets the value of the jobJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public void setJobJoin(JobSearchRowBasic value) {
        this.jobJoin = value;
    }

    /**
     * Gets the value of the jobMainJoin property.
     * 
     * @return
     *     possible object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public JobSearchRowBasic getJobMainJoin() {
        return jobMainJoin;
    }

    /**
     * Sets the value of the jobMainJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public void setJobMainJoin(JobSearchRowBasic value) {
        this.jobMainJoin = value;
    }

    /**
     * Gets the value of the leadSourceJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignSearchRowBasic }
     *     
     */
    public CampaignSearchRowBasic getLeadSourceJoin() {
        return leadSourceJoin;
    }

    /**
     * Sets the value of the leadSourceJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSearchRowBasic }
     *     
     */
    public void setLeadSourceJoin(CampaignSearchRowBasic value) {
        this.leadSourceJoin = value;
    }

    /**
     * Gets the value of the lineBillingAccountJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BillingAccountSearchRowBasic }
     *     
     */
    public BillingAccountSearchRowBasic getLineBillingAccountJoin() {
        return lineBillingAccountJoin;
    }

    /**
     * Sets the value of the lineBillingAccountJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAccountSearchRowBasic }
     *     
     */
    public void setLineBillingAccountJoin(BillingAccountSearchRowBasic value) {
        this.lineBillingAccountJoin = value;
    }

    /**
     * Gets the value of the lineFileJoin property.
     * 
     * @return
     *     possible object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public FileSearchRowBasic getLineFileJoin() {
        return lineFileJoin;
    }

    /**
     * Sets the value of the lineFileJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public void setLineFileJoin(FileSearchRowBasic value) {
        this.lineFileJoin = value;
    }

    /**
     * Gets the value of the locationJoin property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public LocationSearchRowBasic getLocationJoin() {
        return locationJoin;
    }

    /**
     * Sets the value of the locationJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public void setLocationJoin(LocationSearchRowBasic value) {
        this.locationJoin = value;
    }

    /**
     * Gets the value of the manufacturingOperationTaskJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingOperationTaskSearchRowBasic }
     *     
     */
    public ManufacturingOperationTaskSearchRowBasic getManufacturingOperationTaskJoin() {
        return manufacturingOperationTaskJoin;
    }

    /**
     * Sets the value of the manufacturingOperationTaskJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingOperationTaskSearchRowBasic }
     *     
     */
    public void setManufacturingOperationTaskJoin(ManufacturingOperationTaskSearchRowBasic value) {
        this.manufacturingOperationTaskJoin = value;
    }

    /**
     * Gets the value of the messagesJoin property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public MessageSearchRowBasic getMessagesJoin() {
        return messagesJoin;
    }

    /**
     * Sets the value of the messagesJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public void setMessagesJoin(MessageSearchRowBasic value) {
        this.messagesJoin = value;
    }

    /**
     * Gets the value of the nextApproverJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EntitySearchRowBasic }
     *     
     */
    public EntitySearchRowBasic getNextApproverJoin() {
        return nextApproverJoin;
    }

    /**
     * Sets the value of the nextApproverJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitySearchRowBasic }
     *     
     */
    public void setNextApproverJoin(EntitySearchRowBasic value) {
        this.nextApproverJoin = value;
    }

    /**
     * Gets the value of the opportunityJoin property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunitySearchRowBasic }
     *     
     */
    public OpportunitySearchRowBasic getOpportunityJoin() {
        return opportunityJoin;
    }

    /**
     * Sets the value of the opportunityJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunitySearchRowBasic }
     *     
     */
    public void setOpportunityJoin(OpportunitySearchRowBasic value) {
        this.opportunityJoin = value;
    }

    /**
     * Gets the value of the outsourcingVendorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public VendorSearchRowBasic getOutsourcingVendorJoin() {
        return outsourcingVendorJoin;
    }

    /**
     * Sets the value of the outsourcingVendorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public void setOutsourcingVendorJoin(VendorSearchRowBasic value) {
        this.outsourcingVendorJoin = value;
    }

    /**
     * Gets the value of the paidTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getPaidTransactionJoin() {
        return paidTransactionJoin;
    }

    /**
     * Sets the value of the paidTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setPaidTransactionJoin(TransactionSearchRowBasic value) {
        this.paidTransactionJoin = value;
    }

    /**
     * Gets the value of the partnerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerSearchRowBasic }
     *     
     */
    public PartnerSearchRowBasic getPartnerJoin() {
        return partnerJoin;
    }

    /**
     * Sets the value of the partnerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerSearchRowBasic }
     *     
     */
    public void setPartnerJoin(PartnerSearchRowBasic value) {
        this.partnerJoin = value;
    }

    /**
     * Gets the value of the payingTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getPayingTransactionJoin() {
        return payingTransactionJoin;
    }

    /**
     * Sets the value of the payingTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setPayingTransactionJoin(TransactionSearchRowBasic value) {
        this.payingTransactionJoin = value;
    }

    /**
     * Gets the value of the paymentInstrumentJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrumentSearchRowBasic }
     *     
     */
    public PaymentInstrumentSearchRowBasic getPaymentInstrumentJoin() {
        return paymentInstrumentJoin;
    }

    /**
     * Sets the value of the paymentInstrumentJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrumentSearchRowBasic }
     *     
     */
    public void setPaymentInstrumentJoin(PaymentInstrumentSearchRowBasic value) {
        this.paymentInstrumentJoin = value;
    }

    /**
     * Gets the value of the paymentOptionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentOptionSearchRowBasic }
     *     
     */
    public PaymentOptionSearchRowBasic getPaymentOptionJoin() {
        return paymentOptionJoin;
    }

    /**
     * Sets the value of the paymentOptionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentOptionSearchRowBasic }
     *     
     */
    public void setPaymentOptionJoin(PaymentOptionSearchRowBasic value) {
        this.paymentOptionJoin = value;
    }

    /**
     * Gets the value of the payrollItemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollItemSearchRowBasic }
     *     
     */
    public PayrollItemSearchRowBasic getPayrollItemJoin() {
        return payrollItemJoin;
    }

    /**
     * Sets the value of the payrollItemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollItemSearchRowBasic }
     *     
     */
    public void setPayrollItemJoin(PayrollItemSearchRowBasic value) {
        this.payrollItemJoin = value;
    }

    /**
     * Gets the value of the projectTaskJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public ProjectTaskSearchRowBasic getProjectTaskJoin() {
        return projectTaskJoin;
    }

    /**
     * Sets the value of the projectTaskJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public void setProjectTaskJoin(ProjectTaskSearchRowBasic value) {
        this.projectTaskJoin = value;
    }

    /**
     * Gets the value of the purchaseOrderJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getPurchaseOrderJoin() {
        return purchaseOrderJoin;
    }

    /**
     * Sets the value of the purchaseOrderJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setPurchaseOrderJoin(TransactionSearchRowBasic value) {
        this.purchaseOrderJoin = value;
    }

    /**
     * Gets the value of the requestorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getRequestorJoin() {
        return requestorJoin;
    }

    /**
     * Sets the value of the requestorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setRequestorJoin(EmployeeSearchRowBasic value) {
        this.requestorJoin = value;
    }

    /**
     * Gets the value of the revCommittingTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getRevCommittingTransactionJoin() {
        return revCommittingTransactionJoin;
    }

    /**
     * Sets the value of the revCommittingTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setRevCommittingTransactionJoin(TransactionSearchRowBasic value) {
        this.revCommittingTransactionJoin = value;
    }

    /**
     * Gets the value of the revisionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemRevisionSearchRowBasic }
     *     
     */
    public ItemRevisionSearchRowBasic getRevisionJoin() {
        return revisionJoin;
    }

    /**
     * Sets the value of the revisionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRevisionSearchRowBasic }
     *     
     */
    public void setRevisionJoin(ItemRevisionSearchRowBasic value) {
        this.revisionJoin = value;
    }

    /**
     * Gets the value of the revRecScheduleJoin property.
     * 
     * @return
     *     possible object is
     *     {@link RevRecScheduleSearchRowBasic }
     *     
     */
    public RevRecScheduleSearchRowBasic getRevRecScheduleJoin() {
        return revRecScheduleJoin;
    }

    /**
     * Sets the value of the revRecScheduleJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevRecScheduleSearchRowBasic }
     *     
     */
    public void setRevRecScheduleJoin(RevRecScheduleSearchRowBasic value) {
        this.revRecScheduleJoin = value;
    }

    /**
     * Gets the value of the rgPostingTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getRgPostingTransactionJoin() {
        return rgPostingTransactionJoin;
    }

    /**
     * Sets the value of the rgPostingTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setRgPostingTransactionJoin(TransactionSearchRowBasic value) {
        this.rgPostingTransactionJoin = value;
    }

    /**
     * Gets the value of the salesOrderJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getSalesOrderJoin() {
        return salesOrderJoin;
    }

    /**
     * Sets the value of the salesOrderJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setSalesOrderJoin(TransactionSearchRowBasic value) {
        this.salesOrderJoin = value;
    }

    /**
     * Gets the value of the salesRepJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getSalesRepJoin() {
        return salesRepJoin;
    }

    /**
     * Sets the value of the salesRepJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setSalesRepJoin(EmployeeSearchRowBasic value) {
        this.salesRepJoin = value;
    }

    /**
     * Gets the value of the shippingAddressJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AddressSearchRowBasic }
     *     
     */
    public AddressSearchRowBasic getShippingAddressJoin() {
        return shippingAddressJoin;
    }

    /**
     * Sets the value of the shippingAddressJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressSearchRowBasic }
     *     
     */
    public void setShippingAddressJoin(AddressSearchRowBasic value) {
        this.shippingAddressJoin = value;
    }

    /**
     * Gets the value of the subsidiaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SubsidiarySearchRowBasic }
     *     
     */
    public SubsidiarySearchRowBasic getSubsidiaryJoin() {
        return subsidiaryJoin;
    }

    /**
     * Sets the value of the subsidiaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiarySearchRowBasic }
     *     
     */
    public void setSubsidiaryJoin(SubsidiarySearchRowBasic value) {
        this.subsidiaryJoin = value;
    }

    /**
     * Gets the value of the taskJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TaskSearchRowBasic }
     *     
     */
    public TaskSearchRowBasic getTaskJoin() {
        return taskJoin;
    }

    /**
     * Sets the value of the taskJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSearchRowBasic }
     *     
     */
    public void setTaskJoin(TaskSearchRowBasic value) {
        this.taskJoin = value;
    }

    /**
     * Gets the value of the taxCodeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxItemSearchRowBasic }
     *     
     */
    public SalesTaxItemSearchRowBasic getTaxCodeJoin() {
        return taxCodeJoin;
    }

    /**
     * Sets the value of the taxCodeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxItemSearchRowBasic }
     *     
     */
    public void setTaxCodeJoin(SalesTaxItemSearchRowBasic value) {
        this.taxCodeJoin = value;
    }

    /**
     * Gets the value of the taxDetailJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailSearchRowBasic }
     *     
     */
    public TaxDetailSearchRowBasic getTaxDetailJoin() {
        return taxDetailJoin;
    }

    /**
     * Sets the value of the taxDetailJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailSearchRowBasic }
     *     
     */
    public void setTaxDetailJoin(TaxDetailSearchRowBasic value) {
        this.taxDetailJoin = value;
    }

    /**
     * Gets the value of the taxItemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxItemSearchRowBasic }
     *     
     */
    public SalesTaxItemSearchRowBasic getTaxItemJoin() {
        return taxItemJoin;
    }

    /**
     * Sets the value of the taxItemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxItemSearchRowBasic }
     *     
     */
    public void setTaxItemJoin(SalesTaxItemSearchRowBasic value) {
        this.taxItemJoin = value;
    }

    /**
     * Gets the value of the timeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TimeBillSearchRowBasic }
     *     
     */
    public TimeBillSearchRowBasic getTimeJoin() {
        return timeJoin;
    }

    /**
     * Sets the value of the timeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBillSearchRowBasic }
     *     
     */
    public void setTimeJoin(TimeBillSearchRowBasic value) {
        this.timeJoin = value;
    }

    /**
     * Gets the value of the toLocationJoin property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public LocationSearchRowBasic getToLocationJoin() {
        return toLocationJoin;
    }

    /**
     * Sets the value of the toLocationJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public void setToLocationJoin(LocationSearchRowBasic value) {
        this.toLocationJoin = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchRowBasic value) {
        this.userJoin = value;
    }

    /**
     * Gets the value of the userNotesJoin property.
     * 
     * @return
     *     possible object is
     *     {@link NoteSearchRowBasic }
     *     
     */
    public NoteSearchRowBasic getUserNotesJoin() {
        return userNotesJoin;
    }

    /**
     * Sets the value of the userNotesJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteSearchRowBasic }
     *     
     */
    public void setUserNotesJoin(NoteSearchRowBasic value) {
        this.userNotesJoin = value;
    }

    /**
     * Gets the value of the vendorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public VendorSearchRowBasic getVendorJoin() {
        return vendorJoin;
    }

    /**
     * Sets the value of the vendorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public void setVendorJoin(VendorSearchRowBasic value) {
        this.vendorJoin = value;
    }

    /**
     * Gets the value of the vendorLineJoin property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public VendorSearchRowBasic getVendorLineJoin() {
        return vendorLineJoin;
    }

    /**
     * Sets the value of the vendorLineJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public void setVendorLineJoin(VendorSearchRowBasic value) {
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
     * {@link CustomSearchRowBasic }
     * 
     * 
     */
    public List<CustomSearchRowBasic> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchRowBasic>();
        }
        return this.customSearchJoin;
    }

}
