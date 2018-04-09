import java.util.Scanner;
import java.io.IOException;

public class Exercicio1016 
{
	public static void main(String[] args) throws IOException 
	{
		int km, tempo;
		
		Scanner entrada = new Scanner(System.in);
		
		km = entrada.nextInt();
		
		tempo = (60 * km) / 30;
		
		System.out.printf("%d minutos\n", + tempo);
	}
}