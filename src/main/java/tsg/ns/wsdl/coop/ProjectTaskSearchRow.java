
package tsg.ns.wsdl.coop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectTaskSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectTaskSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_2.platform.webservices.netsuite.com}ProjectTaskSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="jobJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}JobSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="predecessorJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ProjectTaskSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="projectTaskAssignmentJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ProjectTaskAssignmentSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="resourceAllocationJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ResourceAllocationSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="successorJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ProjectTaskSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="timeJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TimeBillSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="transactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="userJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="userNotesJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}NoteSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="customSearchJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}CustomSearchRowBasic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectTaskSearchRow", namespace = "urn:scheduling_2022_2.activities.webservices.netsuite.com", propOrder = {
    "basic",
    "jobJoin",
    "predecessorJoin",
    "projectTaskAssignmentJoin",
    "resourceAllocationJoin",
    "successorJoin",
    "timeJoin",
    "transactionJoin",
    "userJoin",
    "userNotesJoin",
    "customSearchJoin"
})
public class ProjectTaskSearchRow
    extends SearchRow
{

    protected ProjectTaskSearchRowBasic basic;
    protected JobSearchRowBasic jobJoin;
    protected ProjectTaskSearchRowBasic predecessorJoin;
    protected ProjectTaskAssignmentSearchRowBasic projectTaskAssignmentJoin;
    protected ResourceAllocationSearchRowBasic resourceAllocationJoin;
    protected ProjectTaskSearchRowBasic successorJoin;
    protected TimeBillSearchRowBasic timeJoin;
    protected TransactionSearchRowBasic transactionJoin;
    protected EmployeeSearchRowBasic userJoin;
    protected NoteSearchRowBasic userNotesJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public ProjectTaskSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public void setBasic(ProjectTaskSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the jobJoin property.
     * 
     * @return
     *     possible object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public JobSearchRowBasic getJobJoin() {
        return jobJoin;
    }

    /**
     * Sets the value of the jobJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public void setJobJoin(JobSearchRowBasic value) {
        this.jobJoin = value;
    }

    /**
     * Gets the value of the predecessorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public ProjectTaskSearchRowBasic getPredecessorJoin() {
        return predecessorJoin;
    }

    /**
     * Sets the value of the predecessorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public void setPredecessorJoin(ProjectTaskSearchRowBasic value) {
        this.predecessorJoin = value;
    }

    /**
     * Gets the value of the projectTaskAssignmentJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskAssignmentSearchRowBasic }
     *     
     */
    public ProjectTaskAssignmentSearchRowBasic getProjectTaskAssignmentJoin() {
        return projectTaskAssignmentJoin;
    }

    /**
     * Sets the value of the projectTaskAssignmentJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskAssignmentSearchRowBasic }
     *     
     */
    public void setProjectTaskAssignmentJoin(ProjectTaskAssignmentSearchRowBasic value) {
        this.projectTaskAssignmentJoin = value;
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
     * Gets the value of the successorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public ProjectTaskSearchRowBasic getSuccessorJoin() {
        return successorJoin;
    }

    /**
     * Sets the value of the successorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public void setSuccessorJoin(ProjectTaskSearchRowBasic value) {
        this.successorJoin = value;
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
     * Gets the value of the transactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * Sets the value of the transactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchRowBasic value) {
        this.transactionJoin = value;
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

    /**
     * Gets the value of the userNotesJoin property.
     * 
     * @return
     *     possible object is
     *     {@link NoteSearchRowBasic }
     *     
     */
    public NoteSearchRowBasic getUserNotesJoin() {
        return userNotesJoin;
    }

    /**
     * Sets the value of the userNotesJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteSearchRowBasic }
     *     
     */
    public void setUserNotesJoin(NoteSearchRowBasic value) {
        this.userNotesJoin = value;
    }

    /**
     * Gets the value of the customSearchJoin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
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
