
package tsg.ns.wsdl.coop;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAccountGovernanceInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccountGovernanceInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:core_2022_2.platform.webservices.netsuite.com}getAccountGovernanceInfoResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccountGovernanceInfoResponse", namespace = "urn:messages_2022_2.platform.webservices.netsuite.com", propOrder = {
    "getAccountGovernanceInfoResult"
})
public class GetAccountGovernanceInfoResponse {

    @XmlElement(namespace = "urn:core_2022_2.platform.webservices.netsuite.com", required = true)
    protected GetAccountGovernanceInfoResult getAccountGovernanceInfoResult;

    /**
     * Gets the value of the getAccountGovernanceInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccountGovernanceInfoResult }
     *     
     */
    public GetAccountGovernanceInfoResult getGetAccountGovernanceInfoResult() {
        return getAccountGovernanceInfoResult;
    }

    /**
     * Sets the value of the getAccountGovernanceInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccountGovernanceInfoResult }
     *     
     */
    public void setGetAccountGovernanceInfoResult(GetAccountGovernanceInfoResult value) {
        this.getAccountGovernanceInfoResult = value;
    }

}
