package tds.gastos.negocio.modelo;

import java.util.List;

public class Persona {
	
	private String nombre;
	private double porcentaje;
	
	private List<GastoCompartido> gastos;
	
	public Persona(String nombre, double porcentaje) {
		if(nombre.isBlank()) throw new IllegalArgumentException("El nombre de la persona no puede estar vacio");
		if(porcentaje<0 || porcentaje>1) throw new IllegalArgumentException("El porcentaje no puede ser mayor que 1 ni menor que 0");
		this.nombre = nombre;
		this.porcentaje = porcentaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public List<GastoCompartido> getGastos() {
		return gastos;
	}

	public void setGastos(List<GastoCompartido> gastos) {
		this.gastos = gastos;
	}
	
	
}
