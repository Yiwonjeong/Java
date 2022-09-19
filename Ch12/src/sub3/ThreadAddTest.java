package sub3;
/* 
 * 작성자: 이원정
 * 작성일: 2022.09.19
 * 내용: 스레드 활용 실습하기
 */
public class ThreadAddTest {
	public static void main(String[] args) {
		
		// 1~50 sum
		AddThread at1 = new AddThread(1, 50);
		
		// 51~100 sum
		AddThread at2 = new AddThread(51, 100);
		
		// Runnable 부연 클래스이기 때문에 바로 start 불가
		// 스레드 생성
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);
	
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int tot1 = at1.getNum();
		int tot2 = at2.getNum();
		
		int total = tot1 + tot2;
		System.out.println("1부터 100까지의 합: " +total);
		
	}
}
