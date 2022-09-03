package Ch05;

class Macaron {
	
	private String toppings;
	private int size;
	static int count=0;
	
	public Macaron(String Macaron) {
		this.toppings = toppings;
		count++;
	}
}

public class MacaronTest {
	
	public static void main(String[] args) {
		
		Macaron m1 = new Macaron("Strawberry");
		Macaron m2 = new Macaron("Milk");
		Macaron m3 = new Macaron("Lemon");
		
		int n = Macaron.count;
		
		System.out.println("Now sale: "+n);
		
	}

}
