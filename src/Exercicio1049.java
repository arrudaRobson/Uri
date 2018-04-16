import java.io.IOException;
import java.util.Scanner;

public class Exercicio1049
{
	public static void main(String[] args) throws IOException {
		String a, b, c;
		
		Scanner entrada = new Scanner(System.in);
		
		a = entrada.next();
		b = entrada.next();
		c = entrada.next();
	
		if(a.equals("vertebrado")) {
			if(b.equals("ave")) {
				if (c.equals("carnivoro")) {
					System.out.println("aguia");
				}
				else if (c.equals("onivoro")) {
					System.out.println("pomba");
				}
			}
			else if(b.equals("mamifero")) {
				if (c.equals("herbivoro")) {
					System.out.println("vaca");
				}
				else if (c.equals("onivoro")) {
					System.out.println("homem");
				}
			}
		}
		else if(a.equals("invertebrado")) {
			if(b.equals("inseto")) {
				if (c.equals("hematofago")) {
					System.out.println("pulga");
				}
				else if (c.equals("herbivoro")) {
					System.out.println("lagarta");
				}
			}
			else if(b.equals("anelideo")) {
				if (c.equals("hematofago")) {
					System.out.println("sanguessuga");
				}
				else if (c.equals("onivoro")) {
					System.out.println("minhoca");
				}
			}
		}
	}
}