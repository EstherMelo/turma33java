package tarefa0309;

import java.util.Scanner;

public class Lista3Ex4 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int m1[][] = new int[3][3];
		int total = 0, diagonal = 0;

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				System.out.println("Digite o velor da matriz M1 na linha " + x + " e na coluna " + y + ":");
				m1[x][y] = leia.nextInt();
				total = total + m1[x][y];
				if (x == y) {
					diagonal = diagonal + m1[x][y];
				}
			}
			System.out.println("A soma total �: " + total);
			System.out.println("A soma da diagonal principal � de:  " + diagonal);

		}
		leia.close();

	}
}
