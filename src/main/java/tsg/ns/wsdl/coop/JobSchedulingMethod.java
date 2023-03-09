
package tsg.ns.wsdl.coop;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobSchedulingMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JobSchedulingMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_backward"/&gt;
 *     &lt;enumeration value="_forward"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "JobSchedulingMethod", namespace = "urn:types.relationships_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum JobSchedulingMethod {

    @XmlEnumValue("_backward")
    BACKWARD("_backward"),
    @XmlEnumValue("_forward")
    FORWARD("_forward");
    private final String value;

    JobSchedulingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobSchedulingMethod fromValue(String v) {
        for (JobSchedulingMethod c: JobSchedulingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
