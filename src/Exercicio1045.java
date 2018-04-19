import java.io.IOException;
import java.util.Scanner;

public class Exercicio1045
{
	public static void main(String[] args) throws IOException
	{
		float a, b = 0, c = 0, x, y, z;
		
		Scanner entrada = new Scanner(System.in);
		
		x = entrada.nextFloat();
		y = entrada.nextFloat();
		z = entrada.nextFloat();
		
		a = Math.max(x, Math.max(y, z));
		
		if (a == x) {
			b = Math.max(y, z);
			c = Math.min(y, z);
		}
		if (a == y) {
			b = Math.max(x, z);
			c = Math.min(x, z);
		}
		if (a == z) {
			b = Math.max(y, x);
			c = Math.min(y, x);
		}
		
		if (a > 0 && b > 0 && c > 0) {
				
			if(a >= b + c) {
				System.out.println("NAO FORMA TRIANGULO");
			}
			else if (a * a > (b * b + c * c)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if (a * a == (b * b + c * c)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if (a * a < (b * b + c * c)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if  ((a == b) && (a == c)) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if (((a == b) &&(a != c)) || ((a == c) &&(a != b)) || ((b == c) &&(b != a))){
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
	}	
}