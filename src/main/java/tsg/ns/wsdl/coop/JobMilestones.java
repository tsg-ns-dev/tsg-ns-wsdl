
package tsg.ns.wsdl.coop;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobMilestones complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobMilestones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="milestoneName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="milestoneOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="milestoneEstComplete" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="milestoneCompleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="milestoneComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobMilestones", namespace = "urn:relationships_2022_2.lists.webservices.netsuite.com", propOrder = {
    "milestoneName",
    "milestoneOrder",
    "milestoneEstComplete",
    "milestoneCompleted",
    "milestoneComments"
})
public class JobMilestones {

    protected String milestoneName;
    protected String milestoneOrder;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar milestoneEstComplete;
    protected Boolean milestoneCompleted;
    protected String milestoneComments;

    /**
     * Gets the value of the milestoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilestoneName() {
        return milestoneName;
    }

    /**
     * Sets the value of the milestoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilestoneName(String value) {
        this.milestoneName = value;
    }

    /**
     * Gets the value of the milestoneOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilestoneOrder() {
        return milestoneOrder;
    }

    /**
     * Sets the value of the milestoneOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilestoneOrder(String value) {
        this.milestoneOrder = value;
    }

    /**
     * Gets the value of the milestoneEstComplete property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMilestoneEstComplete() {
        return milestoneEstComplete;
    }

    /**
     * Sets the value of the milestoneEstComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMilestoneEstComplete(XMLGregorianCalendar value) {
        this.milestoneEstComplete = value;
    }

    /**
     * Gets the value of the milestoneCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMilestoneCompleted() {
        return milestoneCompleted;
    }

    /**
     * Sets the value of the milestoneCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMilestoneCompleted(Boolean value) {
        this.milestoneCompleted = value;
    }

    /**
     * Gets the value of the milestoneComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilestoneComments() {
        return milestoneComments;
    }

    /**
     * Sets the value of the milestoneComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilestoneComments(String value) {
        this.milestoneComments = value;
    }

}
