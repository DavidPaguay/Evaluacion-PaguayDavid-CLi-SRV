package ups.edu.ec.evaluacion.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="TLB_Vehiculo")
public class Vehiculo {
	
	
	@Id
	@Column(name="vehi_id")
	private String placa;
	
	@Column(name="vehi_marca")
	private String marca;
	
	@Column(name="vehi_modelo")
	private String modelo;
	
	@Column(name="vehi_precio")
	private double precio;
	
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	

}
