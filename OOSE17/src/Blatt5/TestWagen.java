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
				//Ausgabe3: getReifen() ist sowohl in Auto, also auch in Lastwagen spezifiziert. Lastwagen l�sst die reifen Variable von seiner
				//Instanz ausgeben (this). Da dem Auto Objekt ein Lastwagen Objekt zugewiesen wird, wird die Methode von Lastwagen augerufen
				//Ausgabe4: Durch explizites typcasten von auto1 zu Lastwagen wird sowieso die getReifen() Methode von Lastwagen genutzt
		
		//Ohne getReifen() in der Klasse Lastwagen:
		//Es �ndern sich Ausgabe 3 und 4, denn die Klasse Lastwagen �berschreibt nun nicht mehr die die getReifen() Funktion und erbt somit die 
		//Funktion von Auto, die auf die Variable reifen von Auto verweist bzw. zur�ckgibt. Bei Ausgabe2 wird auto1 auf Lastwagen getypcastet, deswegen
		// wird bei Ausgabe 2 die Reifenanzahl von Lastwagen ausgegeben
		
		//Ohne getReifen() in der Klasse Auto:
		//Bei Ausgabe3 wird ein Compiler-Fehler ausgegeben, weil die Variable auto1 vom Typ Auto ist und diese nun keine getReifen() Funktion mehr besitzt.
		//Ausgabe 1 und 2 sind nicht betroffen, weil die Funktion ja gar nicht aufgerufen wird und Ausgabe 4 ist funktionsf�hig, weil auto1 zu Lastwagen
		//getypcastet wird und Lastwagen ja eine besitzt, die die reifen Variable von Lastwagen ausgibt.
	}	
}
