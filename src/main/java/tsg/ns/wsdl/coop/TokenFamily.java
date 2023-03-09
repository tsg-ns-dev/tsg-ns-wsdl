
package tsg.ns.wsdl.coop;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenFamily.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TokenFamily"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_adyen"/&gt;
 *     &lt;enumeration value="_altaPay"/&gt;
 *     &lt;enumeration value="_cyberSource"/&gt;
 *     &lt;enumeration value="_eway"/&gt;
 *     &lt;enumeration value="_freedomPay"/&gt;
 *     &lt;enumeration value="_merchantESolutions"/&gt;
 *     &lt;enumeration value="_payCorp"/&gt;
 *     &lt;enumeration value="_payu"/&gt;
 *     &lt;enumeration value="_securePay"/&gt;
 *     &lt;enumeration value="_soluPay"/&gt;
 *     &lt;enumeration value="_vantivPayments"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TokenFamily", namespace = "urn:types.accounting_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum TokenFamily {

    @XmlEnumValue("_adyen")
    ADYEN("_adyen"),
    @XmlEnumValue("_altaPay")
    ALTA_PAY("_altaPay"),
    @XmlEnumValue("_cyberSource")
    CYBER_SOURCE("_cyberSource"),
    @XmlEnumValue("_eway")
    EWAY("_eway"),
    @XmlEnumValue("_freedomPay")
    FREEDOM_PAY("_freedomPay"),
    @XmlEnumValue("_merchantESolutions")
    MERCHANT_E_SOLUTIONS("_merchantESolutions"),
    @XmlEnumValue("_payCorp")
    PAY_CORP("_payCorp"),
    @XmlEnumValue("_payu")
    PAYU("_payu"),
    @XmlEnumValue("_securePay")
    SECURE_PAY("_securePay"),
    @XmlEnumValue("_soluPay")
    SOLU_PAY("_soluPay"),
    @XmlEnumValue("_vantivPayments")
    VANTIV_PAYMENTS("_vantivPayments");
    private final String value;

    TokenFamily(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TokenFamily fromValue(String v) {
        for (TokenFamily c: TokenFamily.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
