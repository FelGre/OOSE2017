package Blatt4;

public class Test {

	public static void main(String[] args) {
		Matrix2D m1 = new Matrix2D(2,3,-1,2);
		Operator alloperators[] = {new determinantOperator(), new traceOperator(),
		new symmetryOperator(), new transposeOperator()};
		for(Operator o : alloperators) {
		System.out.println("Ergebnis " + o.getClass().toString());
		System.out.println(m1.applyOperator(o).toString());
		}
		
		//Tests von Distanzberechnungen
		Point p1 =  new Point(3,9);
		Point p2 =  new Point(14,19);
		System.out.println(p1.distance(p1, p2));
		
		Point3D pp1 = new Point3D(3,8,17);
		Point3D pp2 = new Point3D(2,99,100);
		System.out.println(pp1.distance(pp1, pp2));
		
		//Aufgabe 3 - Tests
		Student student = new Student();
		//I don't like Blumenkohl an Gorgonzolasoﬂe wird ausgegeben, weil die Funktion eat aufgerufen wird, die Cauliflower als "Parametertyp" besitzt, da essen1 ein Cauliflower-Objekt ist
		Cauliflower essen1 = new Cauliflower();
		student.eat(essen1);
		//"I like Spaghetti Bologneser Art" wird ausgegeben, da essen2 ein Spaghetti-Objekt ist, dadurch nicht die eat-Methode mit Cauliflower als "Parametertyp" aufgerufen wird. Da aber Spaghetti Food als Interface implementiert
		//hat, ist sichergestellt dass Spaghetti die Funktion getMeal() besitzt. Dadurch wird die eat-Methode aufgerufen, die Food als "Parametertyp" besitzt. 
		Spaghetti essen2 = new Spaghetti();
		student.eat(essen2);
		
		//"I like Blumenkohl an Gorgonzolasoﬂe" wird ausgegeben, da essen ein Food-Objekt ist. Diesem Objekt wird zwar new Cauliflower() zugewiesen, was nicht schlimm ist, da Cauliflower Food implementier hat und somit
		//gesichert ist, dass essen auch eine GetMeal-Methode hat.
		Food essen = new Cauliflower();
		student.eat(essen);


	}

}
