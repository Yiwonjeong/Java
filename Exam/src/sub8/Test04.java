package sub8;
/*
 * 날짜 : 2022/09/28
 * 이름 : 이원정
 * 내용 : 자바 총정리 실습하기
 */
class Person{
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	protected void Hello() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}
}
class Student extends Person {
		
	private int studentId;
	
	public Student(String name, int age, int studentId) {
			super(name, age);
			this.studentId = studentId;
		}


	public void Hello() {
		super.Hello();
		System.out.println("학번: "+studentId);
	}
}
class Worker extends Person{
	private int workerId;
	
	public Worker(String name, int age, int studentId) {
		super(name, age);
		this.workerId = studentId;
	}
	
	public void Hello() {
		super.Hello();
		System.out.println("사번: "+workerId);
	}
}

public class Test04 {
	public static void main(String[] args) {
		Student kim = new Student("김유신", 21, 20201234);
		Student lee = new Student("이순신", 35, 20111201);
		
		kim.Hello();
		lee.Hello();
	}
}
