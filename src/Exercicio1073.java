import java.io.IOException;
import java.util.Scanner;

public class Exercicio1073 
{
	public static void main(String[] args) throws IOException 
	{
		int n, x;
		
		Scanner entrada = new Scanner(System.in);
		n = entrada.nextInt();
		x = 0;
		if (n > 5 && n < 2000) {
			for(int i = 0; i <= n; i++) {
				if (x % 2 == 0 && x > 0 && x <= n) {
					int a = x * x;
					System.out.println(x + "^2 = " + a);
					x +=1;
				}
				x +=1;
			}
		}
	}
}
