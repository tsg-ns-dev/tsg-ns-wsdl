
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSelectValueResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSelectValueResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:core_2022_2.platform.webservices.netsuite.com}getSelectValueResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSelectValueResponse", namespace = "urn:messages_2022_2.platform.webservices.netsuite.com", propOrder = {
    "getSelectValueResult"
})
public class GetSelectValueResponse {

    @XmlElement(namespace = "urn:core_2022_2.platform.webservices.netsuite.com", required = true)
    protected GetSelectValueResult getSelectValueResult;

    /**
     * Gets the value of the getSelectValueResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetSelectValueResult }
     *     
     */
    public GetSelectValueResult getGetSelectValueResult() {
        return getSelectValueResult;
    }

    /**
     * Sets the value of the getSelectValueResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSelectValueResult }
     *     
     */
    public void setGetSelectValueResult(GetSelectValueResult value) {
        this.getSelectValueResult = value;
    }

}
