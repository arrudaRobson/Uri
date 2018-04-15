import java.io.IOException;
import java.util.Scanner;

public class Exercicio1038 {
	public static void main(String[] args) throws IOException {
		
		int cod, qtd;
		double preco;
		
		Scanner entrada = new Scanner(System.in);
		
		cod = entrada.nextInt();
		qtd = entrada.nextInt();
		
		if (cod == 1) {
			preco = qtd * 4.00;
			System.out.printf("Total: R$ %.2f\n", preco);
		}
		
		else if (cod == 2) {
			preco = qtd * 4.50;
			System.out.printf("Total: R$ %.2f\n", preco);
		}
		
		else if (cod == 3) {
			preco = qtd * 5.00;
			System.out.printf("Total: R$ %.2f\n", preco);
		}
		
		else if (cod == 4) {
			preco = qtd * 2.00;
			System.out.printf("Total: R$ %.2f\n", preco);
		}
		
		else if (cod == 5) {
			preco = qtd * 1.50;
			System.out.printf("Total: R$ %.2f\n", preco);
		}
	}
}
