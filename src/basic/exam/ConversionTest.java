package basic.exam;

public class ConversionTest {
	public static void main(String[] args) {

//		double d = 10;
//		System.out.println(d);
//		
//		int i = (int) 3.3994; // 강제 형변환(명시적 형변환)
//		System.out.println(i);
		
//		int n = (int)(Math.random() * 6) + 1;
//		System.out.println(n);
		
		
//		문제1, 4,5,6,7,8,9,10,11,12,13,14,15 하나 랜덤 하나 출력
		int n1 = (int)(Math.random() * 12) + 4;
		System.out.println(n1);
		
//		문제2, 600 ~ 2200, 100 단위로 에서 랜덤 하나 출력
		int n2 = ((int)((Math.random() * 17) + 6)) * 100;
		System.out.println(n2);
		
		
	}
}
