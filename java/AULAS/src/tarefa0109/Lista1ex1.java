package tarefa0109;

import java.util.Scanner;

public class Lista1ex1 {
	
public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		// Entradas
		int a, b, c;
		
		System.out.println("Digite um numero inteiro positivo");
		a = leia.nextInt();
		
		System.out.println("Digite outro numero inteiro positivo");
		b = leia.nextInt();
		
		System.out.println("Digite outro numero inteiro positivo");
		c = leia.nextInt();
		
		//processamento
		if (a > b && a > c) {
			System.out.println("O Maior é o numero:"+a);
		}
		else if (b > c) {
			System.out.println("O Maior é o numero:"+b);
		}
		else  {
			System.out.println("O Maior é o numero:"+c);
		}

		//saida
	}

}
