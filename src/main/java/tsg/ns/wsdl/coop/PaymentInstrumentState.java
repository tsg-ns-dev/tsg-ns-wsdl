
package tsg.ns.wsdl.coop;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInstrumentState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentInstrumentState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_expired"/&gt;
 *     &lt;enumeration value="_invalid"/&gt;
 *     &lt;enumeration value="_unknown"/&gt;
 *     &lt;enumeration value="_verified"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentInstrumentState", namespace = "urn:types.accounting_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum PaymentInstrumentState {

    @XmlEnumValue("_expired")
    EXPIRED("_expired"),
    @XmlEnumValue("_invalid")
    INVALID("_invalid"),
    @XmlEnumValue("_unknown")
    UNKNOWN("_unknown"),
    @XmlEnumValue("_verified")
    VERIFIED("_verified");
    private final String value;

    PaymentInstrumentState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentInstrumentState fromValue(String v) {
        for (PaymentInstrumentState c: PaymentInstrumentState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
