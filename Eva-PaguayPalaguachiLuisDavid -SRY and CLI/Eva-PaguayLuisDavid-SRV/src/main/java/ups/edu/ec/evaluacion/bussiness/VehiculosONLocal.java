package ups.edu.ec.evaluacion.bussiness;

import java.util.List;

import javax.ejb.Local;

import ups.edu.ec.evaluacion.modelo.Vehiculo;

@Local
public interface VehiculosONLocal {

	public void insertar(Vehiculo p) throws Exception;
	
	public List<Vehiculo>getVehiculos();
}
