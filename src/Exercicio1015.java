import java.util.Scanner;
import java.io.IOException;

public class Exercicio1015
{
	public static void main(String[] args) throws IOException 
	{
		float a, b, c, d;
		double distancia;
		
		Scanner entrada = new Scanner(System.in);
		
		String dadosUm[] = entrada.nextLine().split(" ");
		String dadosDois[] = entrada.nextLine().split(" ");
		
		a = Float.parseFloat(dadosUm[0]);
		b = Float.parseFloat(dadosUm[1]);
		c = Float.parseFloat(dadosDois[0]);
		d = Float.parseFloat(dadosDois[1]);
		
		distancia = Math.sqrt((Math.pow((c - a), 2))+(Math.pow((d - b), 2)));
		
		System.out.printf("%.4f\n", distancia);
		
	}
}