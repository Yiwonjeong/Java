package Ch06;

class Person {
	
	private String regnumber; 	//주민번호, 자식 클래스에서 접근 불가능
	private double weight; 		//체중, 자식 클래스에서 접근 불가능
	protected int age; 			//나이, 자식 클래스에서 접근 가능
	String name;				//이름, 어디서나 접근 가능
	
	public double getWeight () {
		return weight;
	}
	public void setWeight (double weigth) {
		this.weight = weight;
	}
}

class Student extends Person {
	
	int id; 					// 학번
	
}


class StudentTest {
	public static void main(String[] args) {

		Student obj = new Student();
		//obj.regnumber = "123456-123456"; 오류
		//obj.weight = 75.0; 오류
		
		obj.age = 21;
		obj.name = "Kim";
		obj.setWeight(75.0);
		
	}

}
