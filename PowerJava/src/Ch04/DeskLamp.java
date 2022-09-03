package Ch04;

public class DeskLamp {

	//필드 (변수 선언)
	private boolean isOn;
	
	// 메소드
	public void turnOn() {isOn=true;}
	public void turnOff() {isOn=false;}
	public String toString() {
		return "현재 상태는 " + (isOn == true ? "켜짐":"꺼짐");
	}
}
