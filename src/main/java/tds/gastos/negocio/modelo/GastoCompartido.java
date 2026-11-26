package tds.gastos.negocio.modelo;

import java.time.LocalDate;

public class GastoCompartido extends Gasto{

	private Persona pagador;
	
	public GastoCompartido(double cantidad, LocalDate fecha, String descripcion, Categoria categoria, Persona pagador) {
		super(cantidad, fecha, descripcion, categoria);
		
		if(pagador == null) throw new IllegalArgumentException("Debe existir un pagador");
		this.pagador = pagador;
	}

	public Persona getPagador() {
		return pagador;
	}

	public void setPagador(Persona pagador) {
		this.pagador = pagador;
	}

	
	
}
