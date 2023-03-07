
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemCostingMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ItemCostingMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_average"/&gt;
 *     &lt;enumeration value="_fifo"/&gt;
 *     &lt;enumeration value="_groupAverage"/&gt;
 *     &lt;enumeration value="_lifo"/&gt;
 *     &lt;enumeration value="_lotNumbered"/&gt;
 *     &lt;enumeration value="_serialized"/&gt;
 *     &lt;enumeration value="_standard"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemCostingMethod", namespace = "urn:types.accounting_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemCostingMethod {

    @XmlEnumValue("_average")
    AVERAGE("_average"),
    @XmlEnumValue("_fifo")
    FIFO("_fifo"),
    @XmlEnumValue("_groupAverage")
    GROUP_AVERAGE("_groupAverage"),
    @XmlEnumValue("_lifo")
    LIFO("_lifo"),
    @XmlEnumValue("_lotNumbered")
    LOT_NUMBERED("_lotNumbered"),
    @XmlEnumValue("_serialized")
    SERIALIZED("_serialized"),
    @XmlEnumValue("_standard")
    STANDARD("_standard");
    private final String value;

    ItemCostingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemCostingMethod fromValue(String v) {
        for (ItemCostingMethod c: ItemCostingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
