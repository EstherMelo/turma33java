programa
{
	
	funcao inicio()
	{
		inteiro c
		real n, ex, sal
		escreva("Qual o código do funcionário: ")
		leia(c)
		escreva ("Digite as horas que ele trabalhou: ")
		leia (n)
		se (n>50){
			ex = n - 50
			sal = 500 + ex * 20
		}
		senao {
			sal = n * 10
		}
		escreva("O funcionário ", c , " terá o salário de ", sal , " reais")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 162; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */