package basic.exam2;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//		int n = 2;
		
/*		if (n ==2) 
			System.out.println("여자");
//		생략가능, 단 될 수 있으면 중괄호 하는 것이 좋다. 유지보수 할 때 이게 좋다!!!
*/	
//		if (n == 1) {
//			System.out.println("여자");
//		} else if (n == 2) {
//			System.out.println("남자");
//		} else {
//			System.out.println("Error");
//		}
//		System.out.println("종료");

//		문제3. 점수를 입력받고, 점수는 0~100(정수)
		/*	  90 ~ 100 : A
			  80 ~ 89  : B
			  70 ~ 79  : C
			  60 ~ 69  : D
			  0  ~ 59  : F
		*/

		Scanner sc = new Scanner(System.in); //
		System.out.print("당신의 점수는  : ");int n = sc.nextInt();
		
		if (n >= 0 && n <= 100) {
			
		} else {
			System.out.println("0~100 사이값을 넣어주세요.");
		    System.exit(0);
		} // try catch 를 주로 쓴다!!!
		
		if (90 <= n && n <= 100) { // 방향 이렇게 하는 것이 옳다
			System.out.println("당신의 학점은 A 입니다.");
		} else if (n >= 80 && n <= 89) { // n <= 89 조건은 필요 없지...
			System.out.println("당신의 학점은 B 입니다.");
		} else if (n >= 70 && n <= 79) {
			System.out.println("당신의 학점은 C 입니다.");
		} else if (n >= 60 && n <= 69) {
			System.out.println("당신의 학점은 D 입니다.");			
		} else {
			System.out.println("당신의 학점은 F 입니다.");
		}
		
		
	}
}
