
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomizationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="getCustomizationType" type="{urn:types.core_2022_2.platform.webservices.netsuite.com}GetCustomizationType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationType", namespace = "urn:core_2022_2.platform.webservices.netsuite.com")
public class CustomizationType {

    @XmlAttribute(name = "getCustomizationType")
    protected GetCustomizationType getCustomizationType;

    /**
     * Gets the value of the getCustomizationType property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomizationType }
     *     
     */
    public GetCustomizationType getGetCustomizationType() {
        return getCustomizationType;
    }

    /**
     * Sets the value of the getCustomizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomizationType }
     *     
     */
    public void setGetCustomizationType(GetCustomizationType value) {
        this.getCustomizationType = value;
    }

}
