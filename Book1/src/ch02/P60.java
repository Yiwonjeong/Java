package ch02;

	//자료형 추론하기


public class P60 {

	public static void main(String[] args) {

		var i=10;
		var j=10.0;
		var str = "hello";
		
		System.out.println(i);	
		System.out.println(j);
		System.out.println(str);
		
		str="test";
		//str=3; str변수는 string형으로 먼저 사용되었기 때문에 정수 값을 넣을 수 없다. 
		
	}

}
