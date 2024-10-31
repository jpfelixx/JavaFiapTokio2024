package br.com.fiap.banco;

public class ContaPoupanca extends Conta {

	private double saldoAplicacao;

	@Override
	public void exibirSaldo() {
		
	}

	public ContaPoupanca(Cliente cliente, String nrConta, double saldo, double saldoAplicacao) {
		super(cliente, nrConta, saldo);
		this.saldoAplicacao = saldoAplicacao;
	}

	public double getSaldoAplicacao() {
		return saldoAplicacao;
	}

	public void setSaldoAplicacao(double saldoAplicacao) {
		this.saldoAplicacao = saldoAplicacao;
	}
	

}
