import java.io.IOException;
import java.util.Scanner;

public class Exercicio1048 
{
	public static void main(String[] args) throws IOException {
		double x;
		
		Scanner entrada = new Scanner(System.in);
		
		x = entrada.nextDouble();
		
		if (x > 0 && x <= 400) {
			double salario = x;
			double bonus = x * 0.15;
			salario += bonus; 
			System.out.printf("Novo salario: %.2f\n", salario);
			System.out.printf("Reajuste ganho: %.2f\n", bonus);
			System.out.println("Em percentual: 15 %");
		}
		else if (x >= 400.01 && x <= 800) {
			double salario = x;
			double bonus = x * 0.12;
			salario += bonus; 
			System.out.printf("Novo salario: %.2f\n", salario);
			System.out.printf("Reajuste ganho: %.2f\n", bonus);
			System.out.println("Em percentual: 12 %");
		}
		else if (x >= 800.01 && x <= 1200) {
			double salario = x;
			double bonus = x * 0.1;
			salario += bonus; 
			System.out.printf("Novo salario: %.2f\n", salario);
			System.out.printf("Reajuste ganho: %.2f\n", bonus);
			System.out.println("Em percentual: 10 %");
		}
		else if (x >= 1200.01 && x <= 2000) {
			double salario = x;
			double bonus = x * 0.07;
			salario += bonus; 
			System.out.printf("Novo salario: %.2f\n", salario);
			System.out.printf("Reajuste ganho: %.2f\n", bonus);
			System.out.println("Em percentual: 7 %");
		}
		else if (x > 2000) {
			double salario = x;
			double bonus = x * 0.04;
			salario += bonus; 
			System.out.printf("Novo salario: %.2f\n", salario);
			System.out.printf("Reajuste ganho: %.2f\n", bonus);
			System.out.println("Em percentual: 4 %");
		}
	}
}