import java.io.IOException;
import java.util.Scanner;

public class Exercicio1004 
{
	public static void main(String[] args) throws IOException 
	{
		int A,B,prod;
		
		Scanner entrada = new Scanner(System.in);
		
		A = entrada.nextInt();
		B = entrada.nextInt();
		
		prod = A * B;
		
		System.out.printf("PROD = %d\n", + prod);
		
	}
}