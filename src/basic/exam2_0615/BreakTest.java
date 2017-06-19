package basic.exam2_0615;

public class BreakTest {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
//		while(true) {
//			sum += i;
//			if (sum >= 30) break; { //첫번째 반복문만 빠져 나온다 가장 최근의 반복문
//				i++;
//			}
//		}
//		
//		참고, Breakpoint, 잘 안쓴다.
		START: 
			while(true) {
				sum += i;
				if (sum >= 30) break START; { //첫번째 반복문만 빠져 나온다 가장 최근의 반복문
					i++;
				}
			}
			
		System.out.println("1부터 " + i + "까지 정수의 합계는" + sum);
	}
}
