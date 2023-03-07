
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attachTo" type="{urn:core_2022_2.platform.webservices.netsuite.com}BaseRef"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachReference", namespace = "urn:core_2022_2.platform.webservices.netsuite.com", propOrder = {
    "attachTo"
})
@XmlSeeAlso({
    AttachContactReference.class,
    AttachBasicReference.class
})
public abstract class AttachReference {

    @XmlElement(required = true)
    protected BaseRef attachTo;

    /**
     * Gets the value of the attachTo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseRef }
     *     
     */
    public BaseRef getAttachTo() {
        return attachTo;
    }

    /**
     * Sets the value of the attachTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRef }
     *     
     */
    public void setAttachTo(BaseRef value) {
        this.attachTo = value;
    }

}
