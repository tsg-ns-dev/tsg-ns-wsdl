
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsageSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsageSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_2.platform.webservices.netsuite.com}UsageSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="chargeJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ChargeSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="customerJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="itemJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionPlanJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageSearchRow", namespace = "urn:sales_2022_2.transactions.webservices.netsuite.com", propOrder = {
    "basic",
    "chargeJoin",
    "customerJoin",
    "itemJoin",
    "subscriptionPlanJoin"
})
public class UsageSearchRow
    extends SearchRow
{

    protected UsageSearchRowBasic basic;
    protected ChargeSearchRowBasic chargeJoin;
    protected CustomerSearchRowBasic customerJoin;
    protected ItemSearchRowBasic itemJoin;
    protected ItemSearchRowBasic subscriptionPlanJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link UsageSearchRowBasic }
     *     
     */
    public UsageSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageSearchRowBasic }
     *     
     */
    public void setBasic(UsageSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the chargeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeSearchRowBasic }
     *     
     */
    public ChargeSearchRowBasic getChargeJoin() {
        return chargeJoin;
    }

    /**
     * Sets the value of the chargeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeSearchRowBasic }
     *     
     */
    public void setChargeJoin(ChargeSearchRowBasic value) {
        this.chargeJoin = value;
    }

    /**
     * Gets the value of the customerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public CustomerSearchRowBasic getCustomerJoin() {
        return customerJoin;
    }

    /**
     * Sets the value of the customerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public void setCustomerJoin(CustomerSearchRowBasic value) {
        this.customerJoin = value;
    }

    /**
     * Gets the value of the itemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getItemJoin() {
        return itemJoin;
    }

    /**
     * Sets the value of the itemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setItemJoin(ItemSearchRowBasic value) {
        this.itemJoin = value;
    }

    /**
     * Gets the value of the subscriptionPlanJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getSubscriptionPlanJoin() {
        return subscriptionPlanJoin;
    }

    /**
     * Sets the value of the subscriptionPlanJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setSubscriptionPlanJoin(ItemSearchRowBasic value) {
        this.subscriptionPlanJoin = value;
    }

}
