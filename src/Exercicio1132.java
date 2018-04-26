import java.io.IOException;
import java.util.Scanner;

public class Exercicio1132 
{
	public static void main(String[] args) throws IOException
	{
		int x, y, a, b, soma = 0;
		Scanner entrada = new Scanner(System.in);
		x = entrada.nextInt();
		y = entrada.nextInt();
		a = Math.max(x, y);
		b = Math.min(x, y);
		for(int i = b; i <= a; i++) {
			if(i % 13 != 0) {
				soma += i;
			}
		}
		System.out.println(soma);
	}
}
