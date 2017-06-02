package Blatt5;

public class Product {
	protected  String name;
	protected  String description;
	protected  double price; // Netto
	
	//Einen modifier um die Sichtbarkeit von Variablen nur auf Subclasses zu beschränken existiert nicht
	//Protected ist ein Modifier, der der gewünschten Sichtbarkeit am ähnlichsten ist
	//Link zum offiziellen Tutorial, welches  die Sichtbarkeiten der Modifier erklärt: http://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
		
	
	public Product(String name, String desc, double price) {
			this.name = name;
			this.description = desc;
			this.price = price;
		}
	
	 final double getPriceWithTax() {
		return price * 1.19;
	}
		

		
		
		
}
