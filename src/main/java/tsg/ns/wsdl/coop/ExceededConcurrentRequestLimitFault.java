
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExceededConcurrentRequestLimitFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExceededConcurrentRequestLimitFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:faults_2022_2.platform.webservices.netsuite.com}SoapFault"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceededConcurrentRequestLimitFault", namespace = "urn:faults_2022_2.platform.webservices.netsuite.com")
public class ExceededConcurrentRequestLimitFault
    extends SoapFault
{


}
