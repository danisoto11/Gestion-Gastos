package tds.gastos.negocio.modelo;

import java.time.LocalDate;

public class Notificacion {
	private LocalDate fecha;
	private String mensaje;
	private boolean leida;
	
	public Notificacion(LocalDate fecha, String mensaje) {
		if(mensaje.isBlank()) throw new IllegalArgumentException("El mensaje de la notificación no puede estar vacío");
		this.fecha = fecha;
		this.mensaje = mensaje;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public boolean isLeida() {
		return leida;
	}

	public void setLeida(boolean leida) {
		this.leida = leida;
	}
	
	
}
