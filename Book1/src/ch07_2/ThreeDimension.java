package ch07_2;

public class ThreeDimension {
	public static void main(String[] args) {
		
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
