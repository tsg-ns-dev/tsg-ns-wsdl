
package com.netsuite.webservices.platform.core_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.activities.scheduling_2022_1.CalendarEventSearchRow;
import com.netsuite.webservices.activities.scheduling_2022_1.PhoneCallSearchRow;
import com.netsuite.webservices.activities.scheduling_2022_1.ProjectTaskSearchRow;
import com.netsuite.webservices.activities.scheduling_2022_1.ResourceAllocationSearchRow;
import com.netsuite.webservices.activities.scheduling_2022_1.TaskSearchRow;
import com.netsuite.webservices.documents.filecabinet_2022_1.FileSearchRow;
import com.netsuite.webservices.documents.filecabinet_2022_1.FolderSearchRow;
import com.netsuite.webservices.general.communication_2022_1.MessageSearchRow;
import com.netsuite.webservices.general.communication_2022_1.NoteSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.AccountSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.AccountingPeriodSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.BillingScheduleSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.BinSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.BomRevisionSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.BomSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.ClassificationSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.ConsolidatedExchangeRateSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.ContactCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.ContactRoleSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.CostCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.CurrencyRateSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.CustomerCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.CustomerMessageSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.DepartmentSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.ExpenseCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.FairValuePriceSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.GiftCertificateSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.GlobalAccountMappingSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.InventoryNumberSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.ItemAccountMappingSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.ItemRevisionSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.ItemSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.LocationSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.MerchandiseHierarchyNodeSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.NexusSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.NoteTypeSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.OtherNameCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.PartnerCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.PaymentInstrumentSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.PaymentMethodSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.PaymentOptionSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.PriceLevelSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.PricingGroupSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.RevRecScheduleSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.RevRecTemplateSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.SalesRoleSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.SalesTaxItemSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.SubsidiarySearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.TaxGroupSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.TaxTypeSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.TermSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.UnitsTypeSearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.VendorCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2022_1.WinLossReasonSearchRow;
import com.netsuite.webservices.lists.employees_2022_1.EmployeeSearchRow;
import com.netsuite.webservices.lists.employees_2022_1.HcmJobSearchRow;
import com.netsuite.webservices.lists.employees_2022_1.PayrollItemSearchRow;
import com.netsuite.webservices.lists.marketing_2022_1.CampaignSearchRow;
import com.netsuite.webservices.lists.marketing_2022_1.CouponCodeSearchRow;
import com.netsuite.webservices.lists.marketing_2022_1.PromotionCodeSearchRow;
import com.netsuite.webservices.lists.relationships_2022_1.BillingAccountSearchRow;
import com.netsuite.webservices.lists.relationships_2022_1.ContactSearchRow;
import com.netsuite.webservices.lists.relationships_2022_1.CustomerSearchRow;
import com.netsuite.webservices.lists.relationships_2022_1.CustomerStatusSearchRow;
import com.netsuite.webservices.lists.relationships_2022_1.CustomerSubsidiaryRelationshipSearchRow;
import com.netsuite.webservices.lists.relationships_2022_1.EntityGroupSearchRow;
import com.netsuite.webservices.lists.relationships_2022_1.JobSearchRow;
import com.netsuite.webservices.lists.relationships_2022_1.JobStatusSearchRow;
import com.netsuite.webservices.lists.relationships_2022_1.JobTypeSearchRow;
import com.netsuite.webservices.lists.relationships_2022_1.OriginatingLeadSearchRow;
import com.netsuite.webservices.lists.relationships_2022_1.PartnerSearchRow;
import com.netsuite.webservices.lists.relationships_2022_1.VendorSearchRow;
import com.netsuite.webservices.lists.relationships_2022_1.VendorSubsidiaryRelationshipSearchRow;
import com.netsuite.webservices.lists.supplychain_2022_1.ManufacturingCostTemplateSearchRow;
import com.netsuite.webservices.lists.supplychain_2022_1.ManufacturingOperationTaskSearchRow;
import com.netsuite.webservices.lists.supplychain_2022_1.ManufacturingRoutingSearchRow;
import com.netsuite.webservices.lists.support_2022_1.IssueSearchRow;
import com.netsuite.webservices.lists.support_2022_1.SolutionSearchRow;
import com.netsuite.webservices.lists.support_2022_1.SupportCaseSearchRow;
import com.netsuite.webservices.lists.support_2022_1.TopicSearchRow;
import com.netsuite.webservices.lists.website_2022_1.SiteCategorySearchRow;
import com.netsuite.webservices.setup.customization_2022_1.CustomListSearchRow;
import com.netsuite.webservices.setup.customization_2022_1.CustomRecordSearchRow;
import com.netsuite.webservices.transactions.customers_2022_1.ChargeSearchRow;
import com.netsuite.webservices.transactions.demandplanning_2022_1.ItemDemandPlanSearchRow;
import com.netsuite.webservices.transactions.demandplanning_2022_1.ItemSupplyPlanSearchRow;
import com.netsuite.webservices.transactions.employees_2022_1.PaycheckSearchRow;
import com.netsuite.webservices.transactions.employees_2022_1.TimeBillSearchRow;
import com.netsuite.webservices.transactions.employees_2022_1.TimeEntrySearchRow;
import com.netsuite.webservices.transactions.employees_2022_1.TimeSheetSearchRow;
import com.netsuite.webservices.transactions.financial_2022_1.BudgetSearchRow;
import com.netsuite.webservices.transactions.purchases_2022_1.InboundShipmentSearchRow;
import com.netsuite.webservices.transactions.sales_2022_1.AccountingTransactionSearchRow;
import com.netsuite.webservices.transactions.sales_2022_1.OpportunitySearchRow;
import com.netsuite.webservices.transactions.sales_2022_1.TransactionSearchRow;
import com.netsuite.webservices.transactions.sales_2022_1.UsageSearchRow;


