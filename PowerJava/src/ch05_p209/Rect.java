package ch05_p209;

public class Rect {

	int width, height;
	
	public Rect (int w, int h) {
		this.width = w;
		this.height = h;
	}
	double getArea () {
		return (double) width*height;
	}
}
