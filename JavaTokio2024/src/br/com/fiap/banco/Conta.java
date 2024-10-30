package br.com.fiap.banco;

//alt+shift+S --> Generate

public class Conta {


	private Cliente cliente;
	private String nrConta;
	private double saldo;
	
	

	public Conta(Cliente cliente, String nrConta, double saldo) {
		super();
		this.cliente = cliente;
		this.nrConta = nrConta;
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNrConta() {
		return nrConta;
	}

	public void setNrConta(String nrConta) {
		this.nrConta = nrConta;
	}

	public double getSaldo() {
		return saldo;
	}

	
	//adress mod

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
