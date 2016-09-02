package cn.com.gome.dujia.ws.client.sap.pay;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "XI_0979ff68ffc73aa3b405101c6938909d_Service", targetNamespace = "URN:EC", wsdlLocation = "file:/D:/BS_EC_SI_IFI02_REQ.wsdl")
public class XI0979Ff68Ffc73Aa3B405101C6938909DService
    extends Service
{

    private final static URL XI0979FF68FFC73AA3B405101C6938909DSERVICE_WSDL_LOCATION;
    
    private final static WebServiceException XI0979FF68FFC73AA3B405101C6938909DSERVICE_EXCEPTION;
    
    private final static QName XI0979FF68FFC73AA3B405101C6938909DSERVICE_QNAME = new QName("URN:EC", "XI_0979ff68ffc73aa3b405101c6938909d_Service");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/BS_EC_SI_IFI02_REQ.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        XI0979FF68FFC73AA3B405101C6938909DSERVICE_WSDL_LOCATION = url;
        XI0979FF68FFC73AA3B405101C6938909DSERVICE_EXCEPTION = e;
    }

    public XI0979Ff68Ffc73Aa3B405101C6938909DService() {
        super(__getWsdlLocation(), XI0979FF68FFC73AA3B405101C6938909DSERVICE_QNAME);
    }

    public XI0979Ff68Ffc73Aa3B405101C6938909DService(WebServiceFeature... features) {
        super(__getWsdlLocation(), XI0979FF68FFC73AA3B405101C6938909DSERVICE_QNAME, features);
    }

    public XI0979Ff68Ffc73Aa3B405101C6938909DService(URL wsdlLocation) {
        super(wsdlLocation, XI0979FF68FFC73AA3B405101C6938909DSERVICE_QNAME);
    }

    public XI0979Ff68Ffc73Aa3B405101C6938909DService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, XI0979FF68FFC73AA3B405101C6938909DSERVICE_QNAME, features);
    }

    public XI0979Ff68Ffc73Aa3B405101C6938909DService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public XI0979Ff68Ffc73Aa3B405101C6938909DService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SIIFI02REQ
     */
    @WebEndpoint(name = "HTTP_Port")
    public SIIFI02REQ getHTTPPort() {
        return super.getPort(new QName("URN:EC", "HTTP_Port"), SIIFI02REQ.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SIIFI02REQ
     */
    @WebEndpoint(name = "HTTP_Port")
    public SIIFI02REQ getHTTPPort(WebServiceFeature... features) {
        return super.getPort(new QName("URN:EC", "HTTP_Port"), SIIFI02REQ.class, features);
    }

    /**
     * 
     * @return
     *     returns SIIFI02REQ
     */
    @WebEndpoint(name = "HTTPS_Port")
    public SIIFI02REQ getHTTPSPort() {
        return super.getPort(new QName("URN:EC", "HTTPS_Port"), SIIFI02REQ.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SIIFI02REQ
     */
    @WebEndpoint(name = "HTTPS_Port")
    public SIIFI02REQ getHTTPSPort(WebServiceFeature... features) {
        return super.getPort(new QName("URN:EC", "HTTPS_Port"), SIIFI02REQ.class, features);
    }

    private static URL __getWsdlLocation() {
        if (XI0979FF68FFC73AA3B405101C6938909DSERVICE_EXCEPTION!= null) {
            throw XI0979FF68FFC73AA3B405101C6938909DSERVICE_EXCEPTION;
        }
        return XI0979FF68FFC73AA3B405101C6938909DSERVICE_WSDL_LOCATION;
    }

}