package ch05;

public class P152 {
		
	int age = 0;
	String name;
	boolean isMarried;
	int childNum = 0;
	
	public void show() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("결혼여부: "+isMarried);
		System.out.println("자녀 수: "+childNum);
	}
		
	
	public static void main(String[] args) {
		
		P152 p1 = new P152();
		p1.age = 40;
		p1.name = "James";
		p1.isMarried = true;
		p1.childNum = 3;
		
		p1.show();
		
		
	}
}
