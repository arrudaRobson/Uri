import java.io.IOException;
import java.util.Scanner;

public class Exercicio1099 
{
	public static void main(String[] args) throws IOException
	{
		int n, x, y, a = 0;
		
		Scanner entrada = new Scanner(System.in);
		n = entrada.nextInt();
		for(int z = 1; z <= n; z++) {
			x = entrada.nextInt();
			y = entrada.nextInt();
			
			if (x > y) {
				for (int i = x - 1; i > y; i--) {
					if (i % 2 != 0) {
						a += i;
					}
			    }
			} else {
				for (int i = y - 1; i > x; i--) {
					if (i % 2 != 0) {
						a += i;
					}
				}
			}
					
			System.out.printf("%d\n", a);
			a = 0;
		}
	}
}
