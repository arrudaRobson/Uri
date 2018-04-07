import java.util.Scanner;
import java.io.IOException;

public class Exercicio1002 {
	public static void main(String[] args) throws IOException {
		
		double area, raio, pi = 3.14159;
		
		Scanner entrada = new Scanner(System.in);
		
		raio = entrada.nextDouble();
		area = (raio * raio) * pi;
		
		System.out.printf("A=%.4f\n", + area);
	}
}
