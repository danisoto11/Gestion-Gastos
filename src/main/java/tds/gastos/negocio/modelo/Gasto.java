package tds.gastos.negocio.modelo;

import java.time.LocalDate;

public abstract class Gasto {
	private double cantidad;
	private LocalDate fecha;
	private String descripcion;
	
	private Categoria categoria;
	
	public Gasto(double cantidad, LocalDate fecha, String descripcion, Categoria categoria) {
		
		if(cantidad<=0) throw new IllegalArgumentException("Un gasto no puede ser menor que 0");
		LocalDate fechaActual = LocalDate.now();
		if(fecha.isAfter(fechaActual)) throw new IllegalArgumentException("La fecha del gasto (" + fecha +") es posterior a la actual (" + fechaActual +")");
		if(categoria == null) throw new IllegalArgumentException("El gasto debe pertenecer a una categoría");
		
		
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.categoria = categoria;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
