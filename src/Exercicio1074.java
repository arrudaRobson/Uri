import java.io.IOException;
import java.util.Scanner;

public class Exercicio1074 
{
	public static void main(String[] args) throws IOException
	{
		int n ,x;
		Scanner entrada = new Scanner(System.in);
				
		n = entrada.nextInt();
		
		for(int i = 1; i <= n; i++){
			x = entrada.nextInt();
			
			if (x == 0) {
				System.out.printf("NULL\n");
			}
			
			if (x % 2 == 0 && x != 0) {
				System.out.printf("EVEN ");
			}
			
			if (x % 2 != 0) {
				System.out.printf("ODD ");
			}
			
			if (x > 0) {
				System.out.printf("POSITIVE\n");
			}
			
			if (x < 0) {
				System.out.printf("NEGATIVE\n");
			}
		}
	}
}
