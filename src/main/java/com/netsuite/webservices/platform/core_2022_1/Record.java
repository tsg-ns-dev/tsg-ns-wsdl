
package com.netsuite.webservices.platform.core_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.activities.scheduling_2022_1.CalendarEvent;
import com.netsuite.webservices.activities.scheduling_2022_1.PhoneCall;
import com.netsuite.webservices.activities.scheduling_2022_1.ProjectTask;
import com.netsuite.webservices.activities.scheduling_2022_1.ResourceAllocation;
import com.netsuite.webservices.activities.scheduling_2022_1.Task;
import com.netsuite.webservices.documents.filecabinet_2022_1.File;
import com.netsuite.webservices.documents.filecabinet_2022_1.Folder;
import com.netsuite.webservices.general.communication_2022_1.Message;
import com.netsuite.webservices.general.communication_2022_1.Note;
import com.netsuite.webservices.lists.accounting_2022_1.Account;
import com.netsuite.webservices.lists.accounting_2022_1.AccountingPeriod;
import com.netsuite.webservices.lists.accounting_2022_1.AssemblyItem;
import com.netsuite.webservices.lists.accounting_2022_1.BillingSchedule;
import com.netsuite.webservices.lists.accounting_2022_1.Bin;
import com.netsuite.webservices.lists.accounting_2022_1.Bom;
import com.netsuite.webservices.lists.accounting_2022_1.BomRevision;
import com.netsuite.webservices.lists.accounting_2022_1.BudgetCategory;
import com.netsuite.webservices.lists.accounting_2022_1.Classification;
import com.netsuite.webservices.lists.accounting_2022_1.ConsolidatedExchangeRate;
import com.netsuite.webservices.lists.accounting_2022_1.ContactCategory;
import com.netsuite.webservices.lists.accounting_2022_1.ContactRole;
import com.netsuite.webservices.lists.accounting_2022_1.CostCategory;
import com.netsuite.webservices.lists.accounting_2022_1.Currency;
import com.netsuite.webservices.lists.accounting_2022_1.CurrencyRate;
import com.netsuite.webservices.lists.accounting_2022_1.CustomerCategory;
import com.netsuite.webservices.lists.accounting_2022_1.CustomerMessage;
import com.netsuite.webservices.lists.accounting_2022_1.Department;
import com.netsuite.webservices.lists.accounting_2022_1.DescriptionItem;
import com.netsuite.webservices.lists.accounting_2022_1.DiscountItem;
import com.netsuite.webservices.lists.accounting_2022_1.DownloadItem;
import com.netsuite.webservices.lists.accounting_2022_1.ExpenseCategory;
import com.netsuite.webservices.lists.accounting_2022_1.FairValuePrice;
import com.netsuite.webservices.lists.accounting_2022_1.GeneralToken;
import com.netsuite.webservices.lists.accounting_2022_1.GiftCertificate;
import com.netsuite.webservices.lists.accounting_2022_1.GiftCertificateItem;
import com.netsuite.webservices.lists.accounting_2022_1.GlobalAccountMapping;
import com.netsuite.webservices.lists.accounting_2022_1.InventoryItem;
import com.netsuite.webservices.lists.accounting_2022_1.InventoryNumber;
import com.netsuite.webservices.lists.accounting_2022_1.ItemAccountMapping;
import com.netsuite.webservices.lists.accounting_2022_1.ItemGroup;
import com.netsuite.webservices.lists.accounting_2022_1.ItemRevision;
import com.netsuite.webservices.lists.accounting_2022_1.KitItem;
import com.netsuite.webservices.lists.accounting_2022_1.LeadSource;
import com.netsuite.webservices.lists.accounting_2022_1.Location;
import com.netsuite.webservices.lists.accounting_2022_1.LotNumberedAssemblyItem;
import com.netsuite.webservices.lists.accounting_2022_1.LotNumberedInventoryItem;
import com.netsuite.webservices.lists.accounting_2022_1.MarkupItem;
import com.netsuite.webservices.lists.accounting_2022_1.MerchandiseHierarchyNode;
import com.netsuite.webservices.lists.accounting_2022_1.Nexus;
import com.netsuite.webservices.lists.accounting_2022_1.NonInventoryPurchaseItem;
import com.netsuite.webservices.lists.accounting_2022_1.NonInventoryResaleItem;
import com.netsuite.webservices.lists.accounting_2022_1.NonInventorySaleItem;
import com.netsuite.webservices.lists.accounting_2022_1.NoteType;
import com.netsuite.webservices.lists.accounting_2022_1.OtherChargePurchaseItem;
import com.netsuite.webservices.lists.accounting_2022_1.OtherChargeResaleItem;
import com.netsuite.webservices.lists.accounting_2022_1.OtherChargeSaleItem;
import com.netsuite.webservices.lists.accounting_2022_1.OtherNameCategory;
import com.netsuite.webservices.lists.accounting_2022_1.PartnerCategory;
import com.netsuite.webservices.lists.accounting_2022_1.PaymentCard;
import com.netsuite.webservices.lists.accounting_2022_1.PaymentCardToken;
import com.netsuite.webservices.lists.accounting_2022_1.PaymentItem;
import com.netsuite.webservices.lists.accounting_2022_1.PaymentMethod;
import com.netsuite.webservices.lists.accounting_2022_1.PriceLevel;
import com.netsuite.webservices.lists.accounting_2022_1.PricingGroup;
import com.netsuite.webservices.lists.accounting_2022_1.RevRecSchedule;
import com.netsuite.webservices.lists.accounting_2022_1.RevRecTemplate;
import com.netsuite.webservices.lists.accounting_2022_1.SalesRole;
import com.netsuite.webservices.lists.accounting_2022_1.SalesTaxItem;
import com.netsuite.webservices.lists.accounting_2022_1.SerializedAssemblyItem;
import com.netsuite.webservices.lists.accounting_2022_1.SerializedInventoryItem;
import com.netsuite.webservices.lists.accounting_2022_1.ServicePurchaseItem;
import com.netsuite.webservices.lists.accounting_2022_1.ServiceResaleItem;
import com.netsuite.webservices.lists.accounting_2022_1.ServiceSaleItem;
import com.netsuite.webservices.lists.accounting_2022_1.State;
import com.netsuite.webservices.lists.accounting_2022_1.Subsidiary;
import com.netsuite.webservices.lists.accounting_2022_1.SubtotalItem;
import com.netsuite.webservices.lists.accounting_2022_1.TaxAcct;
import com.netsuite.webservices.lists.accounting_2022_1.TaxGroup;
import com.netsuite.webservices.lists.accounting_2022_1.TaxType;
import com.netsuite.webservices.lists.accounting_2022_1.Term;
import com.netsuite.webservices.lists.accounting_2022_1.UnitsType;
import com.netsuite.webservices.lists.accounting_2022_1.VendorCategory;
import com.netsuite.webservices.lists.accounting_2022_1.WinLossReason;
import com.netsuite.webservices.lists.employees_2022_1.Employee;
import com.netsuite.webservices.lists.employees_2022_1.HcmJob;
import com.netsuite.webservices.lists.employees_2022_1.PayrollItem;
import com.netsuite.webservices.lists.marketing_2022_1.Campaign;
import com.netsuite.webservices.lists.marketing_2022_1.CampaignAudience;
import com.netsuite.webservices.lists.marketing_2022_1.CampaignCategory;
import com.netsuite.webservices.lists.marketing_2022_1.CampaignChannel;
import com.netsuite.webservices.lists.marketing_2022_1.CampaignFamily;
import com.netsuite.webservices.lists.marketing_2022_1.CampaignOffer;
import com.netsuite.webservices.lists.marketing_2022_1.CampaignResponse;
import com.netsuite.webservices.lists.marketing_2022_1.CampaignSearchEngine;
import com.netsuite.webservices.lists.marketing_2022_1.CampaignSubscription;
import com.netsuite.webservices.lists.marketing_2022_1.CampaignVertical;
import com.netsuite.webservices.lists.marketing_2022_1.CouponCode;
import com.netsuite.webservices.lists.marketing_2022_1.PromotionCode;
import com.netsuite.webservices.lists.relationships_2022_1.BillingAccount;
import com.netsuite.webservices.lists.relationships_2022_1.Contact;
import com.netsuite.webservices.lists.relationships_2022_1.Customer;
import com.netsuite.webservices.lists.relationships_2022_1.CustomerStatus;
import com.netsuite.webservices.lists.relationships_2022_1.CustomerSubsidiaryRelationship;
import com.netsuite.webservices.lists.relationships_2022_1.EntityGroup;
import com.netsuite.webservices.lists.relationships_2022_1.Job;
import com.netsuite.webservices.lists.relationships_2022_1.JobStatus;
import com.netsuite.webservices.lists.relationships_2022_1.JobType;
import com.netsuite.webservices.lists.relationships_2022_1.Partner;
import com.netsuite.webservices.lists.relationships_2022_1.Vendor;
import com.netsuite.webservices.lists.relationships_2022_1.VendorSubsidiaryRelationship;
import com.netsuite.webservices.lists.supplychain_2022_1.ManufacturingCostTemplate;
import com.netsuite.webservices.lists.supplychain_2022_1.ManufacturingOperationTask;
import com.netsuite.webservices.lists.supplychain_2022_1.ManufacturingRouting;
import com.netsuite.webservices.lists.support_2022_1.Issue;
import com.netsuite.webservices.lists.support_2022_1.Solution;
import com.netsuite.webservices.lists.support_2022_1.SupportCase;
import com.netsuite.webservices.lists.support_2022_1.SupportCaseIssue;
import com.netsuite.webservices.lists.support_2022_1.SupportCaseOrigin;
import com.netsuite.webservices.lists.support_2022_1.SupportCasePriority;
import com.netsuite.webservices.lists.support_2022_1.SupportCaseStatus;
import com.netsuite.webservices.lists.support_2022_1.SupportCaseType;
import com.netsuite.webservices.lists.support_2022_1.Topic;
import com.netsuite.webservices.lists.website_2022_1.SiteCategory;
import com.netsuite.webservices.platform.common_2022_1.Address;
import com.netsuite.webservices.platform.common_2022_1.InventoryDetail;
import com.netsuite.webservices.platform.common_2022_1.LandedCost;
import com.netsuite.webservices.setup.customization_2022_1.CustomFieldType;
import com.netsuite.webservices.setup.customization_2022_1.CustomList;
import com.netsuite.webservices.setup.customization_2022_1.CustomPurchase;
import com.netsuite.webservices.setup.customization_2022_1.CustomRecord;
import com.netsuite.webservices.setup.customization_2022_1.CustomRecordType;
import com.netsuite.webservices.setup.customization_2022_1.CustomSale;
import com.netsuite.webservices.setup.customization_2022_1.CustomSegment;
import com.netsuite.webservices.setup.customization_2022_1.CustomTransaction;
import com.netsuite.webservices.transactions.bank_2022_1.Check;
import com.netsuite.webservices.transactions.bank_2022_1.Deposit;
import com.netsuite.webservices.transactions.customers_2022_1.CashRefund;
import com.netsuite.webservices.transactions.customers_2022_1.Charge;
import com.netsuite.webservices.transactions.customers_2022_1.CreditMemo;
import com.netsuite.webservices.transactions.customers_2022_1.CustomerDeposit;
import com.netsuite.webservices.transactions.customers_2022_1.CustomerPayment;
import com.netsuite.webservices.transactions.customers_2022_1.CustomerRefund;
import com.netsuite.webservices.transactions.customers_2022_1.DepositApplication;
import com.netsuite.webservices.transactions.customers_2022_1.ReturnAuthorization;
import com.netsuite.webservices.transactions.demandplanning_2022_1.ItemDemandPlan;
import com.netsuite.webservices.transactions.demandplanning_2022_1.ItemSupplyPlan;
import com.netsuite.webservices.transactions.employees_2022_1.ExpenseReport;
import com.netsuite.webservices.transactions.employees_2022_1.Paycheck;
import com.netsuite.webservices.transactions.employees_2022_1.PaycheckJournal;
import com.netsuite.webservices.transactions.employees_2022_1.TimeBill;
import com.netsuite.webservices.transactions.employees_2022_1.TimeEntry;
import com.netsuite.webservices.transactions.employees_2022_1.TimeSheet;
import com.netsuite.webservices.transactions.financial_2022_1.Budget;
import com.netsuite.webservices.transactions.general_2022_1.AdvInterCompanyJournalEntry;
import com.netsuite.webservices.transactions.general_2022_1.InterCompanyJournalEntry;
import com.netsuite.webservices.transactions.general_2022_1.JournalEntry;
import com.netsuite.webservices.transactions.general_2022_1.PeriodEndJournal;
import com.netsuite.webservices.transactions.general_2022_1.StatisticalJournalEntry;
import com.netsuite.webservices.transactions.inventory_2022_1.AssemblyBuild;
import com.netsuite.webservices.transactions.inventory_2022_1.AssemblyUnbuild;
import com.netsuite.webservices.transactions.inventory_2022_1.BinTransfer;
import com.netsuite.webservices.transactions.inventory_2022_1.BinWorksheet;
import com.netsuite.webservices.transactions.inventory_2022_1.InterCompanyTransferOrder;
import com.netsuite.webservices.transactions.inventory_2022_1.InventoryAdjustment;
import com.netsuite.webservices.transactions.inventory_2022_1.InventoryCostRevaluation;
import com.netsuite.webservices.transactions.inventory_2022_1.InventoryTransfer;
import com.netsuite.webservices.transactions.inventory_2022_1.TransferOrder;
import com.netsuite.webservices.transactions.inventory_2022_1.WorkOrder;
import com.netsuite.webservices.transactions.inventory_2022_1.WorkOrderClose;
import com.netsuite.webservices.transactions.inventory_2022_1.WorkOrderCompletion;
import com.netsuite.webservices.transactions.inventory_2022_1.WorkOrderIssue;
import com.netsuite.webservices.transactions.purchases_2022_1.InboundShipment;
import com.netsuite.webservices.transactions.purchases_2022_1.ItemReceipt;
import com.netsuite.webservices.transactions.purchases_2022_1.PurchaseOrder;
import com.netsuite.webservices.transactions.purchases_2022_1.PurchaseRequisition;
import com.netsuite.webservices.transactions.purchases_2022_1.VendorBill;
import com.netsuite.webservices.transactions.purchases_2022_1.VendorCredit;
import com.netsuite.webservices.transactions.purchases_2022_1.VendorPayment;
import com.netsuite.webservices.transactions.purchases_2022_1.VendorReturnAuthorization;
import com.netsuite.webservices.transactions.sales_2022_1.CashSale;
import com.netsuite.webservices.transactions.sales_2022_1.Estimate;
import com.netsuite.webservices.transactions.sales_2022_1.Invoice;
import com.netsuite.webservices.transactions.sales_2022_1.ItemFulfillment;
import com.netsuite.webservices.transactions.sales_2022_1.Opportunity;
import com.netsuite.webservices.transactions.sales_2022_1.SalesOrder;
import com.netsuite.webservices.transactions.sales_2022_1.Usage;


