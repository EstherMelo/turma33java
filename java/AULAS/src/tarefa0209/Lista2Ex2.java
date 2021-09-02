package tarefa0209;

import java.util.Scanner;

/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

public class Lista2Ex2 {
	
	public static void main(String[] args) {
		// vars
			int qtdPares;
			int qtdImpares;
			int temp;
			Scanner read;
	
			qtdPares = 0;
			qtdImpares = 0;
			read = new Scanner(System.in);
		// processing
			for (int n = 0; n < 10; n++)
			{
				System.out.print("Número #" + (n + 1) + ": ");
				temp = read.nextInt();
				
				// verificar se par||impar
					if ((temp % 2) == 0)
						qtdPares += 1;
					else
						qtdImpares += 1;
			}

		// output
			System.out.println("\nResultado");
			System.out.println("Quantidade de números pares: " + qtdPares);
			System.out.println("Quantidade de números ímpares: " + qtdImpares);
	}


}
