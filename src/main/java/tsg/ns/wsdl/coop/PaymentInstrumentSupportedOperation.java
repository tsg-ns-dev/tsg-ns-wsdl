
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInstrumentSupportedOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PaymentInstrumentSupportedOperation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_authorization"/&gt;
 *     &lt;enumeration value="_capture"/&gt;
 *     &lt;enumeration value="_sale"/&gt;
 *     &lt;enumeration value="_credit"/&gt;
 *     &lt;enumeration value="_refund"/&gt;
 *     &lt;enumeration value="_override"/&gt;
 *     &lt;enumeration value="_void"/&gt;
 *     &lt;enumeration value="_refresh"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentInstrumentSupportedOperation", namespace = "urn:types.accounting_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum PaymentInstrumentSupportedOperation {

    @XmlEnumValue("_authorization")
    AUTHORIZATION("_authorization"),
    @XmlEnumValue("_capture")
    CAPTURE("_capture"),
    @XmlEnumValue("_sale")
    SALE("_sale"),
    @XmlEnumValue("_credit")
    CREDIT("_credit"),
    @XmlEnumValue("_refund")
    REFUND("_refund"),
    @XmlEnumValue("_override")
    OVERRIDE("_override"),
    @XmlEnumValue("_void")
    VOID("_void"),
    @XmlEnumValue("_refresh")
    REFRESH("_refresh");
    private final String value;

    PaymentInstrumentSupportedOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentInstrumentSupportedOperation fromValue(String v) {
        for (PaymentInstrumentSupportedOperation c: PaymentInstrumentSupportedOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
