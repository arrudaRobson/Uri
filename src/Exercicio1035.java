import java.io.IOException;
import java.util.Scanner;

public class Exercicio1035 
{
	public static void main(String[] args) throws IOException 
	{
		int a = 0, b = 0, c = 0, d = 0, x, y;
		
		Scanner entrada = new Scanner(System.in);
		
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		d = entrada.nextInt();
		
		x = a + b;
		y = c + d;
		
		if (b > c && d > a && y > x && c > 0 && d > 0 && a%2 == 0) {
			System.out.println("Valores aceitos");
		}
		
		else {
			System.out.println("Valores nao aceitos");
		}
	}
}
