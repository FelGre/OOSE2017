package Blatt4;

public class traceOperator implements Operator {
	
	//Funktion zur Berechnung der Spur einer übergebenen 2DMatrix
	public Object execute(Object matrix) { 
		Matrix2D neuematrix = (Matrix2D) matrix; //�bergebenes Objekt in Matrix2D-Variable speichern und casten
		double spur;
		spur = neuematrix.sammlung[0] + neuematrix.sammlung[3]; //Spur berechnen
		return spur; //Spur zur�ckgeben
	}

}