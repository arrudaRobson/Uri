import java.io.IOException;
import java.util.Scanner;

public class Exercicio1040 
{
	public static void main(String[] args) throws IOException
	{
		float N1, N2, N3, N4,media,N5,novaMedia;

        Scanner input =new Scanner(System.in);

        N1 =input.nextFloat();
        N2 =input.nextFloat();
        N3 =input.nextFloat();
        N4 =input.nextFloat();

        media =((N1 * 2)+(N2 * 3)+( N3 * 4)+(N4 * 1))/10;

        if (media >= 7.0) {
        	System.out.printf("Media: %.1f\n",media);
        	System.out.printf("Aluno aprovado.\n");
		} else if (media >= 5.0 && media <= 6.9) {
			System.out.printf("Media: %.1f\n",media);
			System.out.printf("Aluno em exame.\n");
			N5 =input.nextFloat();
			System.out.printf("Nota do exame: %.1f\n",N5);
			novaMedia =(media + N5) / 2;
		   if (novaMedia >= 5.0) {
			   System.out.printf("Aluno aprovado.\n");
		   }else {
			   System.out.printf("Aluno reprovado.\n");
		   }
		 System.out.printf("Media final: %.1f\n",novaMedia);
		 
		} else if (media < 5.0) {
			System.out.printf("Media: %.1f\n",media);
			System.out.printf("Aluno reprovado.\n");
		}
	}
}