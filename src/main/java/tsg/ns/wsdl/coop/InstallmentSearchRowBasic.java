
package tsg.ns.wsdl.coop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstallmentSearchRowBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstallmentSearchRowBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}SearchRowBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="amountPaid" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="amountRemaining" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="daysOverdue" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dueDate" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fxAmount" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fxAmountPaid" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fxAmountRemaining" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="installmentNumber" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="customFieldList" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnCustomFieldList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallmentSearchRowBasic", namespace = "urn:common_2022_2.platform.webservices.netsuite.com", propOrder = {
    "amount",
    "amountPaid",
    "amountRemaining",
    "daysOverdue",
    "dueDate",
    "fxAmount",
    "fxAmountPaid",
    "fxAmountRemaining",
    "installmentNumber",
    "status",
    "customFieldList"
})
public class InstallmentSearchRowBasic
    extends SearchRowBasic
{

    protected List<SearchColumnDoubleField> amount;
    protected List<SearchColumnDoubleField> amountPaid;
    protected List<SearchColumnDoubleField> amountRemaining;
    protected List<SearchColumnLongField> daysOverdue;
    protected List<SearchColumnDateField> dueDate;
    protected List<SearchColumnDoubleField> fxAmount;
    protected List<SearchColumnDoubleField> fxAmountPaid;
    protected List<SearchColumnDoubleField> fxAmountRemaining;
    protected List<SearchColumnLongField> installmentNumber;
    protected List<SearchColumnStringField> status;
    protected SearchColumnCustomFieldList customFieldList;

    /**
     * Gets the value of the amount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the amount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getAmount() {
        if (amount == null) {
            amount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.amount;
    }

    /**
     * Gets the value of the amountPaid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the amountPaid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountPaid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getAmountPaid() {
        if (amountPaid == null) {
            amountPaid = new ArrayList<SearchColumnDoubleField>();
        }
        return this.amountPaid;
    }

    /**
     * Gets the value of the amountRemaining property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the amountRemaining property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountRemaining().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getAmountRemaining() {
        if (amountRemaining == null) {
            amountRemaining = new ArrayList<SearchColumnDoubleField>();
        }
        return this.amountRemaining;
    }

    /**
     * Gets the value of the daysOverdue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the daysOverdue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaysOverdue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getDaysOverdue() {
        if (daysOverdue == null) {
            daysOverdue = new ArrayList<SearchColumnLongField>();
        }
        return this.daysOverdue;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dueDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDueDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getDueDate() {
        if (dueDate == null) {
            dueDate = new ArrayList<SearchColumnDateField>();
        }
        return this.dueDate;
    }

    /**
     * Gets the value of the fxAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fxAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFxAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getFxAmount() {
        if (fxAmount == null) {
            fxAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.fxAmount;
    }

    /**
     * Gets the value of the fxAmountPaid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fxAmountPaid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFxAmountPaid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getFxAmountPaid() {
        if (fxAmountPaid == null) {
            fxAmountPaid = new ArrayList<SearchColumnDoubleField>();
        }
        return this.fxAmountPaid;
    }

    /**
     * Gets the value of the fxAmountRemaining property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fxAmountRemaining property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFxAmountRemaining().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getFxAmountRemaining() {
        if (fxAmountRemaining == null) {
            fxAmountRemaining = new ArrayList<SearchColumnDoubleField>();
        }
        return this.fxAmountRemaining;
    }

    /**
     * Gets the value of the installmentNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the installmentNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstallmentNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getInstallmentNumber() {
        if (installmentNumber == null) {
            installmentNumber = new ArrayList<SearchColumnLongField>();
        }
        return this.installmentNumber;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getStatus() {
        if (status == null) {
            status = new ArrayList<SearchColumnStringField>();
        }
        return this.status;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link SearchColumnCustomFieldList }
     *     
     */
    public SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchColumnCustomFieldList }
     *     
     */
    public void setCustomFieldList(SearchColumnCustomFieldList value) {
        this.customFieldList = value;
    }

}
