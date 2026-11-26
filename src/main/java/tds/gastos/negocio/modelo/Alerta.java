package tds.gastos.negocio.modelo;

import java.util.List;

public class Alerta {
	private double limite;
	//optional de la categoria
	
	private List<Notificacion> notificaciones; //podriamos porbar con un Conjunto en lugar de una lista
	private EstrategiaPeriodo periodo;
	
	public Alerta(double limite) {
		if(limite <= 0) throw new IllegalArgumentException("El limite de la alerta debe ser mayor que 0");
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public List<Notificacion> getNotificaciones() {
		return notificaciones;
	}

	public void setNotificaciones(List<Notificacion> notificaciones) {
		this.notificaciones = notificaciones;
	}
	
	
}
