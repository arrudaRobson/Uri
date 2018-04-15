import java.io.IOException;
import java.util.Scanner;

public class Exercicio1003 
{
	public static void main(String[] args) throws IOException 
	{
		int A,B,soma;
		
		Scanner entrada = new Scanner(System.in);
		
		A = entrada.nextInt();
		B = entrada.nextInt();
		
		soma = A + B;
		
		System.out.printf("SOMA = %d\n", soma);
		
	}
}
