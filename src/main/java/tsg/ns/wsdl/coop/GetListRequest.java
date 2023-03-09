
package tsg.ns.wsdl.coop;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetListRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="baseRef" type="{urn:core_2022_2.platform.webservices.netsuite.com}BaseRef" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetListRequest", namespace = "urn:messages_2022_2.platform.webservices.netsuite.com", propOrder = {
    "baseRef"
})
public class GetListRequest {

    @XmlElement(required = true)
    protected List<BaseRef> baseRef;

    /**
     * Gets the value of the baseRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseRef }
     * 
     * 
     */
    public List<BaseRef> getBaseRef() {
        if (baseRef == null) {
            baseRef = new ArrayList<BaseRef>();
        }
        return this.baseRef;
    }

}
