import java.io.IOException;
import java.util.Scanner;

public class Exercicio1005 
{
	public static void main(String[] args) throws IOException 
	{
		double A,B,media;
		
		Scanner entrada = new Scanner(System.in);
		
		A = entrada.nextDouble();
		B = entrada.nextDouble();
		
		media = ((A * 3.5) + (B * 7.5)) / 11;
		
		System.out.printf("MEDIA = %.5f\n", media);
		
	}
}