
package tsg.ns.wsdl.coop;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionPaymentEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionPaymentEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_authentication"/&gt;
 *     &lt;enumeration value="_authorization"/&gt;
 *     &lt;enumeration value="_captureAuthorization"/&gt;
 *     &lt;enumeration value="_credit"/&gt;
 *     &lt;enumeration value="_overrideHold"/&gt;
 *     &lt;enumeration value="_refreshAuthorization"/&gt;
 *     &lt;enumeration value="_refund"/&gt;
 *     &lt;enumeration value="_sale"/&gt;
 *     &lt;enumeration value="_voidAuthorization"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionPaymentEventType", namespace = "urn:types.sales_2022_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionPaymentEventType {

    @XmlEnumValue("_authentication")
    AUTHENTICATION("_authentication"),
    @XmlEnumValue("_authorization")
    AUTHORIZATION("_authorization"),
    @XmlEnumValue("_captureAuthorization")
    CAPTURE_AUTHORIZATION("_captureAuthorization"),
    @XmlEnumValue("_credit")
    CREDIT("_credit"),
    @XmlEnumValue("_overrideHold")
    OVERRIDE_HOLD("_overrideHold"),
    @XmlEnumValue("_refreshAuthorization")
    REFRESH_AUTHORIZATION("_refreshAuthorization"),
    @XmlEnumValue("_refund")
    REFUND("_refund"),
    @XmlEnumValue("_sale")
    SALE("_sale"),
    @XmlEnumValue("_voidAuthorization")
    VOID_AUTHORIZATION("_voidAuthorization");
    private final String value;

    TransactionPaymentEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionPaymentEventType fromValue(String v) {
        for (TransactionPaymentEventType c: TransactionPaymentEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
