package classes;

public class Exer3ProdutoEletronico {
	public String name;
	public String category;
	public int inventory;
	public int volt;
	public double price;
	public boolean power = false;
	
	//Contrutor vaziu
	public Exer3ProdutoEletronico(){

	}
	//Construtor full
	public Exer3ProdutoEletronico(String name, String category, int inventory, int volt){
		this.name = name;
		this.category = category;
		this.inventory = inventory;
		this.volt = volt;
	}
	
	
	//Get e Set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getInventory() {
		return inventory;
	}
	
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	//Métodos
	public boolean ligar(){
		return this.power = true;
	}
	
	public boolean desligar(){
		return this.power = false;
	}
	
	

}
