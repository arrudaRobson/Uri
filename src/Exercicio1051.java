import java.io.IOException;
import java.util.Scanner;

public class Exercicio1051
{
	public static void main(String[] args) throws IOException {
		double x;
		
		Scanner entrada = new Scanner(System.in);
		
		x = entrada.nextDouble();
		
		if (x > 0 && x <= 2000) {
			System.out.println("Isento");
		}
		else if (x >= 2000.01 && x <= 3000) {
			double a = x;
			double y = 1000;
			a -= y;
			if (a > 2000) {
				double b = 0;
				b -= a;
				double imposto = (y * 0.08) + (b * 0.18);  
				System.out.printf("%.2f\n",imposto);
			}
			else {
				double imposto = (y * 0.08);  
				System.out.printf("%.2f\n",imposto);
			}
		}
		else if (x >= 3000.01 && x <= 4500) {
			double a = x;
			double y = 1000;
			double b = 1500;
			a -= y;
			if (a > 1000) {
				b = 0;
				b -= a;
				double imposto = (y * 0.08) + (b * 0.18);  
				System.out.printf("%.2f\n",imposto);
			}
			if (a > 2000) {
				double z = 0;
				z -= a;
				double imposto = (y * 0.08) + (b * 0.18) + (z * 0.28);  
				System.out.printf("%.2f\n",imposto);
			}
				
			else {
				double imposto = (y * 0.08)+ (b * 0.18);  
				System.out.printf("%.2f\n",imposto);
			}
		}
	}
}