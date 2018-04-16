import java.io.IOException;
import java.util.Scanner;

public class Exercicio1040 
{
	public static void main(String[] args) throws IOException
	{
		float a, b, c, d, media, rec;
		
		Scanner entrada = new Scanner(System.in);
		String dados[] = entrada.nextLine().split(" ");
		
		a = Float.parseFloat(dados[0]);
		b = Float.parseFloat(dados[1]);
		c = Float.parseFloat(dados[2]);
		d = Float.parseFloat(dados[3]);
		
		media = ((a * 2) + (b * 3) + (c * 4) + d) / 10;
		
		if (media >= 7) {
			System.out.printf("Media: %.1f\n",  media);
			System.out.println("Aluno aprovado.");
		}
		
		else if (media > 5 && media < 6) {
			System.out.printf("Media: %.1f\n",  media);
			System.out.println("Aluno em exame.");
			
			float e = entrada.nextFloat();
			
			System.out.printf("Nota do exame: %.1f\n", e);
			rec = (media + e) / 2;
			
			if (media >= 5) {
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f\n",  rec);
			}
			
			else {
				System.out.println("Aluno reprovado.");
				System.out.printf("Media final: %.1f\n",  rec);
			}
		}
		
		else {
			System.out.printf("Media: %.1f\n",  media);
			System.out.println("Aluno reprovado.");
		}
		
	}
}