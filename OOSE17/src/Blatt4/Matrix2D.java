package Blatt4;

public class Matrix2D {
	
	public double[] sammlung = new double[4]; //Array erstellen, welches alle vier Werte der Matrix speichern soll
	
	//Konstruktor: Initialisiert das Matrixobjekt mit den Übergebenen Werten x1 - x4
	public Matrix2D(double w1, double w2, double w3, double w4){
		sammlung[0] = w1; //1. Zeile, 1. Element
		sammlung[1] = w2; //1. Zeile, 2. Element
		sammlung[2] = w3; //2. Zeile, 1. Element
		sammlung[3] = w4; //2. Zeile, 2. Element
	}
	
	//Gibt die Matrix in einer leserlichen Form aus
	public String toString(){
		String leseform; //Lokalen String deklarieren
		leseform = "1,1 = " + sammlung[0] + ",  1,2 = " + sammlung[1] + ", 2,1 = " + sammlung[2] + ", 2,2 = " + sammlung[3]; //Koordinaten als leserlichen String zusammenf�gen
		return leseform; //Finalen String zur�ckgeben
	}
	
	//Methode zum anwenden eines Operators
	public Object applyOperator(Operator o) {
		return o.execute(this);
	}
	
	
	
	
}
