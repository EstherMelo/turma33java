package aplicacoes;


import classes.Exer2Aviao;

public class exer2 {
	public static void main(String[] args) {
		
		Exer2Aviao dodo = new Exer2Aviao();
		dodo.modelo="Asalonga";
		dodo.ligarAviao();
		dodo.subir(10);
		dodo.estadoAviao();
		dodo.descer(5);
		dodo.descer(5);
		dodo.desligarAviao();
		dodo.estadoAviao();
		

	}
}
