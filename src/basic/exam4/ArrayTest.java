package basic.exam4;

public class ArrayTest {
	public static void main(String[] args) {
		int[] score = new int[3];
//		int[] score = new int[]{100, 90, 70}; // 도 가능하다.
//		int[] score = {100, 90, 70}; // 도 가능하다.
		score[0] = 100;
		score[1] = 90;
		score[2] = 70;
//		score[3] = 100; 배열 크기보다 크게 잡을 수 없지.
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
	}
}
