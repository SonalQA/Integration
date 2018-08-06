package jfinal;

public class Parent {

	public static void main (String args[]) {
		System.out.println("I am in Parent");
		methods m = new methods();
		m.child1();
	}
}
