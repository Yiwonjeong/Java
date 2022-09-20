package ch09_3;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("Jump 할 줄 몰라 ㅠㅠ");
	}

	@Override
	public void turn() {
		System.out.println("Turn 할 줄 몰라 ㅠㅠ");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("--- 초보자 레벨입니다 ---");
	}

}
