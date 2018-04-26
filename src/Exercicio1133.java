import java.io.IOException;
import java.util.Scanner;

public class Exercicio1133
{
	public static void main(String[] args) throws IOException
	{
		int x, y, a, b;
		Scanner entrada = new Scanner(System.in);
		x = entrada.nextInt();
		y = entrada.nextInt();
		
		a = Math.max(x, y);
		b = Math.min(x, y);
		
		for(int i = b + 1; i < a; i++) {
			if(i % 5 == 2 || i % 5 == 3) {
				System.out.println(i);
			}
		}
	}
}
