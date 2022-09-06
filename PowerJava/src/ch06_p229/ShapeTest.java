package ch06_p229;

class Shape{
	
	protected int x,y;
	
	public void draw() {
		System.out.println("Shape draw");
	}
}

class Rectangle extends Shape{
	
	private int width, height;
	public void draw() {
		System.out.println("Rectangle draw");
	}
}

class Triangle extends Shape{
	
	private int base, width;
	public void draw() {
		System.out.println("Triangle draw");
	}
}

class Circle extends Shape{
	
	private int radius;
	public void draw() {
		System.out.println("Circle draw");
	}
}

public class ShapeTest {
	public static void main(String[] args) {

		Shape s = new Rectangle();
		s.x = 0;
		s.y = 0;
	}

}
