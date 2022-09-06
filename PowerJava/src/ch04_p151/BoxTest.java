package ch04_p151;

class Box {

	//1. 필드
	int width;
	int length;
	int height;
	
	//2. 메소드
	double getVolume() {
		return (double) width*length*height;
	}
}

public class BoxTest{
	
	public static void main(String[] args) {
		
		//1. 객체 생성
		Box b = new Box();
		
		//2. 필드 접근
		b.width = 20;
		b.length = 20;
		b.height = 30;
		
		//3. 메소드 접근
		System.out.println("상자의 가로,세로,높이는 "+b.width+", "+b.length+", "+b.height);
		System.out.println("상자의 부피는 "+b.getVolume());
	}
	
}