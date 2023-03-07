
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StringDimensionRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StringDimensionRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}DimensionRef"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StringDimensionRef", namespace = "urn:core_2022_2.platform.webservices.netsuite.com", propOrder = {
    "value"
})
public class StringDimensionRef
    extends DimensionRef
{

    @XmlElement(required = true)
    protected String value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
