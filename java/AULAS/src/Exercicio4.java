
import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args)
	{
		double a,b,c,d,r,s;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Atribua um valor a variável A: ");
		a = in.nextDouble();
		System.out.print("Atribua um valor a variável B: ");
		b = in.nextDouble();
		System.out.print("Atribua um valor a variável C: ");
		c = in.nextDouble();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		d = (r+s)/2;
		
		System.out.printf("R=(A+B)^2, então R = %.2f", r);
		System.out.printf("\nS=(B+C)^2, então S = %.2f", s);
		System.out.printf("\nD=(R+S)/2, então D = %.2f", d);
		
		in.close();
	}
}
