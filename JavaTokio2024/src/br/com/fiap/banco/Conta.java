package br.com.fiap.banco;

//alt+shift+S --> Generate

public class Conta {

	private String nome;
	private String cpf;
	private String nrConta;
	private double saldo;

	public Conta(String nome, String cpf, String nrConta, double saldo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.nrConta = nrConta;
		this.saldo = saldo;
	}

	public void Sacar(double vs) {

		if (this.saldo < vs)
			System.out.println("Valor insuficiente no saldo para realizar tal operação");
		else {
			System.out.println("saque realizado com sucesso!");
			this.saldo -= vs;
		}

	}

	public void depositar(double vs) {

		this.saldo += vs;
	}

	public double ConsultarSaldo() {

		return saldo;
	}

	public void TransferirSaldo(Conta b, double s) {
		if (this.ConsultarSaldo() < s)
			System.out.println("Saldo insuficiente");
		else {
			this.setSaldo(this.ConsultarSaldo() - s);
			b.setSaldo(b.ConsultarSaldo() + s);
		}

		
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
