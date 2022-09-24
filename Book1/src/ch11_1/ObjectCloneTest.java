package ch11_1;

// 원점을 의미하는 Point 클래스
class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "x= " + x + ", y= " + y;
	}
}

// Cloneable 인터페이스 구현
class Circle implements Cloneable{
	Point point;
	int radius;

	Circle (int x, int y, int radius){
	this.radius = radius;
	point = new Point(x,y);
	}

	public String toString() {
		return "원점은 " + point + "이고, 반지름은 " + radius + "입니다.";
	}
	
	// clone() 메서드 사용시 발생할 수 있는 오류를 예외 처리한다. 
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}

public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle c1 = new Circle(10, 20, 30);
		
		// clone() 메서드를 사용해 c1 인스턴스를 copyc1에 복제한다.
		Circle copyc1 = (Circle) c1.clone();
		
		System.out.println(c1);
		System.out.println(copyc1);
		System.out.println(System.identityHashCode(c1));
		System.out.println(System.identityHashCode(copyc1));
		
	}
}
