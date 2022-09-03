package sub02;
/* 
 * 작성자: 이원정
 * 작성일: 2022.08.26
 * 내용: Java 배열 역순으로 정렬 연습문제
 */
public class Test03 {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		//현재 배열 출력
		for (int i=0; i<10; i++) {
			System.out.println(arr[i]+", ");
		}
		
		System.out.println("\n");
		
		//배열의 원소를 역순으로 정렬
		for (int j=0; j<5; j++) {  //5번 반복
			int temp = arr[j]; //1을 temp에 임시 보관
			arr[j]= arr[9-j]; //10을 맨 앞으로 이동
			arr [9-j]=temp; //temp에 보관한 1을 맨 뒤로 이동
			
		}
		
		//역순으로 정렬된 배열 출력
		for (int n : arr ) {
			System.out.println(n+", ");
		}
		
	}

}
