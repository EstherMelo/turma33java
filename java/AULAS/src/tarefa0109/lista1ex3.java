package tarefa0109;

import java.util.Scanner;

public class lista1ex3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Informe a sua idade: ");
		idade = leia.nextInt();
		
		if (idade > 25 || idade < 10 ) {
			System.out.println("A sua idade não se encaixa em nenhuma categoria!");
		}
		else if(idade >= 10 && idade <= 14) {
			System.out.println("Voce esta na categoria infantil!");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Voce esta na categoria juvenil!");
		}
		else {
			System.out.println("Voce esta na categoria Adulto!");
		}
		
	}

}
