
package com.netsuite.webservices.platform.common_2022_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstallmentList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstallmentList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="installment" type="{urn:common_2022_1.platform.webservices.netsuite.com}Installment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="replaceAll" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallmentList", propOrder = {
    "installment"
})
public class InstallmentList {

    protected List<Installment> installment;
    @XmlAttribute(name = "replaceAll")
    protected Boolean replaceAll;

    /**
     * Gets the value of the installment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
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
     * {@link Installment }
     * 
     * 
     */
    public List<Installment> getInstallment() {
        if (installment == null) {
            installment = new ArrayList<Installment>();
        }
        return this.installment;
    }

    /**
     * Gets the value of the replaceAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReplaceAll() {
        if (replaceAll == null) {
            return true;
        } else {
            return replaceAll;
        }
    }

    /**
     * Sets the value of the replaceAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplaceAll(Boolean value) {
        this.replaceAll = value;
    }

}
