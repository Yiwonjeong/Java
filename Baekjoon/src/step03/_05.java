package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.26
 * 내용: 백준 3단계 4번 문제(15552) 빠른 A+B
 * 
 * 1. 예외처리 throws IOException
 * 2. BR, BF
 * 3. BR(String) -> 형변환
 * 4. 입력
 */


public class _05 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testcase = Integer.parseInt(br.readLine()); //입력 
		
		
		StringTokenizer st;
		
		for (int i=0; i<testcase; i++) {
			
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+"\n");
			
		}
		br.close();
		
		bw.flush(); //남아있는 데이터 모두 출력
		
		
		
	}

}
