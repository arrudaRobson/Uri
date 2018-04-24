import java.io.IOException;

public class Exercicio1095 
{
	public static void main(String[] args) throws IOException
	{
		int j = 60, i = 1;
		for (int a = 60; a >= 0; a --) {
			System.out.println("I="+i+" J="+j);
			i += 3;
			j -= 5;
			if(j == 0) {
				System.out.println("I="+i+" J="+j);
				break;
			}
		}
	}
}
