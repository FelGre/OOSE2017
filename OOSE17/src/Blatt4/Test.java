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
		
		Point p1 =  new Point(3,9);
		Point p2 =  new Point(14,19);
		System.out.println(p1.distance(p1, p2));
		
		Point3D pp1 = new Point3D(3,8,17);
		Point3D pp2 = new Point3D(2,99,100);
		System.out.println(pp1.distance(pp1, pp2));

	}

}
