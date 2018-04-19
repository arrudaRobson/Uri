import java.io.IOException;
import java.util.Scanner;

public class Exercicio1065 
{
	public static void main(String[] args) throws IOException
	{
		int y = 0;
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 1; i <= 5; i++) {
			int x = entrada.nextInt();
			
			if (x % 2 == 0) {
				y += 1;
			}	
		}
		System.out.println(y + " valores pares");
	}
}
