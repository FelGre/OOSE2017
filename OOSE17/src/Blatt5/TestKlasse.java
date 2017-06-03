package Blatt5;


public class TestKlasse { //Aufgabe b) Teste Xor mit And,or,not

	public static void main(String[] args) {
		Component in1 = new PassGate(); // A
		Component in2 = new PassGate(); // B
		Component n1 = new NotGate();
		Component n2 = new NotGate();
		Component a1 = new AndGate();
		Component a2 = new AndGate();
		Component o1 = new OrGate();
		
		// Bauteile vernetzen
		in1.connectTo(a1); //A mit And verbinden
		in2.connectTo(n1); //B mit not verbinden
		n1.connectTo(a1);  //not mit and verbinden
		
		in1.connectTo(n2); //A mit not2 verbinden
		in2.connectTo(a2); //B mit and2 verbinden
		n2.connectTo(a2);  //not2 mit and2 verbinden
		
		a1.connectTo(o1); //a1 mit or1 verbinden
		a2.connectTo(o1); //a2 mit or1 verbinden
		
		// Circuit-Klasse instanzieren und Ausgang von Or registrieren
		Circuit c1 = new Circuit();
		c1.exitgates.add(o1);
		
		in1.state = true; // Eingang A festlegen
		in2.state = true; // Eingang B festlegen
		
		// Schaltung simulieren und Wert des ersten und einzigen Ausgang ausgeben
		System.out.print("Xor durch not,and,or: ");
		System.out.println(c1.simulate().get(0));
		
		//Aufgabe c) Test aller weiterer Funktionen
		Component x1 = new XorGate();
		Component nand1 = new NandGate();
		Component nor1 = new NorGate();
		Component in3 = new PassGate(); // C
		Component in4 = new PassGate(); // D
		
		in3.connectTo(x1); //Test Xorgate
		in4.connectTo(x1);
		
		in3.connectTo(nand1);//Test NandGate
		in4.connectTo(nand1);
		
		in3.connectTo(nor1);//Test Norgate
		in4.connectTo(nor1);
		
		//Zweiter circuit, Ausgänge adden
		Circuit c2 = new Circuit();
		c2.exitgates.add(x1);
		c2.exitgates.add(nand1);
		c2.exitgates.add(nor1);
		
		in3.state = false; // Eingang C festlegen
		in4.state = false; // Eingang D festlegen

		// Schaltung simulieren und Werte der Ausgänge ausgeben
		System.out.println("Weitere Tests:");
		System.out.print("Xor: ");
		System.out.println(c2.simulate().get(0));
		System.out.print("Nand: ");
		System.out.println(c2.simulate().get(1));
		System.out.print("Nor: ");
		System.out.println(c2.simulate().get(2));
	}

}
