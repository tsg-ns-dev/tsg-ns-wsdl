
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInstrumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PaymentInstrumentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_paymentCard"/&gt;
 *     &lt;enumeration value="_generalToken"/&gt;
 *     &lt;enumeration value="_paymentCardToken"/&gt;
 *     &lt;enumeration value="_paymentCardSwipe"/&gt;
 *     &lt;enumeration value="_emv"/&gt;
 *     &lt;enumeration value="_externalCheckout"/&gt;
 *     &lt;enumeration value="_cash"/&gt;
 *     &lt;enumeration value="_check"/&gt;
 *     &lt;enumeration value="_offline"/&gt;
 *     &lt;enumeration value="_payByReference"/&gt;
 *     &lt;enumeration value="_ach"/&gt;
 *     &lt;enumeration value="_payPal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentInstrumentType", namespace = "urn:types.accounting_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum PaymentInstrumentType {

    @XmlEnumValue("_paymentCard")
    PAYMENT_CARD("_paymentCard"),
    @XmlEnumValue("_generalToken")
    GENERAL_TOKEN("_generalToken"),
    @XmlEnumValue("_paymentCardToken")
    PAYMENT_CARD_TOKEN("_paymentCardToken"),
    @XmlEnumValue("_paymentCardSwipe")
    PAYMENT_CARD_SWIPE("_paymentCardSwipe"),
    @XmlEnumValue("_emv")
    EMV("_emv"),
    @XmlEnumValue("_externalCheckout")
    EXTERNAL_CHECKOUT("_externalCheckout"),
    @XmlEnumValue("_cash")
    CASH("_cash"),
    @XmlEnumValue("_check")
    CHECK("_check"),
    @XmlEnumValue("_offline")
    OFFLINE("_offline"),
    @XmlEnumValue("_payByReference")
    PAY_BY_REFERENCE("_payByReference"),
    @XmlEnumValue("_ach")
    ACH("_ach"),
    @XmlEnumValue("_payPal")
    PAY_PAL("_payPal");
    private final String value;

    PaymentInstrumentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentInstrumentType fromValue(String v) {
        for (PaymentInstrumentType c: PaymentInstrumentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
