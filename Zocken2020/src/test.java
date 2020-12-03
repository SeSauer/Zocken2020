
public class test {

	public static void main(String[] args) {
		Vertex v1 = new Vertex(17, 4);
		Vertex v2 = new Vertex(42, 0);
		Vertex vv = new Vertex(0, 0);

		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v1.length());
		System.out.println(v1.scalarMultiply(2));
	}

}
