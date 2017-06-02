package Blatt4;


	public class Point {
		public double x,y;
		
		//Konstruktor: Initialisiert die Klasse Point mit zwei übergebenen Werten, die x und y entsprechen
		public Point(double nx, double ny){ //Punkt initialisieren
			x = nx;
			y = ny;
		}
		
		//Funktion zum quadrieren einer übergebenen Zahl
		public double quad(double x){ //Funktion zum quadrieren schreiben
			return x * x;
		}
		
		//Berechnet den zweidimensionalen Vektor zwischen p1 und p2. Anschließen wird der Betrag des Vektor berechnet, der äquivalent zum Abstand der zwei Punkte ist
		public double distance(Point p1, Point p2){
			double distanz;
			distanz = Math.sqrt(quad(p2.x -p1.x) + quad(p2.y - p1.y)); //Distanz berechnen
			return distanz;
		}
		
		//Gibt den Punkt in einer leserlichen Form aus
		public void ausgabe(){ //Punkt leserlich ausgeben
			System.out.println("Punkt1: x=" + x + " y=" + y);
		}
	}

