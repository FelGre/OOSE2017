package Blatt4;

public class transposeOperator implements Operator {
	
	//Transponieren einer übergebenen 2DMatrix
	public Object execute(Object matrix) {
		Matrix2D neuematrix = (Matrix2D) matrix; //�bergebenes Objekt in Matrix2D-Variable speichern und casten
		
		//Werte von �bergebener Matrix zwischenspeichern
		double w1 = neuematrix.sammlung[0];
		double w2 = neuematrix.sammlung[1];
		double w3 = neuematrix.sammlung[2];
		double w4 = neuematrix.sammlung[3];
		
		//Das eigentliche Transponieren
		neuematrix.sammlung[0] = w1;
		neuematrix.sammlung[2] = w3;
		neuematrix.sammlung[1] = w2;
		neuematrix.sammlung[3] = w4;
		
		//Durch transponieren Entstandene Matrix zur�ckgeben
		return neuematrix;
	}
	//Zweifel: Übergebene Matrix soll verändert werden. In diesem Code wird eine neue Matrix initialisiert, weshalb die eigentliche Matrix sich nicht ändert.
	//Die Aufgabe war aber das Transponieren der übergebenen Matrix, weshalb hier mit einer shallow-Kopie gearbeitet werden muss bzw. lediglich mit der
	//Referenz der übergebenen Matrix. In der Dokumentation muss explizit darauf hingewiesen werden, dass die Funktion eine neue Matrix zurückgibt und deshalb
	//ggf. die alte Matrix überschrieben wird, wenn mit der transponierten Matrix weitergearbeitet werden soll.
	//Da die Funktion ein Object-Objekt zurückgeben muss, kann hier alternativ ein Boolean-Wert zurückgegeben werden, welcher als Indikator dafür dient
	//ob das Transponieren erfolgreich war oder nicht. Dementsprechend wäre True äquivalent zu "Transponieren erfolgreich" und False äquivalent zu "Transponieren fehlgeschlagen"
}
