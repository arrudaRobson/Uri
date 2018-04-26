import java.io.IOException;
import java.util.Scanner;

public class Exercicio1116 
{
	public static void main(String[] args) throws IOException
	{
		int n;
		Scanner entrada = new Scanner(System.in);
		n = entrada.nextInt();
	
		for(int i = 1; i <= n; i ++) {
			double x, y, div;
			x = entrada.nextInt();
			y = entrada.nextInt();
			if(y == 0) {
				System.out.println("divisao impossivel");
			} else {
				div = x / y;
				System.out.printf("%.1f\n",div);
			}
		}
	}
}
