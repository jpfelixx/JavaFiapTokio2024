package logica.exercicios.aula08;

import java.util.Iterator;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 0;
		int min = 5;
		int max = 10;
				
		for (int i = 0; i <= 9; i++) {
			double a = min + Math.random() * (max - min);
			num+=a;
			System.out.println(a);
			
		}
		System.out.println("A soma é "+num);
	}

}
