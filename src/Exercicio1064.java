import java.io.IOException;
import java.util.Scanner;

public class Exercicio1064 {
	public static void main(String[] args) throws IOException 
	{
		int a = 0;
		double n, x = 0, media;
		
		Scanner entrada = new Scanner(System.in);
			
		for(int i = 1; i <= 6; i++) {
			n = entrada.nextDouble();
			if (n > 0) {
				x += n;
				a += 1;
			}	
		}
		media = x / a;
		System.out.printf("%d valores positivos\n", a);
		System.out.printf("%.1f\n", media);
	}
}
