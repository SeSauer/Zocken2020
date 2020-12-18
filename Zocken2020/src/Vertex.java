
public class Vertex {
		public double x;
		public double y;
		
		public Vertex(double x, double y) {
			this.x=x;
			this.y=y;
		}

		public String toString() {
			return "("+x+","+y+")"; }
		
		public double length() {
			return Math.sqrt(x*x+y*y);
		}
		
		public Vertex scalarMultiply(double factor) {
			return new Vertex(x*factor, y*factor);
		}
		
		public void add(Vertex v) {
			x=x+v.x;
			y=y+v.y;
		}
		
		public void sub(Vertex v) {
			x=x-v.x;
			y=y-v.y;
		}
		public boolean equals(Object v){
			if(v instanceof Vertex) {
				Vertex w = (Vertex)v;
				return w.x==x && w.y ==y; 
			}
			return false;
		}

}


