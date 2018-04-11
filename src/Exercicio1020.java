import java.io.IOException;
import java.util.Scanner;

public class Exercicio1020 
{
    public static void main(String[] args) throws IOException 
    {
    	 
        int idade, anos, meses, dias;
		
        Scanner entrada = new Scanner(System.in);
		  
		idade = entrada.nextInt();
		
		anos = idade/365;
		idade -= anos * 365;
		meses = idade/30;
		idade -= meses * 30;
		dias = idade;
        
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n",anos,meses,dias); 
					
    }

}
