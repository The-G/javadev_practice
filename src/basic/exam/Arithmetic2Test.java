package basic.exam;

import java.util.Scanner;

public class Arithmetic2Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;	
		int j; 
		System.out.print("정수 i 입력 : ");i = sc.nextInt();
		System.out.print("정수 j 입력 : ");j = sc.nextInt();
		
		System.out.println(i > j);
		System.out.println(i < j);
		System.out.println(i >= j);
		System.out.println(i >= j);
		System.out.println(i == j);
		System.out.println(i != j);
	}
}
