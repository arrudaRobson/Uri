import java.io.IOException;
import java.util.Scanner;

public class Exercicio1007
{
	public static void main(String[] args) throws IOException 
	{
		int A,B,C,D,dif;
		
		Scanner entrada = new Scanner(System.in);
		
		A = entrada.nextInt();
		B = entrada.nextInt();
		C = entrada.nextInt();
		D = entrada.nextInt();
		
		dif = ((A * B) - (C * D));
		
		System.out.printf("DIFERENCA = %d\n", + dif);
		
	}
}