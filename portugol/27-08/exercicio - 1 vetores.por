/*1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
programa
{
	
	funcao inicio()
	{
		inteiro x , valores [5]
		real maiorvalor = 0.0

			para (x=0;x<=4;x++) 
			{
				escreva("Qual o maior valor: ")
				leia(valores[x])
				 }
				 
			para (x = 0; x <= 4; x ++) {
				escreva ("[" + valores [x] + "]")
					
					
			se (valores [x]> maiorvalor) {
					maiorvalor = valores[x]
					}
	}
		escreva ("\n")
		escreva("O maior valor desse vetor é:" + maiorvalor)


				
		}
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 584; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valores, 8, 14, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */