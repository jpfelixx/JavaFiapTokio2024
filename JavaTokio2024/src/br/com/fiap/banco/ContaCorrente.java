package br.com.fiap.banco;

public class ContaCorrente extends Conta{
private double saldoInvestimento;

public ContaCorrente(Cliente cliente, String nrConta, double saldo) {
	super(cliente, nrConta, saldo);
	// TODO Auto-generated constructor stub
}

public ContaCorrente(Cliente cliente, String nrConta, double saldo, double saldoInvestimento) {
	super(cliente, nrConta, saldo);
	this.saldoInvestimento = saldoInvestimento;
}

	
	
}
