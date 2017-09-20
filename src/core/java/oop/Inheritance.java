package core.java.oop;

public class Inheritance {
	public static void main(String[] args) {
		// Retangle1 sq = new Square(5);
		Square sq = new Square(5);
		System.out.println(sq.area());

		sq.method(5);
		sq.method(5, 2);
	}
}

class Retangle1 {
	private int width;
	private int height;

	public Retangle1(int w, int h) {
		this.width = w;
		this.height = h;
	}

	public int area() {
		return this.width * this.height;
	}
}

// Square is a retangle
class Square extends Retangle1 {
	public Square(int side) {
		super(side, side);// implicit super constructor needed
	}

	public void method(int x) {// overloading
		System.out.println(this.area() + x);
	}

	public void method(int x, int y) {// overloading
		System.out.println(this.area() + x + y);
	}
}
