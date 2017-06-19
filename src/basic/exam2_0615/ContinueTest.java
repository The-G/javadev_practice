package basic.exam2_0615;

public class ContinueTest {
	public static void main(String[] args) {
//		Q. 1~1000 까지 3의 배수를 더해주세요!!!
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if (i % 3 != 0) continue; { // if문을 skip해 버리네!!
				sum += i;				
			}
		}
		System.out.println(sum);
	}
}
