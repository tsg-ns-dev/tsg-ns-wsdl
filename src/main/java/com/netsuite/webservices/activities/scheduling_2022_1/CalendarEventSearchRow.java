
package com.netsuite.webservices.activities.scheduling_2022_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2022_1.CalendarEventSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.ContactSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.CustomerSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.EntitySearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.FileSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.NoteSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.OpportunitySearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.OriginatingLeadSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.SupportCaseSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.TimeBillSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.core_2022_1.SearchRow;


/**
 * <p>Java class for CalendarEventSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalendarEventSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_1.platform.webservices.netsuite.com}CalendarEventSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="attendeeJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}EntitySearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="attendeeContactJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}ContactSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="attendeeCustomerJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="caseJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}SupportCaseSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="fileJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}FileSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="opportunityJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}OpportunitySearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="originatingLeadJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}OriginatingLeadSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="timeJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}TimeBillSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="transactionJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="userJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="userNotesJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}NoteSearchRowBasic" minOccurs="0"/&gt;
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
@XmlType(name = "CalendarEventSearchRow", propOrder = {
    "basic",
    "attendeeJoin",
    "attendeeContactJoin",
    "attendeeCustomerJoin",
    "caseJoin",
    "fileJoin",
    "opportunityJoin",
    "originatingLeadJoin",
    "timeJoin",
    "transactionJoin",
    "userJoin",
    "userNotesJoin",
    "customSearchJoin"
})
public class CalendarEventSearchRow
    extends SearchRow
{

    protected CalendarEventSearchRowBasic basic;
    protected EntitySearchRowBasic attendeeJoin;
    protected ContactSearchRowBasic attendeeContactJoin;
    protected CustomerSearchRowBasic attendeeCustomerJoin;
    protected SupportCaseSearchRowBasic caseJoin;
    protected FileSearchRowBasic fileJoin;
    protected OpportunitySearchRowBasic opportunityJoin;
    protected OriginatingLeadSearchRowBasic originatingLeadJoin;
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
     *     {@link CalendarEventSearchRowBasic }
     *     
     */
    public CalendarEventSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventSearchRowBasic }
     *     
     */
    public void setBasic(CalendarEventSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the attendeeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EntitySearchRowBasic }
     *     
     */
    public EntitySearchRowBasic getAttendeeJoin() {
        return attendeeJoin;
    }

    /**
     * Sets the value of the attendeeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitySearchRowBasic }
     *     
     */
    public void setAttendeeJoin(EntitySearchRowBasic value) {
        this.attendeeJoin = value;
    }

    /**
     * Gets the value of the attendeeContactJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public ContactSearchRowBasic getAttendeeContactJoin() {
        return attendeeContactJoin;
    }

    /**
     * Sets the value of the attendeeContactJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public void setAttendeeContactJoin(ContactSearchRowBasic value) {
        this.attendeeContactJoin = value;
    }

    /**
     * Gets the value of the attendeeCustomerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public CustomerSearchRowBasic getAttendeeCustomerJoin() {
        return attendeeCustomerJoin;
    }

    /**
     * Sets the value of the attendeeCustomerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public void setAttendeeCustomerJoin(CustomerSearchRowBasic value) {
        this.attendeeCustomerJoin = value;
    }

    /**
     * Gets the value of the caseJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SupportCaseSearchRowBasic }
     *     
     */
    public SupportCaseSearchRowBasic getCaseJoin() {
        return caseJoin;
    }

    /**
     * Sets the value of the caseJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportCaseSearchRowBasic }
     *     
     */
    public void setCaseJoin(SupportCaseSearchRowBasic value) {
        this.caseJoin = value;
    }

    /**
     * Gets the value of the fileJoin property.
     * 
     * @return
     *     possible object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public FileSearchRowBasic getFileJoin() {
        return fileJoin;
    }

    /**
     * Sets the value of the fileJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public void setFileJoin(FileSearchRowBasic value) {
        this.fileJoin = value;
    }

    /**
     * Gets the value of the opportunityJoin property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunitySearchRowBasic }
     *     
     */
    public OpportunitySearchRowBasic getOpportunityJoin() {
        return opportunityJoin;
    }

    /**
     * Sets the value of the opportunityJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunitySearchRowBasic }
     *     
     */
    public void setOpportunityJoin(OpportunitySearchRowBasic value) {
        this.opportunityJoin = value;
    }

    /**
     * Gets the value of the originatingLeadJoin property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatingLeadSearchRowBasic }
     *     
     */
    public OriginatingLeadSearchRowBasic getOriginatingLeadJoin() {
        return originatingLeadJoin;
    }

    /**
     * Sets the value of the originatingLeadJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatingLeadSearchRowBasic }
     *     
     */
    public void setOriginatingLeadJoin(OriginatingLeadSearchRowBasic value) {
        this.originatingLeadJoin = value;
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
