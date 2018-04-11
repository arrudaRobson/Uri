import java.io.IOException;
import java.util.Scanner;

public class Exercicio1017 {

	public static void main(String[] args) throws IOException {
		
		int tempo, velMedia;
		double litros, result;
		
		Scanner entrada = new Scanner(System.in);
		
		tempo = entrada.nextInt();
		velMedia = entrada.nextInt();
		
		litros = (velMedia * tempo);
		result = litros / 12;
		
		System.out.printf("%.3f\n", result);
		
	}
}
