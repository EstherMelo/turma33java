//1- Faça um programa que mostre uma contagem na tela de 233 a 456, só que
//contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.

programa
{
	
	funcao inicio()
	{
	    inteiro x=233
	    
         faca{
      	   escreva("\n",x)
      	   se (x>=300 e x<=400){
      	   	x=x+3
      	   }
      	senao{
      		x=x+5	 	  
      	}
         }enquanto (x<456)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 77; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */