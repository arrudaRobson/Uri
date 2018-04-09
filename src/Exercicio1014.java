import java.util.Scanner;
import java.io.IOException;

public class Exercicio1014
{
	public static void main(String[] args) throws IOException 
	{
		int x;
		double consumo, y;
		
		Scanner entrada = new Scanner(System.in);
		
		x = entrada.nextInt();
		y = entrada.nextDouble();
		
		consumo = x / y;
		
		System.out.printf("%.3f km/l\n", + consumo);
	}
}