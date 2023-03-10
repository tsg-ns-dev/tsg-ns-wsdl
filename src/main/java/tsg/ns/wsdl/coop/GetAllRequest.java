
package tsg.ns.wsdl.coop;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAllRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAllRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="record" type="{urn:core_2022_2.platform.webservices.netsuite.com}GetAllRecord"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllRequest", namespace = "urn:messages_2022_2.platform.webservices.netsuite.com", propOrder = {
    "record"
})
public class GetAllRequest {

    @XmlElement(required = true)
    protected GetAllRecord record;

    /**
     * Gets the value of the record property.
     * 
     * @return
     *     possible object is
     *     {@link GetAllRecord }
     *     
     */
    public GetAllRecord getRecord() {
        return record;
    }

    /**
     * Sets the value of the record property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAllRecord }
     *     
     */
    public void setRecord(GetAllRecord value) {
        this.record = value;
    }

}
