package ch09_3;

public class Player {
	
	// Player가 가지는 level 변수 선언
	private PlayerLevel level;
	
	// 디폴트 생성자
	public Player() {
		level = new BeginnerLevel();	// 처음 생성되면 BeginnerLevel
		level.showLevelMessage();	// 레벨 메시지 출력
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	};
}
