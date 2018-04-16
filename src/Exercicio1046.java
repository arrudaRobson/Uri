import java.io.IOException;
import java.util.Scanner;

public class Exercicio1046 
{
	public static void main(String[] args) throws IOException {
		int x, y;
		
		Scanner entrada = new Scanner(System.in);
		
		x = entrada.nextInt();
		y = entrada.nextInt();
		
		int time = 0;
		
		if (x >= y) {
			time = (24 - x) + y;
			System.out.println("O JOGO DUROU " + time + " HORA(S)");
		}
		else {
			time = (x - y) * -1;
			System.out.println("O JOGO DUROU " + time + " HORA(S)");
		}
	}
}
