
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TransactionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_assemblyBuild"/&gt;
 *     &lt;enumeration value="_assemblyUnbuild"/&gt;
 *     &lt;enumeration value="_binTransfer"/&gt;
 *     &lt;enumeration value="_binWorksheet"/&gt;
 *     &lt;enumeration value="_cashRefund"/&gt;
 *     &lt;enumeration value="_cashSale"/&gt;
 *     &lt;enumeration value="_check"/&gt;
 *     &lt;enumeration value="_creditMemo"/&gt;
 *     &lt;enumeration value="_custom"/&gt;
 *     &lt;enumeration value="_customPurchase"/&gt;
 *     &lt;enumeration value="_customSale"/&gt;
 *     &lt;enumeration value="_customerDeposit"/&gt;
 *     &lt;enumeration value="_customerPayment"/&gt;
 *     &lt;enumeration value="_customerRefund"/&gt;
 *     &lt;enumeration value="_deposit"/&gt;
 *     &lt;enumeration value="_depositApplication"/&gt;
 *     &lt;enumeration value="_estimate"/&gt;
 *     &lt;enumeration value="_expenseReport"/&gt;
 *     &lt;enumeration value="_inboundShipment"/&gt;
 *     &lt;enumeration value="_inventoryAdjustment"/&gt;
 *     &lt;enumeration value="_inventoryCostRevaluation"/&gt;
 *     &lt;enumeration value="_inventoryTransfer"/&gt;
 *     &lt;enumeration value="_invoice"/&gt;
 *     &lt;enumeration value="_itemFulfillment"/&gt;
 *     &lt;enumeration value="_itemReceipt"/&gt;
 *     &lt;enumeration value="_journal"/&gt;
 *     &lt;enumeration value="_opportunity"/&gt;
 *     &lt;enumeration value="_paycheck"/&gt;
 *     &lt;enumeration value="_paycheckJournal"/&gt;
 *     &lt;enumeration value="_periodEndJournal"/&gt;
 *     &lt;enumeration value="_purchaseOrder"/&gt;
 *     &lt;enumeration value="_requisition"/&gt;
 *     &lt;enumeration value="_returnAuthorization"/&gt;
 *     &lt;enumeration value="_salesOrder"/&gt;
 *     &lt;enumeration value="_transferOrder"/&gt;
 *     &lt;enumeration value="_vendorBill"/&gt;
 *     &lt;enumeration value="_vendorCredit"/&gt;
 *     &lt;enumeration value="_vendorPayment"/&gt;
 *     &lt;enumeration value="_vendorReturnAuthorization"/&gt;
 *     &lt;enumeration value="_workOrder"/&gt;
 *     &lt;enumeration value="_workOrderClose"/&gt;
 *     &lt;enumeration value="_workOrderCompletion"/&gt;
 *     &lt;enumeration value="_workOrderIssue"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionType", namespace = "urn:types.sales_2022_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionType {

    @XmlEnumValue("_assemblyBuild")
    ASSEMBLY_BUILD("_assemblyBuild"),
    @XmlEnumValue("_assemblyUnbuild")
    ASSEMBLY_UNBUILD("_assemblyUnbuild"),
    @XmlEnumValue("_binTransfer")
    BIN_TRANSFER("_binTransfer"),
    @XmlEnumValue("_binWorksheet")
    BIN_WORKSHEET("_binWorksheet"),
    @XmlEnumValue("_cashRefund")
    CASH_REFUND("_cashRefund"),
    @XmlEnumValue("_cashSale")
    CASH_SALE("_cashSale"),
    @XmlEnumValue("_check")
    CHECK("_check"),
    @XmlEnumValue("_creditMemo")
    CREDIT_MEMO("_creditMemo"),
    @XmlEnumValue("_custom")
    CUSTOM("_custom"),
    @XmlEnumValue("_customPurchase")
    CUSTOM_PURCHASE("_customPurchase"),
    @XmlEnumValue("_customSale")
    CUSTOM_SALE("_customSale"),
    @XmlEnumValue("_customerDeposit")
    CUSTOMER_DEPOSIT("_customerDeposit"),
    @XmlEnumValue("_customerPayment")
    CUSTOMER_PAYMENT("_customerPayment"),
    @XmlEnumValue("_customerRefund")
    CUSTOMER_REFUND("_customerRefund"),
    @XmlEnumValue("_deposit")
    DEPOSIT("_deposit"),
    @XmlEnumValue("_depositApplication")
    DEPOSIT_APPLICATION("_depositApplication"),
    @XmlEnumValue("_estimate")
    ESTIMATE("_estimate"),
    @XmlEnumValue("_expenseReport")
    EXPENSE_REPORT("_expenseReport"),
    @XmlEnumValue("_inboundShipment")
    INBOUND_SHIPMENT("_inboundShipment"),
    @XmlEnumValue("_inventoryAdjustment")
    INVENTORY_ADJUSTMENT("_inventoryAdjustment"),
    @XmlEnumValue("_inventoryCostRevaluation")
    INVENTORY_COST_REVALUATION("_inventoryCostRevaluation"),
    @XmlEnumValue("_inventoryTransfer")
    INVENTORY_TRANSFER("_inventoryTransfer"),
    @XmlEnumValue("_invoice")
    INVOICE("_invoice"),
    @XmlEnumValue("_itemFulfillment")
    ITEM_FULFILLMENT("_itemFulfillment"),
    @XmlEnumValue("_itemReceipt")
    ITEM_RECEIPT("_itemReceipt"),
    @XmlEnumValue("_journal")
    JOURNAL("_journal"),
    @XmlEnumValue("_opportunity")
    OPPORTUNITY("_opportunity"),
    @XmlEnumValue("_paycheck")
    PAYCHECK("_paycheck"),
    @XmlEnumValue("_paycheckJournal")
    PAYCHECK_JOURNAL("_paycheckJournal"),
    @XmlEnumValue("_periodEndJournal")
    PERIOD_END_JOURNAL("_periodEndJournal"),
    @XmlEnumValue("_purchaseOrder")
    PURCHASE_ORDER("_purchaseOrder"),
    @XmlEnumValue("_requisition")
    REQUISITION("_requisition"),
    @XmlEnumValue("_returnAuthorization")
    RETURN_AUTHORIZATION("_returnAuthorization"),
    @XmlEnumValue("_salesOrder")
    SALES_ORDER("_salesOrder"),
    @XmlEnumValue("_transferOrder")
    TRANSFER_ORDER("_transferOrder"),
    @XmlEnumValue("_vendorBill")
    VENDOR_BILL("_vendorBill"),
    @XmlEnumValue("_vendorCredit")
    VENDOR_CREDIT("_vendorCredit"),
    @XmlEnumValue("_vendorPayment")
    VENDOR_PAYMENT("_vendorPayment"),
    @XmlEnumValue("_vendorReturnAuthorization")
    VENDOR_RETURN_AUTHORIZATION("_vendorReturnAuthorization"),
    @XmlEnumValue("_workOrder")
    WORK_ORDER("_workOrder"),
    @XmlEnumValue("_workOrderClose")
    WORK_ORDER_CLOSE("_workOrderClose"),
    @XmlEnumValue("_workOrderCompletion")
    WORK_ORDER_COMPLETION("_workOrderCompletion"),
    @XmlEnumValue("_workOrderIssue")
    WORK_ORDER_ISSUE("_workOrderIssue");
    private final String value;

    TransactionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionType fromValue(String v) {
        for (TransactionType c: TransactionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
