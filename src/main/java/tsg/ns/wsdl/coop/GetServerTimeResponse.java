
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetServerTimeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetServerTimeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:core_2022_2.platform.webservices.netsuite.com}getServerTimeResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetServerTimeResponse", namespace = "urn:messages_2022_2.platform.webservices.netsuite.com", propOrder = {
    "getServerTimeResult"
})
public class GetServerTimeResponse {

    @XmlElement(namespace = "urn:core_2022_2.platform.webservices.netsuite.com", required = true)
    protected GetServerTimeResult getServerTimeResult;

    /**
     * Gets the value of the getServerTimeResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetServerTimeResult }
     *     
     */
    public GetServerTimeResult getGetServerTimeResult() {
        return getServerTimeResult;
    }

    /**
     * Sets the value of the getServerTimeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetServerTimeResult }
     *     
     */
    public void setGetServerTimeResult(GetServerTimeResult value) {
        this.getServerTimeResult = value;
    }

}
