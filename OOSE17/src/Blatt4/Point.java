package Blatt4;


	public class Point {
		public double x,y;
		
		public Point(double nx, double ny){ //Punkt initialisieren
			x = nx;
			y = ny;
		}
		
		public double quad(double x){ //Funktion zum quadrieren schreiben
			return x * x;
		}
		
		public double distance(Point p1, Point p2){
			double distanz;
			distanz = Math.sqrt(quad(p2.x -p1.x) + quad(p2.y - p1.y)); //Distanz berechnen
			return distanz;
		}
		
		public void ausgabe(){ //Punkt leserlich ausgeben
			System.out.println("Punkt1: x=" + x + " y=" + y);
		}
	}

