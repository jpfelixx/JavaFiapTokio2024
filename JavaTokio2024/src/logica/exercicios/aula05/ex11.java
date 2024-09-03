package logica.exercicios.aula05;

import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de dias");
		int diasvividos = scan.nextInt();
		
		 int anos,meses,dias;
		 
		 anos = diasvividos/365;
		 meses = (diasvividos%365)/30;
		 dias = (diasvividos%365)%30;
		 
		 System.out.println("anos: "+anos);
		 System.out.println("meses: "+meses);
		 System.out.println("dias: "+dias);
		 
		 scan.close();

		
	}
}
