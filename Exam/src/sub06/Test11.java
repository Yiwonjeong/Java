package sub06;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a값 입력: ");
		int a = sc.nextInt();
		System.out.print("b값 입력: ");
		int b = sc.nextInt();
		System.out.print("c값 입력: ");
		int c = sc.nextInt();
		
		int x1 = (-b +(int) Math.sqrt(b*b - 4*a*c)) / 2*a;
		int x2 = (-b -(int) Math.sqrt(b*b - 4*a*c)) / 2*a;
		
		System.out.print("x: " + x1 + ", " + x2);
		
	}
}
