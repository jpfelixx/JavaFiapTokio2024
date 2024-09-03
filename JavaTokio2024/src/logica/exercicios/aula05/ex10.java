package logica.exercicios.aula05;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	System.out.println("Entre com a quantidade de anos");
	int anos = scan.nextInt();
	System.out.println("Entre com a quantidade de meses");
	int meses = scan.nextInt();
	System.out.println("Entre com a quantidade de dias");
	int dias = scan.nextInt();
	
	int diastotais = (dias +(anos*365)+(meses*30));
	System.out.println("Seus dias totais:"+diastotais);
	 scan.close();
	
	}
}
