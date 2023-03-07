
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MediaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_APPCACHE"/&gt;
 *     &lt;enumeration value="_AUTOCAD"/&gt;
 *     &lt;enumeration value="_BMPIMAGE"/&gt;
 *     &lt;enumeration value="_CERTIFICATE"/&gt;
 *     &lt;enumeration value="_CFF"/&gt;
 *     &lt;enumeration value="_CONFIG"/&gt;
 *     &lt;enumeration value="_CSV"/&gt;
 *     &lt;enumeration value="_EOT"/&gt;
 *     &lt;enumeration value="_EXCEL"/&gt;
 *     &lt;enumeration value="_FLASH"/&gt;
 *     &lt;enumeration value="_FREEMARKER"/&gt;
 *     &lt;enumeration value="_GIFIMAGE"/&gt;
 *     &lt;enumeration value="_GZIP"/&gt;
 *     &lt;enumeration value="_HTMLDOC"/&gt;
 *     &lt;enumeration value="_ICON"/&gt;
 *     &lt;enumeration value="_IMAGE"/&gt;
 *     &lt;enumeration value="_JAVASCRIPT"/&gt;
 *     &lt;enumeration value="_JPGIMAGE"/&gt;
 *     &lt;enumeration value="_JSON"/&gt;
 *     &lt;enumeration value="_LZH"/&gt;
 *     &lt;enumeration value="_MESSAGERFC"/&gt;
 *     &lt;enumeration value="_MISCBINARY"/&gt;
 *     &lt;enumeration value="_MISCTEXT"/&gt;
 *     &lt;enumeration value="_MP3"/&gt;
 *     &lt;enumeration value="_MPEGMOVIE"/&gt;
 *     &lt;enumeration value="_MSPROJECT"/&gt;
 *     &lt;enumeration value="_OTF"/&gt;
 *     &lt;enumeration value="_PDF"/&gt;
 *     &lt;enumeration value="_PJPGIMAGE"/&gt;
 *     &lt;enumeration value="_PLAINTEXT"/&gt;
 *     &lt;enumeration value="_PNGIMAGE"/&gt;
 *     &lt;enumeration value="_POSTSCRIPT"/&gt;
 *     &lt;enumeration value="_POWERPOINT"/&gt;
 *     &lt;enumeration value="_QUICKTIME"/&gt;
 *     &lt;enumeration value="_RTF"/&gt;
 *     &lt;enumeration value="_SCSS"/&gt;
 *     &lt;enumeration value="_SMS"/&gt;
 *     &lt;enumeration value="_STYLESHEET"/&gt;
 *     &lt;enumeration value="_SVG"/&gt;
 *     &lt;enumeration value="_TAR"/&gt;
 *     &lt;enumeration value="_TARCOMP"/&gt;
 *     &lt;enumeration value="_TIFFIMAGE"/&gt;
 *     &lt;enumeration value="_TTF"/&gt;
 *     &lt;enumeration value="_VISIO"/&gt;
 *     &lt;enumeration value="_WEBAPPPAGE"/&gt;
 *     &lt;enumeration value="_WEBAPPSCRIPT"/&gt;
 *     &lt;enumeration value="_WOFF"/&gt;
 *     &lt;enumeration value="_WOFF2"/&gt;
 *     &lt;enumeration value="_WORD"/&gt;
 *     &lt;enumeration value="_XMLDOC"/&gt;
 *     &lt;enumeration value="_XSD"/&gt;
 *     &lt;enumeration value="_ZIP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MediaType", namespace = "urn:types.filecabinet_2022_2.documents.webservices.netsuite.com")
@XmlEnum
public enum MediaType {

