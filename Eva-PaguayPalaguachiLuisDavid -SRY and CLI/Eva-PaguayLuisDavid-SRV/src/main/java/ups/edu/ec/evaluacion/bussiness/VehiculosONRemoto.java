package ups.edu.ec.evaluacion.bussiness;

import java.util.List;

import javax.ejb.Remote;

import ups.edu.ec.evaluacion.modelo.Vehiculo;

@Remote
public interface VehiculosONRemoto {

	public void insertar(Vehiculo p) throws Exception;
	
	public List<Vehiculo>getVehiculos();
}
