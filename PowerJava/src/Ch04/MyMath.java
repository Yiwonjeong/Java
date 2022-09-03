package Ch04;

class MyMath {
	
	
	int add (int x, int y) {
		return x+y;
	}
	int add (int x, int y, int z) {
		return x+y+z;
	}
	int add (int x, int y, int z, int w) {
		return x+y+z+w;
	}



public static void main(String[] args) {
	
	MyMath m = new MyMath();
	
	System.out.println(m.add(10, 20));
	System.out.println(m.add(10, 20, 30));
	System.out.println(m.add(10, 20, 30, 40));
}
	
}
