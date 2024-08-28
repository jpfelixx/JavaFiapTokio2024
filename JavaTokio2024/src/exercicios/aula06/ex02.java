package exercicios.aula06;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 float a = scan.nextFloat();
		 float b = scan.nextFloat();
		 if(a>b) {
			 System.out.println(a+"É o maior número");
		 }
		
		 else if (b>a){
				 System.out.println(b+"É o maior número");

		 }
		 
		 else
			 System.out.println("Os valores digitados são igauis");
	}

}
