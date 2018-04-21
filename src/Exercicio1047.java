import java.io.IOException;
import java.util.Scanner;

public class Exercicio1047 
{
	public static void main(String[] args) throws IOException 
	{
		int a, b, c, d, x, y;
		
		Scanner entrada = new Scanner(System.in);
		
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		d = entrada.nextInt();
		
		x = c - a;
		
		if (x < 0) {
			x += 24; 
		}
		y = d - b;
		if (y < 0) {
			y += 60;
			x --;
		}
		if (a == c && b == d) {
			System.out.printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
		} else {
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", x, y);
	
		}
	}
}