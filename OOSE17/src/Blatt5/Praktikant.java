package Blatt5;

public class Praktikant extends Angestellter{

	public Praktikant(String vorname, String nachname, int alter) {
		//Festen Betrag des Gehaltes mit dem Wert 400 setzen
		super(vorname, nachname, alter, 400);
		// TODO Auto-generated constructor stub
		
		
		
	}
	
	//Überschreiben der Methode von Praktikant um die Erhöhung zu verhindern
	public void gehalterhoehen(int summe){
		return;
	}
	
	

}