/**
 * <p>Java class for Record complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Record"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nullFieldList" type="{urn:core_2022_1.platform.webservices.netsuite.com}NullField" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Record", propOrder = {
    "nullFieldList"
})
@XmlSeeAlso({
    Address.class,
    LandedCost.class,
    InventoryDetail.class,
    CalendarEvent.class,
    Task.class,
    PhoneCall.class,
    ProjectTask.class,
    ResourceAllocation.class,
    Note.class,
    Message.class,
    File.class,
    Folder.class,
    Contact.class,
    Customer.class,
    CustomerStatus.class,
    Partner.class,
    Vendor.class,
    EntityGroup.class,
    Job.class,
    JobType.class,
    JobStatus.class,
    BillingAccount.class,
    CustomerSubsidiaryRelationship.class,
    VendorSubsidiaryRelationship.class,
    SupportCase.class,
    SupportCaseStatus.class,
    SupportCaseType.class,
    SupportCaseOrigin.class,
    SupportCaseIssue.class,
    SupportCasePriority.class,
    Solution.class,
    Topic.class,
    Issue.class,
    ContactCategory.class,
    CustomerCategory.class,
    SalesRole.class,
    PriceLevel.class,
    WinLossReason.class,
    Term.class,
    NoteType.class,
    PaymentMethod.class,
    LeadSource.class,
    InventoryItem.class,
    DescriptionItem.class,
    DiscountItem.class,
    DownloadItem.class,
    MarkupItem.class,
    PaymentItem.class,
    SubtotalItem.class,
    NonInventoryPurchaseItem.class,
    NonInventorySaleItem.class,
    NonInventoryResaleItem.class,
    OtherChargeResaleItem.class,
    OtherChargePurchaseItem.class,
    ServiceResaleItem.class,
    ServicePurchaseItem.class,
    ServiceSaleItem.class,
    OtherChargeSaleItem.class,
    Currency.class,
    ExpenseCategory.class,
    Account.class,
    Department.class,
    Classification.class,
    Location.class,
    UnitsType.class,
    ContactRole.class,
    Bin.class,
    SalesTaxItem.class,
    TaxGroup.class,
    TaxType.class,
    SerializedInventoryItem.class,
    LotNumberedInventoryItem.class,
    GiftCertificateItem.class,
    Subsidiary.class,
    GiftCertificate.class,
    PartnerCategory.class,
    VendorCategory.class,
    KitItem.class,
    AssemblyItem.class,
    SerializedAssemblyItem.class,
    LotNumberedAssemblyItem.class,
    State.class,
    AccountingPeriod.class,
    BudgetCategory.class,
    PricingGroup.class,
    InventoryNumber.class,
    RevRecSchedule.class,
    RevRecTemplate.class,
    CostCategory.class,
    Nexus.class,
    CustomerMessage.class,
    OtherNameCategory.class,
    ItemGroup.class,
    CurrencyRate.class,
    ItemRevision.class,
    TaxAcct.class,
    BillingSchedule.class,
    GlobalAccountMapping.class,
    ItemAccountMapping.class,
    FairValuePrice.class,
    ConsolidatedExchangeRate.class,
    Bom.class,
    BomRevision.class,
    PaymentCard.class,
    GeneralToken.class,
    PaymentCardToken.class,
    MerchandiseHierarchyNode.class,
    Opportunity.class,
    SalesOrder.class,
    ItemFulfillment.class,
    Invoice.class,
    CashSale.class,
    Estimate.class,
    Usage.class,
    VendorBill.class,
    PurchaseOrder.class,
    ItemReceipt.class,
    VendorPayment.class,
    VendorCredit.class,
    VendorReturnAuthorization.class,
    PurchaseRequisition.class,
    InboundShipment.class,
    CashRefund.class,
    CustomerPayment.class,
    ReturnAuthorization.class,
    CreditMemo.class,
    CustomerRefund.class,
    CustomerDeposit.class,
    DepositApplication.class,
    Charge.class,
    Budget.class,
    Check.class,
    Deposit.class,
    InventoryAdjustment.class,
    AssemblyBuild.class,
    AssemblyUnbuild.class,
    TransferOrder.class,
    InterCompanyTransferOrder.class,
    WorkOrder.class,
    InventoryTransfer.class,
    BinTransfer.class,
    BinWorksheet.class,
    WorkOrderIssue.class,
    WorkOrderCompletion.class,
    WorkOrderClose.class,
    InventoryCostRevaluation.class,
    JournalEntry.class,
    InterCompanyJournalEntry.class,
    StatisticalJournalEntry.class,
    AdvInterCompanyJournalEntry.class,
    PeriodEndJournal.class,
    CustomRecord.class,
    CustomList.class,
    CustomRecordType.class,
    CustomTransaction.class,
    CustomSegment.class,
    CustomSale.class,
    CustomPurchase.class,
    CustomFieldType.class,
    Employee.class,
    PayrollItem.class,
    HcmJob.class,
    SiteCategory.class,
    TimeBill.class,
    ExpenseReport.class,
    PaycheckJournal.class,
    TimeEntry.class,
    TimeSheet.class,
    Paycheck.class,
    Campaign.class,
    CampaignCategory.class,
    CampaignAudience.class,
    CampaignFamily.class,
    CampaignSearchEngine.class,
    CampaignChannel.class,
    CampaignOffer.class,
    CampaignResponse.class,
    CampaignVertical.class,
    CampaignSubscription.class,
    PromotionCode.class,
    CouponCode.class,
    ItemDemandPlan.class,
    ItemSupplyPlan.class,
    ManufacturingCostTemplate.class,
    ManufacturingRouting.class,
    ManufacturingOperationTask.class
})
public abstract class Record {

    protected NullField nullFieldList;

    /**
     * Gets the value of the nullFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link NullField }
     *     
     */
    public NullField getNullFieldList() {
        return nullFieldList;
    }

    /**
     * Sets the value of the nullFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullField }
     *     
     */
    public void setNullFieldList(NullField value) {
        this.nullFieldList = value;
    }

}
