
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionPaymentEventResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TransactionPaymentEventResult"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_accept"/&gt;
 *     &lt;enumeration value="_holdOverride"/&gt;
 *     &lt;enumeration value="_paymentHold"/&gt;
 *     &lt;enumeration value="_pending"/&gt;
 *     &lt;enumeration value="_reject"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionPaymentEventResult", namespace = "urn:types.sales_2022_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionPaymentEventResult {

    @XmlEnumValue("_accept")
    ACCEPT("_accept"),
    @XmlEnumValue("_holdOverride")
    HOLD_OVERRIDE("_holdOverride"),
    @XmlEnumValue("_paymentHold")
    PAYMENT_HOLD("_paymentHold"),
    @XmlEnumValue("_pending")
    PENDING("_pending"),
    @XmlEnumValue("_reject")
    REJECT("_reject");
    private final String value;

    TransactionPaymentEventResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionPaymentEventResult fromValue(String v) {
        for (TransactionPaymentEventResult c: TransactionPaymentEventResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
