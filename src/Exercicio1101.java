import java.io.IOException;
import java.util.Scanner;

public class Exercicio1101 
{
	public static void main(String[] args) throws IOException
	{
		int m, n, s = 0;
		Scanner entrada = new Scanner(System.in);
		
		while(((m = entrada.nextInt()) > 0) && ((n = entrada.nextInt()) > 0)) {
			int a = Math.max(m,n);
			int b = Math.min(m, n);
			
			for(int i = b; i <= a; i++) {
					System.out.printf("%d ",i);
					s += i;
			}
				System.out.println("Sum="+s);
				s = 0;
		}	
	}
}
