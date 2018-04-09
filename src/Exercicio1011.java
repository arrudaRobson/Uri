import java.util.Scanner;
import java.io.IOException;

public class Exercicio1011 
{
	public static void main(String[] args) throws IOException 
	{
		float raio;
		double volume, pi = 3.14159;
		
		Scanner entrada = new Scanner(System.in);
		
		raio = entrada.nextFloat();
		volume = (4.0/3.0) * (pi * Math.pow(raio, 3));
		
		System.out.printf("VOLUME = %.3f\n", + volume);
	}
}