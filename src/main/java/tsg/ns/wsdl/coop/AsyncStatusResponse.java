
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsyncStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AsyncStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:core_2022_2.platform.webservices.netsuite.com}asyncStatusResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsyncStatusResponse", namespace = "urn:messages_2022_2.platform.webservices.netsuite.com", propOrder = {
    "asyncStatusResult"
})
public class AsyncStatusResponse {

    @XmlElement(namespace = "urn:core_2022_2.platform.webservices.netsuite.com", required = true)
    protected AsyncStatusResult asyncStatusResult;

    /**
     * Gets the value of the asyncStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link AsyncStatusResult }
     *     
     */
    public AsyncStatusResult getAsyncStatusResult() {
        return asyncStatusResult;
    }

    /**
     * Sets the value of the asyncStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsyncStatusResult }
     *     
     */
    public void setAsyncStatusResult(AsyncStatusResult value) {
        this.asyncStatusResult = value;
    }

}
