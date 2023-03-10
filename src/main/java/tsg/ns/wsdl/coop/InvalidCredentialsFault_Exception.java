
package tsg.ns.wsdl.coop;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "invalidCredentialsFault", targetNamespace = "urn:faults_2022_2.platform.webservices.netsuite.com")
public class InvalidCredentialsFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidCredentialsFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public InvalidCredentialsFault_Exception(String message, InvalidCredentialsFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public InvalidCredentialsFault_Exception(String message, InvalidCredentialsFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: tsg.ns.wsdl.coop.InvalidCredentialsFault
     */
    public InvalidCredentialsFault getFaultInfo() {
        return faultInfo;
    }

}
