import java.io.IOException;
import java.util.Scanner;

public class Exercicio1019 {


    public static void main(String[] args) throws IOException {
 
        int N, h, m, s;
		
        Scanner entrada = new Scanner(System.in);
		  
		N = entrada.nextInt();
		
		h = N/3600;
		N -= h * 3600;
		m = N/60;
		N -= m * 60;
		s = N;
        
		System.out.printf("%d:%d:%d\n",h,m,s); 
					
    }
}
