
package tsg.ns.wsdl.coop;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetIntegrationGovernanceInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetIntegrationGovernanceInfoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:core_2022_2.platform.webservices.netsuite.com}status"/&gt;
 *         &lt;element name="integrationConcurrencyLimit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="limitType" type="{urn:types.core_2022_2.platform.webservices.netsuite.com}GetIntegrationGovernanceInfoLimitType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetIntegrationGovernanceInfoResult", namespace = "urn:core_2022_2.platform.webservices.netsuite.com", propOrder = {
    "status",
    "integrationConcurrencyLimit",
    "limitType"
})
public class GetIntegrationGovernanceInfoResult {

    @XmlElement(required = true)
    protected Status status;
    protected Long integrationConcurrencyLimit;
    @XmlSchemaType(name = "string")
    protected GetIntegrationGovernanceInfoLimitType limitType;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the integrationConcurrencyLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIntegrationConcurrencyLimit() {
        return integrationConcurrencyLimit;
    }

    /**
     * Sets the value of the integrationConcurrencyLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIntegrationConcurrencyLimit(Long value) {
        this.integrationConcurrencyLimit = value;
    }

    /**
     * Gets the value of the limitType property.
     * 
     * @return
     *     possible object is
     *     {@link GetIntegrationGovernanceInfoLimitType }
     *     
     */
    public GetIntegrationGovernanceInfoLimitType getLimitType() {
        return limitType;
    }

    /**
     * Sets the value of the limitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetIntegrationGovernanceInfoLimitType }
     *     
     */
    public void setLimitType(GetIntegrationGovernanceInfoLimitType value) {
        this.limitType = value;
    }

}
