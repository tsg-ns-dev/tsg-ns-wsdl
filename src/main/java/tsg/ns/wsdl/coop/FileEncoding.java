
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileEncoding.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FileEncoding"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_autoDetect"/&gt;
 *     &lt;enumeration value="_shiftJis"/&gt;
 *     &lt;enumeration value="_utf8"/&gt;
 *     &lt;enumeration value="_windows1252"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FileEncoding", namespace = "urn:types.filecabinet_2022_2.documents.webservices.netsuite.com")
@XmlEnum
public enum FileEncoding {

    @XmlEnumValue("_autoDetect")
    AUTO_DETECT("_autoDetect"),
    @XmlEnumValue("_shiftJis")
    SHIFT_JIS("_shiftJis"),
    @XmlEnumValue("_utf8")
    UTF_8("_utf8"),
    @XmlEnumValue("_windows1252")
    WINDOWS_1252("_windows1252");
    private final String value;

    FileEncoding(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileEncoding fromValue(String v) {
        for (FileEncoding c: FileEncoding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
