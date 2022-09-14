package ch02_p60;

public class Light {

	public static void main(String[] args) {

		final double Light_speed = 3e5;
		double distance;
		
		distance = Light_speed * 60 * 60 * 24 * 365;
		System.out.println("빛이 1년 동안 가는 거리: "+distance+"km");
		
	}

}
