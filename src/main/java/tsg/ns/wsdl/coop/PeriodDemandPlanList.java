
package tsg.ns.wsdl.coop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodDemandPlanList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodDemandPlanList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="periodDemandPlan" type="{urn:demandplanning_2022_2.transactions.webservices.netsuite.com}PeriodDemandPlan" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodDemandPlanList", namespace = "urn:demandplanning_2022_2.transactions.webservices.netsuite.com", propOrder = {
    "periodDemandPlan"
})
public class PeriodDemandPlanList {

    protected List<PeriodDemandPlan> periodDemandPlan;

    /**
     * Gets the value of the periodDemandPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the periodDemandPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodDemandPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodDemandPlan }
     * 
     * 
     */
    public List<PeriodDemandPlan> getPeriodDemandPlan() {
        if (periodDemandPlan == null) {
            periodDemandPlan = new ArrayList<PeriodDemandPlan>();
        }
        return this.periodDemandPlan;
    }

}
