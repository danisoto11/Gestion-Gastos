package tds.gastos.negocio.modelo;

public class Alerta {
	private double limite;
	//optional de la categoria
	
	private EstrategiaPeriodo periodo;
	private Categoria categoria;
	
	public Alerta(double limite, EstrategiaPeriodo periodo) {
		if(limite <= 0) throw new IllegalArgumentException("El limite de la alerta debe ser mayor que 0");
		this.limite = limite;
		this.periodo = periodo;
	}
	
	public Alerta(double limite, EstrategiaPeriodo periodo, Categoria categoria) {
		this(limite, periodo);
		if(categoria == null) throw new IllegalArgumentException("La categoría debe existir");
		this.categoria = categoria;
	}

	
	//Negocio
	
	
	//Getters and Setters
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public EstrategiaPeriodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(EstrategiaPeriodo periodo) {
		this.periodo = periodo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
