package tds.gastos.negocio.modelo;

public class Categoria {
	private String nombre;
	
	
	public Categoria (String nombre) {
		if(nombre.isBlank()) throw new IllegalArgumentException("La categoria no puede ser vacía.");
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
