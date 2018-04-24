import java.io.IOException;

public class Exercicio1097 
{
	public static void main(String[] args) throws IOException
	{
		int i = 1, j = 7;
		for (int a = 5; a > 0; a --) {
			for(int x = 0; x < 3; x++) {
				System.out.println("I="+i+" J="+j);
				j --;
			}
			i += 2;
			j += 5;
		}
	}
}
