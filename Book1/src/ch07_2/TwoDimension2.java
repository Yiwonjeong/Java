package ch07_2;

public class TwoDimension2 {
	public static void main(String[] args) {
		
		int [][] arr = { {1,2,3}, {4,5,6} };
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // 행 출력 끝난 후 한 줄 띄움
		}
		
	}
}
