
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodDemandPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodDemandPlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="dayOfTheWeek" type="{urn:types.demandplanning_2022_2.transactions.webservices.netsuite.com}DayOfTheWeek" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodDemandPlan", namespace = "urn:demandplanning_2022_2.transactions.webservices.netsuite.com", propOrder = {
    "quantity",
    "dayOfTheWeek"
})
public class PeriodDemandPlan {

    protected double quantity;
    @XmlSchemaType(name = "string")
    protected DayOfTheWeek dayOfTheWeek;

    /**
     * Gets the value of the quantity property.
     * 
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(double value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the dayOfTheWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfTheWeek }
     *     
     */
    public DayOfTheWeek getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    /**
     * Sets the value of the dayOfTheWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfTheWeek }
     *     
     */
    public void setDayOfTheWeek(DayOfTheWeek value) {
        this.dayOfTheWeek = value;
    }

}
