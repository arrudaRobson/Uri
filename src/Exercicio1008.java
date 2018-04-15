import java.io.IOException;
import java.util.Scanner;

public class Exercicio1008
{
	public static void main(String[] args) throws IOException 
	{
		int idFun, horas;
		double valorHora, salario;
		
		Scanner entrada = new Scanner(System.in);
		
		idFun = entrada.nextInt();
		horas = entrada.nextInt();
		valorHora = entrada.nextDouble();
		
		salario = horas * valorHora;
		
		System.out.printf("NUMBER = %d\n", idFun);
		System.out.printf("SALARY = U$ %.2f\n", salario);
		
		
		
	}
}