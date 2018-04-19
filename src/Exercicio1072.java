import java.io.IOException;
import java.util.Scanner;

public class Exercicio1072 
{
	public static void main(String[] args) throws IOException
	{
		int x, y, a = 0, b = 0;
		Scanner entrada = new Scanner(System.in);
		
		x = entrada.nextInt();
		for(int i = 0; i < x; i++){
			y = entrada.nextInt();
			
			if(y >= 10 && y <= 20) {
				a += 1;
			} else {
				b += 1;
			}
		}
		System.out.println(a + " in");
		System.out.println(b + " out");		
	}
}
