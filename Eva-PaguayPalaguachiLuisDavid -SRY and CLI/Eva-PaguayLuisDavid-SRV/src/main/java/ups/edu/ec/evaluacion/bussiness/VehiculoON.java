package ups.edu.ec.evaluacion.bussiness;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.evaluacion.DAO.VehiculoDAO;
import ups.edu.ec.evaluacion.modelo.Vehiculo;



@Stateless
public class VehiculoON implements VehiculosONLocal{
	
	@Inject
	private VehiculoDAO daoVehiculo;

	public void insertar(Vehiculo p) throws Exception{
		daoVehiculo.insert(p);
	}
	
	public List<Vehiculo>getVehiculos(){
		
		return daoVehiculo.getList();
	}

}
