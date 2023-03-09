
package tsg.ns.wsdl.coop;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetIntegrationGovernanceInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetIntegrationGovernanceInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:core_2022_2.platform.webservices.netsuite.com}getIntegrationGovernanceInfoResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetIntegrationGovernanceInfoResponse", namespace = "urn:messages_2022_2.platform.webservices.netsuite.com", propOrder = {
    "getIntegrationGovernanceInfoResult"
})
public class GetIntegrationGovernanceInfoResponse {

    @XmlElement(namespace = "urn:core_2022_2.platform.webservices.netsuite.com", required = true)
    protected GetIntegrationGovernanceInfoResult getIntegrationGovernanceInfoResult;

    /**
     * Gets the value of the getIntegrationGovernanceInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetIntegrationGovernanceInfoResult }
     *     
     */
    public GetIntegrationGovernanceInfoResult getGetIntegrationGovernanceInfoResult() {
        return getIntegrationGovernanceInfoResult;
    }

    /**
     * Sets the value of the getIntegrationGovernanceInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetIntegrationGovernanceInfoResult }
     *     
     */
    public void setGetIntegrationGovernanceInfoResult(GetIntegrationGovernanceInfoResult value) {
        this.getIntegrationGovernanceInfoResult = value;
    }

}
