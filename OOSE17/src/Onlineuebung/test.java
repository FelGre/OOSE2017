package Onlineuebung;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modul m1 = new Modul("Lineare Algebra");
		Modul m2 = new Modul("Analysis");
		Student s = new Student("Francois","Egner",297654, 4);
		
		s.anmelden(m1);
		s.anmelden(m2);
	}

}
