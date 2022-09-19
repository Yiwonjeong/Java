package ch07_1;

public class ObjectCopy1 {
	public static void main(String[] args) {
		
		Book [] bookArray1 = new Book[3];
		Book [] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("잘될 수밖에 없는 너에게","최서영");
		bookArray1[1] = new Book("다섯 번째 감각","김보영");
		bookArray1[2] = new Book("어금니 깨물기","김소연");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for (int i=0; i<bookArray2.length; i++) {
			bookArray2[i].show();
		}
		
	}
}
