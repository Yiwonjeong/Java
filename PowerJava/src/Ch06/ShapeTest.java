package Ch06;

class Shape2{
	
	protected int x,y;
	
	public void draw() {
		System.out.println("Shape draw");
	}
}

class Rectangle extends Shape2{
	
	private int width, height;
	public void draw() {
		System.out.println("Rectangle draw");
	}
}

class Triangle extends Shape2{
	
	private int base, width;
	public void draw() {
		System.out.println("Triangle draw");
	}
}

class Circle extends Shape2{
	
	private int radius;
	public void draw() {
		System.out.println("Circle draw");
	}
}

public class ShapeTest {
	public static void main(String[] args) {

		Shape2 s = new Rectangle();
		s.x = 0;
		s.y = 0;
	}

}
