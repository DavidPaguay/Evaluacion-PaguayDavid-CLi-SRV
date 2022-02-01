package ups.edu.ec.evaluacion.bean;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ups.edu.ec.evaluacion.bussiness.VehiculosONLocal;
import ups.edu.ec.evaluacion.modelo.Vehiculo;
@WebService
public class ContactosSeviceSOAp {
	
	@Inject
	private VehiculosONLocal vehiLocal;
	
	@WebMethod
	public String crearVehi(Vehiculo vehi) {
		
		try {
			vehiLocal.insertar(vehi);
			
			return "ok";
		}catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
		
	}
	
	@WebMethod
	public  List<Vehiculo> getVehi(){
		
		return vehiLocal.getVehiculos();
	}
}
