
package com.netsuite.webservices.platform.messages_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:messages_2022_1.platform.webservices.netsuite.com}writeResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteResponse", propOrder = {
    "writeResponse"
})
public class DeleteResponse {

    @XmlElement(required = true)
    protected WriteResponse writeResponse;

    /**
     * Gets the value of the writeResponse property.
     * 
     * @return
     *     possible object is
     *     {@link WriteResponse }
     *     
     */
    public WriteResponse getWriteResponse() {
        return writeResponse;
    }

    /**
     * Sets the value of the writeResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link WriteResponse }
     *     
     */
    public void setWriteResponse(WriteResponse value) {
        this.writeResponse = value;
    }

}
