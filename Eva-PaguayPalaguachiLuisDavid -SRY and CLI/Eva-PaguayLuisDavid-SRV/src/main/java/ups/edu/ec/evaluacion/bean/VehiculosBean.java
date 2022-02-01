package ups.edu.ec.evaluacion.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import ups.edu.ec.evaluacion.modelo.Vehiculo;


public class VehiculosBean {

	
	@Inject
	private ups.edu.ec.evaluacion.bussiness.VehiculosONLocal cliLocal;
	

	private String cedula;
	private Vehiculo Vehiculo = new Vehiculo();
	private List<Vehiculo> Vehiculos;
	
	public VehiculosBean() {
		
	}
	
	@PostConstruct
	public void init () {
		this.getVehiculos();
	}
	
	public List<Vehiculo> getVehiculos() {
		return Vehiculos;
	}
	
	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Vehiculo getVehiculo() {
		return Vehiculo;
	}
	public void setVehiculo(Vehiculo Vehiculo) {
		this.Vehiculo = Vehiculo;
	}
	
	public void setVehiculos(List<Vehiculo> Vehiculos) {
		this.Vehiculos = Vehiculos;
	}
	
	


}
