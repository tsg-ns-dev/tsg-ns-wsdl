
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsyncInitializeListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AsyncInitializeListResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:messages_2022_2.platform.webservices.netsuite.com}AsyncResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:messages_2022_2.platform.webservices.netsuite.com}readResponseList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsyncInitializeListResult", namespace = "urn:messages_2022_2.platform.webservices.netsuite.com", propOrder = {
    "readResponseList"
})
public class AsyncInitializeListResult
    extends AsyncResult
{

    @XmlElement(required = true)
    protected ReadResponseList readResponseList;

    /**
     * Gets the value of the readResponseList property.
     * 
     * @return
     *     possible object is
     *     {@link ReadResponseList }
     *     
     */
    public ReadResponseList getReadResponseList() {
        return readResponseList;
    }

    /**
     * Sets the value of the readResponseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadResponseList }
     *     
     */
    public void setReadResponseList(ReadResponseList value) {
        this.readResponseList = value;
    }

}
