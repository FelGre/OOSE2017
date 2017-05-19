package Blatt4;


	public class Point {
		public double x,y;
		
		public Point(double nx, double ny){
			x = nx;
			y = ny;
		}
		
		private double quad(double x){
			return x * x;
		}
		
		public double distance(Point p1, Point p2){
			double distanz;
			distanz = Math.sqrt(quad(p2.x -p1.x) + quad(p2.y - p1.y));
			return distanz;
		}
		
		public void ausgabe(){
			System.out.println("Punkt1: x=" + x + " y=" + y);
		}
	}

