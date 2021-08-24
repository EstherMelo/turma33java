programa
{
	
	funcao inicio()
	{
		cadeia nome, chefa
		inteiro valor = 600
		
		escreva("Qual eh o seu nome? ")
		leia(nome)

		escreva("Voce eh a chefa da familia? (sim ou nao) ")
		leia(chefa)

		se (chefa == "sim") {
			escreva("Valor do auxilio eh " + (valor * 2) + "\n")
		} senao se (chefa == "nao") {
			escreva("Valor do auxilio eh " + valor + "\n")
		} senao {
			escreva("Voce nao respondeu a pergunta anterior corretamente!")
		}

		 
}

	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 446; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */