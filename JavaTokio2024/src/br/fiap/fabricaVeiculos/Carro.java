package br.fiap.fabricaVeiculos;

import br.com.fiap.banco.Conta;

public class Carro {

	private String marca;
	private String modelo;
	private String cor;
	private String anofabrica;
	private String anoModelo;
	private String renavam;
    private Motor motor;
	private String tipocambio;
	private String arosRodas;
	private double velocidade;
	private Condutor condutor;
	private boolean ligado;

	

	public Carro(String marca, String modelo, String cor, String anofabrica, String anoModelo, String renavam,
			Motor motor, String tipocambio, String arosRodas, double velocidade, Condutor condutor,
			boolean ligado) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.anofabrica = anofabrica;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.motor = motor;
		this.tipocambio = tipocambio;
		this.arosRodas = arosRodas;
		this.velocidade = velocidade;
		this.condutor = condutor;
		this.ligado = ligado;
	}
	

	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getAnofabrica() {
		return anofabrica;
	}


	public void setAnofabrica(String anofabrica) {
		this.anofabrica = anofabrica;
	}


	public String getAnoModelo() {
		return anoModelo;
	}


	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}


	public String getRenavam() {
		return renavam;
	}


	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}


	public Motor getMotor() {
		return motor;
	}


	public void setMotor(Motor motor) {
		this.motor = motor;
	}


	public String getTipocambio() {
		return tipocambio;
	}


	public void setTipocambio(String tipocambio) {
		this.tipocambio = tipocambio;
	}


	public String getArosRodas() {
		return arosRodas;
	}


	public void setArosRodas(String arosRodas) {
		this.arosRodas = arosRodas;
	}


	public double getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}


	public Condutor getCondutor() {
		return condutor;
	}


	public void setCondutor(Condutor condutor) {
		this.condutor = condutor;
	}


	public boolean isLigado() {
		return ligado;
	}


	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}


	public void acelerar(double ace, int tempo, int limite) {
		if (this.ligado) {
			if (ace <= limite) {
				this.velocidade += ace * tempo;
				System.out.println("velocidade é" + this.velocidade);
			} else
				System.out.println("Aceleracao passada é maior que o limite suportado");
		}

		else
			System.out.println("Deligue o carrito");

	}

	public void ligar() {
		this.ligado = true;

	}

	public void desligar() {
		if (this.velocidade == 0)
			this.ligado = false;

	}

	public void frear(double v) {
		if (this.velocidade > 0 && this.ligado == true) {
			System.out.println("Carro freando");
			if (this.velocidade >= v)
				this.velocidade -= v;
			else {
				System.out.println("Impossível frear mais, carro parado");
				this.velocidade = 0;

			}
				
		} else
			System.out.println("carro parado, n da para acelerar");

	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", anofabrica=" + anofabrica
				+ ", anoModelo=" + anoModelo + ", renavam=" + renavam + ", motor=" + motor + ", tipocambio="
				+ tipocambio + ", arosRodas=" + arosRodas + ", velocidade=" + velocidade + ", nomeCondutor="
				+ condutor.getNome() + ", ligado=" + ligado + "]";
	}

}
