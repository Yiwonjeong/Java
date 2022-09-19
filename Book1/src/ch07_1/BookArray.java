package ch07_1;

public class BookArray {
	public static void main(String[] args) {
		
		// (1) 객체 배열 생성
		Book [] library = new Book[5];
		
		// (2) 배열 요소 저장
		library[0] = new Book("잘될 수밖에 없는 너에게","최서영");
		library[1] = new Book("다섯 번째 감각","김보영");
		library[2] = new Book("어금니 깨물기","김소연");
		library[3] = new Book("시키는 대로 제멋대로","이소호");
		library[4] = new Book("긴긴밤","루리");
		
		for (int i=0; i<library.length; i++) {
			library[i].show();
		}
		
		for (int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
	
	}
}