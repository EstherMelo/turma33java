package tarefa0309;

import java.util.Scanner;

public class Lista3Ex3 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n1[][] = new int[4][6];
		int n2[][] = new int[4][6];
		int m1[][] = new int[4][6];
		int m2[][] = new int[4][6];

		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 6; y++) {
				System.out.println("Digite o valor da matriz N1 na linha " + x + " e na coluna " + y + ":");
				n1[x][y] = leia.nextInt();

			}
		}

		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 6; y++) {
				System.out.println("Digite o valor da matriz N2 na linha " + x + " e na coluna" + y + ":");
				n2[x][y] = leia.nextInt();
			}
		}
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				m1[x][y] = n1[x][y] + n2[x][y];

			}
		}
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 6; y++) {
				if (n1[x][y] > n2[x][y]) {
					m2[x][y] = n1[x][y] - n2[x][y];
				} else {
					m2[x][y] = n2[x][y] - n1[x][y];

				}

			}
		}

		System.out.println("A matriz 1 �: ");
		for (int x = 0; x <m1.length; x++) {
			System.out.println("\n");
			for (int y = 0; y < m2.length; y++) {
				System.out.println(m1[x][y]+" ");
			}
		}
		System.out.println("A matriz 2 �: ");
		for (int x = 0; x < n1.length; x++) {
			System.out.println("\n");
			for (int y = 0; y < n2.length; y++) {
				System.out.println(m1[x][y]+" ");
				
			}

		}

	}
}
