import java.io.IOException;
import java.util.Scanner;

public class Exercicio1070 
{
	public static void main(String[] args) throws IOException
	{
		int x;
		
		Scanner entrada = new Scanner(System.in);
		x = entrada.nextInt();
		
		for(int i = 0; i < 6; i++){
			
			if (x % 2 != 0) {
				System.out.println(x);
			} else {
				System.out.println(x + 1);
				x += 1;
			}
			x += 1;
		}
	}
}