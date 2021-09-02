package tarefa0209;

import java.util.Scanner;
/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
public class Lista2Ex3 {
	public static void main(String[] args) {
		//vars
			int menos21;
			int mais50;
			int temp;
			int idPessoa;
			Scanner read;
			
			menos21 = 0;
			mais50 = 0;
			temp = 0;
			idPessoa = 0;
			read = new Scanner(System.in);
		//processing
			while (true)
			{
				idPessoa += 1;
				System.out.println("Idade da pessoa " + idPessoa + ": ");
				temp = read.nextInt();
					// verificar se termina o programa ou não (-99)
						if (temp == -99)
							break;						
					// calcula as qtds de cada idade
						if (temp < 21)
							menos21++;
						else if(temp > 50)
							mais50++;			
			}			
		//output
			System.out.println("Resultado: ");
			System.out.println("Quantidade de pessoas com menos de 21: " + menos21);
			System.out.println("Quantidade de pessoas com mais de 50: " + mais50);			
	}

}
