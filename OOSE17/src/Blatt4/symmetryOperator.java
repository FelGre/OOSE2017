package Blatt4;

public class symmetryOperator implements Operator{

	public Object execute(Object matrix) {
		Matrix2D neuematrix = (Matrix2D) matrix; //Übergebene Matrix in 2DMatrix umwandeln
		return (neuematrix.sammlung[1] == neuematrix.sammlung[2] ? true : false); //Prüfen ob 1. Zeile 2.Spalte indentich mit 2.Zeil 1.Spalte ist und zurückgeben
	}

}
