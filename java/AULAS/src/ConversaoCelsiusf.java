import java.util.Scanner;
public class ConversaoCelsiusf {
	//Variáveis
			static String nome;
			static double tempCelsius;
			static double tempSaida;
			
			

		public static void main(String[] args) {
			Scanner mySc = new Scanner(System.in);
			
			System.out.println("Escreva seu nome: ");
			nome = mySc.next();
			
			System.out.println("temperatura em Celsius: ");
			tempCelsius = mySc.nextDouble();
			 
			
			 tempSaida=(tempCelsius * 1.8 + 32);

			 System.out.println("resultado temperatura em Fahrenheit "+tempSaida);
		    
			
		}
}
