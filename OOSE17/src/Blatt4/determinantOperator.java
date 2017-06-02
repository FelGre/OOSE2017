package Blatt4;

public class determinantOperator implements Operator {

	//Berechnet die Determinante der übergebenen Matrix
	public Object execute(Object matrix) {
		Matrix2D neuematrix = (Matrix2D) matrix; //�bergebene Objekt in neue lokale Variable schreiben und casten
		double determinante; //Variable f�r Determinante deklarieren
		determinante = neuematrix.sammlung[0] * neuematrix.sammlung[3] - neuematrix.sammlung[1] * neuematrix.sammlung[2]; //Determinante berechnen
		return determinante; //Determinante zur�ckgeben
	}

}
