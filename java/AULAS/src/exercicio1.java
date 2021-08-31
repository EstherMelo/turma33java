
import java.util.Scanner;

public class Exercicio1 {
	

		public static void main(String[] args) 
		{
			int anos, meses, dias, totalDias;
			
			Scanner in = new Scanner(System.in);
			
			System.out.print("Digite os anos: ");
			anos = in.nextInt();
			System.out.print("Digite os meses: ");
			meses = in.nextInt();
			System.out.print("Digite os dias: ");
			dias = in.nextInt();
			totalDias = ((anos*365)+(meses*30)+dias);
			System.out.printf("Sua idade em dias é de %d dias.", totalDias);
			
			in.close();

		}

	}

