
package com.netsuite.webservices.lists.accounting_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2022_1.AccountingPeriodSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.ConsolidatedExchangeRateSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.SubsidiarySearchRowBasic;
import com.netsuite.webservices.platform.core_2022_1.SearchRow;


/**
 * <p>Java class for ConsolidatedExchangeRateSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsolidatedExchangeRateSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_1.platform.webservices.netsuite.com}ConsolidatedExchangeRateSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="fromSubsidiaryJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}SubsidiarySearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="periodJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}AccountingPeriodSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="toSubsidiaryJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}SubsidiarySearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="userJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsolidatedExchangeRateSearchRow", propOrder = {
    "basic",
    "fromSubsidiaryJoin",
    "periodJoin",
    "toSubsidiaryJoin",
    "userJoin"
})
public class ConsolidatedExchangeRateSearchRow
    extends SearchRow
{

    protected ConsolidatedExchangeRateSearchRowBasic basic;
    protected SubsidiarySearchRowBasic fromSubsidiaryJoin;
    protected AccountingPeriodSearchRowBasic periodJoin;
    protected SubsidiarySearchRowBasic toSubsidiaryJoin;
    protected EmployeeSearchRowBasic userJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidatedExchangeRateSearchRowBasic }
     *     
     */
    public ConsolidatedExchangeRateSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidatedExchangeRateSearchRowBasic }
     *     
     */
    public void setBasic(ConsolidatedExchangeRateSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the fromSubsidiaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SubsidiarySearchRowBasic }
     *     
     */
    public SubsidiarySearchRowBasic getFromSubsidiaryJoin() {
        return fromSubsidiaryJoin;
    }

    /**
     * Sets the value of the fromSubsidiaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiarySearchRowBasic }
     *     
     */
    public void setFromSubsidiaryJoin(SubsidiarySearchRowBasic value) {
        this.fromSubsidiaryJoin = value;
    }

    /**
     * Gets the value of the periodJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingPeriodSearchRowBasic }
     *     
     */
    public AccountingPeriodSearchRowBasic getPeriodJoin() {
        return periodJoin;
    }

    /**
     * Sets the value of the periodJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingPeriodSearchRowBasic }
     *     
     */
    public void setPeriodJoin(AccountingPeriodSearchRowBasic value) {
        this.periodJoin = value;
    }

    /**
     * Gets the value of the toSubsidiaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SubsidiarySearchRowBasic }
     *     
     */
    public SubsidiarySearchRowBasic getToSubsidiaryJoin() {
        return toSubsidiaryJoin;
    }

    /**
     * Sets the value of the toSubsidiaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiarySearchRowBasic }
     *     
     */
    public void setToSubsidiaryJoin(SubsidiarySearchRowBasic value) {
        this.toSubsidiaryJoin = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchRowBasic value) {
        this.userJoin = value;
    }

}
