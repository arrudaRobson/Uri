import java.io.IOException;
import java.util.Scanner;

public class Exercicio1021 {


    public static void main(String[] args) throws IOException {
 
        double notas, moedas, nCem, nCinq, nVint, nDez, nCinc, nDois, mUm, mCinq, mVint, mDez, mCinc, m;
		
        Scanner entrada = new Scanner(System.in);
       
		notas = entrada.nextDouble();
		
		moedas = notas * 100;
		moedas %=100;
		
		nCem = notas/100;
		notas %= 100;
	
		nCinq = notas/50;
		notas %= 50;
		nVint = notas/20;
		notas %= 20;
		nDez = notas/10;
		notas %= 10;
		nCinc = notas/5;
		notas %= 5;
		nDois = notas/2;
		notas %= 2;
		mUm = notas;
		mCinq = moedas/50;
		moedas %= 50;
		mVint = moedas/25;
		moedas %= 25;
		mDez = moedas/10;
		moedas %= 10;
		mCinc = moedas/5;
		moedas %= 5;
		m = moedas;
		System.out.println("NOTAS:");
		System.out.println((int)nCem + " nota(s) de R$ 100.00");
		System.out.println((int)nCinq + " nota(s) de R$ 50.00");
		System.out.println((int)nVint + " nota(s) de R$ 20.00");
		System.out.println((int)nDez + " nota(s) de R$ 10.00");
		System.out.println((int)nCinc + " nota(s) de R$ 5.00");
		System.out.println((int)nDois + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println((int)mUm + " moeda(s) de R$ 1.00");
		System.out.println((int)mCinq + " moeda(s) de R$ 0.50");
		System.out.println((int)mVint + " moeda(s) de R$ 0.25");
		System.out.println((int)mDez + " moeda(s) de R$ 0.10");
		System.out.println((int)mCinc + " moeda(s) de R$ 0.05");
		System.out.println((int)m + " moeda(s) de R$ 0.01"); 
	
    }
}

