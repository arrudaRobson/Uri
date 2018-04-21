import java.io.IOException;
import java.util.Scanner;

public class Exercicio1113 
{
	public static void main(String[] args) throws IOException
	{
		int x, y;
		Scanner entrada = new Scanner(System.in);
		x = entrada.nextInt();
		y = entrada.nextInt();
		while(x != y) {
			if (x > y) {
				System.out.println("Decrescente");
			} else if (x < y) {
				System.out.println("Crescente");
			}
			x = entrada.nextInt();
			y = entrada.nextInt();
		}
	}
}
