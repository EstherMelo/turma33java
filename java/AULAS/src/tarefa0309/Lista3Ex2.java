package tarefa0309;

import java.util.Random;
import java.util.Scanner;

public class Lista3Ex2 {
	public static void main(String[] args) {
		
				Scanner leia = new Scanner(System.in);
				Random random = new Random();

				int lancamento[] = new int[10];
				int maior = 0, quantidade = 1, total = 0, media;
				System.out.println("Lan�amento de dados-\n");
				for (int x = 0; x < 10; x++) {
					System.out.println("Digite o " + x + "� valor do dado lan�ado: ");
					lancamento[x] = random.nextInt();
					lancamento[x] = leia.nextInt();
		         while(lancamento[x]>6) {
		        	 System.out.println("Digite um valor de 1 a 6: ");
		        	 lancamento [x] = leia.nextInt();
		         }
		        	 total = total+lancamento[x];  
		           if(lancamento[x]>maior) {
		        	   maior = lancamento[x];
		        	   quantidade=1;
		           }
		           else if(lancamento[x]==maior) {
		        	   quantidade++;
		           }
		          
				}

				media = total/10;
				System.out.println("Os lan�amentos foram:\n");
				for(int x=0; x<10; x++) {
					System.out.println("" +lancamento[x]+",");
				}
				
			    System.out.println("A m�dia foi de: "+media);
			    System.out.println("O maior n�mero lan�ado foi "+maior+" e ele foi lan�ado "+quantidade+" vezes!!");
			
			
			}
}
