
package com.netsuite.webservices.lists.relationships_2022_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2022_1.BillingAccountSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.BillingScheduleSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.ContactSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.CustomerSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.JobSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.ProjectTaskSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.ResourceAllocationSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.TaskSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.TimeBillSearchRowBasic;
import com.netsuite.webservices.platform.core_2022_1.SearchRow;


/**
 * <p>Java class for JobSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_1.platform.webservices.netsuite.com}JobSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="billingAccountJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}BillingAccountSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="billingScheduleJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}BillingScheduleSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="contactPrimaryJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}ContactSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="customerJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="projectManagerJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="projectTaskJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}ProjectTaskSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="resourceAllocationJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}ResourceAllocationSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="taskJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}TaskSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="timeJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}TimeBillSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="customSearchJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}CustomSearchRowBasic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobSearchRow", propOrder = {
    "basic",
    "billingAccountJoin",
    "billingScheduleJoin",
    "contactPrimaryJoin",
    "customerJoin",
    "projectManagerJoin",
    "projectTaskJoin",
    "resourceAllocationJoin",
    "taskJoin",
    "timeJoin",
    "customSearchJoin"
})
public class JobSearchRow
    extends SearchRow
{

    protected JobSearchRowBasic basic;
    protected BillingAccountSearchRowBasic billingAccountJoin;
    protected BillingScheduleSearchRowBasic billingScheduleJoin;
    protected ContactSearchRowBasic contactPrimaryJoin;
    protected CustomerSearchRowBasic customerJoin;
    protected EmployeeSearchRowBasic projectManagerJoin;
    protected ProjectTaskSearchRowBasic projectTaskJoin;
    protected ResourceAllocationSearchRowBasic resourceAllocationJoin;
    protected TaskSearchRowBasic taskJoin;
    protected TimeBillSearchRowBasic timeJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public JobSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public void setBasic(JobSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the billingAccountJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BillingAccountSearchRowBasic }
     *     
     */
    public BillingAccountSearchRowBasic getBillingAccountJoin() {
        return billingAccountJoin;
    }

    /**
     * Sets the value of the billingAccountJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAccountSearchRowBasic }
     *     
     */
    public void setBillingAccountJoin(BillingAccountSearchRowBasic value) {
        this.billingAccountJoin = value;
    }

    /**
     * Gets the value of the billingScheduleJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BillingScheduleSearchRowBasic }
     *     
     */
    public BillingScheduleSearchRowBasic getBillingScheduleJoin() {
        return billingScheduleJoin;
    }

    /**
     * Sets the value of the billingScheduleJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingScheduleSearchRowBasic }
     *     
     */
    public void setBillingScheduleJoin(BillingScheduleSearchRowBasic value) {
        this.billingScheduleJoin = value;
    }

    /**
     * Gets the value of the contactPrimaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public ContactSearchRowBasic getContactPrimaryJoin() {
        return contactPrimaryJoin;
    }

    /**
     * Sets the value of the contactPrimaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public void setContactPrimaryJoin(ContactSearchRowBasic value) {
        this.contactPrimaryJoin = value;
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
     * Gets the value of the projectManagerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getProjectManagerJoin() {
        return projectManagerJoin;
    }

    /**
     * Sets the value of the projectManagerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setProjectManagerJoin(EmployeeSearchRowBasic value) {
        this.projectManagerJoin = value;
    }

    /**
     * Gets the value of the projectTaskJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public ProjectTaskSearchRowBasic getProjectTaskJoin() {
        return projectTaskJoin;
    }

    /**
     * Sets the value of the projectTaskJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public void setProjectTaskJoin(ProjectTaskSearchRowBasic value) {
        this.projectTaskJoin = value;
    }

    /**
     * Gets the value of the resourceAllocationJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceAllocationSearchRowBasic }
     *     
     */
    public ResourceAllocationSearchRowBasic getResourceAllocationJoin() {
        return resourceAllocationJoin;
    }

    /**
     * Sets the value of the resourceAllocationJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceAllocationSearchRowBasic }
     *     
     */
    public void setResourceAllocationJoin(ResourceAllocationSearchRowBasic value) {
        this.resourceAllocationJoin = value;
    }

    /**
     * Gets the value of the taskJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TaskSearchRowBasic }
     *     
     */
    public TaskSearchRowBasic getTaskJoin() {
        return taskJoin;
    }

    /**
     * Sets the value of the taskJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSearchRowBasic }
     *     
     */
    public void setTaskJoin(TaskSearchRowBasic value) {
        this.taskJoin = value;
    }

    /**
     * Gets the value of the timeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TimeBillSearchRowBasic }
     *     
     */
    public TimeBillSearchRowBasic getTimeJoin() {
        return timeJoin;
    }

    /**
     * Sets the value of the timeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBillSearchRowBasic }
     *     
     */
    public void setTimeJoin(TimeBillSearchRowBasic value) {
        this.timeJoin = value;
    }

    /**
     * Gets the value of the customSearchJoin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customSearchJoin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomSearchJoin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomSearchRowBasic }
     * 
     * 
     */
    public List<CustomSearchRowBasic> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchRowBasic>();
        }
        return this.customSearchJoin;
    }

}
