import java.io.IOException;
import java.util.Scanner;

public class Exercicio1114 
{
	public static void main(String[] args) throws IOException
	{
		int x, y = 2002;
		Scanner entrada = new Scanner(System.in);
		x = entrada.nextInt();
		while(x != y) {
			System.out.println("Senha Invalida");
			x = entrada.nextInt();
		}
		System.out.println("Acesso Permitido");
	}
}
