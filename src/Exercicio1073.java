import java.io.IOException;
import java.util.Scanner;

public class Exercicio1073 
{
	public static void main(String[] args) throws IOException 
	{
		int n, x;
		
		Scanner entrada = new Scanner(System.in);
		n = entrada.nextInt();
		if (n > 5 && n < 2000) {
			if (n % 2 == 0) {
				x = n * n;
				System.out.println(n + "^2 = " + x);
			}
		}
	}
}
