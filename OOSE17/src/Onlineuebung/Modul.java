package Onlineuebung;

public class Modul {
	private String name;
	private java.util.ArrayList<Student> hoerer = new java.util.ArrayList<>();
	
	public Modul(String name){
		this.name = name;
	}
	
	public boolean bearbeiteAnmeldung(Student s){
		if (hoerer.size() <100){
			hoerer.add(s);
			return true;
		}else{
			return false;
		}
	}
	
	public String getName(){
		return name;
	}
	
	
}
