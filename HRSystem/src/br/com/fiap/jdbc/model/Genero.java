package br.com.fiap.jdbc.model;

public enum Genero {

	feminino("F"), masculino("M"), outro("O");

	private final String codigo;

	Genero(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public static Genero fromCodigo(String codigo) {
		for(Genero genero : Genero.values()) {
			if(genero.getCodigo().equalsIgnoreCase(codigo))
			return genero;
		}
		throw new IllegalArgumentException("Código de gênero inválido");
	}
 
}