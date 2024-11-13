package br.com.fiap.jdbc.model;

public class areaAtuacao {
	private   long idArea;
	private  String  nome;
	

	public areaAtuacao() {
		super();
	}

	public areaAtuacao(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public long getIdArea() {
		return idArea;
	}

	public void setIdArea(long idArea) {
		this.idArea = idArea;
	}

	
	
	
}
