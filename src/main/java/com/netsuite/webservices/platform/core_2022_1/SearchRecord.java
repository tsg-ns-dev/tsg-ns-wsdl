
package com.netsuite.webservices.platform.core_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.activities.scheduling_2022_1.CalendarEventSearch;
import com.netsuite.webservices.activities.scheduling_2022_1.CalendarEventSearchAdvanced;
import com.netsuite.webservices.activities.scheduling_2022_1.PhoneCallSearch;
import com.netsuite.webservices.activities.scheduling_2022_1.PhoneCallSearchAdvanced;
import com.netsuite.webservices.activities.scheduling_2022_1.ProjectTaskSearch;
import com.netsuite.webservices.activities.scheduling_2022_1.ProjectTaskSearchAdvanced;
import com.netsuite.webservices.activities.scheduling_2022_1.ResourceAllocationSearch;
import com.netsuite.webservices.activities.scheduling_2022_1.ResourceAllocationSearchAdvanced;
import com.netsuite.webservices.activities.scheduling_2022_1.TaskSearch;
import com.netsuite.webservices.activities.scheduling_2022_1.TaskSearchAdvanced;
import com.netsuite.webservices.documents.filecabinet_2022_1.FileSearch;
import com.netsuite.webservices.documents.filecabinet_2022_1.FileSearchAdvanced;
import com.netsuite.webservices.documents.filecabinet_2022_1.FolderSearch;
import com.netsuite.webservices.documents.filecabinet_2022_1.FolderSearchAdvanced;
import com.netsuite.webservices.general.communication_2022_1.MessageSearch;
import com.netsuite.webservices.general.communication_2022_1.MessageSearchAdvanced;
import com.netsuite.webservices.general.communication_2022_1.NoteSearch;
import com.netsuite.webservices.general.communication_2022_1.NoteSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.AccountSearch;
import com.netsuite.webservices.lists.accounting_2022_1.AccountSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.AccountingPeriodSearch;
import com.netsuite.webservices.lists.accounting_2022_1.AccountingPeriodSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.BillingScheduleSearch;
import com.netsuite.webservices.lists.accounting_2022_1.BillingScheduleSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.BinSearch;
import com.netsuite.webservices.lists.accounting_2022_1.BinSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.BomRevisionSearch;
import com.netsuite.webservices.lists.accounting_2022_1.BomRevisionSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.BomSearch;
import com.netsuite.webservices.lists.accounting_2022_1.BomSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.ClassificationSearch;
import com.netsuite.webservices.lists.accounting_2022_1.ClassificationSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.ConsolidatedExchangeRateSearch;
import com.netsuite.webservices.lists.accounting_2022_1.ConsolidatedExchangeRateSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.ContactCategorySearch;
import com.netsuite.webservices.lists.accounting_2022_1.ContactCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.ContactRoleSearch;
import com.netsuite.webservices.lists.accounting_2022_1.ContactRoleSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.CostCategorySearch;
import com.netsuite.webservices.lists.accounting_2022_1.CostCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.CurrencyRateSearch;
import com.netsuite.webservices.lists.accounting_2022_1.CurrencyRateSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.CustomerCategorySearch;
import com.netsuite.webservices.lists.accounting_2022_1.CustomerCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.CustomerMessageSearch;
import com.netsuite.webservices.lists.accounting_2022_1.CustomerMessageSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.DepartmentSearch;
import com.netsuite.webservices.lists.accounting_2022_1.DepartmentSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.ExpenseCategorySearch;
import com.netsuite.webservices.lists.accounting_2022_1.ExpenseCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.FairValuePriceSearch;
import com.netsuite.webservices.lists.accounting_2022_1.FairValuePriceSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.GiftCertificateSearch;
import com.netsuite.webservices.lists.accounting_2022_1.GiftCertificateSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.GlobalAccountMappingSearch;
import com.netsuite.webservices.lists.accounting_2022_1.GlobalAccountMappingSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.InventoryNumberSearch;
import com.netsuite.webservices.lists.accounting_2022_1.InventoryNumberSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.ItemAccountMappingSearch;
import com.netsuite.webservices.lists.accounting_2022_1.ItemAccountMappingSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.ItemRevisionSearch;
import com.netsuite.webservices.lists.accounting_2022_1.ItemRevisionSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.ItemSearch;
import com.netsuite.webservices.lists.accounting_2022_1.ItemSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.LocationSearch;
import com.netsuite.webservices.lists.accounting_2022_1.LocationSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.MerchandiseHierarchyNodeSearch;
import com.netsuite.webservices.lists.accounting_2022_1.MerchandiseHierarchyNodeSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.NexusSearch;
import com.netsuite.webservices.lists.accounting_2022_1.NexusSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.NoteTypeSearch;
import com.netsuite.webservices.lists.accounting_2022_1.NoteTypeSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.OtherNameCategorySearch;
import com.netsuite.webservices.lists.accounting_2022_1.OtherNameCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.PartnerCategorySearch;
import com.netsuite.webservices.lists.accounting_2022_1.PartnerCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.PaymentInstrumentSearch;
import com.netsuite.webservices.lists.accounting_2022_1.PaymentInstrumentSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.PaymentMethodSearch;
import com.netsuite.webservices.lists.accounting_2022_1.PaymentMethodSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.PaymentOptionSearch;
import com.netsuite.webservices.lists.accounting_2022_1.PaymentOptionSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.PriceLevelSearch;
import com.netsuite.webservices.lists.accounting_2022_1.PriceLevelSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.PricingGroupSearch;
import com.netsuite.webservices.lists.accounting_2022_1.PricingGroupSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.RevRecScheduleSearch;
import com.netsuite.webservices.lists.accounting_2022_1.RevRecScheduleSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.RevRecTemplateSearch;
import com.netsuite.webservices.lists.accounting_2022_1.RevRecTemplateSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.SalesRoleSearch;
import com.netsuite.webservices.lists.accounting_2022_1.SalesRoleSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.SalesTaxItemSearch;
import com.netsuite.webservices.lists.accounting_2022_1.SalesTaxItemSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.SubsidiarySearch;
import com.netsuite.webservices.lists.accounting_2022_1.SubsidiarySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.TaxGroupSearch;
import com.netsuite.webservices.lists.accounting_2022_1.TaxGroupSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.TaxTypeSearch;
import com.netsuite.webservices.lists.accounting_2022_1.TaxTypeSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.TermSearch;
import com.netsuite.webservices.lists.accounting_2022_1.TermSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.UnitsTypeSearch;
import com.netsuite.webservices.lists.accounting_2022_1.UnitsTypeSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.VendorCategorySearch;
import com.netsuite.webservices.lists.accounting_2022_1.VendorCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2022_1.WinLossReasonSearch;
import com.netsuite.webservices.lists.accounting_2022_1.WinLossReasonSearchAdvanced;
import com.netsuite.webservices.lists.employees_2022_1.EmployeeSearch;
import com.netsuite.webservices.lists.employees_2022_1.EmployeeSearchAdvanced;
import com.netsuite.webservices.lists.employees_2022_1.HcmJobSearch;
import com.netsuite.webservices.lists.employees_2022_1.HcmJobSearchAdvanced;
import com.netsuite.webservices.lists.employees_2022_1.PayrollItemSearch;
import com.netsuite.webservices.lists.employees_2022_1.PayrollItemSearchAdvanced;
import com.netsuite.webservices.lists.marketing_2022_1.CampaignSearch;
import com.netsuite.webservices.lists.marketing_2022_1.CampaignSearchAdvanced;
import com.netsuite.webservices.lists.marketing_2022_1.CouponCodeSearch;
import com.netsuite.webservices.lists.marketing_2022_1.CouponCodeSearchAdvanced;
import com.netsuite.webservices.lists.marketing_2022_1.PromotionCodeSearch;
import com.netsuite.webservices.lists.marketing_2022_1.PromotionCodeSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2022_1.BillingAccountSearch;
import com.netsuite.webservices.lists.relationships_2022_1.BillingAccountSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2022_1.ContactSearch;
import com.netsuite.webservices.lists.relationships_2022_1.ContactSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2022_1.CustomerSearch;
import com.netsuite.webservices.lists.relationships_2022_1.CustomerSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2022_1.CustomerStatusSearch;
import com.netsuite.webservices.lists.relationships_2022_1.CustomerStatusSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2022_1.CustomerSubsidiaryRelationshipSearch;
import com.netsuite.webservices.lists.relationships_2022_1.CustomerSubsidiaryRelationshipSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2022_1.EntityGroupSearch;
import com.netsuite.webservices.lists.relationships_2022_1.EntityGroupSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2022_1.JobSearch;
import com.netsuite.webservices.lists.relationships_2022_1.JobSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2022_1.JobStatusSearch;
import com.netsuite.webservices.lists.relationships_2022_1.JobStatusSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2022_1.JobTypeSearch;
import com.netsuite.webservices.lists.relationships_2022_1.JobTypeSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2022_1.OriginatingLeadSearch;
import com.netsuite.webservices.lists.relationships_2022_1.PartnerSearch;
import com.netsuite.webservices.lists.relationships_2022_1.PartnerSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2022_1.VendorSearch;
import com.netsuite.webservices.lists.relationships_2022_1.VendorSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2022_1.VendorSubsidiaryRelationshipSearch;
import com.netsuite.webservices.lists.relationships_2022_1.VendorSubsidiaryRelationshipSearchAdvanced;
import com.netsuite.webservices.lists.supplychain_2022_1.ManufacturingCostTemplateSearch;
import com.netsuite.webservices.lists.supplychain_2022_1.ManufacturingCostTemplateSearchAdvanced;
import com.netsuite.webservices.lists.supplychain_2022_1.ManufacturingOperationTaskSearch;
import com.netsuite.webservices.lists.supplychain_2022_1.ManufacturingOperationTaskSearchAdvanced;
import com.netsuite.webservices.lists.supplychain_2022_1.ManufacturingRoutingSearch;
import com.netsuite.webservices.lists.supplychain_2022_1.ManufacturingRoutingSearchAdvanced;
import com.netsuite.webservices.lists.support_2022_1.IssueSearch;
import com.netsuite.webservices.lists.support_2022_1.IssueSearchAdvanced;
import com.netsuite.webservices.lists.support_2022_1.SolutionSearch;
import com.netsuite.webservices.lists.support_2022_1.SolutionSearchAdvanced;
import com.netsuite.webservices.lists.support_2022_1.SupportCaseSearch;
import com.netsuite.webservices.lists.support_2022_1.SupportCaseSearchAdvanced;
import com.netsuite.webservices.lists.support_2022_1.TopicSearch;
import com.netsuite.webservices.lists.support_2022_1.TopicSearchAdvanced;
import com.netsuite.webservices.lists.website_2022_1.SiteCategorySearch;
import com.netsuite.webservices.lists.website_2022_1.SiteCategorySearchAdvanced;
import com.netsuite.webservices.setup.customization_2022_1.CustomListSearch;
import com.netsuite.webservices.setup.customization_2022_1.CustomListSearchAdvanced;
import com.netsuite.webservices.setup.customization_2022_1.CustomRecordSearch;
import com.netsuite.webservices.setup.customization_2022_1.CustomRecordSearchAdvanced;
import com.netsuite.webservices.transactions.customers_2022_1.ChargeSearch;
import com.netsuite.webservices.transactions.customers_2022_1.ChargeSearchAdvanced;
import com.netsuite.webservices.transactions.demandplanning_2022_1.ItemDemandPlanSearch;
import com.netsuite.webservices.transactions.demandplanning_2022_1.ItemDemandPlanSearchAdvanced;
import com.netsuite.webservices.transactions.demandplanning_2022_1.ItemSupplyPlanSearch;
import com.netsuite.webservices.transactions.demandplanning_2022_1.ItemSupplyPlanSearchAdvanced;
import com.netsuite.webservices.transactions.employees_2022_1.PaycheckSearch;
import com.netsuite.webservices.transactions.employees_2022_1.PaycheckSearchAdvanced;
import com.netsuite.webservices.transactions.employees_2022_1.TimeBillSearch;
import com.netsuite.webservices.transactions.employees_2022_1.TimeBillSearchAdvanced;
import com.netsuite.webservices.transactions.employees_2022_1.TimeEntrySearch;
import com.netsuite.webservices.transactions.employees_2022_1.TimeEntrySearchAdvanced;
import com.netsuite.webservices.transactions.employees_2022_1.TimeSheetSearch;
import com.netsuite.webservices.transactions.employees_2022_1.TimeSheetSearchAdvanced;
import com.netsuite.webservices.transactions.financial_2022_1.BudgetSearch;
import com.netsuite.webservices.transactions.financial_2022_1.BudgetSearchAdvanced;
import com.netsuite.webservices.transactions.purchases_2022_1.InboundShipmentSearch;
import com.netsuite.webservices.transactions.purchases_2022_1.InboundShipmentSearchAdvanced;
import com.netsuite.webservices.transactions.sales_2022_1.AccountingTransactionSearch;
import com.netsuite.webservices.transactions.sales_2022_1.AccountingTransactionSearchAdvanced;
import com.netsuite.webservices.transactions.sales_2022_1.OpportunitySearch;
import com.netsuite.webservices.transactions.sales_2022_1.OpportunitySearchAdvanced;
import com.netsuite.webservices.transactions.sales_2022_1.TransactionSearch;
import com.netsuite.webservices.transactions.sales_2022_1.TransactionSearchAdvanced;
import com.netsuite.webservices.transactions.sales_2022_1.UsageSearch;
import com.netsuite.webservices.transactions.sales_2022_1.UsageSearchAdvanced;


