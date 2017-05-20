package Blatt4;

public class traceOperator implements Operator {
	public Object execute(Object matrix) { 
		Matrix2D neuematrix = (Matrix2D) matrix; //Übergebenes Objekt in Matrix2D-Variable speichern und casten
		double spur;
		spur = neuematrix.sammlung[0] + neuematrix.sammlung[3]; //Spur berechnen
		return spur; //Spur zurückgeben
	}

}