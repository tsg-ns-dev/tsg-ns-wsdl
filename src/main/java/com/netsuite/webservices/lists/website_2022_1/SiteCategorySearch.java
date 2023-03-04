
package com.netsuite.webservices.lists.website_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2022_1.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2022_1.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2022_1.SiteCategorySearchBasic;
import com.netsuite.webservices.platform.core_2022_1.SearchRecord;


/**
 * <p>Java class for SiteCategorySearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteCategorySearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_1.platform.webservices.netsuite.com}SiteCategorySearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="shopperJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="userJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteCategorySearch", propOrder = {
    "basic",
    "shopperJoin",
    "userJoin"
})
public class SiteCategorySearch
    extends SearchRecord
{

    protected SiteCategorySearchBasic basic;
    protected CustomerSearchBasic shopperJoin;
    protected EmployeeSearchBasic userJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link SiteCategorySearchBasic }
     *     
     */
    public SiteCategorySearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCategorySearchBasic }
     *     
     */
    public void setBasic(SiteCategorySearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the shopperJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public CustomerSearchBasic getShopperJoin() {
        return shopperJoin;
    }

    /**
     * Sets the value of the shopperJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public void setShopperJoin(CustomerSearchBasic value) {
        this.shopperJoin = value;
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
