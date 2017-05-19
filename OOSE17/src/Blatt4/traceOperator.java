package Blatt4;

public class traceOperator implements Operator {
	public Object execute(Object matrix) { // Spur berechnen
		Matrix2D neuematrix = (Matrix2D) matrix; //Übergebene Matrix in 2DMatrix umwandeln
		double spur;
		spur = neuematrix.sammlung[0] + neuematrix.sammlung[3];
		return spur;
	}

}