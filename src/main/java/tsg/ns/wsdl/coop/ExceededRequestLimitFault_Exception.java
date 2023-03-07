
package tsg.ns.wsdl.coop;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "exceededRequestLimitFault", targetNamespace = "urn:faults_2022_2.platform.webservices.netsuite.com")
public class ExceededRequestLimitFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ExceededRequestLimitFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ExceededRequestLimitFault_Exception(String message, ExceededRequestLimitFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ExceededRequestLimitFault_Exception(String message, ExceededRequestLimitFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: tsg.ns.wsdl.coop.ExceededRequestLimitFault
     */
    public ExceededRequestLimitFault getFaultInfo() {
        return faultInfo;
    }

}
