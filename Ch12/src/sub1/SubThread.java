package sub1;

public class SubThread extends Thread{
	
	private String name;
	
	public SubThread (String name) {
		this.name = name;
	}

	// 메인 스레드에서 파생된 자식 스래드 
	@Override
	public void run() {
		
		for (int i=0; i<10; i++) {
			
			// 1초에 한 번씩 실행되도록 slepp을 걺, 1000=1초
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " 스레드 실행 ... ");
		}
		
		System.out.println(name + " 스레드 종료 ... ");
	}
}
