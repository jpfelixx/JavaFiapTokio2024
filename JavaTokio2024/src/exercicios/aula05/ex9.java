package exercicios.aula05;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	 System.out.println("Digite um número");
	 int valor = scan.nextInt();
	 int unidade;
	 int dezena ;
	 int centena;
	 centena = valor/100;
	 dezena = (valor%100)/10;
	 unidade = (valor%100)%10;
	 
	 System.out.println("centena: "+centena);
	 System.out.println("dezena: "+dezena);
	 System.out.println("unidade: "+unidade);


	
	 scan.close();
	
	 
	}

}
