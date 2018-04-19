import java.io.IOException;
import java.util.Scanner;

public class Exercicio1066 
{
	public static void main(String[] args) throws IOException
	{
		int a = 0, b = 0, c = 0, d = 0;
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 1; i <= 5; i++) {
			int x = entrada.nextInt();
			
			if (x > 0) {
				c += 1;
			}
			
			if (x < 0) {
				d += 1;
			}
			
			if (x % 2 == 0) {
				a += 1;
			}
			
			if (x % 2 != 0) {
				b += 1;
			}
			
		}
		System.out.println(a + " valor(es) par(es)");
		System.out.println(b + " valor(es) impar(es)");
		System.out.println(c + " valor(es) positivo(s)");
		System.out.println(d + " valor(es) negativo(s)");
	}
}
