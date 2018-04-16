import java.io.IOException;
import java.util.Scanner;

public class Exercicio1044
{
	public static void main(String[] args) throws IOException
	{
		int a, b;
		
		Scanner entrada = new Scanner(System.in);
		String dados[] = entrada.nextLine().split(" ");
		
		a = Integer.parseInt(dados[0]);
		b = Integer.parseInt(dados[1]);

		if (a % b  == 0 || b % a == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
	}	
}
