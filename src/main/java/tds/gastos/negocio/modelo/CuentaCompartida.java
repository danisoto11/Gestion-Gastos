package tds.gastos.negocio.modelo;

import java.util.List;

public class CuentaCompartida {
	private String nombre;
	List<Persona> participantes;
	List<GastoCompartido> gastos;
	
	public CuentaCompartida(String nombre, List<Persona> participantes) {
		if(nombre.isBlank()) throw new IllegalArgumentException("La cuenta debe tener un nombre");
		if(participantes.isEmpty()) throw new IllegalArgumentException("Los participantes de la cuenta no pueden ser 0");
		if(participantes.size()<2) throw new IllegalArgumentException("El número de participantes de la cuenta debe ser mayor o igual a 2");
		this.nombre = nombre;
		this.participantes = participantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Persona> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<Persona> participantes) {
		this.participantes = participantes;
	}

	public List<GastoCompartido> getGastos() {
		return gastos;
	}

	public void setGastos(List<GastoCompartido> gastos) {
		this.gastos = gastos;
	}
	
	
}
