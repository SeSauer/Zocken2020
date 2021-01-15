
public class simpleOval extends geometricObject {
	
	public simpleOval(double w,double h,Vertex pos) {
		super(w,h,pos);
	}
	public simpleOval(double w, double h) {
		this(w,h,new Vertex(0,0));
	}
	public simpleOval(double w,double h, double x,double y) {
		this(w,h,new Vertex(x,y));
	}
	public simpleOval(double w, Vertex pos) {
		this(w,w,pos);
	}
	public simpleOval() {super();}

	public double area() {
		return (Math.PI*width*height/4);
	}
	public String toString() {
		return "SimpleOval_"+super.toString();
	}
	public boolean equals(Object that) {
		return (that instanceof simpleOval) && super.equals(that);
	}


}

