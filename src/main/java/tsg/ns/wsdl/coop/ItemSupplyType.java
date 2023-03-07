
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemSupplyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ItemSupplyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_build"/&gt;
 *     &lt;enumeration value="_purchase"/&gt;
 *     &lt;enumeration value="_transfer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemSupplyType", namespace = "urn:types.accounting_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemSupplyType {

    @XmlEnumValue("_build")
    BUILD("_build"),
    @XmlEnumValue("_purchase")
    PURCHASE("_purchase"),
    @XmlEnumValue("_transfer")
    TRANSFER("_transfer");
    private final String value;

    ItemSupplyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemSupplyType fromValue(String v) {
        for (ItemSupplyType c: ItemSupplyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
