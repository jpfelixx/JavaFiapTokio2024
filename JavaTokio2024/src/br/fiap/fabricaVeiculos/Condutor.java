package br.fiap.fabricaVeiculos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Condutor {
	 private String nome;
	    private String nmrCarteira;
	    private String Telefone;
	    private Date dataNasc = new Date();
		public Condutor(String nome, String nmrCarteira, String telefone,String dataNas) {
			super();
			this.nome = nome;
			this.nmrCarteira = nmrCarteira;
			Telefone = telefone;
			SimpleDateFormat format = new  SimpleDateFormat("dd/MM/yyyy");
			try {
				this.setDataNasc(format.parse(dataNas));
			} catch (ParseException e) {
				System.err.println("Formato de data inválido"+dataNas);
				e.printStackTrace();
			}
		}
		
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNmrCarteira() {
			return nmrCarteira;
		}
		public void setNmrCarteira(String nmrCarteira) {
			this.nmrCarteira = nmrCarteira;
		}
		public String getTelefone() {
			return Telefone;
		}
		public void setTelefone(String telefone) {
			Telefone = telefone;
		}


		public Date getDataNasc() {
			return dataNasc;
		}


		public void setDataNasc(Date dataNasc) {
			this.dataNasc = dataNasc;
		}
	   
	    

}
