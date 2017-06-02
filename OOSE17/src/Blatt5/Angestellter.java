package Blatt5;

public class Angestellter {
	//Instanzvariablen
	private String vorname;
	private String nachname;
	private int alter;
	private int gehalt;
	
	//Konstruktor
	public Angestellter(String vorname, String nachname, int alter, int gehalt){
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.gehalt = gehalt;
	}
	
	//Getter-Methoden für globalen Zugriff auf die Instanzvariablen
	public String getVorname(){
		return vorname;
	}
	
	public String getNachname(){
		return nachname;
	}
	
	public int getAlter(){
		return alter;
	}
	
	public int getGehalt(){
		return gehalt;
	}
	
	//Methode zum altern des Angestellten um 1 Jahr
	public void altern(){
		alter ++;
	}
	
	//Methode zum erhoehen des Gehaltes um den eingegebenen Betrag summe
	public void gehalterhoehen(int summe){
		gehalt += summe;
	}
}
