import java.io.IOException;
import java.util.Scanner;

public class Exercicio1118 
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
			 if(x >= 0 && x <= 10) {
				for(i = 0; i < 2; i++) {
					media += x;
					if(i == 2) {
						media /= 2;
						System.out.printf("media = %.2f\n",media);
					}
				}
			}
			if(i >= 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
			}
			
		}
	}
}
