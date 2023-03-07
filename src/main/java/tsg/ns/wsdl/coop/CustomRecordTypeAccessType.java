
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomRecordTypeAccessType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CustomRecordTypeAccessType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_noPermissionRequired"/&gt;
 *     &lt;enumeration value="_requireCustomRecordEntriesPermission"/&gt;
 *     &lt;enumeration value="_usePermissionList"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomRecordTypeAccessType", namespace = "urn:types.customization_2022_2.setup.webservices.netsuite.com")
@XmlEnum
public enum CustomRecordTypeAccessType {

    @XmlEnumValue("_noPermissionRequired")
    NO_PERMISSION_REQUIRED("_noPermissionRequired"),
    @XmlEnumValue("_requireCustomRecordEntriesPermission")
    REQUIRE_CUSTOM_RECORD_ENTRIES_PERMISSION("_requireCustomRecordEntriesPermission"),
    @XmlEnumValue("_usePermissionList")
    USE_PERMISSION_LIST("_usePermissionList");
    private final String value;

    CustomRecordTypeAccessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomRecordTypeAccessType fromValue(String v) {
        for (CustomRecordTypeAccessType c: CustomRecordTypeAccessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
