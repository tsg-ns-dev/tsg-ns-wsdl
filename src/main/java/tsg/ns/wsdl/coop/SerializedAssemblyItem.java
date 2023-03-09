
package tsg.ns.wsdl.coop;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SerializedAssemblyItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SerializedAssemblyItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="customForm" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="upcCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parent" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="printItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isOnline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="lastInvtCountDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="nextInvtCountDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="invtCountInterval" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="invtClassification" type="{urn:types.accounting_2022_2.lists.webservices.netsuite.com}ItemInvtClassification" minOccurs="0"/&gt;
 *         &lt;element name="isGcoCompliant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="offerSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="useComponentYield" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="subsidiaryList" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/&gt;
 *         &lt;element name="availableToPartners" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="includeChildren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="department" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="class" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cogsAccount" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="vendor" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="incomeAccount" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="intercoIncomeAccount" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="assetAccount" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="matchBillToReceipt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="billQtyVarianceAcct" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="billPriceVarianceAcct" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="billExchRateVarianceAcct" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="gainLossAccount" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="salesTaxCode" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="costCategory" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="purchaseTaxCode" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="prodQtyVarianceAcct" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="prodPriceVarianceAcct" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="purchasePriceVarianceAcct" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="wipVarianceAcct" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="taxSchedule" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="scrapAcct" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="shippingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="wipAcct" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="shippingCostUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handlingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="handlingCostUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weightUnit" type="{urn:types.accounting_2022_2.lists.webservices.netsuite.com}ItemWeightUnit" minOccurs="0"/&gt;
 *         &lt;element name="weightUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="costingMethod" type="{urn:types.accounting_2022_2.lists.webservices.netsuite.com}ItemCostingMethod" minOccurs="0"/&gt;
 *         &lt;element name="isTaxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="costingMethodDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="unitsType" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="stockUnit" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="purchaseUnit" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="saleUnit" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="trackLandedCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="matrixItemNameTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billingSchedule" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="deferredRevenueAccount" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="revRecSchedule" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="stockDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="producer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mpn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="multManufactureAddr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="manufactureraddr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryOfManufacture" type="{urn:types.common_2022_2.platform.webservices.netsuite.com}Country" minOccurs="0"/&gt;
 *         &lt;element name="effectiveBomControl" type="{urn:types.accounting_2022_2.lists.webservices.netsuite.com}AssemblyItemEffectiveBomControl" minOccurs="0"/&gt;
 *         &lt;element name="minimumQuantityUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="defaultRevision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="defaultItemShipMethod" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="itemCarrier" type="{urn:types.common_2022_2.platform.webservices.netsuite.com}ShippingCarrier" minOccurs="0"/&gt;
 *         &lt;element name="roundUpAsComponent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderQuantityDiff" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="receiptQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="receiptAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="receiptQuantityDiff" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="isDropShipItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isPhantom" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="itemShipMethodList" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerTaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scheduleBNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scheduleBQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="scheduleBCode" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerTariff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preferenceCriterion" type="{urn:types.accounting_2022_2.lists.webservices.netsuite.com}ItemPreferenceCriterion" minOccurs="0"/&gt;
 *         &lt;element name="issueProduct" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="minimumQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="enforceMinQtyInternally" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="maximumQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="softDescriptor" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="isSpecialWorkOrderItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="pricesIncludeTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="quantityPricingSchedule" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="buildEntireAssembly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="quantityOnHand" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="quantityOnHandUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="useMarginalRates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="reorderMultiple" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="costEstimateType" type="{urn:types.common_2022_2.platform.webservices.netsuite.com}ItemCostEstimateType" minOccurs="0"/&gt;
 *         &lt;element name="isHazmatItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="hazmatId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hazmatShippingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hazmatHazardClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hazmatPackingGroup" type="{urn:types.accounting_2022_2.lists.webservices.netsuite.com}HazmatPackingGroup" minOccurs="0"/&gt;
 *         &lt;element name="hazmatItemUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hazmatItemUnitsQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="costEstimate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="transferPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="overallQuantityPricingType" type="{urn:types.accounting_2022_2.lists.webservices.netsuite.com}ItemOverallQuantityPricingType" minOccurs="0"/&gt;
 *         &lt;element name="pricingGroup" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="intercoCogsAccount" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="vsoePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vsoeSopGroup" type="{urn:types.common_2022_2.platform.webservices.netsuite.com}VsoeSopGroup" minOccurs="0"/&gt;
 *         &lt;element name="vsoeDeferral" type="{urn:types.common_2022_2.platform.webservices.netsuite.com}VsoeDeferral" minOccurs="0"/&gt;
 *         &lt;element name="vsoePermitDiscount" type="{urn:types.common_2022_2.platform.webservices.netsuite.com}VsoePermitDiscount" minOccurs="0"/&gt;
 *         &lt;element name="vsoeDelivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="itemRevenueCategory" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="unbuildVarianceAccount" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="revenueRecognitionRule" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="revRecForecastRule" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="revenueAllocationGroup" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="createRevenuePlansOn" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="directRevenuePosting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dropshipExpenseAccount" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="preferredLocation" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="isStorePickupAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="totalValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="useBins" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="averageCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lastPurchasePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="purchaseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="leadTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="autoLeadTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="buildTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="buildTimeLotSize" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="fixedBuildTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="planningItemCategory" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="safetyStockLevel" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="safetyStockLevelUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="safetyStockLevelDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="seasonalDemand" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="serialNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reorderPoint" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="reorderPointUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preferredStockLevel" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="preferredStockLevelUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="demandModifier" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="autoReorderPoint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="autoPreferredStockLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="preferredStockLevelDays" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="defaultReturnCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="supplyReplenishmentMethod" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="alternateDemandSourceItem" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="fixedLotSize" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="supplyType" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="demandTimeFence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="supplyTimeFence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="rescheduleInDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="rescheduleOutDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="supplyLotSizingMethod" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="demandSource" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="shipIndividually" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="quantityCommitted" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="quantityAvailable" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="quantityBackOrdered" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="quantityOnOrder" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="shipPackage" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="storeDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="storeDisplayThumbnail" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="storeDisplayImage" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="storeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="storeDetailedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="storeItemTemplate" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="pageTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="metaTagHtml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="excludeFromSitemap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sitemapPriority" type="{urn:types.common_2022_2.platform.webservices.netsuite.com}SitemapPriority" minOccurs="0"/&gt;
 *         &lt;element name="urlComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="searchKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isDonationItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="showDefaultDonationAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="maxDonationAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="dontShowPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="noPriceMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shoppingDotComCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shopzillaCategoryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="outOfStockMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nexTagCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outOfStockBehavior" type="{urn:types.accounting_2022_2.lists.webservices.netsuite.com}ItemOutOfStockBehavior" minOccurs="0"/&gt;
 *         &lt;element name="productFeedList" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}ProductFeedList" minOccurs="0"/&gt;
 *         &lt;element name="relatedItemsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="onSpecial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="specialsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="featuredDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemOptionsList" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}ItemOptionsList" minOccurs="0"/&gt;
 *         &lt;element name="itemNumberOptionsList" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/&gt;
 *         &lt;element name="itemVendorList" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}ItemVendorList" minOccurs="0"/&gt;
 *         &lt;element name="pricingMatrix" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}PricingMatrix" minOccurs="0"/&gt;
 *         &lt;element name="billOfMaterialsList" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}SerializedAssemblyItemBillOfMaterialsList" minOccurs="0"/&gt;
 *         &lt;element name="memberList" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}ItemMemberList" minOccurs="0"/&gt;
 *         &lt;element name="accountingBookDetailList" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}ItemAccountingBookDetailList" minOccurs="0"/&gt;
 *         &lt;element name="locationsList" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}SerializedInventoryItemLocationsList" minOccurs="0"/&gt;
 *         &lt;element name="siteCategoryList" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}SiteCategoryList" minOccurs="0"/&gt;
 *         &lt;element name="binNumberList" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}InventoryItemBinNumberList" minOccurs="0"/&gt;
 *         &lt;element name="numbersList" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}SerializedInventoryItemNumbersList" minOccurs="0"/&gt;
 *         &lt;element name="translationsList" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}TranslationList" minOccurs="0"/&gt;
 *         &lt;element name="presentationItemList" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}PresentationItemList" minOccurs="0"/&gt;
 *         &lt;element name="hierarchyVersionsList" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}SerializedAssemblyItemHierarchyVersionsList" minOccurs="0"/&gt;
 *         &lt;element name="futureHorizon" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="consumptionUnit" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
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
@XmlType(name = "SerializedAssemblyItem", propOrder = {
    "createdDate",
    "lastModifiedDate",
    "customForm",
    "itemId",
    "upcCode",
    "displayName",
    "vendorName",
    "parent",
    "printItems",
    "isOnline",
    "lastInvtCountDate",
    "nextInvtCountDate",
    "invtCountInterval",
    "invtClassification",
    "isGcoCompliant",
    "offerSupport",
    "useComponentYield",
    "isInactive",
    "subsidiaryList",
    "availableToPartners",
    "includeChildren",
    "department",
    "clazz",
    "location",
    "description",
    "cogsAccount",
    "vendor",
    "incomeAccount",
    "intercoIncomeAccount",
    "assetAccount",
    "matchBillToReceipt",
    "billQtyVarianceAcct",
    "billPriceVarianceAcct",
    "billExchRateVarianceAcct",
    "gainLossAccount",
    "salesTaxCode",
    "costCategory",
    "purchaseTaxCode",
    "prodQtyVarianceAcct",
    "prodPriceVarianceAcct",
    "purchasePriceVarianceAcct",
    "wipVarianceAcct",
    "taxSchedule",
    "scrapAcct",
    "shippingCost",
    "wipAcct",
    "shippingCostUnits",
    "handlingCost",
    "weight",
    "handlingCostUnits",
    "weightUnit",
    "weightUnits",
    "costingMethod",
    "isTaxable",
    "costingMethodDisplay",
    "rate",
    "unitsType",
    "stockUnit",
    "purchaseUnit",
    "saleUnit",
    "trackLandedCost",
    "matrixItemNameTemplate",
    "billingSchedule",
    "deferredRevenueAccount",
    "revRecSchedule",
    "stockDescription",
    "producer",
    "manufacturer",
    "mpn",
    "multManufactureAddr",
    "manufactureraddr1",
    "manufacturerCity",
    "manufacturerState",
    "manufacturerZip",
    "countryOfManufacture",
    "effectiveBomControl",
    "minimumQuantityUnits",
    "defaultRevision",
    "defaultItemShipMethod",
    "itemCarrier",
    "roundUpAsComponent",
    "purchaseOrderQuantity",
    "purchaseOrderAmount",
    "purchaseOrderQuantityDiff",
    "receiptQuantity",
    "receiptAmount",
    "receiptQuantityDiff",
    "isDropShipItem",
    "isPhantom",
    "itemShipMethodList",
    "manufacturerTaxId",
    "scheduleBNumber",
    "scheduleBQuantity",
    "scheduleBCode",
    "manufacturerTariff",
    "preferenceCriterion",
    "issueProduct",
    "minimumQuantity",
    "enforceMinQtyInternally",
    "maximumQuantity",
    "softDescriptor",
    "isSpecialWorkOrderItem",
    "pricesIncludeTax",
    "quantityPricingSchedule",
    "buildEntireAssembly",
    "quantityOnHand",
    "quantityOnHandUnits",
    "useMarginalRates",
    "reorderMultiple",
    "cost",
    "costEstimateType",
    "isHazmatItem",
    "hazmatId",
    "hazmatShippingName",
    "hazmatHazardClass",
    "hazmatPackingGroup",
    "hazmatItemUnits",
    "hazmatItemUnitsQty",
    "costEstimate",
    "transferPrice",
    "overallQuantityPricingType",
    "pricingGroup",
    "intercoCogsAccount",
    "vsoePrice",
    "vsoeSopGroup",
    "vsoeDeferral",
    "vsoePermitDiscount",
    "vsoeDelivered",
    "itemRevenueCategory",
    "unbuildVarianceAccount",
    "revenueRecognitionRule",
    "revRecForecastRule",
    "revenueAllocationGroup",
    "createRevenuePlansOn",
    "directRevenuePosting",
    "dropshipExpenseAccount",
    "preferredLocation",
    "isStorePickupAllowed",
    "totalValue",
    "useBins",
    "averageCost",
    "lastPurchasePrice",
    "purchaseDescription",
    "leadTime",
    "autoLeadTime",
    "buildTime",
    "buildTimeLotSize",
    "fixedBuildTime",
    "planningItemCategory",
    "safetyStockLevel",
    "safetyStockLevelUnits",
    "safetyStockLevelDays",
    "seasonalDemand",
    "serialNumbers",
    "reorderPoint",
    "reorderPointUnits",
    "preferredStockLevel",
    "preferredStockLevelUnits",
    "demandModifier",
    "autoReorderPoint",
    "autoPreferredStockLevel",
    "preferredStockLevelDays",
    "defaultReturnCost",
    "supplyReplenishmentMethod",
    "alternateDemandSourceItem",
    "fixedLotSize",
    "supplyType",
    "demandTimeFence",
    "supplyTimeFence",
    "rescheduleInDays",
    "rescheduleOutDays",
    "supplyLotSizingMethod",
    "demandSource",
    "shipIndividually",
    "quantityCommitted",
    "quantityAvailable",
    "quantityBackOrdered",
    "quantityOnOrder",
    "shipPackage",
    "storeDisplayName",
    "storeDisplayThumbnail",
    "storeDisplayImage",
    "storeDescription",
    "storeDetailedDescription",
    "storeItemTemplate",
    "pageTitle",
    "metaTagHtml",
    "excludeFromSitemap",
    "sitemapPriority",
    "urlComponent",
    "searchKeywords",
    "isDonationItem",
    "showDefaultDonationAmount",
    "maxDonationAmount",
    "dontShowPrice",
    "noPriceMessage",
    "shoppingDotComCategory",
    "shopzillaCategoryId",
    "outOfStockMessage",
    "nexTagCategory",
    "outOfStockBehavior",
    "productFeedList",
    "relatedItemsDescription",
    "onSpecial",
    "specialsDescription",
    "featuredDescription",
    "itemOptionsList",
    "itemNumberOptionsList",
    "itemVendorList",
    "pricingMatrix",
    "billOfMaterialsList",
    "memberList",
    "accountingBookDetailList",
    "locationsList",
    "siteCategoryList",
    "binNumberList",
    "numbersList",
    "translationsList",
    "presentationItemList",
    "hierarchyVersionsList",
    "futureHorizon",
    "consumptionUnit",
    "customFieldList"
})
public class SerializedAssemblyItem
    extends Record
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected RecordRef customForm;
    protected String itemId;
    protected String upcCode;
    protected String displayName;
    protected String vendorName;
    protected RecordRef parent;
    protected Boolean printItems;
    protected Boolean isOnline;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastInvtCountDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextInvtCountDate;
    protected Long invtCountInterval;
    @XmlSchemaType(name = "string")
    protected ItemInvtClassification invtClassification;
    protected Boolean isGcoCompliant;
    protected Boolean offerSupport;
    protected Boolean useComponentYield;
    protected Boolean isInactive;
    protected RecordRefList subsidiaryList;
    protected Boolean availableToPartners;
    protected Boolean includeChildren;
    protected RecordRef department;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected RecordRef location;
    protected String description;
    protected RecordRef cogsAccount;
    protected RecordRef vendor;
    protected RecordRef incomeAccount;
    protected RecordRef intercoIncomeAccount;
    protected RecordRef assetAccount;
    protected Boolean matchBillToReceipt;
    protected RecordRef billQtyVarianceAcct;
    protected RecordRef billPriceVarianceAcct;
    protected RecordRef billExchRateVarianceAcct;
    protected RecordRef gainLossAccount;
    protected RecordRef salesTaxCode;
    protected RecordRef costCategory;
    protected RecordRef purchaseTaxCode;
    protected RecordRef prodQtyVarianceAcct;
    protected RecordRef prodPriceVarianceAcct;
    protected RecordRef purchasePriceVarianceAcct;
    protected RecordRef wipVarianceAcct;
    protected RecordRef taxSchedule;
    protected RecordRef scrapAcct;
    protected Double shippingCost;
    protected RecordRef wipAcct;
    protected String shippingCostUnits;
    protected Double handlingCost;
    protected Double weight;
    protected String handlingCostUnits;
    @XmlSchemaType(name = "string")
    protected ItemWeightUnit weightUnit;
    protected String weightUnits;
    @XmlSchemaType(name = "string")
    protected ItemCostingMethod costingMethod;
    protected Boolean isTaxable;
    protected String costingMethodDisplay;
    protected Double rate;
    protected RecordRef unitsType;
    protected RecordRef stockUnit;
    protected RecordRef purchaseUnit;
    protected RecordRef saleUnit;
    protected Boolean trackLandedCost;
    protected String matrixItemNameTemplate;
    protected RecordRef billingSchedule;
    protected RecordRef deferredRevenueAccount;
    protected RecordRef revRecSchedule;
    protected String stockDescription;
    protected Boolean producer;
    protected String manufacturer;
    protected String mpn;
    protected Boolean multManufactureAddr;
    protected String manufactureraddr1;
    protected String manufacturerCity;
    protected String manufacturerState;
    protected String manufacturerZip;
    @XmlSchemaType(name = "string")
    protected Country countryOfManufacture;
    @XmlSchemaType(name = "string")
    protected AssemblyItemEffectiveBomControl effectiveBomControl;
    protected String minimumQuantityUnits;
    protected String defaultRevision;
    protected RecordRef defaultItemShipMethod;
    @XmlSchemaType(name = "string")
    protected ShippingCarrier itemCarrier;
    protected Boolean roundUpAsComponent;
    protected Double purchaseOrderQuantity;
    protected Double purchaseOrderAmount;
    protected Double purchaseOrderQuantityDiff;
    protected Double receiptQuantity;
    protected Double receiptAmount;
    protected Double receiptQuantityDiff;
    protected Boolean isDropShipItem;
    protected Boolean isPhantom;
    protected RecordRefList itemShipMethodList;
    protected String manufacturerTaxId;
    protected String scheduleBNumber;
    protected Long scheduleBQuantity;
    protected RecordRef scheduleBCode;
    protected String manufacturerTariff;
    @XmlSchemaType(name = "string")
    protected ItemPreferenceCriterion preferenceCriterion;
    protected RecordRef issueProduct;
    protected Long minimumQuantity;
    protected Boolean enforceMinQtyInternally;
    protected Long maximumQuantity;
    protected RecordRef softDescriptor;
    protected Boolean isSpecialWorkOrderItem;
    protected Boolean pricesIncludeTax;
    protected RecordRef quantityPricingSchedule;
    protected Boolean buildEntireAssembly;
    protected Double quantityOnHand;
    protected String quantityOnHandUnits;
    protected Boolean useMarginalRates;
    protected Long reorderMultiple;
    protected Double cost;
    @XmlSchemaType(name = "string")
    protected ItemCostEstimateType costEstimateType;
    protected Boolean isHazmatItem;
    protected String hazmatId;
    protected String hazmatShippingName;
    protected String hazmatHazardClass;
    @XmlSchemaType(name = "string")
    protected HazmatPackingGroup hazmatPackingGroup;
    protected String hazmatItemUnits;
    protected Double hazmatItemUnitsQty;
    protected Double costEstimate;
    protected Double transferPrice;
    @XmlSchemaType(name = "string")
    protected ItemOverallQuantityPricingType overallQuantityPricingType;
    protected RecordRef pricingGroup;
    protected RecordRef intercoCogsAccount;
    protected Double vsoePrice;
    @XmlSchemaType(name = "string")
    protected VsoeSopGroup vsoeSopGroup;
    @XmlSchemaType(name = "string")
    protected VsoeDeferral vsoeDeferral;
    @XmlSchemaType(name = "string")
    protected VsoePermitDiscount vsoePermitDiscount;
    protected Boolean vsoeDelivered;
    protected RecordRef itemRevenueCategory;
    protected RecordRef unbuildVarianceAccount;
    protected RecordRef revenueRecognitionRule;
    protected RecordRef revRecForecastRule;
    protected RecordRef revenueAllocationGroup;
    protected RecordRef createRevenuePlansOn;
    protected Boolean directRevenuePosting;
    protected RecordRef dropshipExpenseAccount;
    protected RecordRef preferredLocation;
    protected Boolean isStorePickupAllowed;
    protected Double totalValue;
    protected Boolean useBins;
    protected Double averageCost;
    protected Double lastPurchasePrice;
    protected String purchaseDescription;
    protected Long leadTime;
    protected Boolean autoLeadTime;
    protected Double buildTime;
    protected Double buildTimeLotSize;
    protected Double fixedBuildTime;
    protected RecordRef planningItemCategory;
    protected Double safetyStockLevel;
    protected String safetyStockLevelUnits;
    protected Long safetyStockLevelDays;
    protected Boolean seasonalDemand;
    protected String serialNumbers;
    protected Double reorderPoint;
    protected String reorderPointUnits;
    protected Double preferredStockLevel;
    protected String preferredStockLevelUnits;
    protected Double demandModifier;
    protected Boolean autoReorderPoint;
    protected Boolean autoPreferredStockLevel;
    protected Double preferredStockLevelDays;
    protected Double defaultReturnCost;
    protected RecordRef supplyReplenishmentMethod;
    protected RecordRef alternateDemandSourceItem;
    protected Double fixedLotSize;
    protected RecordRef supplyType;
    protected Long demandTimeFence;
    protected Long supplyTimeFence;
    protected Long rescheduleInDays;
    protected Long rescheduleOutDays;
    protected RecordRef supplyLotSizingMethod;
    protected RecordRef demandSource;
    protected Boolean shipIndividually;
    protected Double quantityCommitted;
    protected Double quantityAvailable;
    protected Double quantityBackOrdered;
    protected Double quantityOnOrder;
    protected RecordRef shipPackage;
    protected String storeDisplayName;
    protected RecordRef storeDisplayThumbnail;
    protected RecordRef storeDisplayImage;
    protected String storeDescription;
    protected String storeDetailedDescription;
    protected RecordRef storeItemTemplate;
    protected String pageTitle;
    protected String metaTagHtml;
    protected Boolean excludeFromSitemap;
    protected String sitemapPriority;
    protected String urlComponent;
    protected String searchKeywords;
    protected Boolean isDonationItem;
    protected Boolean showDefaultDonationAmount;
    protected Double maxDonationAmount;
    protected Boolean dontShowPrice;
    protected String noPriceMessage;
    protected String shoppingDotComCategory;
    protected Long shopzillaCategoryId;
    protected String outOfStockMessage;
    protected String nexTagCategory;
    @XmlSchemaType(name = "string")
    protected ItemOutOfStockBehavior outOfStockBehavior;
    protected ProductFeedList productFeedList;
    protected String relatedItemsDescription;
    protected Boolean onSpecial;
    protected String specialsDescription;
    protected String featuredDescription;
    protected ItemOptionsList itemOptionsList;
    protected RecordRefList itemNumberOptionsList;
    protected ItemVendorList itemVendorList;
    protected PricingMatrix pricingMatrix;
    protected SerializedAssemblyItemBillOfMaterialsList billOfMaterialsList;
    protected ItemMemberList memberList;
    protected ItemAccountingBookDetailList accountingBookDetailList;
    protected SerializedInventoryItemLocationsList locationsList;
    protected SiteCategoryList siteCategoryList;
    protected InventoryItemBinNumberList binNumberList;
    protected SerializedInventoryItemNumbersList numbersList;
    protected TranslationList translationsList;
    protected PresentationItemList presentationItemList;
    protected SerializedAssemblyItemHierarchyVersionsList hierarchyVersionsList;
    protected Long futureHorizon;
    protected RecordRef consumptionUnit;
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
     * Gets the value of the printItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintItems() {
        return printItems;
    }

    /**
     * Sets the value of the printItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintItems(Boolean value) {
        this.printItems = value;
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
     * Gets the value of the lastInvtCountDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastInvtCountDate() {
        return lastInvtCountDate;
    }

    /**
     * Sets the value of the lastInvtCountDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastInvtCountDate(XMLGregorianCalendar value) {
        this.lastInvtCountDate = value;
    }

    /**
     * Gets the value of the nextInvtCountDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextInvtCountDate() {
        return nextInvtCountDate;
    }

    /**
     * Sets the value of the nextInvtCountDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextInvtCountDate(XMLGregorianCalendar value) {
        this.nextInvtCountDate = value;
    }

    /**
     * Gets the value of the invtCountInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvtCountInterval() {
        return invtCountInterval;
    }

    /**
     * Sets the value of the invtCountInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvtCountInterval(Long value) {
        this.invtCountInterval = value;
    }

    /**
     * Gets the value of the invtClassification property.
     * 
     * @return
     *     possible object is
     *     {@link ItemInvtClassification }
     *     
     */
    public ItemInvtClassification getInvtClassification() {
        return invtClassification;
    }

    /**
     * Sets the value of the invtClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInvtClassification }
     *     
     */
    public void setInvtClassification(ItemInvtClassification value) {
        this.invtClassification = value;
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
     * Gets the value of the useComponentYield property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseComponentYield() {
        return useComponentYield;
    }

    /**
     * Sets the value of the useComponentYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseComponentYield(Boolean value) {
        this.useComponentYield = value;
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
     * Gets the value of the cogsAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCogsAccount() {
        return cogsAccount;
    }

    /**
     * Sets the value of the cogsAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCogsAccount(RecordRef value) {
        this.cogsAccount = value;
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
     * Gets the value of the assetAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAssetAccount() {
        return assetAccount;
    }

    /**
     * Sets the value of the assetAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAssetAccount(RecordRef value) {
        this.assetAccount = value;
    }

    /**
     * Gets the value of the matchBillToReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMatchBillToReceipt() {
        return matchBillToReceipt;
    }

    /**
     * Sets the value of the matchBillToReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchBillToReceipt(Boolean value) {
        this.matchBillToReceipt = value;
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
     * Gets the value of the gainLossAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getGainLossAccount() {
        return gainLossAccount;
    }

    /**
     * Sets the value of the gainLossAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setGainLossAccount(RecordRef value) {
        this.gainLossAccount = value;
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
     * Gets the value of the prodQtyVarianceAcct property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getProdQtyVarianceAcct() {
        return prodQtyVarianceAcct;
    }

    /**
     * Sets the value of the prodQtyVarianceAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setProdQtyVarianceAcct(RecordRef value) {
        this.prodQtyVarianceAcct = value;
    }

    /**
     * Gets the value of the prodPriceVarianceAcct property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getProdPriceVarianceAcct() {
        return prodPriceVarianceAcct;
    }

    /**
     * Sets the value of the prodPriceVarianceAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setProdPriceVarianceAcct(RecordRef value) {
        this.prodPriceVarianceAcct = value;
    }

    /**
     * Gets the value of the purchasePriceVarianceAcct property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPurchasePriceVarianceAcct() {
        return purchasePriceVarianceAcct;
    }

    /**
     * Sets the value of the purchasePriceVarianceAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPurchasePriceVarianceAcct(RecordRef value) {
        this.purchasePriceVarianceAcct = value;
    }

    /**
     * Gets the value of the wipVarianceAcct property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getWipVarianceAcct() {
        return wipVarianceAcct;
    }

    /**
     * Sets the value of the wipVarianceAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setWipVarianceAcct(RecordRef value) {
        this.wipVarianceAcct = value;
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
     * Gets the value of the scrapAcct property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getScrapAcct() {
        return scrapAcct;
    }

    /**
     * Sets the value of the scrapAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setScrapAcct(RecordRef value) {
        this.scrapAcct = value;
    }

    /**
     * Gets the value of the shippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShippingCost() {
        return shippingCost;
    }

    /**
     * Sets the value of the shippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShippingCost(Double value) {
        this.shippingCost = value;
    }

    /**
     * Gets the value of the wipAcct property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getWipAcct() {
        return wipAcct;
    }

    /**
     * Sets the value of the wipAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setWipAcct(RecordRef value) {
        this.wipAcct = value;
    }

    /**
     * Gets the value of the shippingCostUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCostUnits() {
        return shippingCostUnits;
    }

    /**
     * Sets the value of the shippingCostUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCostUnits(String value) {
        this.shippingCostUnits = value;
    }

    /**
     * Gets the value of the handlingCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHandlingCost() {
        return handlingCost;
    }

    /**
     * Sets the value of the handlingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHandlingCost(Double value) {
        this.handlingCost = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

    /**
     * Gets the value of the handlingCostUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingCostUnits() {
        return handlingCostUnits;
    }

    /**
     * Sets the value of the handlingCostUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingCostUnits(String value) {
        this.handlingCostUnits = value;
    }

    /**
     * Gets the value of the weightUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ItemWeightUnit }
     *     
     */
    public ItemWeightUnit getWeightUnit() {
        return weightUnit;
    }

    /**
     * Sets the value of the weightUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemWeightUnit }
     *     
     */
    public void setWeightUnit(ItemWeightUnit value) {
        this.weightUnit = value;
    }

    /**
     * Gets the value of the weightUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightUnits() {
        return weightUnits;
    }

    /**
     * Sets the value of the weightUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightUnits(String value) {
        this.weightUnits = value;
    }

    /**
     * Gets the value of the costingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ItemCostingMethod }
     *     
     */
    public ItemCostingMethod getCostingMethod() {
        return costingMethod;
    }

    /**
     * Sets the value of the costingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemCostingMethod }
     *     
     */
    public void setCostingMethod(ItemCostingMethod value) {
        this.costingMethod = value;
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
     * Gets the value of the costingMethodDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostingMethodDisplay() {
        return costingMethodDisplay;
    }

    /**
     * Sets the value of the costingMethodDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostingMethodDisplay(String value) {
        this.costingMethodDisplay = value;
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
     * Gets the value of the stockUnit property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getStockUnit() {
        return stockUnit;
    }

    /**
     * Sets the value of the stockUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setStockUnit(RecordRef value) {
        this.stockUnit = value;
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
     * Gets the value of the trackLandedCost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrackLandedCost() {
        return trackLandedCost;
    }

    /**
     * Sets the value of the trackLandedCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrackLandedCost(Boolean value) {
        this.trackLandedCost = value;
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
     * Gets the value of the stockDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockDescription() {
        return stockDescription;
    }

    /**
     * Sets the value of the stockDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockDescription(String value) {
        this.stockDescription = value;
    }

    /**
     * Gets the value of the producer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProducer() {
        return producer;
    }

    /**
     * Sets the value of the producer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProducer(Boolean value) {
        this.producer = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the mpn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpn() {
        return mpn;
    }

    /**
     * Sets the value of the mpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpn(String value) {
        this.mpn = value;
    }

    /**
     * Gets the value of the multManufactureAddr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultManufactureAddr() {
        return multManufactureAddr;
    }

    /**
     * Sets the value of the multManufactureAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultManufactureAddr(Boolean value) {
        this.multManufactureAddr = value;
    }

    /**
     * Gets the value of the manufactureraddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufactureraddr1() {
        return manufactureraddr1;
    }

    /**
     * Sets the value of the manufactureraddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufactureraddr1(String value) {
        this.manufactureraddr1 = value;
    }

    /**
     * Gets the value of the manufacturerCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerCity() {
        return manufacturerCity;
    }

    /**
     * Sets the value of the manufacturerCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerCity(String value) {
        this.manufacturerCity = value;
    }

    /**
     * Gets the value of the manufacturerState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerState() {
        return manufacturerState;
    }

    /**
     * Sets the value of the manufacturerState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerState(String value) {
        this.manufacturerState = value;
    }

    /**
     * Gets the value of the manufacturerZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerZip() {
        return manufacturerZip;
    }

    /**
     * Sets the value of the manufacturerZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerZip(String value) {
        this.manufacturerZip = value;
    }

    /**
     * Gets the value of the countryOfManufacture property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountryOfManufacture() {
        return countryOfManufacture;
    }

    /**
     * Sets the value of the countryOfManufacture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountryOfManufacture(Country value) {
        this.countryOfManufacture = value;
    }

    /**
     * Gets the value of the effectiveBomControl property.
     * 
     * @return
     *     possible object is
     *     {@link AssemblyItemEffectiveBomControl }
     *     
     */
    public AssemblyItemEffectiveBomControl getEffectiveBomControl() {
        return effectiveBomControl;
    }

    /**
     * Sets the value of the effectiveBomControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyItemEffectiveBomControl }
     *     
     */
    public void setEffectiveBomControl(AssemblyItemEffectiveBomControl value) {
        this.effectiveBomControl = value;
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
     * Gets the value of the defaultRevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultRevision() {
        return defaultRevision;
    }

    /**
     * Sets the value of the defaultRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultRevision(String value) {
        this.defaultRevision = value;
    }

    /**
     * Gets the value of the defaultItemShipMethod property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDefaultItemShipMethod() {
        return defaultItemShipMethod;
    }

    /**
     * Sets the value of the defaultItemShipMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDefaultItemShipMethod(RecordRef value) {
        this.defaultItemShipMethod = value;
    }

    /**
     * Gets the value of the itemCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingCarrier }
     *     
     */
    public ShippingCarrier getItemCarrier() {
        return itemCarrier;
    }

    /**
     * Sets the value of the itemCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingCarrier }
     *     
     */
    public void setItemCarrier(ShippingCarrier value) {
        this.itemCarrier = value;
    }

    /**
     * Gets the value of the roundUpAsComponent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoundUpAsComponent() {
        return roundUpAsComponent;
    }

    /**
     * Sets the value of the roundUpAsComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoundUpAsComponent(Boolean value) {
        this.roundUpAsComponent = value;
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
     * Gets the value of the isDropShipItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDropShipItem() {
        return isDropShipItem;
    }

    /**
     * Sets the value of the isDropShipItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDropShipItem(Boolean value) {
        this.isDropShipItem = value;
    }

    /**
     * Gets the value of the isPhantom property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPhantom() {
        return isPhantom;
    }

    /**
     * Sets the value of the isPhantom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPhantom(Boolean value) {
        this.isPhantom = value;
    }

    /**
     * Gets the value of the itemShipMethodList property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRefList }
     *     
     */
    public RecordRefList getItemShipMethodList() {
        return itemShipMethodList;
    }

    /**
     * Sets the value of the itemShipMethodList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRefList }
     *     
     */
    public void setItemShipMethodList(RecordRefList value) {
        this.itemShipMethodList = value;
    }

    /**
     * Gets the value of the manufacturerTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerTaxId() {
        return manufacturerTaxId;
    }

    /**
     * Sets the value of the manufacturerTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerTaxId(String value) {
        this.manufacturerTaxId = value;
    }

    /**
     * Gets the value of the scheduleBNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleBNumber() {
        return scheduleBNumber;
    }

    /**
     * Sets the value of the scheduleBNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleBNumber(String value) {
        this.scheduleBNumber = value;
    }

    /**
     * Gets the value of the scheduleBQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getScheduleBQuantity() {
        return scheduleBQuantity;
    }

    /**
     * Sets the value of the scheduleBQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setScheduleBQuantity(Long value) {
        this.scheduleBQuantity = value;
    }

    /**
     * Gets the value of the scheduleBCode property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getScheduleBCode() {
        return scheduleBCode;
    }

    /**
     * Sets the value of the scheduleBCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setScheduleBCode(RecordRef value) {
        this.scheduleBCode = value;
    }

    /**
     * Gets the value of the manufacturerTariff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerTariff() {
        return manufacturerTariff;
    }

    /**
     * Sets the value of the manufacturerTariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerTariff(String value) {
        this.manufacturerTariff = value;
    }

    /**
     * Gets the value of the preferenceCriterion property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPreferenceCriterion }
     *     
     */
    public ItemPreferenceCriterion getPreferenceCriterion() {
        return preferenceCriterion;
    }

    /**
     * Sets the value of the preferenceCriterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPreferenceCriterion }
     *     
     */
    public void setPreferenceCriterion(ItemPreferenceCriterion value) {
        this.preferenceCriterion = value;
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
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSoftDescriptor() {
        return softDescriptor;
    }

    /**
     * Sets the value of the softDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSoftDescriptor(RecordRef value) {
        this.softDescriptor = value;
    }

    /**
     * Gets the value of the isSpecialWorkOrderItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSpecialWorkOrderItem() {
        return isSpecialWorkOrderItem;
    }

    /**
     * Sets the value of the isSpecialWorkOrderItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSpecialWorkOrderItem(Boolean value) {
        this.isSpecialWorkOrderItem = value;
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
     * Gets the value of the buildEntireAssembly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuildEntireAssembly() {
        return buildEntireAssembly;
    }

    /**
     * Sets the value of the buildEntireAssembly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuildEntireAssembly(Boolean value) {
        this.buildEntireAssembly = value;
    }

    /**
     * Gets the value of the quantityOnHand property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityOnHand() {
        return quantityOnHand;
    }

    /**
     * Sets the value of the quantityOnHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityOnHand(Double value) {
        this.quantityOnHand = value;
    }

    /**
     * Gets the value of the quantityOnHandUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityOnHandUnits() {
        return quantityOnHandUnits;
    }

    /**
     * Sets the value of the quantityOnHandUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityOnHandUnits(String value) {
        this.quantityOnHandUnits = value;
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
     * Gets the value of the reorderMultiple property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReorderMultiple() {
        return reorderMultiple;
    }

    /**
     * Sets the value of the reorderMultiple property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReorderMultiple(Long value) {
        this.reorderMultiple = value;
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
     * Gets the value of the isHazmatItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHazmatItem() {
        return isHazmatItem;
    }

    /**
     * Sets the value of the isHazmatItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHazmatItem(Boolean value) {
        this.isHazmatItem = value;
    }

    /**
     * Gets the value of the hazmatId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazmatId() {
        return hazmatId;
    }

    /**
     * Sets the value of the hazmatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazmatId(String value) {
        this.hazmatId = value;
    }

    /**
     * Gets the value of the hazmatShippingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazmatShippingName() {
        return hazmatShippingName;
    }

    /**
     * Sets the value of the hazmatShippingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazmatShippingName(String value) {
        this.hazmatShippingName = value;
    }

    /**
     * Gets the value of the hazmatHazardClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazmatHazardClass() {
        return hazmatHazardClass;
    }

    /**
     * Sets the value of the hazmatHazardClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazmatHazardClass(String value) {
        this.hazmatHazardClass = value;
    }

    /**
     * Gets the value of the hazmatPackingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link HazmatPackingGroup }
     *     
     */
    public HazmatPackingGroup getHazmatPackingGroup() {
        return hazmatPackingGroup;
    }

    /**
     * Sets the value of the hazmatPackingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazmatPackingGroup }
     *     
     */
    public void setHazmatPackingGroup(HazmatPackingGroup value) {
        this.hazmatPackingGroup = value;
    }

    /**
     * Gets the value of the hazmatItemUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazmatItemUnits() {
        return hazmatItemUnits;
    }

    /**
     * Sets the value of the hazmatItemUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazmatItemUnits(String value) {
        this.hazmatItemUnits = value;
    }

    /**
     * Gets the value of the hazmatItemUnitsQty property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHazmatItemUnitsQty() {
        return hazmatItemUnitsQty;
    }

    /**
     * Sets the value of the hazmatItemUnitsQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHazmatItemUnitsQty(Double value) {
        this.hazmatItemUnitsQty = value;
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
     * Gets the value of the transferPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTransferPrice() {
        return transferPrice;
    }

    /**
     * Sets the value of the transferPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTransferPrice(Double value) {
        this.transferPrice = value;
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
     * Gets the value of the intercoCogsAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIntercoCogsAccount() {
        return intercoCogsAccount;
    }

    /**
     * Sets the value of the intercoCogsAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIntercoCogsAccount(RecordRef value) {
        this.intercoCogsAccount = value;
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
     * Gets the value of the unbuildVarianceAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getUnbuildVarianceAccount() {
        return unbuildVarianceAccount;
    }

    /**
     * Sets the value of the unbuildVarianceAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setUnbuildVarianceAccount(RecordRef value) {
        this.unbuildVarianceAccount = value;
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
     * Gets the value of the dropshipExpenseAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDropshipExpenseAccount() {
        return dropshipExpenseAccount;
    }

    /**
     * Sets the value of the dropshipExpenseAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDropshipExpenseAccount(RecordRef value) {
        this.dropshipExpenseAccount = value;
    }

    /**
     * Gets the value of the preferredLocation property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPreferredLocation() {
        return preferredLocation;
    }

    /**
     * Sets the value of the preferredLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPreferredLocation(RecordRef value) {
        this.preferredLocation = value;
    }

    /**
     * Gets the value of the isStorePickupAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStorePickupAllowed() {
        return isStorePickupAllowed;
    }

    /**
     * Sets the value of the isStorePickupAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStorePickupAllowed(Boolean value) {
        this.isStorePickupAllowed = value;
    }

    /**
     * Gets the value of the totalValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalValue() {
        return totalValue;
    }

    /**
     * Sets the value of the totalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalValue(Double value) {
        this.totalValue = value;
    }

    /**
     * Gets the value of the useBins property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseBins() {
        return useBins;
    }

    /**
     * Sets the value of the useBins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseBins(Boolean value) {
        this.useBins = value;
    }

    /**
     * Gets the value of the averageCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageCost() {
        return averageCost;
    }

    /**
     * Sets the value of the averageCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageCost(Double value) {
        this.averageCost = value;
    }

    /**
     * Gets the value of the lastPurchasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLastPurchasePrice() {
        return lastPurchasePrice;
    }

    /**
     * Sets the value of the lastPurchasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLastPurchasePrice(Double value) {
        this.lastPurchasePrice = value;
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
     * Gets the value of the leadTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLeadTime() {
        return leadTime;
    }

    /**
     * Sets the value of the leadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLeadTime(Long value) {
        this.leadTime = value;
    }

    /**
     * Gets the value of the autoLeadTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoLeadTime() {
        return autoLeadTime;
    }

    /**
     * Sets the value of the autoLeadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoLeadTime(Boolean value) {
        this.autoLeadTime = value;
    }

    /**
     * Gets the value of the buildTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuildTime() {
        return buildTime;
    }

    /**
     * Sets the value of the buildTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuildTime(Double value) {
        this.buildTime = value;
    }

    /**
     * Gets the value of the buildTimeLotSize property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuildTimeLotSize() {
        return buildTimeLotSize;
    }

    /**
     * Sets the value of the buildTimeLotSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuildTimeLotSize(Double value) {
        this.buildTimeLotSize = value;
    }

    /**
     * Gets the value of the fixedBuildTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFixedBuildTime() {
        return fixedBuildTime;
    }

    /**
     * Sets the value of the fixedBuildTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFixedBuildTime(Double value) {
        this.fixedBuildTime = value;
    }

    /**
     * Gets the value of the planningItemCategory property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPlanningItemCategory() {
        return planningItemCategory;
    }

    /**
     * Sets the value of the planningItemCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPlanningItemCategory(RecordRef value) {
        this.planningItemCategory = value;
    }

    /**
     * Gets the value of the safetyStockLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSafetyStockLevel() {
        return safetyStockLevel;
    }

    /**
     * Sets the value of the safetyStockLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSafetyStockLevel(Double value) {
        this.safetyStockLevel = value;
    }

    /**
     * Gets the value of the safetyStockLevelUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafetyStockLevelUnits() {
        return safetyStockLevelUnits;
    }

    /**
     * Sets the value of the safetyStockLevelUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafetyStockLevelUnits(String value) {
        this.safetyStockLevelUnits = value;
    }

    /**
     * Gets the value of the safetyStockLevelDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSafetyStockLevelDays() {
        return safetyStockLevelDays;
    }

    /**
     * Sets the value of the safetyStockLevelDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSafetyStockLevelDays(Long value) {
        this.safetyStockLevelDays = value;
    }

    /**
     * Gets the value of the seasonalDemand property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeasonalDemand() {
        return seasonalDemand;
    }

    /**
     * Sets the value of the seasonalDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeasonalDemand(Boolean value) {
        this.seasonalDemand = value;
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
     * Gets the value of the reorderPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReorderPoint() {
        return reorderPoint;
    }

    /**
     * Sets the value of the reorderPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReorderPoint(Double value) {
        this.reorderPoint = value;
    }

    /**
     * Gets the value of the reorderPointUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReorderPointUnits() {
        return reorderPointUnits;
    }

    /**
     * Sets the value of the reorderPointUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReorderPointUnits(String value) {
        this.reorderPointUnits = value;
    }

    /**
     * Gets the value of the preferredStockLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPreferredStockLevel() {
        return preferredStockLevel;
    }

    /**
     * Sets the value of the preferredStockLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPreferredStockLevel(Double value) {
        this.preferredStockLevel = value;
    }

    /**
     * Gets the value of the preferredStockLevelUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredStockLevelUnits() {
        return preferredStockLevelUnits;
    }

    /**
     * Sets the value of the preferredStockLevelUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredStockLevelUnits(String value) {
        this.preferredStockLevelUnits = value;
    }

    /**
     * Gets the value of the demandModifier property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDemandModifier() {
        return demandModifier;
    }

    /**
     * Sets the value of the demandModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDemandModifier(Double value) {
        this.demandModifier = value;
    }

    /**
     * Gets the value of the autoReorderPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoReorderPoint() {
        return autoReorderPoint;
    }

    /**
     * Sets the value of the autoReorderPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoReorderPoint(Boolean value) {
        this.autoReorderPoint = value;
    }

    /**
     * Gets the value of the autoPreferredStockLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoPreferredStockLevel() {
        return autoPreferredStockLevel;
    }

    /**
     * Sets the value of the autoPreferredStockLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoPreferredStockLevel(Boolean value) {
        this.autoPreferredStockLevel = value;
    }

    /**
     * Gets the value of the preferredStockLevelDays property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPreferredStockLevelDays() {
        return preferredStockLevelDays;
    }

    /**
     * Sets the value of the preferredStockLevelDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPreferredStockLevelDays(Double value) {
        this.preferredStockLevelDays = value;
    }

    /**
     * Gets the value of the defaultReturnCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDefaultReturnCost() {
        return defaultReturnCost;
    }

    /**
     * Sets the value of the defaultReturnCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDefaultReturnCost(Double value) {
        this.defaultReturnCost = value;
    }

    /**
     * Gets the value of the supplyReplenishmentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSupplyReplenishmentMethod() {
        return supplyReplenishmentMethod;
    }

    /**
     * Sets the value of the supplyReplenishmentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSupplyReplenishmentMethod(RecordRef value) {
        this.supplyReplenishmentMethod = value;
    }

    /**
     * Gets the value of the alternateDemandSourceItem property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAlternateDemandSourceItem() {
        return alternateDemandSourceItem;
    }

    /**
     * Sets the value of the alternateDemandSourceItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAlternateDemandSourceItem(RecordRef value) {
        this.alternateDemandSourceItem = value;
    }

    /**
     * Gets the value of the fixedLotSize property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFixedLotSize() {
        return fixedLotSize;
    }

    /**
     * Sets the value of the fixedLotSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFixedLotSize(Double value) {
        this.fixedLotSize = value;
    }

    /**
     * Gets the value of the supplyType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSupplyType() {
        return supplyType;
    }

    /**
     * Sets the value of the supplyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSupplyType(RecordRef value) {
        this.supplyType = value;
    }

    /**
     * Gets the value of the demandTimeFence property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDemandTimeFence() {
        return demandTimeFence;
    }

    /**
     * Sets the value of the demandTimeFence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDemandTimeFence(Long value) {
        this.demandTimeFence = value;
    }

    /**
     * Gets the value of the supplyTimeFence property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSupplyTimeFence() {
        return supplyTimeFence;
    }

    /**
     * Sets the value of the supplyTimeFence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSupplyTimeFence(Long value) {
        this.supplyTimeFence = value;
    }

    /**
     * Gets the value of the rescheduleInDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRescheduleInDays() {
        return rescheduleInDays;
    }

    /**
     * Sets the value of the rescheduleInDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRescheduleInDays(Long value) {
        this.rescheduleInDays = value;
    }

    /**
     * Gets the value of the rescheduleOutDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRescheduleOutDays() {
        return rescheduleOutDays;
    }

    /**
     * Sets the value of the rescheduleOutDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRescheduleOutDays(Long value) {
        this.rescheduleOutDays = value;
    }

    /**
     * Gets the value of the supplyLotSizingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSupplyLotSizingMethod() {
        return supplyLotSizingMethod;
    }

    /**
     * Sets the value of the supplyLotSizingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSupplyLotSizingMethod(RecordRef value) {
        this.supplyLotSizingMethod = value;
    }

    /**
     * Gets the value of the demandSource property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDemandSource() {
        return demandSource;
    }

    /**
     * Sets the value of the demandSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDemandSource(RecordRef value) {
        this.demandSource = value;
    }

    /**
     * Gets the value of the shipIndividually property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipIndividually() {
        return shipIndividually;
    }

    /**
     * Sets the value of the shipIndividually property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipIndividually(Boolean value) {
        this.shipIndividually = value;
    }

    /**
     * Gets the value of the quantityCommitted property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityCommitted() {
        return quantityCommitted;
    }

    /**
     * Sets the value of the quantityCommitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityCommitted(Double value) {
        this.quantityCommitted = value;
    }

    /**
     * Gets the value of the quantityAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityAvailable() {
        return quantityAvailable;
    }

    /**
     * Sets the value of the quantityAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityAvailable(Double value) {
        this.quantityAvailable = value;
    }

    /**
     * Gets the value of the quantityBackOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityBackOrdered() {
        return quantityBackOrdered;
    }

    /**
     * Sets the value of the quantityBackOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityBackOrdered(Double value) {
        this.quantityBackOrdered = value;
    }

    /**
     * Gets the value of the quantityOnOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityOnOrder() {
        return quantityOnOrder;
    }

    /**
     * Sets the value of the quantityOnOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityOnOrder(Double value) {
        this.quantityOnOrder = value;
    }

    /**
     * Gets the value of the shipPackage property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShipPackage() {
        return shipPackage;
    }

    /**
     * Sets the value of the shipPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShipPackage(RecordRef value) {
        this.shipPackage = value;
    }

    /**
     * Gets the value of the storeDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreDisplayName() {
        return storeDisplayName;
    }

    /**
     * Sets the value of the storeDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreDisplayName(String value) {
        this.storeDisplayName = value;
    }

    /**
     * Gets the value of the storeDisplayThumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getStoreDisplayThumbnail() {
        return storeDisplayThumbnail;
    }

    /**
     * Sets the value of the storeDisplayThumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setStoreDisplayThumbnail(RecordRef value) {
        this.storeDisplayThumbnail = value;
    }

    /**
     * Gets the value of the storeDisplayImage property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getStoreDisplayImage() {
        return storeDisplayImage;
    }

    /**
     * Sets the value of the storeDisplayImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setStoreDisplayImage(RecordRef value) {
        this.storeDisplayImage = value;
    }

    /**
     * Gets the value of the storeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreDescription() {
        return storeDescription;
    }

    /**
     * Sets the value of the storeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreDescription(String value) {
        this.storeDescription = value;
    }

    /**
     * Gets the value of the storeDetailedDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreDetailedDescription() {
        return storeDetailedDescription;
    }

    /**
     * Sets the value of the storeDetailedDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreDetailedDescription(String value) {
        this.storeDetailedDescription = value;
    }

    /**
     * Gets the value of the storeItemTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getStoreItemTemplate() {
        return storeItemTemplate;
    }

    /**
     * Sets the value of the storeItemTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setStoreItemTemplate(RecordRef value) {
        this.storeItemTemplate = value;
    }

    /**
     * Gets the value of the pageTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageTitle() {
        return pageTitle;
    }

    /**
     * Sets the value of the pageTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageTitle(String value) {
        this.pageTitle = value;
    }

    /**
     * Gets the value of the metaTagHtml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaTagHtml() {
        return metaTagHtml;
    }

    /**
     * Sets the value of the metaTagHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaTagHtml(String value) {
        this.metaTagHtml = value;
    }

    /**
     * Gets the value of the excludeFromSitemap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeFromSitemap() {
        return excludeFromSitemap;
    }

    /**
     * Sets the value of the excludeFromSitemap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeFromSitemap(Boolean value) {
        this.excludeFromSitemap = value;
    }

    /**
     * Gets the value of the sitemapPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitemapPriority() {
        return sitemapPriority;
    }

    /**
     * Sets the value of the sitemapPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitemapPriority(String value) {
        this.sitemapPriority = value;
    }

    /**
     * Gets the value of the urlComponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlComponent() {
        return urlComponent;
    }

    /**
     * Sets the value of the urlComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlComponent(String value) {
        this.urlComponent = value;
    }

    /**
     * Gets the value of the searchKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchKeywords() {
        return searchKeywords;
    }

    /**
     * Sets the value of the searchKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchKeywords(String value) {
        this.searchKeywords = value;
    }

    /**
     * Gets the value of the isDonationItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDonationItem() {
        return isDonationItem;
    }

    /**
     * Sets the value of the isDonationItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDonationItem(Boolean value) {
        this.isDonationItem = value;
    }

    /**
     * Gets the value of the showDefaultDonationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowDefaultDonationAmount() {
        return showDefaultDonationAmount;
    }

    /**
     * Sets the value of the showDefaultDonationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowDefaultDonationAmount(Boolean value) {
        this.showDefaultDonationAmount = value;
    }

    /**
     * Gets the value of the maxDonationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxDonationAmount() {
        return maxDonationAmount;
    }

    /**
     * Sets the value of the maxDonationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxDonationAmount(Double value) {
        this.maxDonationAmount = value;
    }

    /**
     * Gets the value of the dontShowPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDontShowPrice() {
        return dontShowPrice;
    }

    /**
     * Sets the value of the dontShowPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDontShowPrice(Boolean value) {
        this.dontShowPrice = value;
    }

    /**
     * Gets the value of the noPriceMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoPriceMessage() {
        return noPriceMessage;
    }

    /**
     * Sets the value of the noPriceMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoPriceMessage(String value) {
        this.noPriceMessage = value;
    }

    /**
     * Gets the value of the shoppingDotComCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShoppingDotComCategory() {
        return shoppingDotComCategory;
    }

    /**
     * Sets the value of the shoppingDotComCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShoppingDotComCategory(String value) {
        this.shoppingDotComCategory = value;
    }

    /**
     * Gets the value of the shopzillaCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShopzillaCategoryId() {
        return shopzillaCategoryId;
    }

    /**
     * Sets the value of the shopzillaCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShopzillaCategoryId(Long value) {
        this.shopzillaCategoryId = value;
    }

    /**
     * Gets the value of the outOfStockMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfStockMessage() {
        return outOfStockMessage;
    }

    /**
     * Sets the value of the outOfStockMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfStockMessage(String value) {
        this.outOfStockMessage = value;
    }

    /**
     * Gets the value of the nexTagCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNexTagCategory() {
        return nexTagCategory;
    }

    /**
     * Sets the value of the nexTagCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNexTagCategory(String value) {
        this.nexTagCategory = value;
    }

    /**
     * Gets the value of the outOfStockBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link ItemOutOfStockBehavior }
     *     
     */
    public ItemOutOfStockBehavior getOutOfStockBehavior() {
        return outOfStockBehavior;
    }

    /**
     * Sets the value of the outOfStockBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemOutOfStockBehavior }
     *     
     */
    public void setOutOfStockBehavior(ItemOutOfStockBehavior value) {
        this.outOfStockBehavior = value;
    }

    /**
     * Gets the value of the productFeedList property.
     * 
     * @return
     *     possible object is
     *     {@link ProductFeedList }
     *     
     */
    public ProductFeedList getProductFeedList() {
        return productFeedList;
    }

    /**
     * Sets the value of the productFeedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductFeedList }
     *     
     */
    public void setProductFeedList(ProductFeedList value) {
        this.productFeedList = value;
    }

    /**
     * Gets the value of the relatedItemsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedItemsDescription() {
        return relatedItemsDescription;
    }

    /**
     * Sets the value of the relatedItemsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedItemsDescription(String value) {
        this.relatedItemsDescription = value;
    }

    /**
     * Gets the value of the onSpecial property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnSpecial() {
        return onSpecial;
    }

    /**
     * Sets the value of the onSpecial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnSpecial(Boolean value) {
        this.onSpecial = value;
    }

    /**
     * Gets the value of the specialsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialsDescription() {
        return specialsDescription;
    }

    /**
     * Sets the value of the specialsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialsDescription(String value) {
        this.specialsDescription = value;
    }

    /**
     * Gets the value of the featuredDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeaturedDescription() {
        return featuredDescription;
    }

    /**
     * Sets the value of the featuredDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeaturedDescription(String value) {
        this.featuredDescription = value;
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
     * Gets the value of the itemNumberOptionsList property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRefList }
     *     
     */
    public RecordRefList getItemNumberOptionsList() {
        return itemNumberOptionsList;
    }

    /**
     * Sets the value of the itemNumberOptionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRefList }
     *     
     */
    public void setItemNumberOptionsList(RecordRefList value) {
        this.itemNumberOptionsList = value;
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
     * Gets the value of the billOfMaterialsList property.
     * 
     * @return
     *     possible object is
     *     {@link SerializedAssemblyItemBillOfMaterialsList }
     *     
     */
    public SerializedAssemblyItemBillOfMaterialsList getBillOfMaterialsList() {
        return billOfMaterialsList;
    }

    /**
     * Sets the value of the billOfMaterialsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerializedAssemblyItemBillOfMaterialsList }
     *     
     */
    public void setBillOfMaterialsList(SerializedAssemblyItemBillOfMaterialsList value) {
        this.billOfMaterialsList = value;
    }

    /**
     * Gets the value of the memberList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemMemberList }
     *     
     */
    public ItemMemberList getMemberList() {
        return memberList;
    }

    /**
     * Sets the value of the memberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemMemberList }
     *     
     */
    public void setMemberList(ItemMemberList value) {
        this.memberList = value;
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
     * Gets the value of the locationsList property.
     * 
     * @return
     *     possible object is
     *     {@link SerializedInventoryItemLocationsList }
     *     
     */
    public SerializedInventoryItemLocationsList getLocationsList() {
        return locationsList;
    }

    /**
     * Sets the value of the locationsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerializedInventoryItemLocationsList }
     *     
     */
    public void setLocationsList(SerializedInventoryItemLocationsList value) {
        this.locationsList = value;
    }

    /**
     * Gets the value of the siteCategoryList property.
     * 
     * @return
     *     possible object is
     *     {@link SiteCategoryList }
     *     
     */
    public SiteCategoryList getSiteCategoryList() {
        return siteCategoryList;
    }

    /**
     * Sets the value of the siteCategoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCategoryList }
     *     
     */
    public void setSiteCategoryList(SiteCategoryList value) {
        this.siteCategoryList = value;
    }

    /**
     * Gets the value of the binNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryItemBinNumberList }
     *     
     */
    public InventoryItemBinNumberList getBinNumberList() {
        return binNumberList;
    }

    /**
     * Sets the value of the binNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryItemBinNumberList }
     *     
     */
    public void setBinNumberList(InventoryItemBinNumberList value) {
        this.binNumberList = value;
    }

    /**
     * Gets the value of the numbersList property.
     * 
     * @return
     *     possible object is
     *     {@link SerializedInventoryItemNumbersList }
     *     
     */
    public SerializedInventoryItemNumbersList getNumbersList() {
        return numbersList;
    }

    /**
     * Sets the value of the numbersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerializedInventoryItemNumbersList }
     *     
     */
    public void setNumbersList(SerializedInventoryItemNumbersList value) {
        this.numbersList = value;
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
     * Gets the value of the presentationItemList property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationItemList }
     *     
     */
    public PresentationItemList getPresentationItemList() {
        return presentationItemList;
    }

    /**
     * Sets the value of the presentationItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationItemList }
     *     
     */
    public void setPresentationItemList(PresentationItemList value) {
        this.presentationItemList = value;
    }

    /**
     * Gets the value of the hierarchyVersionsList property.
     * 
     * @return
     *     possible object is
     *     {@link SerializedAssemblyItemHierarchyVersionsList }
     *     
     */
    public SerializedAssemblyItemHierarchyVersionsList getHierarchyVersionsList() {
        return hierarchyVersionsList;
    }

    /**
     * Sets the value of the hierarchyVersionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerializedAssemblyItemHierarchyVersionsList }
     *     
     */
    public void setHierarchyVersionsList(SerializedAssemblyItemHierarchyVersionsList value) {
        this.hierarchyVersionsList = value;
    }

    /**
     * Gets the value of the futureHorizon property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFutureHorizon() {
        return futureHorizon;
    }

    /**
     * Sets the value of the futureHorizon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFutureHorizon(Long value) {
        this.futureHorizon = value;
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
