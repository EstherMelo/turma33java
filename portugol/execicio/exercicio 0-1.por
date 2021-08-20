//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias 
//e mostre-a expressa apenas em dias. 

programa
{
	
	funcao inicio()
	{
		inteiro anos
		inteiro meses
		inteiro dias

		escreva("qual sua idade em anos ")
		leia (anos)
		
		escreva("qual sua idade em meses ")
		leia (meses)

		escreva("qual sua idade em dias ")
		leia (dias)

		dias = ((anos*365)+(meses*30)+dias)
		escreva ("sua idade em dias é "+dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 350; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */