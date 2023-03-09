
package tsg.ns.wsdl.coop;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsageSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsageSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_2.platform.webservices.netsuite.com}UsageSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="chargeJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ChargeSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="customerJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="itemJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionPlanJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageSearch", namespace = "urn:sales_2022_2.transactions.webservices.netsuite.com", propOrder = {
    "basic",
    "chargeJoin",
    "customerJoin",
    "itemJoin",
    "subscriptionPlanJoin"
})
public class UsageSearch
    extends SearchRecord
{

    protected UsageSearchBasic basic;
    protected ChargeSearchBasic chargeJoin;
    protected CustomerSearchBasic customerJoin;
    protected ItemSearchBasic itemJoin;
    protected ItemSearchBasic subscriptionPlanJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link UsageSearchBasic }
     *     
     */
    public UsageSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageSearchBasic }
     *     
     */
    public void setBasic(UsageSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the chargeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeSearchBasic }
     *     
     */
    public ChargeSearchBasic getChargeJoin() {
        return chargeJoin;
    }

    /**
     * Sets the value of the chargeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeSearchBasic }
     *     
     */
    public void setChargeJoin(ChargeSearchBasic value) {
        this.chargeJoin = value;
    }

    /**
     * Gets the value of the customerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public CustomerSearchBasic getCustomerJoin() {
        return customerJoin;
    }

    /**
     * Sets the value of the customerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public void setCustomerJoin(CustomerSearchBasic value) {
        this.customerJoin = value;
    }

    /**
     * Gets the value of the itemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getItemJoin() {
        return itemJoin;
    }

    /**
     * Sets the value of the itemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setItemJoin(ItemSearchBasic value) {
        this.itemJoin = value;
    }

    /**
     * Gets the value of the subscriptionPlanJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getSubscriptionPlanJoin() {
        return subscriptionPlanJoin;
    }

    /**
     * Sets the value of the subscriptionPlanJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setSubscriptionPlanJoin(ItemSearchBasic value) {
        this.subscriptionPlanJoin = value;
    }

}
