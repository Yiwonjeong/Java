package ch06;

//this로 다른 생성자 호출하기

public class P172 {

	String name;
	int age;
	
	P172() { 
		this("이름없음", 1);
	}
	
	P172(String name, int age){
		this.name = name;
		this.age = age;
	}
	
}
