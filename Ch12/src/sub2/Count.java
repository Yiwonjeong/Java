package sub2;

public class Count {

	private int num;

	public int getNum() {
		return num;
	}

	// synchronized 동기화 블록: 하나의 스레드 실행
	// 동기화 블럭: 스레드 간의 경합을 막고 동기 방식으로 실행
	public synchronized void setNum() {
		num++;
	}
	
	
	
}
