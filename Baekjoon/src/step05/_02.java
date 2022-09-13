package step05;
/* 
 * 작성자: 이원정
 * 작성일: 2022.09.09
 * 내용: 백준 5단계 2번 문제(4673) 셀프 넘버
*/
public class _02 {
	
	
	public static void main(String[] args) {

		boolean [] isNotSelfNumber = new boolean [10001];
		
		for (int i=1; i<=10000; i++) {
			int dn = getDn(i);
			if (dn<=10000) {
				isNotSelfNumber[dn]=true;
			}
		}
		
		for (int i=1; i<isNotSelfNumber.length; i++) {
			if( !isNotSelfNumber[i] ) {
				System.out.println(i);
			}
		}
	}
		
		private static int getDn (int n) {
			int dn = n;
			while (n>0) {
				dn += n%10;
				n/= 10;
			}
		return dn;	
		}
		
		
}
