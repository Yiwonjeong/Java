package ch06_p251;

class Parent{
	void print() { System.out.println("Parent 메소드 호출..."); }
}

class Child extends Parent {
	@Override
	void print() {
		System.out.println("Child 메소드 호출...");
	}
}

public class Casting {
	public static void main(String[] args) {
		Parent p = new Child(); // 업캐스팅: 자식 객체를 부모 객체로 형 변환
		p.print();
		
		
		Child c = (Child)p; // 다운캐스팅: 부모 객체를 자식 객체로 형 변환
		//Child c = new Parent(); 컴파일 오류
		c.print();
	}

}
