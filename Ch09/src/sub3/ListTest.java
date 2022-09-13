package sub3;

import java.util.ArrayList;
import java.util.List;

/* 
 * 작성자: 이원정
 * 작성일: 2022.09.13
 * 내용: 자료구조 List 실습하기
 * 
 * List
 * - 배열과 유사하지만 동적으로 생성되는 선형 자료구조
 * - List를 구현한 ArrayList를 가장 많이 사용
 * 
 */
public class ListTest {
	public static void main(String[] args) {
		
		// List 생성
		List<Integer> list = new ArrayList<>();
		
		
		// 데이터 입력
		list.add(1);  	// 1
		list.add(2);	// 1,2
		list.add(3);	// 1,2,3
		list.add(4);	// 1,2,3,4
		list.add(5);	// 1,2,3,4,5
		list.add(1,6);	// 1: index [1] 자리에 6 삽입, 결과: 1,6,2,3,4,5
		list.remove(2); // 1,6,3,4,5
		
		System.out.println(list);
		
		// 데이터 출력
		System.out.println("1번째 원소: " + list.get(0));
		System.out.println("2번째 원소: " + list.get(1));
		System.out.println("3번째 원소: " + list.get(2));
		
		// List 크기
		System.out.println("list 크기: " +list.size());
		
		// List 반복문 
		for( int n : list) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		
		// 문자열 List
		List <String> people  = new ArrayList<>();
		
		people.add("김유신");
		people.add("김춘추");
		people.add("장보고");
		people.add("강감찬");
		people.add("이순신");
		
		System.out.println(people);
		
		// 객체 리스트 
		List<Apple> apples = new ArrayList<>();
		
		Apple a1 = new Apple("한국", 3000);
		apples.add(a1);
		apples.add(new Apple("미국", 2000));
		apples.add(new Apple("일본", 1000));
		
		// 한국 사과
		Apple apple = apples.get(0);
		apple.show();
		
		// 미국 사과
		Apple apple2 = apples.get(1);
		apple2.show();
		
		// 일본 사과
		apples.get(2).show();
	}
}
