package basic.exam2;

public class ForTest2 {
	public static void main(String[] args) {
/*      int sum = 0;
		for (int i = 1; i <= 3; i++) {
//			sum = sum + i;
			sum += i;
		}
		System.out.println(sum);
*/

		//		Q. 1~1000 까지 3의 배수를 더해주세요!!!
		int sum = 0;
//		for(int i = 1; i <= 1000; i++) {
//			if (i % 3 == 0) {
//				sum += i;				
//			}
//		}
		for(int i = 0; i <= 1000; i+=3) { // 왜 이걸 생각 못했지...
			if (i % 3 == 0) {
				sum += i;				
			}
		}
		System.out.println(sum);
	}
}
