import java.util.Scanner;

public class Exercicio3 {
	
	
	public static void main(String[] args) 
	{
		int resto, horas, minutos, segundos;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite a duração do evento em segundos: ");
		segundos = in.nextInt();
		horas = segundos/3600;
		resto = segundos%3600;
		minutos = resto/60;
		segundos = resto%60;
		System.out.printf("O evento tem %d horas, %d minutos e %d segundos de duração.", horas, minutos, segundos);
		
		in.close();	

	}

}
