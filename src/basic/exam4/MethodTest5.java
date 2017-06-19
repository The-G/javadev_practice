package basic.exam4;

import java.util.Scanner;

public class MethodTest5 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("가위는 1, 바위는 2, 보는 3을 입력하세요 > ");
		int you = sc.nextInt();
		int com = (int)(Math.random() * 3) + 1;
		
		System.out.println("You : " + caption(you));
		System.out.println("Com : " + caption(com));

		
		switch ((you - com + 3) %3) {
		case 1:
			System.out.println("당신의 승리입니다");break;
		case 2:
			System.out.println("당신의 패배입니다");break;
		default:
			System.out.println("무승부입니다.");break;
		}				
		
	}

	private static String caption(int value) {
		switch (value) {
		case 1:
			return "가위";
		case 2:
			return "바위";
		case 3:
			return "보";
		default:
			System.out.println("에러");
			return null;
		}
	}

//	이건 메소드에서 처리하는 것이 아니다. 
//	장점: 유연하게 값을 처리할 수 있어서...
//	      메서드는 기능별로 한가지 기능만 두는 것이 좋다.
//	      여러 application과 연결하는데 좋다!!
//	      될 수 있는 한 method는 너무 기능을 몰아 넣으면 안된다!!!

}
