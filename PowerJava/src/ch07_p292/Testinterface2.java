package ch07_p292;

class Shape{
	protected int x,y;
}

interface Drawable{
	void draw();
}

class Circle extends Shape implements Drawable{
	int radius;
	public void draw() {System.out.println("Circle Draw at ("+x+", "+y+")"); }
}

public class Testinterface2 {
	public static void main(String[] args) {
		Drawable obj = new Circle();
		obj.draw();
	}

}
