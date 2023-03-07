
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaycheckSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaycheckSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_2.platform.webservices.netsuite.com}PaycheckSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="employeeJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="payrollItemJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}PayrollItemSearchBasic" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaycheckSearch", namespace = "urn:employees_2022_2.transactions.webservices.netsuite.com", propOrder = {
    "basic",
    "employeeJoin",
    "payrollItemJoin"
})
public class PaycheckSearch
    extends SearchRecord
{

    protected PaycheckSearchBasic basic;
    protected EmployeeSearchBasic employeeJoin;
    protected PayrollItemSearchBasic payrollItemJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link PaycheckSearchBasic }
     *     
     */
    public PaycheckSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckSearchBasic }
     *     
     */
    public void setBasic(PaycheckSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the employeeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getEmployeeJoin() {
        return employeeJoin;
    }

    /**
     * Sets the value of the employeeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setEmployeeJoin(EmployeeSearchBasic value) {
        this.employeeJoin = value;
    }

    /**
     * Gets the value of the payrollItemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollItemSearchBasic }
     *     
     */
    public PayrollItemSearchBasic getPayrollItemJoin() {
        return payrollItemJoin;
    }

    /**
     * Sets the value of the payrollItemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollItemSearchBasic }
     *     
     */
    public void setPayrollItemJoin(PayrollItemSearchBasic value) {
        this.payrollItemJoin = value;
    }

}
