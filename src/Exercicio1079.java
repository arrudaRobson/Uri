import java.io.IOException;
import java.util.Scanner;

public class Exercicio1079 
{
	public static void main(String[] args) throws IOException
	{
		int n;
		double a, b, c, media = 0;
		Scanner entrada = new Scanner(System.in);
		
		n = entrada.nextInt();
		for(int i = 0; i < n; i ++) {
			a = entrada.nextDouble();
			b = entrada.nextDouble();
			c = entrada.nextDouble();
			
			media = ((a * 2) + (b * 3) + (c * 5)) / 10;
			System.out.printf("%.1f\n", media);
		}
	}
}
