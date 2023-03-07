
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAsyncResultResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAsyncResultResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:messages_2022_2.platform.webservices.netsuite.com}asyncResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAsyncResultResponse", namespace = "urn:messages_2022_2.platform.webservices.netsuite.com", propOrder = {
    "asyncResult"
})
public class GetAsyncResultResponse {

    @XmlElement(required = true)
    protected AsyncResult asyncResult;

    /**
     * Gets the value of the asyncResult property.
     * 
     * @return
     *     possible object is
     *     {@link AsyncResult }
     *     
     */
    public AsyncResult getAsyncResult() {
        return asyncResult;
    }

    /**
     * Sets the value of the asyncResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsyncResult }
     *     
     */
    public void setAsyncResult(AsyncResult value) {
        this.asyncResult = value;
    }

}
