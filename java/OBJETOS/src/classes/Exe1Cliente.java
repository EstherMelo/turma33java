package classes;

public class Exe1Cliente {
	
	public String nome;
	public boolean ativo=false;
	
	public void ativarCliente() {
		System.out.println("O cadastro do cliente foi ativado!");
		ativo=true;
	}
	public void desativarCliente() {
		System.out.println("O cadastro do cliente foi desativado!");
		ativo=false;
	}
	public void ativoCliente() {
		if(ativo) {
			System.out.println("Cliente: "+nome+"\nSitua��o: ativo");
		}
		else {
			System.out.println("Cliente: "+nome+"\nSitua��o: desativo");
		}
	}
}
