package tarefa0209;
/*1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/

public class Lista2Ex1 {

	public static void main(String[] args) {
		
		for (int c = 1000;c <= 1999;c++)
		{
			if ((c % 11) == 5)
				System.out.println(c);	
		}
		
	}
}
