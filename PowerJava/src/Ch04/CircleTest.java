package Ch04;

public class CircleTest {

	public static void main(String[] args) {

		//1. 참조 변수 선언
		Circle obj;
		
		//2. 객체 생성
		obj = new Circle();
		
		//3. 필드 접근
		obj.radius = 100;
		obj.color = "blue";
		
		//4. 메소드 접근
		double area = obj.getArea();
		System.out.println("원의 면적: "+area);
	}

}
