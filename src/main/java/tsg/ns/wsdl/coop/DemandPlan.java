
package tsg.ns.wsdl.coop;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DemandPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DemandPlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="calculatedQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="periodDemandPlanList" type="{urn:demandplanning_2022_2.transactions.webservices.netsuite.com}PeriodDemandPlanList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemandPlan", namespace = "urn:demandplanning_2022_2.transactions.webservices.netsuite.com", propOrder = {
    "startDate",
    "endDate",
    "calculatedQuantity",
    "periodDemandPlanList"
})
public class DemandPlan {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected Double calculatedQuantity;
    protected PeriodDemandPlanList periodDemandPlanList;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the calculatedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCalculatedQuantity() {
        return calculatedQuantity;
    }

    /**
     * Sets the value of the calculatedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCalculatedQuantity(Double value) {
        this.calculatedQuantity = value;
    }

    /**
     * Gets the value of the periodDemandPlanList property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodDemandPlanList }
     *     
     */
    public PeriodDemandPlanList getPeriodDemandPlanList() {
        return periodDemandPlanList;
    }

    /**
     * Sets the value of the periodDemandPlanList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodDemandPlanList }
     *     
     */
    public void setPeriodDemandPlanList(PeriodDemandPlanList value) {
        this.periodDemandPlanList = value;
    }

}
