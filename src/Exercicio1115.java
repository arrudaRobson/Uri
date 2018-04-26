import java.io.IOException;
import java.util.Scanner;

public class Exercicio1115 
{
	public static void main(String[] args) throws IOException 
	{
		int x, y;
		Scanner entrada = new Scanner(System.in);
		
		for(;;) {
			x = entrada.nextInt();
			y = entrada.nextInt();
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
			} else if (x == 0 || y == 0) {
				break;
			}
		}
	}
}
