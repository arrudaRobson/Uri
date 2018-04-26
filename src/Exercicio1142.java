import java.io.IOException;
import java.util.Scanner;

public class Exercicio1142 
{
	public static void main(String[] args) throws IOException
	{
		int n;
		Scanner entrada = new Scanner(System.in);
		n = entrada.nextInt();
		n *= 4; 
		for (int i = 1; i < n ; i += 4) {
			for (int a = i; a <= i+2; a++) {
				System.out.print(a + " ");
			}
			System.out.printf("PUM\n");
	    }
	}
}
