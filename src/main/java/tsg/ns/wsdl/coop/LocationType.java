
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_store"/&gt;
 *     &lt;enumeration value="_warehouse"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationType", namespace = "urn:types.accounting_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum LocationType {

    @XmlEnumValue("_store")
    STORE("_store"),
    @XmlEnumValue("_warehouse")
    WAREHOUSE("_warehouse");
    private final String value;

    LocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationType fromValue(String v) {
        for (LocationType c: LocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
