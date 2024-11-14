package br.com.fiap.jdbc.model;

import java.sql.Date;

public class Candidato {

	private long idcandidato;
	private String nome;
	private String telefone;
	private String email;
	private String endereco;
	private String formacao;
	private Date data_nasc;
	private Genero genero;
	private float tempo_experiencia;
	private long idArea;

	public Candidato() {

	}

	public Candidato(String nome, String telefone, String email, String endereco, String formacao, Date data_nasc,
			Genero genero, float tempo_experiencia, long idArea) {

		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.formacao = formacao;
		this.data_nasc = data_nasc;
		this.genero = genero;
		this.tempo_experiencia = tempo_experiencia;
		this.idArea = idArea;
	}

	public long getIdcandidato() {
		return idcandidato;
	}

	public void setIdcandidato(long idcandidato) {
		this.idcandidato = idcandidato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public Date getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public float getTempo_experiencia() {
		return tempo_experiencia;
	}

	public void setTempo_experiencia(float tempo_experiencia) {
		this.tempo_experiencia = tempo_experiencia;
	}

	public long getIdArea() {
		return idArea;
	}

	public void setIdArea(long idArea) {
		this.idArea = idArea;
	}

}
