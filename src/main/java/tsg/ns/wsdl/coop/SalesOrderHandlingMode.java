
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesOrderHandlingMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SalesOrderHandlingMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_process"/&gt;
 *     &lt;enumeration value="_recordExternalEvent"/&gt;
 *     &lt;enumeration value="_saveOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SalesOrderHandlingMode", namespace = "urn:types.sales_2022_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum SalesOrderHandlingMode {

    @XmlEnumValue("_process")
    PROCESS("_process"),
    @XmlEnumValue("_recordExternalEvent")
    RECORD_EXTERNAL_EVENT("_recordExternalEvent"),
    @XmlEnumValue("_saveOnly")
    SAVE_ONLY("_saveOnly");
    private final String value;

    SalesOrderHandlingMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SalesOrderHandlingMode fromValue(String v) {
        for (SalesOrderHandlingMode c: SalesOrderHandlingMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
