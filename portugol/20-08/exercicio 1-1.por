programa
{
	
	funcao inicio()
	{
	inteiro p, ex, m

		
		escreva("Olá!, Favor digitar a quantidade de tomates em quilogramas(kg)")
		leia(p)
		se (p>50){
			ex = p - 50
			m = ex * 4
		}
		senao{
			m=0
			ex=0
		}
		escreva("o peso do excesso é de: ", ex ," e a multa sera de: ", m)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 14; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */