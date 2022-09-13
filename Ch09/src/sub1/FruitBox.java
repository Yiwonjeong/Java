package sub1;


// 제네릭 선언 <T>

public class FruitBox<T> {

	
	// 치환변수 T
	
	private T fruit;

	public T getFruit() {
		return fruit;
	}

	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
	
	
	
}
