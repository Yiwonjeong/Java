package ch07_2;

// ArrayList 클래스 import
import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		// ArrayList 선언
		ArrayList<Book> library = new ArrayList<Book>();
		
		// add() 메서드로 요소 값 추가
		library.add(new Book("잘될 수밖에 없는 너에게","최서영"));
		library.add(new Book("다섯 번째 감각","김보영"));
		library.add(new Book("어금니 깨물기","김소연"));
		library.add(new Book("시키는 대로 제멋대로","이소호"));
		library.add(new Book("긴긴밤","루리"));
	
		// 배열에 추가된 요소 개수만큼 출력 - for문 사용 
		for (int i=0; i<library.size(); i++) {
			Book book = library.get(i);
			book.show();
		}
		System.out.println();
		
		// 배열에 추가된 요소 개수만큼 출력 - 향상된 for문 사용 
		for ( Book book : library) {
			book.show();
		}
	}
}
