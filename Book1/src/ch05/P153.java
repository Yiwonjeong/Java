package ch05;
// Person
public class P153 {

	String name;
	float height;
	float weight;
	
	public P153() { }
	
	public P153(String pname) {
		name = pname;
	}
	
	public P153(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
	
	public void show() {
		System.out.println("-------------");
		System.out.println("이름: "+name);
		System.out.println("키: "+height);
		System.out.println("몸무게: "+weight);
		System.out.println("-------------");
	}
}


