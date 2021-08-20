//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos
//e mostre-o expresso em horas, minutos e segundos.
	programa
{
	
	funcao inicio()
	{
		inteiro tempoemsegundos   
		inteiro horas 
		inteiro minutos 
		inteiro segundos  


	escreva("escreva o tempo em segundos do evento :")	 			
	leia(tempoemsegundos) 

	horas = tempoemsegundos / 3600
	minutos = (tempoemsegundos % 3600)/60
	segundos = (tempoemsegundos % 3600)%60
	
	escreva("\nhoras  : "+horas)
	escreva("\nminutos : "+minutos)
	escreva("\nsegundos : "+segundos) 
											}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 582; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */