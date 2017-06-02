package Blatt5;

public class Angestellter {
	private String vorname;
	private String nachname;
	private int alter;
	private int gehalt;
	
	public Angestellter(String vorname, String nachname, int alter, int gehalt){
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.gehalt = gehalt;
	}
	
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
	
	public void setVorname(String vorname){
		this.vorname = vorname;
	}
	
	public void setNachname(String nachname){
		this.nachname = nachname;
	}
	
	public void setAlter(int alter){
		this.alter = alter;
	}
	
	public void setGehalt(int gehalt){
		this.gehalt = gehalt;
	}
}
