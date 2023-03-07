
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:messages_2022_2.platform.webservices.netsuite.com}readResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetResponse", namespace = "urn:messages_2022_2.platform.webservices.netsuite.com", propOrder = {
    "readResponse"
})
public class GetResponse {

    @XmlElement(required = true)
    protected ReadResponse readResponse;

    /**
     * Gets the value of the readResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ReadResponse }
     *     
     */
    public ReadResponse getReadResponse() {
        return readResponse;
    }

    /**
     * Sets the value of the readResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadResponse }
     *     
     */
    public void setReadResponse(ReadResponse value) {
        this.readResponse = value;
    }

}