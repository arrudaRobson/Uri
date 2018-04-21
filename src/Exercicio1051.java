import java.io.IOException;
import java.util.Scanner;

public class Exercicio1051
{
	public static void main(String[] args) throws IOException 
	{
		double x, imposto = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		x = entrada.nextDouble();
		
		if (x > 0 && x <= 2000) {
			System.out.println("Isento");
			return;
		} else if (x >= 2000.01 && x <= 3000) {
			x -= 2000;
			imposto = (x * 0.08);  
	
		} else if (x >= 3000.01 && x <= 4500) {
			x -= 3000;
			imposto = (1000 * 0.08) + (x * 0.18);  
			
		} else if (x > 4500.00) {
			x -= 4500;
			imposto = (1000 * 0.08) + (1500 * 0.18) + (x * 0.28);  
			
		} 
		System.out.printf("R$ %.2f\n",imposto);
	}
}