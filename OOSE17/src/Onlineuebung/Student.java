package Onlineuebung;

public class Student {
	private String vorname;
	private String nachname;
	private int matrikelnummer;
	private int semester;
	
	
	public Student(String vorname, String nachname, int matrikelnummer, int semester){
		this.vorname = vorname;
		this.nachname = nachname;
		this.matrikelnummer = matrikelnummer;
		this.semester = semester;
	}
	
	public void anmelden(Modul m){
		if (m.bearbeiteAnmeldung(this)){
			System.out.println(vorname + " " + nachname + ": Ich wurde zugelassen für " + m.getName());
		}else{
			System.out.println(vorname + " " + nachname + ": Ich wurde nicht zugelassen für " + m.getName());
		}
	}
	
	public String getVorname(){
		return vorname;
	}
	
	public String getNachname() {
		return nachname;
	}
	
	public int getMatrikelnummer(){
		return matrikelnummer;
	}
	
	public int getSemester(){
		return semester;
	}
}
