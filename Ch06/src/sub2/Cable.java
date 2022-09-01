package sub2;

public class Cable implements Socket {

	private Bulb bulb;
	
	public Cable(Bulb bulb) {
		this.bulb = bulb;
	}
	
	@Override
	public void switchOn() {
		bulb.LightOn();
	}
	
	@Override
	public void switchOff() {
		bulb.LightOff();
	}

}
