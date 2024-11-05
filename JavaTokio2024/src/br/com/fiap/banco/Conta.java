package br.com.fiap.banco;

//alt+shift+S --> Generate

public abstract class Conta {

	private Cliente cliente;
	private String nrConta;
	private double saldo;

	public Conta(Cliente cliente, String nrConta, double saldo) {
		super();
		this.cliente = cliente;
		this.nrConta = nrConta;
		this.saldo = saldo;
	}

	public abstract void exibirSaldo();

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

	public boolean Sacar(double vs) throws SaldoInsuficiente {

		if (this.saldo < vs) {
			 throw new SaldoInsuficiente("Saldo Superior ao saque");

		}
		else {

			this.saldo -= vs;
			return true;

		}

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double vs) {

		this.saldo += vs;
	}

	public double ConsultarSaldo() {

		return saldo;
	}

	public void TransferirSaldo(Conta b, double s) throws SaldoInsuficiente {
		if (this.ConsultarSaldo() < s)
			 throw new SaldoInsuficiente("Saldo Insuficiente");
		else {
			this.setSaldo(this.ConsultarSaldo() - s);
			b.setSaldo(b.ConsultarSaldo() + s);
		}

	}

}
