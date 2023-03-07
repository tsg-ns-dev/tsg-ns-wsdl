
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionLinkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TransactionLinkType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_advancedCostAmortization"/&gt;
 *     &lt;enumeration value="_advancedExpenseAmortization"/&gt;
 *     &lt;enumeration value="_authorizationDeposit"/&gt;
 *     &lt;enumeration value="_billReceipt"/&gt;
 *     &lt;enumeration value="_blcgaJeFullfillment"/&gt;
 *     &lt;enumeration value="_captureAuthorization"/&gt;
 *     &lt;enumeration value="_closedPeriodFxVariance"/&gt;
 *     &lt;enumeration value="_closeWorkOrder"/&gt;
 *     &lt;enumeration value="_cogsLink"/&gt;
 *     &lt;enumeration value="_collectTegata"/&gt;
 *     &lt;enumeration value="_commission"/&gt;
 *     &lt;enumeration value="_contractCostDeferral"/&gt;
 *     &lt;enumeration value="_contractCostDeferralReversal"/&gt;
 *     &lt;enumeration value="_deferredRevenueReallocation"/&gt;
 *     &lt;enumeration value="_depositApplication"/&gt;
 *     &lt;enumeration value="_depositRefundCheck"/&gt;
 *     &lt;enumeration value="_discountTegata"/&gt;
 *     &lt;enumeration value="_dropShipment"/&gt;
 *     &lt;enumeration value="_endorseTegata"/&gt;
 *     &lt;enumeration value="_estimateInvoicing"/&gt;
 *     &lt;enumeration value="_foreignCurrencyGainLossOnContractAsset"/&gt;
 *     &lt;enumeration value="_fulfillmentRequestFulfillment"/&gt;
 *     &lt;enumeration value="_glImpactAdjustment"/&gt;
 *     &lt;enumeration value="_intercompanyAdjustment"/&gt;
 *     &lt;enumeration value="_inTransitPayment"/&gt;
 *     &lt;enumeration value="_inventoryCountAdjustment"/&gt;
 *     &lt;enumeration value="_kitShipment"/&gt;
 *     &lt;enumeration value="_landedCost"/&gt;
 *     &lt;enumeration value="_linkedReturnCost"/&gt;
 *     &lt;enumeration value="_netContractAssetOrLiabilityPerElement"/&gt;
 *     &lt;enumeration value="_opportunityClose"/&gt;
 *     &lt;enumeration value="_opportunityEstimate"/&gt;
 *     &lt;enumeration value="_orderBillInvoice"/&gt;
 *     &lt;enumeration value="_orderFulfillmentRequest"/&gt;
 *     &lt;enumeration value="_orderPickingPacking"/&gt;
 *     &lt;enumeration value="_outsourcedManufacturing"/&gt;
 *     &lt;enumeration value="_ownershipTransferItemReceipt"/&gt;
 *     &lt;enumeration value="_payment"/&gt;
 *     &lt;enumeration value="_paymentRefund"/&gt;
 *     &lt;enumeration value="_payTegata"/&gt;
 *     &lt;enumeration value="_poToOwnershipTransfer"/&gt;
 *     &lt;enumeration value="_prepaymentApplication"/&gt;
 *     &lt;enumeration value="_purchaseContractOrder"/&gt;
 *     &lt;enumeration value="_purchaseOrderPrepayment"/&gt;
 *     &lt;enumeration value="_purchaseOrderRequisition"/&gt;
 *     &lt;enumeration value="_purchaseOrderToBlanket"/&gt;
 *     &lt;enumeration value="_purchaseReturn"/&gt;
 *     &lt;enumeration value="_receiptBill"/&gt;
 *     &lt;enumeration value="_receiptFulfillment"/&gt;
 *     &lt;enumeration value="_reimbursement"/&gt;
 *     &lt;enumeration value="_reservationShipment"/&gt;
 *     &lt;enumeration value="_revalueWorkOrder"/&gt;
 *     &lt;enumeration value="_revenueAmortizatonRecognition"/&gt;
 *     &lt;enumeration value="_revenueArrangement"/&gt;
 *     &lt;enumeration value="_revenueCommitted"/&gt;
 *     &lt;enumeration value="_rfqToVendorRfq"/&gt;
 *     &lt;enumeration value="_saleReturn"/&gt;
 *     &lt;enumeration value="_salesOrderAuthorization"/&gt;
 *     &lt;enumeration value="_salesOrderDegross"/&gt;
 *     &lt;enumeration value="_salesOrderDeposit"/&gt;
 *     &lt;enumeration value="_salesOrderRevenueRevaluation"/&gt;
 *     &lt;enumeration value="_sourceOfRevenueContract"/&gt;
 *     &lt;enumeration value="_specialOrder"/&gt;
 *     &lt;enumeration value="_systemJournal"/&gt;
 *     &lt;enumeration value="_transferOrderFulfillmentReceipt"/&gt;
 *     &lt;enumeration value="_transformation"/&gt;
 *     &lt;enumeration value="_vendorBillVariance"/&gt;
 *     &lt;enumeration value="_vendorRfqToPurchaseContract"/&gt;
 *     &lt;enumeration value="_waveOrder"/&gt;
 *     &lt;enumeration value="_waveShipment"/&gt;
 *     &lt;enumeration value="_wipBuild"/&gt;
 *     &lt;enumeration value="_workOrderBuild"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionLinkType", namespace = "urn:types.sales_2022_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionLinkType {

    @XmlEnumValue("_advancedCostAmortization")
    ADVANCED_COST_AMORTIZATION("_advancedCostAmortization"),
    @XmlEnumValue("_advancedExpenseAmortization")
    ADVANCED_EXPENSE_AMORTIZATION("_advancedExpenseAmortization"),
    @XmlEnumValue("_authorizationDeposit")
    AUTHORIZATION_DEPOSIT("_authorizationDeposit"),
    @XmlEnumValue("_billReceipt")
    BILL_RECEIPT("_billReceipt"),
    @XmlEnumValue("_blcgaJeFullfillment")
    BLCGA_JE_FULLFILLMENT("_blcgaJeFullfillment"),
    @XmlEnumValue("_captureAuthorization")
    CAPTURE_AUTHORIZATION("_captureAuthorization"),
    @XmlEnumValue("_closedPeriodFxVariance")
    CLOSED_PERIOD_FX_VARIANCE("_closedPeriodFxVariance"),
    @XmlEnumValue("_closeWorkOrder")
    CLOSE_WORK_ORDER("_closeWorkOrder"),
    @XmlEnumValue("_cogsLink")
    COGS_LINK("_cogsLink"),
    @XmlEnumValue("_collectTegata")
    COLLECT_TEGATA("_collectTegata"),
    @XmlEnumValue("_commission")
    COMMISSION("_commission"),
    @XmlEnumValue("_contractCostDeferral")
    CONTRACT_COST_DEFERRAL("_contractCostDeferral"),
    @XmlEnumValue("_contractCostDeferralReversal")
    CONTRACT_COST_DEFERRAL_REVERSAL("_contractCostDeferralReversal"),
    @XmlEnumValue("_deferredRevenueReallocation")
    DEFERRED_REVENUE_REALLOCATION("_deferredRevenueReallocation"),
    @XmlEnumValue("_depositApplication")
    DEPOSIT_APPLICATION("_depositApplication"),
    @XmlEnumValue("_depositRefundCheck")
    DEPOSIT_REFUND_CHECK("_depositRefundCheck"),
    @XmlEnumValue("_discountTegata")
    DISCOUNT_TEGATA("_discountTegata"),
    @XmlEnumValue("_dropShipment")
    DROP_SHIPMENT("_dropShipment"),
    @XmlEnumValue("_endorseTegata")
    ENDORSE_TEGATA("_endorseTegata"),
    @XmlEnumValue("_estimateInvoicing")
    ESTIMATE_INVOICING("_estimateInvoicing"),
    @XmlEnumValue("_foreignCurrencyGainLossOnContractAsset")
    FOREIGN_CURRENCY_GAIN_LOSS_ON_CONTRACT_ASSET("_foreignCurrencyGainLossOnContractAsset"),
    @XmlEnumValue("_fulfillmentRequestFulfillment")
    FULFILLMENT_REQUEST_FULFILLMENT("_fulfillmentRequestFulfillment"),
    @XmlEnumValue("_glImpactAdjustment")
    GL_IMPACT_ADJUSTMENT("_glImpactAdjustment"),
    @XmlEnumValue("_intercompanyAdjustment")
    INTERCOMPANY_ADJUSTMENT("_intercompanyAdjustment"),
    @XmlEnumValue("_inTransitPayment")
    IN_TRANSIT_PAYMENT("_inTransitPayment"),
    @XmlEnumValue("_inventoryCountAdjustment")
    INVENTORY_COUNT_ADJUSTMENT("_inventoryCountAdjustment"),
    @XmlEnumValue("_kitShipment")
    KIT_SHIPMENT("_kitShipment"),
    @XmlEnumValue("_landedCost")
    LANDED_COST("_landedCost"),
    @XmlEnumValue("_linkedReturnCost")
    LINKED_RETURN_COST("_linkedReturnCost"),
    @XmlEnumValue("_netContractAssetOrLiabilityPerElement")
    NET_CONTRACT_ASSET_OR_LIABILITY_PER_ELEMENT("_netContractAssetOrLiabilityPerElement"),
    @XmlEnumValue("_opportunityClose")
    OPPORTUNITY_CLOSE("_opportunityClose"),
    @XmlEnumValue("_opportunityEstimate")
    OPPORTUNITY_ESTIMATE("_opportunityEstimate"),
    @XmlEnumValue("_orderBillInvoice")
    ORDER_BILL_INVOICE("_orderBillInvoice"),
    @XmlEnumValue("_orderFulfillmentRequest")
    ORDER_FULFILLMENT_REQUEST("_orderFulfillmentRequest"),
    @XmlEnumValue("_orderPickingPacking")
    ORDER_PICKING_PACKING("_orderPickingPacking"),
    @XmlEnumValue("_outsourcedManufacturing")
    OUTSOURCED_MANUFACTURING("_outsourcedManufacturing"),
    @XmlEnumValue("_ownershipTransferItemReceipt")
    OWNERSHIP_TRANSFER_ITEM_RECEIPT("_ownershipTransferItemReceipt"),
    @XmlEnumValue("_payment")
    PAYMENT("_payment"),
    @XmlEnumValue("_paymentRefund")
    PAYMENT_REFUND("_paymentRefund"),
    @XmlEnumValue("_payTegata")
    PAY_TEGATA("_payTegata"),
    @XmlEnumValue("_poToOwnershipTransfer")
    PO_TO_OWNERSHIP_TRANSFER("_poToOwnershipTransfer"),
    @XmlEnumValue("_prepaymentApplication")
    PREPAYMENT_APPLICATION("_prepaymentApplication"),
    @XmlEnumValue("_purchaseContractOrder")
    PURCHASE_CONTRACT_ORDER("_purchaseContractOrder"),
    @XmlEnumValue("_purchaseOrderPrepayment")
    PURCHASE_ORDER_PREPAYMENT("_purchaseOrderPrepayment"),
    @XmlEnumValue("_purchaseOrderRequisition")
    PURCHASE_ORDER_REQUISITION("_purchaseOrderRequisition"),
    @XmlEnumValue("_purchaseOrderToBlanket")
    PURCHASE_ORDER_TO_BLANKET("_purchaseOrderToBlanket"),
    @XmlEnumValue("_purchaseReturn")
    PURCHASE_RETURN("_purchaseReturn"),
    @XmlEnumValue("_receiptBill")
    RECEIPT_BILL("_receiptBill"),
    @XmlEnumValue("_receiptFulfillment")
    RECEIPT_FULFILLMENT("_receiptFulfillment"),
    @XmlEnumValue("_reimbursement")
    REIMBURSEMENT("_reimbursement"),
    @XmlEnumValue("_reservationShipment")
    RESERVATION_SHIPMENT("_reservationShipment"),
    @XmlEnumValue("_revalueWorkOrder")
    REVALUE_WORK_ORDER("_revalueWorkOrder"),
    @XmlEnumValue("_revenueAmortizatonRecognition")
    REVENUE_AMORTIZATON_RECOGNITION("_revenueAmortizatonRecognition"),
    @XmlEnumValue("_revenueArrangement")
    REVENUE_ARRANGEMENT("_revenueArrangement"),
    @XmlEnumValue("_revenueCommitted")
    REVENUE_COMMITTED("_revenueCommitted"),
    @XmlEnumValue("_rfqToVendorRfq")
    RFQ_TO_VENDOR_RFQ("_rfqToVendorRfq"),
    @XmlEnumValue("_saleReturn")
    SALE_RETURN("_saleReturn"),
    @XmlEnumValue("_salesOrderAuthorization")
    SALES_ORDER_AUTHORIZATION("_salesOrderAuthorization"),
    @XmlEnumValue("_salesOrderDegross")
    SALES_ORDER_DEGROSS("_salesOrderDegross"),
    @XmlEnumValue("_salesOrderDeposit")
    SALES_ORDER_DEPOSIT("_salesOrderDeposit"),
    @XmlEnumValue("_salesOrderRevenueRevaluation")
    SALES_ORDER_REVENUE_REVALUATION("_salesOrderRevenueRevaluation"),
    @XmlEnumValue("_sourceOfRevenueContract")
    SOURCE_OF_REVENUE_CONTRACT("_sourceOfRevenueContract"),
    @XmlEnumValue("_specialOrder")
    SPECIAL_ORDER("_specialOrder"),
    @XmlEnumValue("_systemJournal")
    SYSTEM_JOURNAL("_systemJournal"),
    @XmlEnumValue("_transferOrderFulfillmentReceipt")
    TRANSFER_ORDER_FULFILLMENT_RECEIPT("_transferOrderFulfillmentReceipt"),
    @XmlEnumValue("_transformation")
    TRANSFORMATION("_transformation"),
    @XmlEnumValue("_vendorBillVariance")
    VENDOR_BILL_VARIANCE("_vendorBillVariance"),
    @XmlEnumValue("_vendorRfqToPurchaseContract")
    VENDOR_RFQ_TO_PURCHASE_CONTRACT("_vendorRfqToPurchaseContract"),
    @XmlEnumValue("_waveOrder")
    WAVE_ORDER("_waveOrder"),
    @XmlEnumValue("_waveShipment")
    WAVE_SHIPMENT("_waveShipment"),
    @XmlEnumValue("_wipBuild")
    WIP_BUILD("_wipBuild"),
    @XmlEnumValue("_workOrderBuild")
    WORK_ORDER_BUILD("_workOrderBuild");
    private final String value;

    TransactionLinkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionLinkType fromValue(String v) {
        for (TransactionLinkType c: TransactionLinkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
