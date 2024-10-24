package br.com.fiap.banco;

public class MainConta {

	public static void main(String[] args) {

		
		Conta a = new Conta("Juan","12345678912","sp3091481",1);
		Conta b = new Conta("Mih","12342345332","sp3091481",12000);
		Conta c = new Conta("Jo","123458912","sp3091481",12000);
		
		System.out.println(a.ConsultarSaldo());
		System.out.println(b.ConsultarSaldo());
		System.out.println(c.ConsultarSaldo());
		
		a.TransferirSaldo(b,120.00);
		
		System.out.println(a.ConsultarSaldo());
		System.out.println(b.ConsultarSaldo());
		
		a.depositar(120.00);
		System.out.println(a.ConsultarSaldo());
		
		a.Sacar(120);
		System.out.println(a.ConsultarSaldo());

	}

}
