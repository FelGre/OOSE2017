package Blatt4;

public class Point3D extends Point {
	double z;
	
	public Point3D(double nx, double ny, double nz) {
		super(nx, ny);
		z = nz;
	}
	
	private double quad(double x){
		return x * x;
	}
	
	public double distance(Point3D p1, Point3D p2){
		double distanz;
		distanz = Math.sqrt(quad(p2.x -p1.x) + quad(p2.y - p1.y) + quad(p2.z - p1.z));
		return distanz;
	}
	
	public void ausgabe(){
		System.out.println("Punkt1: x=" + x + " y=" + y + " z= " + z);
	}
}
