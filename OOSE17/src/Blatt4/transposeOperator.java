package Blatt4;

public class transposeOperator implements Operator {

	public Object execute(Object matrix) {
		Matrix2D neuematrix = (Matrix2D) matrix; //Übergebene Matrix in 2DMatrix umwandeln
		
		double w1 = neuematrix.sammlung[0];
		double w2 = neuematrix.sammlung[1];
		double w3 = neuematrix.sammlung[2];
		double w4 = neuematrix.sammlung[3];
		
		neuematrix.sammlung[0] = w1;
		neuematrix.sammlung[2] = w3;
		neuematrix.sammlung[1] = w2;
		neuematrix.sammlung[3] = w4;
		
		return neuematrix;
	}

}