/**
 * <p>Java class for SearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRow")
@XmlSeeAlso({
    SearchRowBasic.class,
    CalendarEventSearchRow.class,
    TaskSearchRow.class,
    PhoneCallSearchRow.class,
    ProjectTaskSearchRow.class,
    ResourceAllocationSearchRow.class,
    NoteSearchRow.class,
    MessageSearchRow.class,
    FileSearchRow.class,
    FolderSearchRow.class,
    ContactSearchRow.class,
    CustomerSearchRow.class,
    PartnerSearchRow.class,
    VendorSearchRow.class,
    EntityGroupSearchRow.class,
    JobSearchRow.class,
    CustomerStatusSearchRow.class,
    JobStatusSearchRow.class,
    JobTypeSearchRow.class,
    OriginatingLeadSearchRow.class,
    BillingAccountSearchRow.class,
    CustomerSubsidiaryRelationshipSearchRow.class,
    VendorSubsidiaryRelationshipSearchRow.class,
    SupportCaseSearchRow.class,
    SolutionSearchRow.class,
    TopicSearchRow.class,
    IssueSearchRow.class,
    AccountSearchRow.class,
    DepartmentSearchRow.class,
    ClassificationSearchRow.class,
    LocationSearchRow.class,
    ItemSearchRow.class,
    BinSearchRow.class,
    SubsidiarySearchRow.class,
    GiftCertificateSearchRow.class,
    AccountingPeriodSearchRow.class,
    ContactCategorySearchRow.class,
    ContactRoleSearchRow.class,
    CustomerCategorySearchRow.class,
    ExpenseCategorySearchRow.class,
    NoteTypeSearchRow.class,
    PartnerCategorySearchRow.class,
    PaymentMethodSearchRow.class,
    PriceLevelSearchRow.class,
    SalesRoleSearchRow.class,
    TermSearchRow.class,
    VendorCategorySearchRow.class,
    WinLossReasonSearchRow.class,
    UnitsTypeSearchRow.class,
    PricingGroupSearchRow.class,
    InventoryNumberSearchRow.class,
    RevRecScheduleSearchRow.class,
    RevRecTemplateSearchRow.class,
    NexusSearchRow.class,
    OtherNameCategorySearchRow.class,
    CustomerMessageSearchRow.class,
    CurrencyRateSearchRow.class,
    ItemRevisionSearchRow.class,
    BillingScheduleSearchRow.class,
    GlobalAccountMappingSearchRow.class,
    ItemAccountMappingSearchRow.class,
    FairValuePriceSearchRow.class,
    CostCategorySearchRow.class,
    ConsolidatedExchangeRateSearchRow.class,
    TaxGroupSearchRow.class,
    SalesTaxItemSearchRow.class,
    TaxTypeSearchRow.class,
    BomSearchRow.class,
    BomRevisionSearchRow.class,
    PaymentInstrumentSearchRow.class,
    PaymentOptionSearchRow.class,
    MerchandiseHierarchyNodeSearchRow.class,
    OpportunitySearchRow.class,
    TransactionSearchRow.class,
    AccountingTransactionSearchRow.class,
    UsageSearchRow.class,
    InboundShipmentSearchRow.class,
    ChargeSearchRow.class,
    BudgetSearchRow.class,
    CustomRecordSearchRow.class,
    CustomListSearchRow.class,
    EmployeeSearchRow.class,
    PayrollItemSearchRow.class,
    HcmJobSearchRow.class,
    SiteCategorySearchRow.class,
    TimeBillSearchRow.class,
    TimeEntrySearchRow.class,
    TimeSheetSearchRow.class,
    PaycheckSearchRow.class,
    CampaignSearchRow.class,
    PromotionCodeSearchRow.class,
    CouponCodeSearchRow.class,
    ItemDemandPlanSearchRow.class,
    ItemSupplyPlanSearchRow.class,
    ManufacturingCostTemplateSearchRow.class,
    ManufacturingRoutingSearchRow.class,
    ManufacturingOperationTaskSearchRow.class
})
public abstract class SearchRow {


}
