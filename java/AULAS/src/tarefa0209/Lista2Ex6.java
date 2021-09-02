package tarefa0209;

import java.util.Scanner;

/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
public class Lista2Ex6 {

	public static void main(String[] args) {
		//vars
		double numeroDigitado;
		double somaDosNumerosMultiplosDe3;
		double mediaDosNumerosMultiplosDe3;
		int totalDosNumerosMultiplosDe3;
		int totalDosNumerosDigitados;
		int i;
		Scanner read;
		
		somaDosNumerosMultiplosDe3 = 0;
		mediaDosNumerosMultiplosDe3 = 0;
		totalDosNumerosMultiplosDe3 = 0;
		totalDosNumerosDigitados = 0;
		i = 0;
		read = new Scanner(System.in);
		
	//input and processing
		do
		{
			i++;
			// informar os números
				System.out.print("Número #" + i + " : "); // índice para cada número
				numeroDigitado = read.nextDouble();
				
			// múltiplos de 3
				if ((numeroDigitado % 3) == 0)
				{
					somaDosNumerosMultiplosDe3 += numeroDigitado;
					mediaDosNumerosMultiplosDe3 += numeroDigitado;
					totalDosNumerosMultiplosDe3 += 1;
				}
				
				totalDosNumerosDigitados += 1;				
		} while (numeroDigitado != 0);
		read.close();
		
		totalDosNumerosDigitados--;	  // -1 PARA NÃO CONTAR O ZERO
		totalDosNumerosMultiplosDe3--;// -1 PARA NÃO CONTAR O ZERO
		
		mediaDosNumerosMultiplosDe3 /= totalDosNumerosMultiplosDe3; // CALCULA A MÉDIA
	// output
			System.out.println("____________RESULTADO________________________");
			System.out.println("Total de números digitados : " + totalDosNumerosDigitados + " números");
			System.out.println("Total de números multiplos de 3: " + totalDosNumerosMultiplosDe3); // SÓ UM EXTRA, NÃO FOI PEDIDO
			System.out.println("Média dos números digitados que são múltiplos de 3: " + mediaDosNumerosMultiplosDe3);
	}

}
