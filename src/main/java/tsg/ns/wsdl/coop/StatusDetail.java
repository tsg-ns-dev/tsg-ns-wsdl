
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{urn:types.faults_2022_2.platform.webservices.netsuite.com}StatusDetailCodeType" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="afterSubmitFailed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" type="{urn:types.faults_2022_2.platform.webservices.netsuite.com}StatusDetailType" default="ERROR" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusDetail", namespace = "urn:core_2022_2.platform.webservices.netsuite.com", propOrder = {
    "code",
    "message",
    "afterSubmitFailed"
})
public class StatusDetail {

    @XmlSchemaType(name = "string")
    protected StatusDetailCodeType code;
    protected String message;
    protected Boolean afterSubmitFailed;
    @XmlAttribute(name = "type")
    protected StatusDetailType type;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDetailCodeType }
     *     
     */
    public StatusDetailCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetailCodeType }
     *     
     */
    public void setCode(StatusDetailCodeType value) {
        this.code = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the afterSubmitFailed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAfterSubmitFailed() {
        return afterSubmitFailed;
    }

    /**
     * Sets the value of the afterSubmitFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAfterSubmitFailed(Boolean value) {
        this.afterSubmitFailed = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDetailType }
     *     
     */
    public StatusDetailType getType() {
        if (type == null) {
            return StatusDetailType.ERROR;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetailType }
     *     
     */
    public void setType(StatusDetailType value) {
        this.type = value;
    }

}
