
package com.netsuite.webservices.platform.common_2022_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2022_1.SearchColumnDateField;
import com.netsuite.webservices.platform.core_2022_1.SearchColumnEnumSelectField;
import com.netsuite.webservices.platform.core_2022_1.SearchColumnSelectField;
import com.netsuite.webservices.platform.core_2022_1.SearchColumnStringField;
import com.netsuite.webservices.platform.core_2022_1.SearchRowBasic;


/**
 * <p>Java class for PaymentInstrumentSearchRowBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInstrumentSearchRowBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRowBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardBrand" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cardExpDate" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cardLastFourDigits" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cardTokenCardBrand" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cardTokenCardExpDate" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cardTokenExpDate" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cardTokenNameOnCard" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="default" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="entity" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="generalTokenExpirationDate" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="internalId" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lastFourDigits" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mask" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nameOnCard" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentInstrumentStateType" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentInstrumentType" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentMethod" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="preserveOnFile" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrumentSearchRowBasic", propOrder = {
    "cardBrand",
    "cardExpDate",
    "cardLastFourDigits",
    "cardTokenCardBrand",
    "cardTokenCardExpDate",
    "cardTokenExpDate",
    "cardTokenNameOnCard",
    "_default",
    "entity",
    "generalTokenExpirationDate",
    "internalId",
    "isInactive",
    "lastFourDigits",
    "mask",
    "nameOnCard",
    "paymentInstrumentStateType",
    "paymentInstrumentType",
    "paymentMethod",
    "preserveOnFile"
})
public class PaymentInstrumentSearchRowBasic
    extends SearchRowBasic
{

    protected List<SearchColumnStringField> cardBrand;
    protected List<SearchColumnDateField> cardExpDate;
    protected List<SearchColumnStringField> cardLastFourDigits;
    protected List<SearchColumnStringField> cardTokenCardBrand;
    protected List<SearchColumnDateField> cardTokenCardExpDate;
    protected List<SearchColumnDateField> cardTokenExpDate;
    protected List<SearchColumnStringField> cardTokenNameOnCard;
    @XmlElement(name = "default")
    protected List<SearchColumnStringField> _default;
    protected List<SearchColumnSelectField> entity;
    protected List<SearchColumnDateField> generalTokenExpirationDate;
    protected List<SearchColumnSelectField> internalId;
    protected List<SearchColumnStringField> isInactive;
    protected List<SearchColumnStringField> lastFourDigits;
    protected List<SearchColumnStringField> mask;
    protected List<SearchColumnStringField> nameOnCard;
    protected List<SearchColumnSelectField> paymentInstrumentStateType;
    protected List<SearchColumnEnumSelectField> paymentInstrumentType;
    protected List<SearchColumnSelectField> paymentMethod;
    protected List<SearchColumnStringField> preserveOnFile;

    /**
     * Gets the value of the cardBrand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardBrand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardBrand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCardBrand() {
        if (cardBrand == null) {
            cardBrand = new ArrayList<SearchColumnStringField>();
        }
        return this.cardBrand;
    }

    /**
     * Gets the value of the cardExpDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardExpDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardExpDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getCardExpDate() {
        if (cardExpDate == null) {
            cardExpDate = new ArrayList<SearchColumnDateField>();
        }
        return this.cardExpDate;
    }

    /**
     * Gets the value of the cardLastFourDigits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardLastFourDigits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardLastFourDigits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCardLastFourDigits() {
        if (cardLastFourDigits == null) {
            cardLastFourDigits = new ArrayList<SearchColumnStringField>();
        }
        return this.cardLastFourDigits;
    }

    /**
     * Gets the value of the cardTokenCardBrand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardTokenCardBrand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardTokenCardBrand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCardTokenCardBrand() {
        if (cardTokenCardBrand == null) {
            cardTokenCardBrand = new ArrayList<SearchColumnStringField>();
        }
        return this.cardTokenCardBrand;
    }

    /**
     * Gets the value of the cardTokenCardExpDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardTokenCardExpDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardTokenCardExpDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getCardTokenCardExpDate() {
        if (cardTokenCardExpDate == null) {
            cardTokenCardExpDate = new ArrayList<SearchColumnDateField>();
        }
        return this.cardTokenCardExpDate;
    }

    /**
     * Gets the value of the cardTokenExpDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardTokenExpDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardTokenExpDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getCardTokenExpDate() {
        if (cardTokenExpDate == null) {
            cardTokenExpDate = new ArrayList<SearchColumnDateField>();
        }
        return this.cardTokenExpDate;
    }

    /**
     * Gets the value of the cardTokenNameOnCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardTokenNameOnCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardTokenNameOnCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCardTokenNameOnCard() {
        if (cardTokenNameOnCard == null) {
            cardTokenNameOnCard = new ArrayList<SearchColumnStringField>();
        }
        return this.cardTokenNameOnCard;
    }

    /**
     * Gets the value of the default property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the default property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getDefault() {
        if (_default == null) {
            _default = new ArrayList<SearchColumnStringField>();
        }
        return this._default;
    }

    /**
     * Gets the value of the entity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getEntity() {
        if (entity == null) {
            entity = new ArrayList<SearchColumnSelectField>();
        }
        return this.entity;
    }

    /**
     * Gets the value of the generalTokenExpirationDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalTokenExpirationDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralTokenExpirationDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getGeneralTokenExpirationDate() {
        if (generalTokenExpirationDate == null) {
            generalTokenExpirationDate = new ArrayList<SearchColumnDateField>();
        }
        return this.generalTokenExpirationDate;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
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
     * returned list will be present inside the JAXB object.
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
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getIsInactive() {
        if (isInactive == null) {
            isInactive = new ArrayList<SearchColumnStringField>();
        }
        return this.isInactive;
    }

    /**
     * Gets the value of the lastFourDigits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastFourDigits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastFourDigits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getLastFourDigits() {
        if (lastFourDigits == null) {
            lastFourDigits = new ArrayList<SearchColumnStringField>();
        }
        return this.lastFourDigits;
    }

    /**
     * Gets the value of the mask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getMask() {
        if (mask == null) {
            mask = new ArrayList<SearchColumnStringField>();
        }
        return this.mask;
    }

    /**
     * Gets the value of the nameOnCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameOnCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameOnCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getNameOnCard() {
        if (nameOnCard == null) {
            nameOnCard = new ArrayList<SearchColumnStringField>();
        }
        return this.nameOnCard;
    }

    /**
     * Gets the value of the paymentInstrumentStateType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentInstrumentStateType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentInstrumentStateType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPaymentInstrumentStateType() {
        if (paymentInstrumentStateType == null) {
            paymentInstrumentStateType = new ArrayList<SearchColumnSelectField>();
        }
        return this.paymentInstrumentStateType;
    }

    /**
     * Gets the value of the paymentInstrumentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentInstrumentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentInstrumentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getPaymentInstrumentType() {
        if (paymentInstrumentType == null) {
            paymentInstrumentType = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.paymentInstrumentType;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPaymentMethod() {
        if (paymentMethod == null) {
            paymentMethod = new ArrayList<SearchColumnSelectField>();
        }
        return this.paymentMethod;
    }

    /**
     * Gets the value of the preserveOnFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preserveOnFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreserveOnFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPreserveOnFile() {
        if (preserveOnFile == null) {
            preserveOnFile = new ArrayList<SearchColumnStringField>();
        }
        return this.preserveOnFile;
    }

}
