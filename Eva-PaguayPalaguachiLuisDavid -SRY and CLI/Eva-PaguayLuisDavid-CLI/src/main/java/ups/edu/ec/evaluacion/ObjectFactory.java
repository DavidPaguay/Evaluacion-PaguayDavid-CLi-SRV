
package ups.edu.ec.evaluacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ups.edu.ec.evaluacion package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CrearVehi_QNAME = new QName("http://bean.evaluacion.ec.edu.ups/", "crearVehi");
    private final static QName _CrearVehiResponse_QNAME = new QName("http://bean.evaluacion.ec.edu.ups/", "crearVehiResponse");
    private final static QName _GetVehi_QNAME = new QName("http://bean.evaluacion.ec.edu.ups/", "getVehi");
    private final static QName _GetVehiResponse_QNAME = new QName("http://bean.evaluacion.ec.edu.ups/", "getVehiResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ups.edu.ec.evaluacion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearVehi }
     * 
     */
    public CrearVehi createCrearVehi() {
        return new CrearVehi();
    }

    /**
     * Create an instance of {@link CrearVehiResponse }
     * 
     */
    public CrearVehiResponse createCrearVehiResponse() {
        return new CrearVehiResponse();
    }

    /**
     * Create an instance of {@link GetVehi }
     * 
     */
    public GetVehi createGetVehi() {
        return new GetVehi();
    }

    /**
     * Create an instance of {@link GetVehiResponse }
     * 
     */
    public GetVehiResponse createGetVehiResponse() {
        return new GetVehiResponse();
    }

    /**
     * Create an instance of {@link Vehiculo }
     * 
     */
    public Vehiculo createVehiculo() {
        return new Vehiculo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearVehi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearVehi }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.evaluacion.ec.edu.ups/", name = "crearVehi")
    public JAXBElement<CrearVehi> createCrearVehi(CrearVehi value) {
        return new JAXBElement<CrearVehi>(_CrearVehi_QNAME, CrearVehi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearVehiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearVehiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.evaluacion.ec.edu.ups/", name = "crearVehiResponse")
    public JAXBElement<CrearVehiResponse> createCrearVehiResponse(CrearVehiResponse value) {
        return new JAXBElement<CrearVehiResponse>(_CrearVehiResponse_QNAME, CrearVehiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetVehi }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.evaluacion.ec.edu.ups/", name = "getVehi")
    public JAXBElement<GetVehi> createGetVehi(GetVehi value) {
        return new JAXBElement<GetVehi>(_GetVehi_QNAME, GetVehi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetVehiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.evaluacion.ec.edu.ups/", name = "getVehiResponse")
    public JAXBElement<GetVehiResponse> createGetVehiResponse(GetVehiResponse value) {
        return new JAXBElement<GetVehiResponse>(_GetVehiResponse_QNAME, GetVehiResponse.class, null, value);
    }

}
