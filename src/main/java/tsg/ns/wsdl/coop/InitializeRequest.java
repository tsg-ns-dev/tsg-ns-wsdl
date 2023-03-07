
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitializeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitializeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="initializeRecord" type="{urn:core_2022_2.platform.webservices.netsuite.com}InitializeRecord"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitializeRequest", namespace = "urn:messages_2022_2.platform.webservices.netsuite.com", propOrder = {
    "initializeRecord"
})
public class InitializeRequest {

    @XmlElement(required = true)
    protected InitializeRecord initializeRecord;

    /**
     * Gets the value of the initializeRecord property.
     * 
     * @return
     *     possible object is
     *     {@link InitializeRecord }
     *     
     */
    public InitializeRecord getInitializeRecord() {
        return initializeRecord;
    }

    /**
     * Sets the value of the initializeRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitializeRecord }
     *     
     */
    public void setInitializeRecord(InitializeRecord value) {
        this.initializeRecord = value;
    }

}
