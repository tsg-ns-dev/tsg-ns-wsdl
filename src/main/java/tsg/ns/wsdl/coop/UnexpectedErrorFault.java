
package tsg.ns.wsdl.coop;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnexpectedErrorFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnexpectedErrorFault"&gt;
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
@XmlType(name = "UnexpectedErrorFault", namespace = "urn:faults_2022_2.platform.webservices.netsuite.com")
public class UnexpectedErrorFault
    extends SoapFault
{


}
