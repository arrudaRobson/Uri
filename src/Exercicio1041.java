import java.io.IOException;
import java.util.Scanner;

public class Exercicio1041 
{
	public static void main(String[] args)throws IOException 
	{
		double x, y;
		
		Scanner entrada = new Scanner(System.in);
		String dados[] = entrada.nextLine().split(" ");
		
		x = Double.parseDouble(dados[0]);
		y = Double.parseDouble(dados[1]);
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		if (y == 0.0 && x != 0.0) {
			System.out.println("Eixo X");
		}
		if (x == 0.0 && y != 0.0) {
			System.out.println("Eixo Y");
		}
		if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		} else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		} else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		} else if (x > 0.0 && y < 0.0) {
			System.out.println("Q4");
		}
	}
}
