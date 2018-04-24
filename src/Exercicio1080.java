import java.io.IOException;
import java.util.Scanner;

public class Exercicio1080 
{
	public static void main(String[] args) throws IOException
	{
		int x, b = 0, a = 0;
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 1; i <= 100; i++) {
			x = entrada.nextInt();
			if(x > b) {
				b = x;
				a = i;
			}
		}
		System.out.println(b);
		System.out.println(a);
	}
}
