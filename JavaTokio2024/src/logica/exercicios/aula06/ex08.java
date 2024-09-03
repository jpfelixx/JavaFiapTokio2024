package logica.exercicios.aula06;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        System.out.println("Digite a distância percorrida: ");
		float a = scan.nextFloat();
        System.out.println("Digite o total de combustível gasto: ");
		float b = scan.nextFloat();
		float consumo = a/b;
		System.out.println("O consumo de combustível foi:"+consumo);
		if(consumo>8)
			System.out.println("Esse carro bebe hein!");
		else
			System.out.println("Autonomia legal!");

	}

	
}
