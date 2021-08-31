import java.util.Scanner;

public class exercicio2 {


		

		public static void main(String[] args) 
		{
			int resto, anos, meses, dias;
			Scanner in = new Scanner(System.in);
			
			System.out.print("Digite sua idade em dias: ");
			dias = in.nextInt();
			anos = dias/365;
			resto = dias%365;
			meses = resto/30;
			dias = resto%30;
			System.out.printf("Você tem %d anos, %d meses e %d dias.", anos, meses, dias);
			
			in.close();		
		}

	}

