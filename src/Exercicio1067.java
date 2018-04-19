import java.io.IOException;
import java.util.Scanner;

public class Exercicio1067 
{
	public static void main(String[] args) throws IOException
	{
		int x;
		
		Scanner entrada = new Scanner(System.in);
		x = entrada.nextInt();
		
		int y = 0;
		for(int i = 0; i <= x; i++){
			
			if (y % 2 != 0) {
				System.out.println(y);
			}
			y += 1;
		}
	}
}
