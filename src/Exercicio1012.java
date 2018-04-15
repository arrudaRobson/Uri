import java.util.Scanner;
import java.io.IOException;

public class Exercicio1012
{
	public static void main(String[] args) throws IOException 
	{
		float A, B, C;
		double volume, pi = 3.14159;
		
		Scanner entrada = new Scanner(System.in);
		
		String dados[] = entrada.nextLine().split(" ");
		A = Float.parseFloat(dados[0]);
		B = Float.parseFloat(dados[1]);
		C = Float.parseFloat(dados[2]);
		
		double triangulo = (A * C) / 2;
		double circulo = pi * (Math.pow(C, 2));
		double trapezio = ((A + B) * C) / 2;
		double quadrado = Math.pow(B, 2);
		double retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", 
				triangulo, circulo, trapezio, quadrado, retangulo);
	}
}