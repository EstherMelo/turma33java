programa
{
	
	funcao inicio()
	{
	
		real ip
		escreva("Digite o Indice de poluição atual: ")
		leia(ip)
		
		se (ip >= 0.3 e ip<0.4){
			escreva("Indice de poluição acima de 0,3 e menor que 0,4 ")
			escreva("\nsuspender as atividades das empresas do grupo 1")
		}
		senao se (ip >= 0.4 e ip<=0.5){
			escreva("Indice de poluição acima de 0,4 e menor que 0,5 ")
			escreva("\nsuspender as atividades das empresas do grupo 1 e 2")
		}
		senao se (ip >= 0.5){
			escreva("Indice de poluição acima de 0,5 ")
			escreva("\nsuspender as atividades das empresas do grupo 1 , 2 e 3")
		}
		senao{
			escreva("indice menor que 0,3 ,\ntodas empresas podem continuar")
		
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 671; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */