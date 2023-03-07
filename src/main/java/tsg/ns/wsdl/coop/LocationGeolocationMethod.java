
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationGeolocationMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocationGeolocationMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_deriveFromPostalCode"/&gt;
 *     &lt;enumeration value="_useLatLongCoordinates"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationGeolocationMethod", namespace = "urn:types.accounting_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum LocationGeolocationMethod {

    @XmlEnumValue("_deriveFromPostalCode")
    DERIVE_FROM_POSTAL_CODE("_deriveFromPostalCode"),
    @XmlEnumValue("_useLatLongCoordinates")
    USE_LAT_LONG_COORDINATES("_useLatLongCoordinates");
    private final String value;

    LocationGeolocationMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationGeolocationMethod fromValue(String v) {
        for (LocationGeolocationMethod c: LocationGeolocationMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
