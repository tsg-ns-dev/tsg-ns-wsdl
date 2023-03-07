
package tsg.ns.wsdl.coop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TermSearchRowBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TermSearchRowBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}SearchRowBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateDriven" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dayDiscountExpires" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dayOfMonthNetDue" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="daysUntilExpiry" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="daysUntilNetDue" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="discountPercent" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="discountPercentDateDriven" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dueNextMonthIfWithinDays" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="installment" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="internalId" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="preferred" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recurrenceCount" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recurrenceFrequency" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="repeatEvery" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="splitEvenly" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermSearchRowBasic", namespace = "urn:common_2022_2.platform.webservices.netsuite.com", propOrder = {
    "dateDriven",
    "dayDiscountExpires",
    "dayOfMonthNetDue",
    "daysUntilExpiry",
    "daysUntilNetDue",
    "discountPercent",
    "discountPercentDateDriven",
    "dueNextMonthIfWithinDays",
    "externalId",
    "installment",
    "internalId",
    "isInactive",
    "name",
    "preferred",
    "recurrenceCount",
    "recurrenceFrequency",
    "repeatEvery",
    "splitEvenly"
})
public class TermSearchRowBasic
    extends SearchRowBasic
{

    protected List<SearchColumnBooleanField> dateDriven;
    protected List<SearchColumnLongField> dayDiscountExpires;
    protected List<SearchColumnLongField> dayOfMonthNetDue;
    protected List<SearchColumnLongField> daysUntilExpiry;
    protected List<SearchColumnLongField> daysUntilNetDue;
    protected List<SearchColumnDoubleField> discountPercent;
    protected List<SearchColumnDoubleField> discountPercentDateDriven;
    protected List<SearchColumnLongField> dueNextMonthIfWithinDays;
    protected List<SearchColumnSelectField> externalId;
    protected List<SearchColumnBooleanField> installment;
    protected List<SearchColumnSelectField> internalId;
    protected List<SearchColumnBooleanField> isInactive;
    protected List<SearchColumnStringField> name;
    protected List<SearchColumnBooleanField> preferred;
    protected List<SearchColumnLongField> recurrenceCount;
    protected List<SearchColumnStringField> recurrenceFrequency;
    protected List<SearchColumnLongField> repeatEvery;
    protected List<SearchColumnBooleanField> splitEvenly;

    /**
     * Gets the value of the dateDriven property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dateDriven property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateDriven().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getDateDriven() {
        if (dateDriven == null) {
            dateDriven = new ArrayList<SearchColumnBooleanField>();
        }
        return this.dateDriven;
    }

    /**
     * Gets the value of the dayDiscountExpires property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dayDiscountExpires property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayDiscountExpires().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getDayDiscountExpires() {
        if (dayDiscountExpires == null) {
            dayDiscountExpires = new ArrayList<SearchColumnLongField>();
        }
        return this.dayDiscountExpires;
    }

    /**
     * Gets the value of the dayOfMonthNetDue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dayOfMonthNetDue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayOfMonthNetDue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getDayOfMonthNetDue() {
        if (dayOfMonthNetDue == null) {
            dayOfMonthNetDue = new ArrayList<SearchColumnLongField>();
        }
        return this.dayOfMonthNetDue;
    }

    /**
     * Gets the value of the daysUntilExpiry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the daysUntilExpiry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaysUntilExpiry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getDaysUntilExpiry() {
        if (daysUntilExpiry == null) {
            daysUntilExpiry = new ArrayList<SearchColumnLongField>();
        }
        return this.daysUntilExpiry;
    }

    /**
     * Gets the value of the daysUntilNetDue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the daysUntilNetDue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaysUntilNetDue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getDaysUntilNetDue() {
        if (daysUntilNetDue == null) {
            daysUntilNetDue = new ArrayList<SearchColumnLongField>();
        }
        return this.daysUntilNetDue;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the discountPercent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountPercent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getDiscountPercent() {
        if (discountPercent == null) {
            discountPercent = new ArrayList<SearchColumnDoubleField>();
        }
        return this.discountPercent;
    }

    /**
     * Gets the value of the discountPercentDateDriven property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the discountPercentDateDriven property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountPercentDateDriven().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getDiscountPercentDateDriven() {
        if (discountPercentDateDriven == null) {
            discountPercentDateDriven = new ArrayList<SearchColumnDoubleField>();
        }
        return this.discountPercentDateDriven;
    }

    /**
     * Gets the value of the dueNextMonthIfWithinDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dueNextMonthIfWithinDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDueNextMonthIfWithinDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getDueNextMonthIfWithinDays() {
        if (dueNextMonthIfWithinDays == null) {
            dueNextMonthIfWithinDays = new ArrayList<SearchColumnLongField>();
        }
        return this.dueNextMonthIfWithinDays;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the externalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getExternalId() {
        if (externalId == null) {
            externalId = new ArrayList<SearchColumnSelectField>();
        }
        return this.externalId;
    }

    /**
     * Gets the value of the installment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the installment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstallment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getInstallment() {
        if (installment == null) {
            installment = new ArrayList<SearchColumnBooleanField>();
        }
        return this.installment;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the internalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getInternalId() {
        if (internalId == null) {
            internalId = new ArrayList<SearchColumnSelectField>();
        }
        return this.internalId;
    }

    /**
     * Gets the value of the isInactive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the isInactive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsInactive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsInactive() {
        if (isInactive == null) {
            isInactive = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isInactive;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getName() {
        if (name == null) {
            name = new ArrayList<SearchColumnStringField>();
        }
        return this.name;
    }

    /**
     * Gets the value of the preferred property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the preferred property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferred().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getPreferred() {
        if (preferred == null) {
            preferred = new ArrayList<SearchColumnBooleanField>();
        }
        return this.preferred;
    }

    /**
     * Gets the value of the recurrenceCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the recurrenceCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurrenceCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getRecurrenceCount() {
        if (recurrenceCount == null) {
            recurrenceCount = new ArrayList<SearchColumnLongField>();
        }
        return this.recurrenceCount;
    }

    /**
     * Gets the value of the recurrenceFrequency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the recurrenceFrequency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurrenceFrequency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getRecurrenceFrequency() {
        if (recurrenceFrequency == null) {
            recurrenceFrequency = new ArrayList<SearchColumnStringField>();
        }
        return this.recurrenceFrequency;
    }

    /**
     * Gets the value of the repeatEvery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the repeatEvery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepeatEvery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getRepeatEvery() {
        if (repeatEvery == null) {
            repeatEvery = new ArrayList<SearchColumnLongField>();
        }
        return this.repeatEvery;
    }

    /**
     * Gets the value of the splitEvenly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the splitEvenly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplitEvenly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getSplitEvenly() {
        if (splitEvenly == null) {
            splitEvenly = new ArrayList<SearchColumnBooleanField>();
        }
        return this.splitEvenly;
    }

}
