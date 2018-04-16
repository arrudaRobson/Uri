import java.io.IOException;
import java.util.Scanner;

public class Exercicio1043
{
	public static void main(String[] args) throws IOException
	{
		double a, b, c, x, y;
		
		Scanner entrada = new Scanner(System.in);
		String dados[] = entrada.nextLine().split(" ");
		
		a = Double.parseDouble(dados[0]);
		b = Double.parseDouble(dados[1]);
		c = Double.parseDouble(dados[2]);

		if (((b - c < a) && (a < b + c)) && ((a - c < b) && (b < a + c)) && ((a - b < c) && (c < a + b))) {
			x = a + b + c;
			System.out.printf("Perimetro = %.1f", x);
		}
		else {
			y = ((a + b) * c) / 2;
			System.out.printf("Area = %.1f", y);
		}
	}	
}