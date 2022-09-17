package ch05;
// Person Test
public class P153_2 {
	public static void main(String[] args) {
		
		P153 pKim = new P153();
		pKim.name = "김유신";
		pKim.weight = 85.5F;
		pKim.height = 180.0F;
		
		P153 pLee = new P153("이순신", 175, 75);
		
		pKim.show();
		pLee.show();
		
		
	}
}
