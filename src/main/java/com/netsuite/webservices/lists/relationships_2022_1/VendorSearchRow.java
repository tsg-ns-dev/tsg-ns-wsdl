
package com.netsuite.webservices.lists.relationships_2022_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2022_1.AccountSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.CampaignSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.ContactSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.EntityTaxRegistrationSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.FileSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.LocationSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.MessageSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.MseSubsidiarySearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.NoteSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.VendorSearchRowBasic;
import com.netsuite.webservices.platform.core_2022_1.SearchRow;


/**
 * <p>Java class for VendorSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_1.platform.webservices.netsuite.com}VendorSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="accountJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}AccountSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="campaignResponseJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}CampaignSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="contactJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}ContactSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="contactPrimaryJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}ContactSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="expAccountJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}AccountSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="fileJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}FileSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="manufacturingLocationsJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}LocationSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="messagesJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}MessageSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="messagesFromJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}MessageSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="messagesToJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}MessageSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="mseSubsidiaryJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}MseSubsidiarySearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="taxRegistrationJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}EntityTaxRegistrationSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="timeApproverJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/&gt;
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
@XmlType(name = "VendorSearchRow", propOrder = {
    "basic",
    "accountJoin",
    "campaignResponseJoin",
    "contactJoin",
    "contactPrimaryJoin",
    "expAccountJoin",
    "fileJoin",
    "manufacturingLocationsJoin",
    "messagesJoin",
    "messagesFromJoin",
    "messagesToJoin",
    "mseSubsidiaryJoin",
    "taxRegistrationJoin",
    "timeApproverJoin",
    "transactionJoin",
    "userJoin",
    "userNotesJoin",
    "customSearchJoin"
})
public class VendorSearchRow
    extends SearchRow
{

    protected VendorSearchRowBasic basic;
    protected AccountSearchRowBasic accountJoin;
    protected CampaignSearchRowBasic campaignResponseJoin;
    protected ContactSearchRowBasic contactJoin;
    protected ContactSearchRowBasic contactPrimaryJoin;
    protected AccountSearchRowBasic expAccountJoin;
    protected FileSearchRowBasic fileJoin;
    protected LocationSearchRowBasic manufacturingLocationsJoin;
    protected MessageSearchRowBasic messagesJoin;
    protected MessageSearchRowBasic messagesFromJoin;
    protected MessageSearchRowBasic messagesToJoin;
    protected MseSubsidiarySearchRowBasic mseSubsidiaryJoin;
    protected EntityTaxRegistrationSearchRowBasic taxRegistrationJoin;
    protected EmployeeSearchRowBasic timeApproverJoin;
    protected TransactionSearchRowBasic transactionJoin;
    protected EmployeeSearchRowBasic userJoin;
    protected NoteSearchRowBasic userNotesJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public VendorSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public void setBasic(VendorSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the accountJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public AccountSearchRowBasic getAccountJoin() {
        return accountJoin;
    }

    /**
     * Sets the value of the accountJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public void setAccountJoin(AccountSearchRowBasic value) {
        this.accountJoin = value;
    }

    /**
     * Gets the value of the campaignResponseJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignSearchRowBasic }
     *     
     */
    public CampaignSearchRowBasic getCampaignResponseJoin() {
        return campaignResponseJoin;
    }

    /**
     * Sets the value of the campaignResponseJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSearchRowBasic }
     *     
     */
    public void setCampaignResponseJoin(CampaignSearchRowBasic value) {
        this.campaignResponseJoin = value;
    }

    /**
     * Gets the value of the contactJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public ContactSearchRowBasic getContactJoin() {
        return contactJoin;
    }

    /**
     * Sets the value of the contactJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public void setContactJoin(ContactSearchRowBasic value) {
        this.contactJoin = value;
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
     * Gets the value of the expAccountJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public AccountSearchRowBasic getExpAccountJoin() {
        return expAccountJoin;
    }

    /**
     * Sets the value of the expAccountJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public void setExpAccountJoin(AccountSearchRowBasic value) {
        this.expAccountJoin = value;
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
     * Gets the value of the manufacturingLocationsJoin property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public LocationSearchRowBasic getManufacturingLocationsJoin() {
        return manufacturingLocationsJoin;
    }

    /**
     * Sets the value of the manufacturingLocationsJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public void setManufacturingLocationsJoin(LocationSearchRowBasic value) {
        this.manufacturingLocationsJoin = value;
    }

    /**
     * Gets the value of the messagesJoin property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public MessageSearchRowBasic getMessagesJoin() {
        return messagesJoin;
    }

    /**
     * Sets the value of the messagesJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public void setMessagesJoin(MessageSearchRowBasic value) {
        this.messagesJoin = value;
    }

    /**
     * Gets the value of the messagesFromJoin property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public MessageSearchRowBasic getMessagesFromJoin() {
        return messagesFromJoin;
    }

    /**
     * Sets the value of the messagesFromJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public void setMessagesFromJoin(MessageSearchRowBasic value) {
        this.messagesFromJoin = value;
    }

    /**
     * Gets the value of the messagesToJoin property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public MessageSearchRowBasic getMessagesToJoin() {
        return messagesToJoin;
    }

    /**
     * Sets the value of the messagesToJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public void setMessagesToJoin(MessageSearchRowBasic value) {
        this.messagesToJoin = value;
    }

    /**
     * Gets the value of the mseSubsidiaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link MseSubsidiarySearchRowBasic }
     *     
     */
    public MseSubsidiarySearchRowBasic getMseSubsidiaryJoin() {
        return mseSubsidiaryJoin;
    }

    /**
     * Sets the value of the mseSubsidiaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link MseSubsidiarySearchRowBasic }
     *     
     */
    public void setMseSubsidiaryJoin(MseSubsidiarySearchRowBasic value) {
        this.mseSubsidiaryJoin = value;
    }

    /**
     * Gets the value of the taxRegistrationJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EntityTaxRegistrationSearchRowBasic }
     *     
     */
    public EntityTaxRegistrationSearchRowBasic getTaxRegistrationJoin() {
        return taxRegistrationJoin;
    }

    /**
     * Sets the value of the taxRegistrationJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityTaxRegistrationSearchRowBasic }
     *     
     */
    public void setTaxRegistrationJoin(EntityTaxRegistrationSearchRowBasic value) {
        this.taxRegistrationJoin = value;
    }

    /**
     * Gets the value of the timeApproverJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getTimeApproverJoin() {
        return timeApproverJoin;
    }

    /**
     * Sets the value of the timeApproverJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setTimeApproverJoin(EmployeeSearchRowBasic value) {
        this.timeApproverJoin = value;
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
