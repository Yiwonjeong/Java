package ch06;

public class P173 {

	String name;
	int age;
	
	P173 (){
		this("이름없음", 1);
	}
	
	P173 (String name, int age){
		this.name = name;
		this.age = age;
	}
	
	P173 retrunItSelf() {
		return this;  		// this형 변환
	}
	
	public static void main(String[] args) {
		
		P173 noName = new P173();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		P173 p = noName.retrunItSelf(); //this값을 변수에 대입
		System.out.println(p);			// noName.returnItSelf()의 변환값 출력
		System.out.println(noName);
	}
	
}
