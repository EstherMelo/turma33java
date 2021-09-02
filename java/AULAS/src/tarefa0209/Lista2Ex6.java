package tarefa0209;

import java.util.Scanner;

/*6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
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
			// informar os n�meros
				System.out.print("N�mero #" + i + " : "); // �ndice para cada n�mero
				numeroDigitado = read.nextDouble();
				
			// m�ltiplos de 3
				if ((numeroDigitado % 3) == 0)
				{
					somaDosNumerosMultiplosDe3 += numeroDigitado;
					mediaDosNumerosMultiplosDe3 += numeroDigitado;
					totalDosNumerosMultiplosDe3 += 1;
				}
				
				totalDosNumerosDigitados += 1;				
		} while (numeroDigitado != 0);
		read.close();
		
		totalDosNumerosDigitados--;	  // -1 PARA N�O CONTAR O ZERO
		totalDosNumerosMultiplosDe3--;// -1 PARA N�O CONTAR O ZERO
		
		mediaDosNumerosMultiplosDe3 /= totalDosNumerosMultiplosDe3; // CALCULA A M�DIA
	// output
			System.out.println("____________RESULTADO________________________");
			System.out.println("Total de n�meros digitados : " + totalDosNumerosDigitados + " n�meros");
			System.out.println("Total de n�meros multiplos de 3: " + totalDosNumerosMultiplosDe3); // S� UM EXTRA, N�O FOI PEDIDO
			System.out.println("M�dia dos n�meros digitados que s�o m�ltiplos de 3: " + mediaDosNumerosMultiplosDe3);
	}

}
