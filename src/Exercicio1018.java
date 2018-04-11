import java.io.IOException;
import java.util.Scanner;

public class Exercicio1018 {


    public static void main(String[] args) throws IOException {
 
        int N, cem, cinqta, vinte, dez, cinco, dois, um;
		
		Scanner entrada = new Scanner(System.in);
		  
		N = entrada.nextInt();
		System.out.printf("%d\n", N);
	
		cem = N / 100;
		N -= cem * 100; 
		
		cinqta = (N % 100) / 50; 
		N -= cinqta * 50; 
		
		vinte = (N % 50) / 20; 
		N -= vinte * 20; 
		
		dez = (N % 20) / 10; 
		N -= dez * 10; 
		
		cinco = (N % 10) / 5; 
		N -= cinco * 5; 
		
		dois = (N % 5) / 2; 
		N -= dois * 2; 
		
		um = (N % 2) / 1; 
		
		System.out.printf("%d nota(s) de R$ 100,00\n", cem); 
		System.out.printf("%d nota(s) de R$ 50,00\n", cinqta); 
		System.out.printf("%d nota(s) de R$ 20,00\n", vinte); 
		System.out.printf("%d nota(s) de R$ 10,00\n",dez); 
		System.out.printf("%d nota(s) de R$ 5,00\n", cinco); 
		System.out.printf("%d nota(s) de R$ 2,00\n", dois); 
		System.out.printf("%d nota(s) de R$ 1,00\n", um);	
		
    }
}
