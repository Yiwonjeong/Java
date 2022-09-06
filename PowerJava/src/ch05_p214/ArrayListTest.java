package ch05_p214;

import java.util.ArrayList;

class Person{
	
	String name;
	String tel;
	
	public Person (String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	
	
}

public class ArrayListTest {
	public static void main(String[] args) {

		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person("홍길동", "010-1234-5678"));
		list.add(new Person("김유신", "010-1234-5679"));
		list.add(new Person("최지영", "010-5159-5463"));
		list.add(new Person("김만수", "010-1972-3198"));
		
		for(Person obj : list)
			System.out.println("("+obj.name+","+obj.tel+")");
	}

}
