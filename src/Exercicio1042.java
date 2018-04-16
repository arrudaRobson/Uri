import java.io.IOException;
import java.util.Scanner;

public class Exercicio1042 
{
	public static void main(String[] args) throws IOException 
	{
		int a, b, c, x, y, z;
		
		
		Scanner entrada = new Scanner(System.in);
		
		String dados[] = entrada.nextLine().split(" ");
		
		a = Integer.parseInt(dados[0]);
		b = Integer.parseInt(dados[1]);
		c = Integer.parseInt(dados[2]);
		
		x = Math.min(a, Math.min(c, b));
		
		if (x == a) {
			y = Math.min(c, b);
			z = Math.max(c, b);
			
			System.out.printf("%d\n%d\n%d\n\n", x,y,z);
			System.out.printf("%d\n%d\n%d\n", a,b,c);
		}
		else if (x == b) {
			y = Math.min(c, a);
			z = Math.max(c, a);
			
			System.out.printf("%d\n%d\n%d\n\n", x,y,z);
			System.out.printf("%d\n%d\n%d\n", a,b,c);
		}
		else if (x == c) {
			y = Math.min(a, b);
			z = Math.max(a, b);
			
			System.out.printf("%d\n%d\n%d\n\n", x,y,z);
			System.out.printf("%d\n%d\n%d\n", a,b,c);
		}
		
	}
}
