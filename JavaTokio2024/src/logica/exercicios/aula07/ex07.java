package logica.exercicios.aula07;
import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double  []  array = new double[10]; 
		int acima = 0, abaixo =0;
		
		double media= 0;
		 
		    for (int i = 0; i <10; i++) {
		    	System.out.println("Digite a nota");
				double d = scan.nextDouble();
				array[i] = d;
				media+=d;	
			}

		  media = media/10;
		  for (int i = 0; i < array.length; i++) {
			  if(array[i]>media)
				   acima++;
			  else
				  abaixo++;
			
		}
		  
		  System.out.println(acima+" alunos tiveram a  nota acima da média");
		  System.out.println(abaixo+" alunos tiveram a  nota abaixo da média");

		    
	}

}
