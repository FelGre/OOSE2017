package Blatt4;

public class Point3D extends Point {
	private double z; //Erweiterte Koordinate deklarieren
	
	//Konstruktor: setzt den privaten Wert z und ruft den Konstruktor der vererbten Klasse auf, sodass Pont3D ingsesamt 3 Koordinaten/private Variablen besitzt
	public Point3D(double nx, double ny, double nz) {
		super(nx, ny); //Super-Konstruktor aufrufen, da Point3D von Point erbt und Point x und y beinhaltet (Erbende Klasse ertweitert quasi nur die vererbt Klasse)
		z = nz; //Die dritte Koordinate, z, initialisieren
	}
	
	//Bildet aus den zwei Punkten den Vektor, der die zwei Punkte verbindet. Berechnet anschließend den Betrag des Vektor, der äquivalent der Distanz der beiden Punkte ist
	public double distance(Point3D p1, Point3D p2){
		double distanz;
		distanz = Math.sqrt(quad(p2.x -p1.x) + quad(p2.y - p1.y) + quad(p2.z - p1.z)); //quad wird von der vererbten Klasse aufgerufen, Distanz wird berechnet
		return distanz;
	}
	
	//Gibt den Punkt leserlich aus
	public void ausgabe(){
		System.out.println("Punkt1: x=" + x + " y=" + y + " z= " + z); //Punkt-Koordinate bzw. Vektor vom Ursprung aus wird leserlich ausgegeben
	}
}
