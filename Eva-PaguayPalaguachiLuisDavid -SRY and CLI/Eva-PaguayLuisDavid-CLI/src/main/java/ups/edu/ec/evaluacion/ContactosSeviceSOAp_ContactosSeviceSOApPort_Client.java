
package ups.edu.ec.evaluacion;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-02-01T13:34:16.255-05:00
 * Generated source version: 3.5.0
 *
 */
public final class ContactosSeviceSOAp_ContactosSeviceSOApPort_Client {

    private static final QName SERVICE_NAME = new QName("http://bean.evaluacion.ec.edu.ups/", "ContactosSeviceSOApService");

    private ContactosSeviceSOAp_ContactosSeviceSOApPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ContactosSeviceSOApService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        ContactosSeviceSOApService ss = new ContactosSeviceSOApService(wsdlURL, SERVICE_NAME);
        ContactosSeviceSOAp port = ss.getContactosSeviceSOApPort();

        {
        System.out.println("Invoking crearVehi...");
        ups.edu.ec.evaluacion.Vehiculo _crearVehi_arg0 = null;
        java.lang.String _crearVehi__return = port.crearVehi(_crearVehi_arg0);
        System.out.println("crearVehi.result=" + _crearVehi__return);


        }
        {
        System.out.println("Invoking getVehi...");
        java.util.List<ups.edu.ec.evaluacion.Vehiculo> _getVehi__return = port.getVehi();
        System.out.println("getVehi.result=" + _getVehi__return);


        }

        System.exit(0);
    }

}
