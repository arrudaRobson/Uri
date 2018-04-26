import java.io.IOException;
import java.util.Scanner;

public class Exercicio1117 
{
	public static void main(String[] args) throws IOException
	{
		double x, media = 0;
		int i = 0;
		Scanner entrada = new Scanner(System.in);
		for(;;) {
			x = entrada.nextDouble();
			if(x < 0 || x > 10 ) {
				System.out.println("nota invalida");
			}
			else if(x >= 0 && x <= 10) {
				media += x;
				i += 1;
			}
			if(i == 2) {
				media /= 2;
				System.out.printf("media = %.2f\n",media);
				break;
			}
		}
	}
}