/**
 * <p>Java class for SearchRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRecord"&gt;
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
@XmlType(name = "SearchRecord")
@XmlSeeAlso({
    SearchRecordBasic.class,
    CalendarEventSearch.class,
    TaskSearch.class,
    PhoneCallSearch.class,
    ProjectTaskSearch.class,
    ResourceAllocationSearch.class,
    CalendarEventSearchAdvanced.class,
    TaskSearchAdvanced.class,
    PhoneCallSearchAdvanced.class,
    ProjectTaskSearchAdvanced.class,
    ResourceAllocationSearchAdvanced.class,
    NoteSearch.class,
    MessageSearch.class,
    NoteSearchAdvanced.class,
    MessageSearchAdvanced.class,
    FileSearch.class,
    FolderSearch.class,
    FileSearchAdvanced.class,
    FolderSearchAdvanced.class,
    ContactSearch.class,
    CustomerSearch.class,
    PartnerSearch.class,
    VendorSearch.class,
    EntityGroupSearch.class,
    JobSearch.class,
    CustomerStatusSearch.class,
    JobStatusSearch.class,
    JobTypeSearch.class,
    OriginatingLeadSearch.class,
    BillingAccountSearch.class,
    CustomerSubsidiaryRelationshipSearch.class,
    VendorSubsidiaryRelationshipSearch.class,
    ContactSearchAdvanced.class,
    CustomerSearchAdvanced.class,
    PartnerSearchAdvanced.class,
    VendorSearchAdvanced.class,
    EntityGroupSearchAdvanced.class,
    JobSearchAdvanced.class,
    CustomerStatusSearchAdvanced.class,
    JobStatusSearchAdvanced.class,
    JobTypeSearchAdvanced.class,
    BillingAccountSearchAdvanced.class,
    CustomerSubsidiaryRelationshipSearchAdvanced.class,
    VendorSubsidiaryRelationshipSearchAdvanced.class,
    SupportCaseSearch.class,
    SolutionSearch.class,
    TopicSearch.class,
    IssueSearch.class,
    SupportCaseSearchAdvanced.class,
    SolutionSearchAdvanced.class,
    TopicSearchAdvanced.class,
    IssueSearchAdvanced.class,
    AccountSearch.class,
    DepartmentSearch.class,
    ClassificationSearch.class,
    LocationSearch.class,
    ItemSearch.class,
    BinSearch.class,
    SubsidiarySearch.class,
    GiftCertificateSearch.class,
    AccountingPeriodSearch.class,
    ContactCategorySearch.class,
    ContactRoleSearch.class,
    CustomerCategorySearch.class,
    ExpenseCategorySearch.class,
    NoteTypeSearch.class,
    PartnerCategorySearch.class,
    PaymentMethodSearch.class,
    PriceLevelSearch.class,
    SalesRoleSearch.class,
    TermSearch.class,
    VendorCategorySearch.class,
    WinLossReasonSearch.class,
    UnitsTypeSearch.class,
    PricingGroupSearch.class,
    InventoryNumberSearch.class,
    RevRecScheduleSearch.class,
    RevRecTemplateSearch.class,
    NexusSearch.class,
    OtherNameCategorySearch.class,
    CustomerMessageSearch.class,
    CurrencyRateSearch.class,
    ItemRevisionSearch.class,
    BillingScheduleSearch.class,
    GlobalAccountMappingSearch.class,
    ItemAccountMappingSearch.class,
    FairValuePriceSearch.class,
    CostCategorySearch.class,
    ConsolidatedExchangeRateSearch.class,
    TaxGroupSearch.class,
    SalesTaxItemSearch.class,
    TaxTypeSearch.class,
    BomSearch.class,
    BomRevisionSearch.class,
    PaymentInstrumentSearch.class,
    PaymentOptionSearch.class,
    MerchandiseHierarchyNodeSearch.class,
    AccountSearchAdvanced.class,
    DepartmentSearchAdvanced.class,
    ClassificationSearchAdvanced.class,
    LocationSearchAdvanced.class,
    ItemSearchAdvanced.class,
    BinSearchAdvanced.class,
    SubsidiarySearchAdvanced.class,
    GiftCertificateSearchAdvanced.class,
    AccountingPeriodSearchAdvanced.class,
    ContactCategorySearchAdvanced.class,
    ContactRoleSearchAdvanced.class,
    CustomerCategorySearchAdvanced.class,
    ExpenseCategorySearchAdvanced.class,
    NoteTypeSearchAdvanced.class,
    PartnerCategorySearchAdvanced.class,
    PaymentMethodSearchAdvanced.class,
    PriceLevelSearchAdvanced.class,
    SalesRoleSearchAdvanced.class,
    TermSearchAdvanced.class,
    VendorCategorySearchAdvanced.class,
    WinLossReasonSearchAdvanced.class,
    UnitsTypeSearchAdvanced.class,
    PricingGroupSearchAdvanced.class,
    InventoryNumberSearchAdvanced.class,
    RevRecScheduleSearchAdvanced.class,
    RevRecTemplateSearchAdvanced.class,
    NexusSearchAdvanced.class,
    OtherNameCategorySearchAdvanced.class,
    CustomerMessageSearchAdvanced.class,
    CurrencyRateSearchAdvanced.class,
    ItemRevisionSearchAdvanced.class,
    BillingScheduleSearchAdvanced.class,
    GlobalAccountMappingSearchAdvanced.class,
    ItemAccountMappingSearchAdvanced.class,
    FairValuePriceSearchAdvanced.class,
    CostCategorySearchAdvanced.class,
    ConsolidatedExchangeRateSearchAdvanced.class,
    TaxGroupSearchAdvanced.class,
    SalesTaxItemSearchAdvanced.class,
    TaxTypeSearchAdvanced.class,
    BomSearchAdvanced.class,
    BomRevisionSearchAdvanced.class,
    PaymentInstrumentSearchAdvanced.class,
    PaymentOptionSearchAdvanced.class,
    MerchandiseHierarchyNodeSearchAdvanced.class,
    OpportunitySearch.class,
    TransactionSearch.class,
    AccountingTransactionSearch.class,
    UsageSearch.class,
    OpportunitySearchAdvanced.class,
    TransactionSearchAdvanced.class,
    AccountingTransactionSearchAdvanced.class,
    UsageSearchAdvanced.class,
    InboundShipmentSearch.class,
    InboundShipmentSearchAdvanced.class,
    ChargeSearch.class,
    ChargeSearchAdvanced.class,
    BudgetSearch.class,
    BudgetSearchAdvanced.class,
    CustomRecordSearch.class,
    CustomListSearch.class,
    CustomRecordSearchAdvanced.class,
    CustomListSearchAdvanced.class,
    EmployeeSearch.class,
    PayrollItemSearch.class,
    HcmJobSearch.class,
    EmployeeSearchAdvanced.class,
    PayrollItemSearchAdvanced.class,
    HcmJobSearchAdvanced.class,
    SiteCategorySearch.class,
    SiteCategorySearchAdvanced.class,
    TimeBillSearch.class,
    TimeEntrySearch.class,
    TimeSheetSearch.class,
    PaycheckSearch.class,
    TimeBillSearchAdvanced.class,
    TimeEntrySearchAdvanced.class,
    TimeSheetSearchAdvanced.class,
    PaycheckSearchAdvanced.class,
    CampaignSearch.class,
    PromotionCodeSearch.class,
    CouponCodeSearch.class,
    CampaignSearchAdvanced.class,
    PromotionCodeSearchAdvanced.class,
    CouponCodeSearchAdvanced.class,
    ItemDemandPlanSearch.class,
    ItemSupplyPlanSearch.class,
    ItemDemandPlanSearchAdvanced.class,
    ItemSupplyPlanSearchAdvanced.class,
    ManufacturingCostTemplateSearch.class,
    ManufacturingRoutingSearch.class,
    ManufacturingOperationTaskSearch.class,
    ManufacturingCostTemplateSearchAdvanced.class,
    ManufacturingRoutingSearchAdvanced.class,
    ManufacturingOperationTaskSearchAdvanced.class
})
public abstract class SearchRecord {


}
