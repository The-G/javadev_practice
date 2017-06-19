package basic.exam;

import java.util.Scanner;

public class Arithmetic3Test {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
		boolean t1, t2;
		t1 = true; t2 = true;   System.out.println(t1 && t2);
		t1 = true; t2 = false;  System.out.println(t1 && t2);
		t1 = false; t2 = false; System.out.println(t1 && t2);

		t1 = true; t2 = true;   System.out.println(t1 || t2);
		t1 = true; t2 = false;  System.out.println(t1 || t2);
		t1 = false; t2 = false; System.out.println(t1 || t2);

		System.out.println(!true);
		System.out.println(!t1);
	}
}
