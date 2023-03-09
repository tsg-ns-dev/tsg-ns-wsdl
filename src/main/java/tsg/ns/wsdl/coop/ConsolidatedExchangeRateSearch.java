
package tsg.ns.wsdl.coop;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsolidatedExchangeRateSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsolidatedExchangeRateSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_2.platform.webservices.netsuite.com}ConsolidatedExchangeRateSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="fromSubsidiaryJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}SubsidiarySearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="periodJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}AccountingPeriodSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="toSubsidiaryJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}SubsidiarySearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="userJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsolidatedExchangeRateSearch", propOrder = {
    "basic",
    "fromSubsidiaryJoin",
    "periodJoin",
    "toSubsidiaryJoin",
    "userJoin"
})
public class ConsolidatedExchangeRateSearch
    extends SearchRecord
{

    protected ConsolidatedExchangeRateSearchBasic basic;
    protected SubsidiarySearchBasic fromSubsidiaryJoin;
    protected AccountingPeriodSearchBasic periodJoin;
    protected SubsidiarySearchBasic toSubsidiaryJoin;
    protected EmployeeSearchBasic userJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidatedExchangeRateSearchBasic }
     *     
     */
    public ConsolidatedExchangeRateSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidatedExchangeRateSearchBasic }
     *     
     */
    public void setBasic(ConsolidatedExchangeRateSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the fromSubsidiaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SubsidiarySearchBasic }
     *     
     */
    public SubsidiarySearchBasic getFromSubsidiaryJoin() {
        return fromSubsidiaryJoin;
    }

    /**
     * Sets the value of the fromSubsidiaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiarySearchBasic }
     *     
     */
    public void setFromSubsidiaryJoin(SubsidiarySearchBasic value) {
        this.fromSubsidiaryJoin = value;
    }

    /**
     * Gets the value of the periodJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingPeriodSearchBasic }
     *     
     */
    public AccountingPeriodSearchBasic getPeriodJoin() {
        return periodJoin;
    }

    /**
     * Sets the value of the periodJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingPeriodSearchBasic }
     *     
     */
    public void setPeriodJoin(AccountingPeriodSearchBasic value) {
        this.periodJoin = value;
    }

    /**
     * Gets the value of the toSubsidiaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SubsidiarySearchBasic }
     *     
     */
    public SubsidiarySearchBasic getToSubsidiaryJoin() {
        return toSubsidiaryJoin;
    }

    /**
     * Sets the value of the toSubsidiaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiarySearchBasic }
     *     
     */
    public void setToSubsidiaryJoin(SubsidiarySearchBasic value) {
        this.toSubsidiaryJoin = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchBasic value) {
        this.userJoin = value;
    }

}
