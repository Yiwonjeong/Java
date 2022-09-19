package ch06_5;

public class Company {

	// 유일하게 생성한 인스턴스
	private static Company instance = new Company(); 
	
	private Company() {}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
		
}
