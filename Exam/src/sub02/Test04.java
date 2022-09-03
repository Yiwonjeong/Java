package sub02;
/* 
 * 작성자: 이원정
 * 작성일: 2022.08.26
 * 내용: Java 배열 선택 정렬 연습문제
 * 
 * 선택정렬
 * - 알고리즘에서 배열의 원소를 정렬하는 가장 기본적인 방법
 * - 정렬 알고리즘에는 선택정렬, 삽입정렬, 퀵정렬, 버블정렬 등이 있다.
 * 
 * 정렬단계
 * 1단계: 배열의 첫 번째 원소를 2,3,4번째 원소와 차례로 비교
 * 2단계: 첫 번째 원소보다 작은 원소를 찾으면 서로 자리 교환
 * 3단계: 배열의 두 번째 원소를 3,4,5번째 원소와 차례로 비교
 * 4단계: 두 번째 원소보다 작은 원소를 찾으면 서로 자리 교환
 * 5단계: 위와 같이 최종 숫자가 하나 남을 때까지 반복 수정
 * 
 */
public class Test04 {

	public static void main(String[] args) {

		int arr[]= {4,2,1,5,3};
		
		for (int i=0; i<4; i++) {
		
			for(int j= i+1; j<5; j++) {
			
				if (arr[i] > arr[j]) {
					int temp = arr[j]; //2를 temp에 보관
					arr[j]= arr[i];	   //4를 두 번째로 이동
					arr[i]=temp;	   //2를 앞으로 이동
				}
		}
	}
		for (int n=0; n<10; n++) {
			System.out.print(n+ " ");
		}

}
}
