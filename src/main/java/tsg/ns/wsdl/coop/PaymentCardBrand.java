
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCardBrand.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PaymentCardBrand"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_amex"/&gt;
 *     &lt;enumeration value="_cirrus"/&gt;
 *     &lt;enumeration value="_dinersClub"/&gt;
 *     &lt;enumeration value="_discover"/&gt;
 *     &lt;enumeration value="_jcb"/&gt;
 *     &lt;enumeration value="_laser"/&gt;
 *     &lt;enumeration value="_localCard"/&gt;
 *     &lt;enumeration value="_maestro"/&gt;
 *     &lt;enumeration value="_masterCard"/&gt;
 *     &lt;enumeration value="_solo"/&gt;
 *     &lt;enumeration value="_unionPay"/&gt;
 *     &lt;enumeration value="_visa"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentCardBrand", namespace = "urn:types.accounting_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum PaymentCardBrand {

    @XmlEnumValue("_amex")
    AMEX("_amex"),
    @XmlEnumValue("_cirrus")
    CIRRUS("_cirrus"),
    @XmlEnumValue("_dinersClub")
    DINERS_CLUB("_dinersClub"),
    @XmlEnumValue("_discover")
    DISCOVER("_discover"),
    @XmlEnumValue("_jcb")
    JCB("_jcb"),
    @XmlEnumValue("_laser")
    LASER("_laser"),
    @XmlEnumValue("_localCard")
    LOCAL_CARD("_localCard"),
    @XmlEnumValue("_maestro")
    MAESTRO("_maestro"),
    @XmlEnumValue("_masterCard")
    MASTER_CARD("_masterCard"),
    @XmlEnumValue("_solo")
    SOLO("_solo"),
    @XmlEnumValue("_unionPay")
    UNION_PAY("_unionPay"),
    @XmlEnumValue("_visa")
    VISA("_visa");
    private final String value;

    PaymentCardBrand(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentCardBrand fromValue(String v) {
        for (PaymentCardBrand c: PaymentCardBrand.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
