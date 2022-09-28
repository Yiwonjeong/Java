package sub8;
/*
 * 날짜 : 2022/09/28
 * 이름 : 이원정
 * 내용 : 자바 총정리 실습하기
 */
class _Person{
	private String name;
	private int age;
	
	_Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void Hello() {
		System.out.println("-------");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}
}
class _Student extends _Person {
		
		private String school;
		private String major;
	
		public _Student(String name, int age, String school, String major) {
		super(name, age);
		this.school = school;
		this.major = major;
	}

	
	
	@Override
	public void Hello() {
		super.Hello();
		System.out.println("학교: "+school);
		System.out.println("전공: "+major);
	}
}


public class Test06 {
	public static void main(String[] args) {
		_Person kim = new _Person("김유신", 24);
		_Student jang = new _Student("장보고", 26, "부경대", "영문학과");
		
		kim.Hello();
		jang.Hello();
	}
	
}
