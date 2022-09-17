package ch06;
// class BirthDay
public class P170  {

	int day, month, year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void show() {
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		
		P170 bDay = new P170();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.show();
	}
	
}



