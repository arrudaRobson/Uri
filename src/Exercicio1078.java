import java.io.IOException;
import java.util.Scanner;

public class Exercicio1078 
{
	public static void main(String[] args) throws IOException 
	{
		int n;
		Scanner entrada = new Scanner(System.in);
		
		n = entrada.nextInt();
		for(int i = 1; i <= 10; i++) {
			int m = i * n;
			System.out.printf("%d x %d = %d\n", i, n, m);
		}
	}
}
