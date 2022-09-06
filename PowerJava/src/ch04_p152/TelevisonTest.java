package ch04_p152;

class Televison{
	
	//1. 필드 
	int channel;
	int volume;
	boolean onOff;
	
	//2. 메소드
	
}


public class TelevisonTest {
	public static void main(String[] args) {

		//1. 객체 생성
		Televison myTv = new Televison();
		
		//2. 필드 접근
		myTv.channel = 7;
		myTv.volume = 10;
		myTv.onOff = true;
		
		//1. 객체 생성2
		Televison yourTv = new Televison();
		
		//2. 필드 접근2
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		
		//3. 메소드 접근
		System.out.println("myTv 채널: "+myTv.channel+", volume: "+myTv.volume);
		System.out.println("yourTv 채널: "+yourTv.channel+", volume: "+yourTv.volume);
		
		
	}

}