    @XmlEnumValue("_APPCACHE")
    APPCACHE("_APPCACHE"),
    @XmlEnumValue("_AUTOCAD")
    AUTOCAD("_AUTOCAD"),
    @XmlEnumValue("_BMPIMAGE")
    BMPIMAGE("_BMPIMAGE"),
    @XmlEnumValue("_CERTIFICATE")
    CERTIFICATE("_CERTIFICATE"),
    @XmlEnumValue("_CFF")
    CFF("_CFF"),
    @XmlEnumValue("_CONFIG")
    CONFIG("_CONFIG"),
    @XmlEnumValue("_CSV")
    CSV("_CSV"),
    @XmlEnumValue("_EOT")
    EOT("_EOT"),
    @XmlEnumValue("_EXCEL")
    EXCEL("_EXCEL"),
    @XmlEnumValue("_FLASH")
    FLASH("_FLASH"),
    @XmlEnumValue("_FREEMARKER")
    FREEMARKER("_FREEMARKER"),
    @XmlEnumValue("_GIFIMAGE")
    GIFIMAGE("_GIFIMAGE"),
    @XmlEnumValue("_GZIP")
    GZIP("_GZIP"),
    @XmlEnumValue("_HTMLDOC")
    HTMLDOC("_HTMLDOC"),
    @XmlEnumValue("_ICON")
    ICON("_ICON"),
    @XmlEnumValue("_IMAGE")
    IMAGE("_IMAGE"),
    @XmlEnumValue("_JAVASCRIPT")
    JAVASCRIPT("_JAVASCRIPT"),
    @XmlEnumValue("_JPGIMAGE")
    JPGIMAGE("_JPGIMAGE"),
    @XmlEnumValue("_JSON")
    JSON("_JSON"),
    @XmlEnumValue("_LZH")
    LZH("_LZH"),
    @XmlEnumValue("_MESSAGERFC")
    MESSAGERFC("_MESSAGERFC"),
    @XmlEnumValue("_MISCBINARY")
    MISCBINARY("_MISCBINARY"),
    @XmlEnumValue("_MISCTEXT")
    MISCTEXT("_MISCTEXT"),
    @XmlEnumValue("_MP3")
    MP_3("_MP3"),
    @XmlEnumValue("_MPEGMOVIE")
    MPEGMOVIE("_MPEGMOVIE"),
    @XmlEnumValue("_MSPROJECT")
    MSPROJECT("_MSPROJECT"),
    @XmlEnumValue("_OTF")
    OTF("_OTF"),
    @XmlEnumValue("_PDF")
    PDF("_PDF"),
    @XmlEnumValue("_PJPGIMAGE")
    PJPGIMAGE("_PJPGIMAGE"),
    @XmlEnumValue("_PLAINTEXT")
    PLAINTEXT("_PLAINTEXT"),
    @XmlEnumValue("_PNGIMAGE")
    PNGIMAGE("_PNGIMAGE"),
    @XmlEnumValue("_POSTSCRIPT")
    POSTSCRIPT("_POSTSCRIPT"),
    @XmlEnumValue("_POWERPOINT")
    POWERPOINT("_POWERPOINT"),
    @XmlEnumValue("_QUICKTIME")
    QUICKTIME("_QUICKTIME"),
    @XmlEnumValue("_RTF")
    RTF("_RTF"),
    @XmlEnumValue("_SCSS")
    SCSS("_SCSS"),
    @XmlEnumValue("_SMS")
    SMS("_SMS"),
    @XmlEnumValue("_STYLESHEET")
    STYLESHEET("_STYLESHEET"),
    @XmlEnumValue("_SVG")
    SVG("_SVG"),
    @XmlEnumValue("_TAR")
    TAR("_TAR"),
    @XmlEnumValue("_TARCOMP")
    TARCOMP("_TARCOMP"),
    @XmlEnumValue("_TIFFIMAGE")
    TIFFIMAGE("_TIFFIMAGE"),
    @XmlEnumValue("_TTF")
    TTF("_TTF"),
    @XmlEnumValue("_VISIO")
    VISIO("_VISIO"),
    @XmlEnumValue("_WEBAPPPAGE")
    WEBAPPPAGE("_WEBAPPPAGE"),
    @XmlEnumValue("_WEBAPPSCRIPT")
    WEBAPPSCRIPT("_WEBAPPSCRIPT"),
    @XmlEnumValue("_WOFF")
    WOFF("_WOFF"),
    @XmlEnumValue("_WOFF2")
    WOFF_2("_WOFF2"),
    @XmlEnumValue("_WORD")
    WORD("_WORD"),
    @XmlEnumValue("_XMLDOC")
    XMLDOC("_XMLDOC"),
    @XmlEnumValue("_XSD")
    XSD("_XSD"),
    @XmlEnumValue("_ZIP")
    ZIP("_ZIP");
    private final String value;

    MediaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MediaType fromValue(String v) {
        for (MediaType c: MediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
