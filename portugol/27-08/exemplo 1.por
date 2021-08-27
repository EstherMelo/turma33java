/*times[]
//SPFC
//SANTOS
//PALMEIRAS
//CORINTHIANS
//pontos[] - inteiros
//rode os times e pergunte:
G-ganhou, P-Perdeu ou E-empatou:
g=3, p=0, e=1
3 rodadas com todos os times
ao final mostra o nome de cada time E total de pontos
*/

programa
{
	
	funcao inicio()
	{

		//variaveis
		caracter resultado
		cadeia times[4]

		times[0] = "SPFC"
		times[1] = "SANTOS"
		times[2] = "PALMEIRAS"
		times[3] = "CORINTHIANS"
		
		inteiro pontos[4]

		pontos[0] = 0
		pontos[1] = 0
		pontos[2] = 0
		pontos[3] = 0
		
		
		//entradas
		para (inteiro x=0; x<3; x++)
		{
			escreva("\nRodada ", x)
			
			para (inteiro y=0; y<4; y++)
			{
				escreva("\nQual foi o resultado do time? ", times[y])
				escreva("\nEscreva G=ganhou, P=perdeu, E=empatou: ")
				leia(resultado)
	
				se (resultado == 'g' ou resultado == 'G')
				{
					pontos[y] = pontos[y] + 3
				}
				senao se (resultado == 'p' ou resultado == 'P')
				{
					pontos[y] = pontos[y] + 0
				}
				senao se (resultado == 'e' ou resultado == 'E')
				{
					pontos[y] = pontos[y] + 1
				}
			}
		}
		//saidas
		escreva("\nPLACAR!\n")
		
		para (inteiro x=0; x<4; x++)
		{
			escreva ("\nTime: ", times[x], " pontos ", pontos[x],"\n")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1003; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */