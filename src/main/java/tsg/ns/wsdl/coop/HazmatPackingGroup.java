
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HazmatPackingGroup.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="HazmatPackingGroup"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_i"/&gt;
 *     &lt;enumeration value="_ii"/&gt;
 *     &lt;enumeration value="_iii"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HazmatPackingGroup", namespace = "urn:types.accounting_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum HazmatPackingGroup {

    @XmlEnumValue("_i")
    I("_i"),
    @XmlEnumValue("_ii")
    II("_ii"),
    @XmlEnumValue("_iii")
    III("_iii");
    private final String value;

    HazmatPackingGroup(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HazmatPackingGroup fromValue(String v) {
        for (HazmatPackingGroup c: HazmatPackingGroup.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
