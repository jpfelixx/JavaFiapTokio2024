package br.com.fiap.banco.Mains;

import br.com.fiap.banco.Cliente;
import br.com.fiap.banco.ContaCorrente;
import br.com.fiap.banco.SaldoInsuficiente;

public class MainConta {

	public static void main(String[] args) {

		Cliente juan = new Cliente("juanito","12345678910");
		Cliente Mih = new Cliente("Millena","1012345623");
		ContaCorrente a = new ContaCorrente(juan,"1010101010",100.00);
		ContaCorrente b = new ContaCorrente(Mih,"121212121",100.00);

	
		System.out.println(a.ConsultarSaldo());
		System.out.println(b.ConsultarSaldo());
		
		try {
			a.TransferirSaldo(b,120.00);
		} catch (SaldoInsuficiente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(a.ConsultarSaldo());
		System.out.println(b.ConsultarSaldo());
		
		a.depositar(120.00);
		a.depositar(120.00);
		a.depositar(120.00);

		System.out.println(a.ConsultarSaldo());
		
		try {
			a.Sacar(120);
		} catch (SaldoInsuficiente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a.ConsultarSaldo());
		

		
		
	}

}
