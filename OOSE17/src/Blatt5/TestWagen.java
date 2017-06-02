package Blatt5;

public class TestWagen {

	public static void main(String[] args) {
		Auto auto1 = new Lastwagen();
		System.out.println(auto1.reifen); // Ausgabe 1)
		System.out.println(((Lastwagen) auto1).reifen); // Ausgabe 2)
		System.out.println(auto1.getReifen()); // Ausgabe 3)
		System.out.println(((Lastwagen) auto1).getReifen()); // Ausgabe 4)
		
		//Ausgabe1: auto1 ist vom Typen Auto, deswegen wird auf die reifen-Variable von Auto zugegriffen
		//Ausgabe2: durch das typecasten von auto1 auf explizit Lastwagen, wird die reifen-Variable von Lastwagen ausgegeben
		//Ausgabe3: getReifen() ist sowohl in Auto, also auch in Lastwagen spezifiziert. Lastwagen lässt die reifen Variable von seiner
		//Instanz ausgeben (this). Da dem Auto Objekt ein Lastwagen Objekt zugewiesen wird, wird die Methode von Lastwagen augerufen
		//Ausgabe4: Durch explizites typcasten von auto1 zu Lastwagen wird sowieso die getReifen() Methode von Lastwagen genutzt

}
