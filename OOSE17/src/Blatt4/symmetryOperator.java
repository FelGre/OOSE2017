package Blatt4;

public class symmetryOperator implements Operator{

	public Object execute(Object matrix) {
		Matrix2D neuematrix = (Matrix2D) matrix; //Übergebene Matrix in 2DMatrix umwandeln
		return (neuematrix.sammlung[1] == neuematrix.sammlung[2] ? true : false);
	}

}
