
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomRecordTypePermissionsPermittedLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CustomRecordTypePermissionsPermittedLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_create"/&gt;
 *     &lt;enumeration value="_edit"/&gt;
 *     &lt;enumeration value="_full"/&gt;
 *     &lt;enumeration value="_none"/&gt;
 *     &lt;enumeration value="_view"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomRecordTypePermissionsPermittedLevel", namespace = "urn:types.customization_2022_2.setup.webservices.netsuite.com")
@XmlEnum
public enum CustomRecordTypePermissionsPermittedLevel {

    @XmlEnumValue("_create")
    CREATE("_create"),
    @XmlEnumValue("_edit")
    EDIT("_edit"),
    @XmlEnumValue("_full")
    FULL("_full"),
    @XmlEnumValue("_none")
    NONE("_none"),
    @XmlEnumValue("_view")
    VIEW("_view");
    private final String value;

    CustomRecordTypePermissionsPermittedLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomRecordTypePermissionsPermittedLevel fromValue(String v) {
        for (CustomRecordTypePermissionsPermittedLevel c: CustomRecordTypePermissionsPermittedLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}