
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileAttachFrom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FileAttachFrom"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_computer"/&gt;
 *     &lt;enumeration value="_web"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FileAttachFrom", namespace = "urn:types.filecabinet_2022_2.documents.webservices.netsuite.com")
@XmlEnum
public enum FileAttachFrom {

    @XmlEnumValue("_computer")
    COMPUTER("_computer"),
    @XmlEnumValue("_web")
    WEB("_web");
    private final String value;

    FileAttachFrom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileAttachFrom fromValue(String v) {
        for (FileAttachFrom c: FileAttachFrom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
