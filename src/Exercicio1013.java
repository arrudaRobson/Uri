import java.util.Scanner;
import java.io.IOException;

public class Exercicio1013
{
	public static void main(String[] args) throws IOException 
	{
		int a, b, c;
		
		Scanner entrada = new Scanner(System.in);
		
		String dados[] = entrada.nextLine().split(" ");
		
		a = Integer.parseInt(dados[0]);
		b = Integer.parseInt(dados[1]);
		c = Integer.parseInt(dados[2]);
		
		if (a > b && a > c) {
			System.out.printf("%d eh o maior\n", a);
		}
		
		else if (b > a && b > c) {
			System.out.printf("%d eh o maior\n", b);			
		}
		
		else if (c > a && c > b) {
			System.out.printf("%d eh o maior\n", c);
		}
	}
}