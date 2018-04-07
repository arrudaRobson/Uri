import java.io.IOException;
import java.util.Scanner;

public class Exercicio1009
{
	public static void main(String[] args) throws IOException 
	{
		String nome;
		double vendas, salarioFixo, bonus, salarioComBonus;
		
		Scanner entrada = new Scanner(System.in);
		
		nome = entrada.next();
		salarioFixo = entrada.nextDouble();
		vendas = entrada.nextDouble();
		
		bonus = vendas * 0.15;
		
		salarioComBonus = salarioFixo + bonus;
		
		System.out.printf("TOTAL = R$ %.2f\n", + salarioComBonus);
		
	}
}