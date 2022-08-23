package sub1;
/* 
 * 작성자: 이원정
 * 작성일: 2022.08.22
 * 내용: Java 배열 실습하기
 * 
 * 배열(Array)
 * - 하나 이상의 데이터를 하나의 변수에 저장할 수 있는 자료 구조
 * - 현대 프로그래밍에서는 Array 대신 List를 더 많이 사용
 */

public class ArrayTest {

	public static void main(String[] args) {

		//배열
		
		int [] arr1 = {1,2,3,4,5};
		char [] arr2= {'A','B','C'};
		String [] arr3= {"서울", "대전", "대구", "부산", "광주"};
		
		
		//배열 원소 출력
		
		System.out.println("arr1[0]: " +arr1[0]);
		System.out.println("arr1[2]: " +arr1[2]);
		System.out.println("arr1[4]: " +arr1[4]);
		
		System.out.println();

		System.out.println("arr2[0]: " +arr2[0]);
		System.out.println("arr2[1]: " +arr2[1]);
		
		System.out.println();
		
		System.out.println("arr3[1]: " +arr3[1]);
		System.out.println("arr3[3]: " +arr3[3]);
		
		System.out.println();
		
		//배열 길이
		
		System.out.println("arr1의 배열 길이: " +arr1.length);
		System.out.println("arr2의 배열 길이: " +arr2.length);
		System.out.println("arr3의 배열 길이: " +arr3.length);
		
		System.out.println();
		
		//배열 반복문
		
		for (int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");	
		}
		
		System.out.println();
		
		for(char ch: arr2) {
			System.out.print(ch+" ");
			
		}
		System.out.println();
		
		for(String str: arr3) {
			System.out.print(str+" ");
		}
		System.out.println("\n");
		
		//1차원 배열 (선, lineur)
		
		int[] scores = {80,60,78,62,92};
		int total = 0;
		
		for (int score: scores) {
			
			total += score;
			
		}
		System.out.println("scores의 합: " +total);
		
		
		System.out.println("\n");
		
		
		//2차원 배열 (면)
		
		int [][] arr2d = {{1, 2, 3, 4},
				          {5, 6, 7, 8},
				          {9,10,11,12}};
		
		System.out.println("arr2d[0][0]: " +arr2d[0][0]);
		System.out.println("arr2d[0][1]: " +arr2d[0][1]);
		System.out.println("arr2d[0][2]: " +arr2d[0][2]);
		System.out.println("arr2d[0][3]: " +arr2d[0][3]);
		
		System.out.println();
	
		for(int a=0; a<3; a++ ) {
			for(int b=0; b<4; b++) {
				System.out.println("arr2d["+a+"]["+b+"]: " +arr2d[a][b]);
				}
			}
		
		
		//3차원 배열 (공간)
		
		int[][][] arr3d = {{{1,2,3,},
							{4,5,6,},
							{7,8,9}},  
						  {{10,11,12},
						   {13,14,15},
						   {16,17,18}},
						  {{19,20,21},
							{22,23,24},
					       {25,26,27}}};
		
		System.out.println();
		
		for(int f=0; f<3; f++) {
			for(int a=0; a<3; a++) {
				for (int b=0; b<3; b++) {
					System.out.printf("arr3d[%d][%d][%d]: %d\n", f,a,b, arr3d[f][a][b]);
				}
			}
			
		}
		
	}

}
