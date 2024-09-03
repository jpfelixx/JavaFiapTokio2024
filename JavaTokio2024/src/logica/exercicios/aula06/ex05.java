package logica.exercicios.aula06;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	 
	float resultado=0;
	float a = scan.nextFloat();
	scan.nextLine();
	char d = scan.nextLine().charAt(0);
	float b = scan.nextFloat();
	
	
	switch(d) {
	case '+':
		resultado=a+b;
		break;
	case '-':
		resultado=a-b;
		break;
	case '*':
		resultado=a*b;
		break;
	case '/':
		resultado=a/b;
		break;
	default:
	System.out.println("Operador inválido!");
	

	}
	System.out.println("O resultado da operação é"+resultado);
		
		scan.close();
		//teste
	}

}
