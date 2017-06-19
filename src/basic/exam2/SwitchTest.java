package basic.exam2;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
//		int n = 2;
//		
//		switch (n) {
//		case 1:
//		case 3:
//			System.out.println("남자");
//			break;
//		case 2:
//		case 4:
//			System.out.println("여자");
//			break;
//		default:
//			System.out.println("Error");
//			break; // 없어도 되기는 하는데, 대부분 해준다.
//				
//		}
			
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 넣어주세요"); int score = sc.nextInt();
				
		switch (score/10) {
		case 10:
		case 9:
			System.out.println("A임");
			break;
		case 8:
			System.out.println("B임");
			break;
		case 7:
			System.out.println("C임");
			break;
		case 6:			
			System.out.println("D임");
			break;
		default:
			System.out.println("F임");
			break;
		}
		System.out.println("종료");
	}
}
