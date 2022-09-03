package Ch04;

public class CircleTest2 {

	public static void main(String[] args) {

	
		//1. 객체 생성
		Circle c = new Circle();
		
		//2. 필드 접근
		c.radius = 100;
		c.color = "red";
		
		//3. 메소드 접근
		double area = c.getArea();
		System.out.println("원의 면적: "+area);
		
		
	}
}
