package Blatt4;

public class determinantOperator implements Operator {

	public Object execute(Object matrix) {
		Matrix2D neuematrix = (Matrix2D) matrix; //Übergebene Matrix in 2DMatrix umwandeln
		double determinante; //Variable für Determinante deklarieren
		determinante = neuematrix.sammlung[0] * neuematrix.sammlung[3] - neuematrix.sammlung[1] * neuematrix.sammlung[2]; //Determinante berechnen
		return determinante; //Determinante zurückgeben
	}

}
