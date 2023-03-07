
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangePasswordResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangePasswordResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:messages_2022_2.platform.webservices.netsuite.com}sessionResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangePasswordResponse", namespace = "urn:messages_2022_2.platform.webservices.netsuite.com", propOrder = {
    "sessionResponse"
})
public class ChangePasswordResponse {

    @XmlElement(required = true)
    protected SessionResponse sessionResponse;

    /**
     * Gets the value of the sessionResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SessionResponse }
     *     
     */
    public SessionResponse getSessionResponse() {
        return sessionResponse;
    }

    /**
     * Sets the value of the sessionResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionResponse }
     *     
     */
    public void setSessionResponse(SessionResponse value) {
        this.sessionResponse = value;
    }

}