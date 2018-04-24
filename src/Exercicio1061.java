import java.io.IOException;
import java.util.Scanner;

public class Exercicio1061 
{
	public static void main(String[] args) throws IOException
	{
		int x, y, dia, hora, min, seg, a, b, c, d, e, f;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dia ");
		String day[] = entrada.nextLine().split("");
		String in[] = entrada.nextLine().split(" : ");
		
		System.out.print("Dia ");
		String da[] = entrada.nextLine().split("");
		String out[] = entrada.nextLine().split(" : ");
		x = Integer.parseInt(day[0]);
		y = Integer.parseInt(da[0]);
		a = Integer.parseInt(in[0]);
		b = Integer.parseInt(in[1]);
		c = Integer.parseInt(in[2]);
		d = Integer.parseInt(out[0]);
		e = Integer.parseInt(out[1]);
		f = Integer.parseInt(out[2]);
		
		dia = y - x;
		
		if (dia < 0) {
			dia ++; 
		}
		
		hora = d - a;
		if (hora < 0) {
			hora += 24;
			dia --;
		}
		
		min = e - b;
		if (min < 0) {
			min += 60;
			hora --;
		}
		
		seg = f - c;
		if (seg < 0) {
			seg += 60;
			min --;
		}
	
		System.out.printf("%d dia(s)\n%d hora(s)\n%d minuto(s)\n%d segundo(s)\n",dia,hora,min,seg);	
	}
}
