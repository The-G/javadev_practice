package basic.exam2_0615;

public class ForTest4 {
	public static void main(String[] args) {
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + "*" + j + "=" + (i*j));
//			}
//			System.out.println("\t");
//		}
//		
//		for (int i = 2; i <= 9; i++) {	
//			System.out.println("");
//			for (int j = 2; j <= 5; j++) {
//				System.out.print(j + "*" + i + "=" + (j*i) + "\t");				
//			}				
//		}
//		System.out.println("");
//		for (int i = 2; i <= 9; i++) {	
//			System.out.println("");
//			for (int j = 6; j <= 9; j++) {
//				System.out.print(j + "*" + i + "=" + (j*i) + "\t");				
//			}				
//		}

//		#동영이형 답 !!
//		for (int a = 0; a < 2; a++) { // page
//			for (int i = 1; i <= 9; i++) { // second 1~9까지
//				for (int j = 2+(4*a); j <= 5+(4*a); j++) {
////					0일때, 2,3,4,5 단
////					1일때, 6,7,8,9 단
////					if문을 수식으로 풀었네,,, 규칙찾고.
//					System.out.print(j + " X " + i + " = " + (i * j) + '\t');
//				}
//				System.out.println(""); // 행간 줄바꿈
//			}
//			System.out.println(""); // 단락간 줄바꿈
//		}
		
//		# 선생님 답  !!
		for (int i = 2; i <= 9; i+=4) { 
			for (int j = 1; j <= 9; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					System.out.print((i+j2) + "*"+ j+ "=" + ((i+j2)*j) + "\t");					
				}
				System.out.println("");
			}
			System.out.println("");
		}		
	}
}
