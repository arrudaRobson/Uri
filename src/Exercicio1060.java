import java.io.IOException;
import java.util.Scanner;

public class Exercicio1060 
{
	public static void main(String[] args) throws IOException 
	{
		int y = 0;
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 1; i <= 6; i++) {
			
			double x = entrada.nextDouble();
			
			if (x > 0) {
				y += 1;
			}	
		}
		System.out.println(y + " valores positivos");
	}
}
