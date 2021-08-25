programa
{
	
	funcao inicio()
	{
		cadeia nome 
		caracter pronome 
		real nota
		escreva("digite seu nome: ")
		leia(nome)
		escreva("como prefere ser chamade (A/O/U)?: ")

		 	 para(inteiro x=1; x<-5; x++){
		 	 	escreva("Digite uma nota: ")
		 	 	leia(nota)

		 	 	somaNotas = somaNotas + nota
		 	 }
		 	 media = somaNotas / 5)
		 	 se (media <5.00){
		 	 	 escreva("oi "+nome+ sua média é: " + meida" vc será recuperad"+pronome+" em notas")
		 	 }
		 	 senao se (media >=5.00){
		 	 	escreva("oi "+nome+ sua média é: " + meida" vc será aprovad"+pronome+" em notas")
		 	 }
		 	 escreva("A meida é: " + media)
	} 	 
} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 621; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */