package tds.gastos.negocio.modelo;

import java.time.LocalDate;

public class GastoIndividual extends Gasto{

	public GastoIndividual(double cantidad, LocalDate fecha, String descripcion, Categoria categoria) {
		super(cantidad, fecha, descripcion, categoria);
	}

}
