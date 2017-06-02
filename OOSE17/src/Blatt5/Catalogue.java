package Blatt5;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
	private static ArrayList<Product> products = new ArrayList<Product>(); 
	
	public static void printMe(){
		for (Product product : products){
			System.out.println(product.toString());
		}
	}
	
	public static void main(String[] args) {
		products.add(new Product("Papier", "A4", 2.52));
		products.add(new Clothing("Hemd", "Herrenhemd", 33.61, 48, "Baumwolle"));
		printMe();
	}
}
