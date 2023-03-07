
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeUse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ChargeUse"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_actual"/&gt;
 *     &lt;enumeration value="_forecast"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargeUse", namespace = "urn:types.customers_2022_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ChargeUse {

    @XmlEnumValue("_actual")
    ACTUAL("_actual"),
    @XmlEnumValue("_forecast")
    FORECAST("_forecast");
    private final String value;

    ChargeUse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargeUse fromValue(String v) {
        for (ChargeUse c: ChargeUse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
