package Ch06;

class Employee{
	public int baseSalary = 3000000; //기본금
	int getSalary() {
		return baseSalary;
	}
}

class Manager extends Employee{
	@Override
	int getSalary() {
		return (baseSalary + 2000000);
	}
}

class Programmer extends Employee{
	@Override
	int getSalary() {
		return (baseSalary + 3000000);
	}
	
}
public class Test {
	public static void main(String[] args) {

		Manager m = new Manager();
		System.out.println("관리자의 월급: "+m.getSalary());
		
		Programmer p = new Programmer();
		System.out.println("프로그래머의 월급: "+p.getSalary());
	}

}
