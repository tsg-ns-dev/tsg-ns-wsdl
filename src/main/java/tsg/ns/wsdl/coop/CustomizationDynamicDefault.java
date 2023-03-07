
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationDynamicDefault.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CustomizationDynamicDefault"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_currentDateTime"/&gt;
 *     &lt;enumeration value="_currentUser"/&gt;
 *     &lt;enumeration value="_currentUsersDepartment"/&gt;
 *     &lt;enumeration value="_currentUsersLocation"/&gt;
 *     &lt;enumeration value="_currentUsersSupervisor"/&gt;
 *     &lt;enumeration value="_currentUsersSubsidiary"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomizationDynamicDefault", namespace = "urn:types.customization_2022_2.setup.webservices.netsuite.com")
@XmlEnum
public enum CustomizationDynamicDefault {

    @XmlEnumValue("_currentDateTime")
    CURRENT_DATE_TIME("_currentDateTime"),
    @XmlEnumValue("_currentUser")
    CURRENT_USER("_currentUser"),
    @XmlEnumValue("_currentUsersDepartment")
    CURRENT_USERS_DEPARTMENT("_currentUsersDepartment"),
    @XmlEnumValue("_currentUsersLocation")
    CURRENT_USERS_LOCATION("_currentUsersLocation"),
    @XmlEnumValue("_currentUsersSupervisor")
    CURRENT_USERS_SUPERVISOR("_currentUsersSupervisor"),
    @XmlEnumValue("_currentUsersSubsidiary")
    CURRENT_USERS_SUBSIDIARY("_currentUsersSubsidiary");
    private final String value;

    CustomizationDynamicDefault(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomizationDynamicDefault fromValue(String v) {
        for (CustomizationDynamicDefault c: CustomizationDynamicDefault.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
