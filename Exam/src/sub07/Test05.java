package sub07;
/*
 * 날짜: 2022/09/27
 * 이름: 이원정
 * 내용: 자바 총정리 연습문제
 * 
 * 버블정렬: 인접한 2개의 요소를 비교해서 더 큰 수를 뒤로 보내는 정렬방식
 */
public class Test05 {
	public static void main(String[] args) {
		
		int [] values = {3,5,2,7,1};
		printArray(values);
		
		for (int i=4; i>0; i--)
		{
			for (int j=0; j<i; j++)
			{
				if (values[j]>values[j+1]){
					{
						int temp = values[j];
						values[j]=values[j+1];
						values[j+1]=temp;
					}
				}
				printArray(values);
			}
		}
		
	}

	private static void printArray(int[] array) {
		for (int i : array)
			System.out.printf("%5d", i);
		
		System.out.printf("\n");
	}
}