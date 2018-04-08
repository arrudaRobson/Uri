import java.io.IOException;
import java.util.Scanner;

public class Exercicio1010
{
	public static void main(String[] args) throws IOException 
	{	
		
		int codPecaUm, codPecaDois, quantPecaUm, quantPecaDois;
		double venda, precoPecaUm, precoPecaDois;
		
		Scanner entrada = new Scanner(System.in);
		
		
		String primeiro[] = entrada.nextLine().split(" ");
		String segundo[] = entrada.nextLine().split(" ");
		
		
		codPecaUm = Integer.parseInt(primeiro[0]);
		quantPecaUm = Integer.parseInt(primeiro[1]);
		precoPecaUm = Double.parseDouble(primeiro[2]);
		codPecaDois = Integer.parseInt(segundo[0]);
		quantPecaDois = Integer.parseInt(segundo[1]);
		precoPecaDois = Double.parseDouble(segundo[2]);
		
		venda =  (quantPecaUm * precoPecaUm) + (quantPecaDois * precoPecaDois);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", + venda);
		
	}
}