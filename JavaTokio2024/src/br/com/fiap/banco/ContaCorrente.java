package br.com.fiap.banco;

import br.com.fiap.banco.Produtos.Produto;

public class ContaCorrente extends Conta  {

	private double saldoInvestimento;

	public ContaCorrente(Cliente cliente, String nrConta, double saldo) {
		super(cliente, nrConta, saldo);
		this.saldoInvestimento = 0;
	}

	public double getSaldoInvestimento() {
		return saldoInvestimento;
	}

	public void setSaldoInvestimento(double saldoInvestimento) {
		this.saldoInvestimento = saldoInvestimento;
	}

	@Override
	public void exibirSaldo() {
		System.out.println("Cliente:" + this.getCliente().getNome());
		System.out.println("Saldo:" + this.getSaldo());
		System.out.println("Saldo:" + this.saldoInvestimento);

	}

	public void investir(Produto produto, double valor) {
		if(this.Sacar(valor))
			this.saldoInvestimento+=produto.investir(valor);
		
		
	}



}
