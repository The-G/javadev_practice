package basic.exam2;

import java.util.Scanner;

public class Answer6 {
	public static void main(String[] args) {
		String[] caption = {"가위","바위","보"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위는 1, 바위는 2, 보는 3을 입력하세요>");
		int you = sc.nextInt();
		int com = (int)(Math.random() * 3) + 1;
		
		System.out.println("YOU : " + caption[you -1]);
		System.out.println("COM : " + caption[com -1]);
		
		if ((you == 1 && com == 3) ||  // 관계 논리 순이지!! 
			(you == 2 && com == 1) ||
			(you == 3 && com == 2)) {
			System.out.println("당신의 승리 입니다.");
		} else if (you == com) {
			System.out.println("비겼습니다.");
		} else {
			System.out.println("당신의 패배입니다.");
		}
		
		
//		강사님 switch 문으로도 해결하심.. 여러가지 경우의 수를 수식을 만들어서 해결하려고 하심!!!
//		수식을 만들어 버리네!!! 근데 가독성이 떨어진다...
		switch ((you - com +3) % 3) {
		case 1:
			System.out.println("승리");
			break;
		case 2:
			System.out.println("패배");
			break;
		default:
			System.out.println("무승부");
			break;
		}		
		
	}
}
