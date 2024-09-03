package logica.exercicios.aula06;
import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos lados do triângulo
        System.out.print("Digite o lado A: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o lado B: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o lado C: ");
        double c = scanner.nextDouble();
        
        // Ordena os lados em ordem decrescente
        double[] lados = {a, b, c};
        java.util.Arrays.sort(lados);
        double A = lados[2]; // Maior lado
        double B = lados[1];
        double C = lados[0];
        
        // Determina se forma um triângulo
        if (A >= B + C) {
            System.out.println("Não forma triangulo");
        } else {
            // Determina o tipo de triângulo
            if (A * A == B * B + C * C) {
                System.out.println("Triangulo retangulo");
            } else if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            
            // Verifica se é equilátero ou isósceles
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || A == C || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        
        scanner.close();
    }
}
