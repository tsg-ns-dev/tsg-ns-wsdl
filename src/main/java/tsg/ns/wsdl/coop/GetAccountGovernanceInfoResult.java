
package tsg.ns.wsdl.coop;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAccountGovernanceInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccountGovernanceInfoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:core_2022_2.platform.webservices.netsuite.com}status"/&gt;
 *         &lt;element name="accountConcurrencyLimit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="unallocatedConcurrencyLimit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccountGovernanceInfoResult", namespace = "urn:core_2022_2.platform.webservices.netsuite.com", propOrder = {
    "status",
    "accountConcurrencyLimit",
    "unallocatedConcurrencyLimit"
})
public class GetAccountGovernanceInfoResult {

    @XmlElement(required = true)
    protected Status status;
    protected Long accountConcurrencyLimit;
    protected Long unallocatedConcurrencyLimit;

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
     * Gets the value of the accountConcurrencyLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountConcurrencyLimit() {
        return accountConcurrencyLimit;
    }

    /**
     * Sets the value of the accountConcurrencyLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountConcurrencyLimit(Long value) {
        this.accountConcurrencyLimit = value;
    }

    /**
     * Gets the value of the unallocatedConcurrencyLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnallocatedConcurrencyLimit() {
        return unallocatedConcurrencyLimit;
    }

    /**
     * Sets the value of the unallocatedConcurrencyLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnallocatedConcurrencyLimit(Long value) {
        this.unallocatedConcurrencyLimit = value;
    }

}
