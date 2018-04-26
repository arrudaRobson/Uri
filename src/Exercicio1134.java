import java.io.IOException;
import java.util.Scanner;

public class Exercicio1134 
{
	public static void main(String[] args) throws IOException
	{
		int number, alcohol = 0, gasoline = 0, diesel = 0;
		Scanner input = new Scanner(System.in);
		
		for(;;) {
			number = input.nextInt();
			if(number == 1) {
				alcohol += 1;
			} else if (number == 2) {
				gasoline += 1;
			} else if (number == 3) {
				diesel += 1;
			} else if(number == 4) {
				break;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\n",alcohol);
		System.out.printf("Gasolina: %d\n",gasoline);
		System.out.printf("Diesel: %d\n",diesel);
	}
}