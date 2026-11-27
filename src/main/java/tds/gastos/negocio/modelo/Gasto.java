package tds.gastos.negocio.modelo;

import java.time.LocalDate;

public abstract class Gasto {
	private double cantidad;
	private LocalDate fecha;
	private String descripcion;
	// private int id; -> mas adelante, para persistencia 
	
	private Categoria categoria;
	
	public Gasto(double cantidad, LocalDate fecha, String descripcion, Categoria categoria) {
		
		validarArgumentos(cantidad, fecha, descripcion, categoria);
		
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.categoria = categoria;
		this.descripcion = descripcion;
	}

	private void validarArgumentos(double cantidad, LocalDate fecha, String descripcion, Categoria categoria) {
		if(cantidad<=0) throw new IllegalArgumentException("El gasto debe ser mayor que 0");
		if(fecha==null) throw new IllegalArgumentException("La fecha no puede ser nula");
		// Asumimos que se pueden añadir gastos de fechas futuras (como pagos recurrentes, suscripciones, etc)
		if(categoria == null) throw new IllegalArgumentException("El gasto debe pertenecer a una categoría");
		if(descripcion == null) descripcion = "";
	}
	
	public void editarGasto(double cantidad, LocalDate fecha, String descripcion, Categoria categoria) {
		
		validarArgumentos(cantidad, fecha, descripcion, categoria);
		
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.categoria = categoria;
		this.descripcion = descripcion;
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
