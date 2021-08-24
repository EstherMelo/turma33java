programa
{
	
	funcao inicio()
	{
		inteiro numero
		
		escreva("Digite um numero inteiro: ")
		leia(numero)

		se (numero < 0) {
			escreva("O numero eh negativo")
		} senao se (numero == 0) {
			escreva("O numero zero eh neutro")
		} senao se (numero % 2 == 0) {
			escreva("O numero eh par")
		} senao {
			escreva("O numero eh impar")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 346; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */