package logica.exercicios.aula05;

import java.util.Scanner;

public class ex07 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor do produto");
		float valor = scan.nextFloat();
		System.out.println("Digite o valor do valor pago");
		float valorpago = scan.nextFloat();
		float troco= valorpago-valor;
		System.out.println("o seu troco é:"+troco);
	    scan.close();
	}
	
}
