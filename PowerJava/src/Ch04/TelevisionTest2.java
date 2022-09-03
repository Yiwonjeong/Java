package Ch04;

class Television{
	
	private int channel;
	private int volume;
	private boolean onOff;
	
	//매개변수가 있는 생성자
	public Television(int c, int v, boolean o) {
		channel = c;
		volume = v;
		onOff = o;
	}
	
	public void show() {
		System.out.println("channel : "+channel);
		System.out.println("volume: "+volume);
	}
	
	
}


public class TelevisionTest2 {
	public static void main(String[] args) {

		Television myTv = new Television(11, 20, true);
		
		myTv.show();
		
	}

}
