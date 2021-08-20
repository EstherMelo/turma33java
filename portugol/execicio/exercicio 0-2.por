//2. Faça um sistema que leia a idade de uma pessoa expressa em dias 
//e mostre-a expressa em anos, meses e dias.

programa
{
	
	funcao inicio()
	{
		inteiro idadePessoaEmDias  
		inteiro anos 
		inteiro meses
		inteiro dias 


	escreva("informe a idade de uma pessoa expressa em dias :")	 			
	leia(idadePessoaEmDias) 

	anos = idadePessoaEmDias / 365
	meses = (idadePessoaEmDias % 365)/30
	dias = (idadePessoaEmDias % 365)/30
	
	escreva("\nAnos  : "+anos)
	escreva("\nMeses : "+meses)
	escreva("\nDias  : "+dias) 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 525; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */