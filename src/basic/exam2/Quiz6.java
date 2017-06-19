package basic.exam2;

import java.util.Random;
import java.util.Scanner;

public class Quiz6 {
	public static void main(String[] args) {
//		my
		Scanner sc = new Scanner(System.in);
		System.out.print("가위는 1, 바위는2, 보는 3 입력하세요 >"); int my_action = sc.nextInt();
//		computer
		Random rd = new Random();
		int com_action = rd.nextInt(3) + 1;
		
		if (my_action == com_action) {
			System.out.println("비김");
		}
		
		if (my_action  == 1)
		if (com_action == 2)
			System.out.println("나:가위/컴:주먹 패배");

		if (my_action  == 1)
		if (com_action == 3)
			System.out.println("나:가위/컴:보 승리");
			
		if (my_action  == 2)
		if (com_action == 1)
			System.out.println("나:바위/컴:가위 승리");

		if (my_action  == 2)
		if (com_action == 3)
			System.out.println("나:바위/컴:보 패배");
			
		if (my_action  == 3)
		if (com_action == 1)
			System.out.println("나:보/컴:가위 패배");
			
		if (my_action  == 3)
		if (com_action == 2)
			System.out.println("나:보/컴:바위 승리");
		
		
	}
}
