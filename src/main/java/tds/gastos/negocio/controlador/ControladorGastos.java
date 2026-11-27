package tds.gastos.negocio.controlador;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import tds.gastos.negocio.modelo.Gasto;
import tds.gastos.negocio.modelo.GastoIndividual;
import tds.gastos.negocio.modelo.Categoria;
//import java.time.YearMonth;

public class ControladorGastos {
	
	//TEMPORALMENTE, hasta que se creen los repositorios
	private List<Gasto> gastos;
	private Set<Categoria> categorias;
	
	// GASTOS
	public boolean registrarGasto(double cantidad, LocalDate fecha, String descripcion, Categoria categoria) {
		Gasto gasto = new GastoIndividual(cantidad, fecha, descripcion, categoria);
		return gastos.add(gasto);
		// ALERTA
	}

	public boolean eliminarGasto(Gasto gasto) {
		return gastos.remove(gasto);
	}

	public boolean editarGasto(Gasto gasto, double cantidad, LocalDate fecha, String descripcion, Categoria categoria) {
		gasto.setCantidad(cantidad);
		gasto.setCategoria(categoria);
		gasto.setDescripcion(descripcion);
		gasto.setFecha(fecha);
		return false;
		//ALERTA
	}
	
	public List<Gasto> getGastos() {
		return List.copyOf(gastos);
	}
	
	// CATEGORIAS
	public boolean registrarCategoria(String nombre) {
		Categoria categoria = new Categoria(nombre);
		return categorias.add(categoria);
	}
	public Set<Categoria> getCategorias() {
		return Set.copyOf(categorias);
	}
	// FILTROS
	public boolean filtrarGastos() {
		return false;
	}
	
}
