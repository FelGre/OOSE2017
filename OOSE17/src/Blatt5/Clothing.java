package Blatt5;

public class Clothing extends Product {
	
	int groesse;
	String material;
	
	public Clothing(String name, String desc, double price, int groesse, String material) {
		super(name, desc, price);
		this.groesse = groesse;
		this.material = material;
		
	}
	
	public String toString(){
		return "Name: " + name + " Beschreibung: " + description + " Preis: " + getPriceWithTax() + " Grösse: " + groesse + " Material: " + material;
	}
}
