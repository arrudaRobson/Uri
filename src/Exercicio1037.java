import java.io.IOException;
import java.util.Scanner;

public class Exercicio1037 
{
	public static void main(String[] args) throws IOException 
	{
		double x;
		
		Scanner entrada = new Scanner(System.in);
		
		x = entrada.nextDouble();
		
		if (x < 0 || x > 100){
			System.out.println("Fora de intervalo");
		}
		
		else if (x <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		
		else if (x <= 50) {
			System.out.println("Intervalo (25,50]");
		}
		
		else if (x <= 75) {
			System.out.println("Intervalo (50,75]");
		}
		
		else if (x <= 100) {
			System.out.println("Intervalo (75,100]");
		}

	}
}