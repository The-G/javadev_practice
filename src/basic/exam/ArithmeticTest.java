package basic.exam;

import java.util.Scanner;

public class ArithmeticTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.print("a : "); a = sc.nextInt();
		System.out.print("B : "); b = sc.nextInt();
		
		System.out.println(a + "+" + b + "=" + a + b); // 문자열 피해...
		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println(a + "/" + b + "=" + (a / b)); // 정수 나누기 정수는 정수
		System.out.println(a + "/" + b + "=" + ((double)a / b)); // 큰 쪽의 data type을 따라간다
		System.out.println(a + "%" + b + "=" + (a % b));
		// alt shift a 다중선택		
		
	}
}
