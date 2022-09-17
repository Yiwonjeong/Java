package ch05;
// private 사용하기 
public class P162 {

	int stuID;
	private String stuName;
	int grade;
	String addr;
	
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	
	
	public static void main(String[] args) {
		
		P162 stu1 = new P162();
		stu1.setStuName("이상원");
		
		System.out.println(stu1.getStuName());
		
	}
	
	
}
