
package tsg.ns.wsdl.coop;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "NetSuiteService", targetNamespace = "urn:platform_2022_2.webservices.netsuite.com", wsdlLocation = "https://webservices.netsuite.com/wsdl/v2022_2_0/netsuite.wsdl")
public class NetSuiteService
    extends Service
{

    private final static URL NETSUITESERVICE_WSDL_LOCATION;
    private final static WebServiceException NETSUITESERVICE_EXCEPTION;
    private final static QName NETSUITESERVICE_QNAME = new QName("urn:platform_2022_2.webservices.netsuite.com", "NetSuiteService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://webservices.netsuite.com/wsdl/v2022_2_0/netsuite.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NETSUITESERVICE_WSDL_LOCATION = url;
        NETSUITESERVICE_EXCEPTION = e;
    }

    public NetSuiteService() {
        super(__getWsdlLocation(), NETSUITESERVICE_QNAME);
    }

    public NetSuiteService(WebServiceFeature... features) {
        super(__getWsdlLocation(), NETSUITESERVICE_QNAME, features);
    }

    public NetSuiteService(URL wsdlLocation) {
        super(wsdlLocation, NETSUITESERVICE_QNAME);
    }

    public NetSuiteService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NETSUITESERVICE_QNAME, features);
    }

    public NetSuiteService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NetSuiteService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns NetSuitePortType
     */
    @WebEndpoint(name = "NetSuitePort")
    public NetSuitePortType getNetSuitePort() {
        return super.getPort(new QName("urn:platform_2022_2.webservices.netsuite.com", "NetSuitePort"), NetSuitePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NetSuitePortType
     */
    @WebEndpoint(name = "NetSuitePort")
    public NetSuitePortType getNetSuitePort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:platform_2022_2.webservices.netsuite.com", "NetSuitePort"), NetSuitePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NETSUITESERVICE_EXCEPTION!= null) {
            throw NETSUITESERVICE_EXCEPTION;
        }
        return NETSUITESERVICE_WSDL_LOCATION;
    }

}
