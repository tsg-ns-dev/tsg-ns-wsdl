
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryItemFraudRisk.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InventoryItemFraudRisk"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_high"/&gt;
 *     &lt;enumeration value="_low"/&gt;
 *     &lt;enumeration value="_medium"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InventoryItemFraudRisk", namespace = "urn:types.accounting_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum InventoryItemFraudRisk {

    @XmlEnumValue("_high")
    HIGH("_high"),
    @XmlEnumValue("_low")
    LOW("_low"),
    @XmlEnumValue("_medium")
    MEDIUM("_medium");
    private final String value;

    InventoryItemFraudRisk(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InventoryItemFraudRisk fromValue(String v) {
        for (InventoryItemFraudRisk c: InventoryItemFraudRisk.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
