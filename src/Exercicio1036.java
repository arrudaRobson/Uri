import java.io.IOException;
import java.util.Scanner;

public class Exercicio1036
{
	public static void main(String[] args) throws IOException 
	{
		double A, B, C, delta, R1, R2;
		
		Scanner entrada = new Scanner(System.in);
		
		A = entrada.nextDouble();
		B = entrada.nextDouble();
		C = entrada.nextDouble();

		delta = Math.pow(B, 2.0) - 4.0 * A * C;
		if (A != 0.0 && delta >= 0.0) {
			R1 = (-B + Math.sqrt(delta)) / (2.0 * A);
			R2 = (-B - Math.sqrt(delta)) / (2.0 * A);
			System.out.printf("R1 = %.5f\n", R1);
			System.out.printf("R2 = %.5f\n", R2);
		} else {
			System.out.printf("Impossivel calcular\n");
		}
	}
}