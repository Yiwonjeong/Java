
public class P144 {

	//string타입 변수를 이용해서 직급별 월급 출력하기
	
	public static void main(String[] args) {

		String position = "과장";
		
		switch(position) {
		
		case "부장":
			System.out.println("700만원");
			break;
			
		case "과장":
			System.out.println("500만원");
			break;
			
		default:
			System.out.println("300만");
			
		}
		
		
	}

}
