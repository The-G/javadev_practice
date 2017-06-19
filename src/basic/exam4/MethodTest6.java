package basic.exam4;

public class MethodTest6 {
	public static void main(String[] args) {
		print(1);
		print(2,3); // method overloading
		print(4,5,6);
		
/*		String name = "부레뷁붸붹";
		print(name);
		System.out.println(name);
*/
		int a=10, b=5;
		swapNumber(a, b);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		
		int[] lotto = {1,2,3,4,5,6};
		swapRandom(lotto);
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}
	}

	// 기본자료형은 값을 수정시 러턴후 원래 값!!!!!
	private static void swapNumber(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	} 

	// 참조자료형은 값을 수정시 리턴후에도 값이 바뀜!!!!!
	private static void swapRandom(int[] lotto) {
		int temp = lotto[0];
		lotto[0] = lotto[5];
		lotto[5] = temp; 
	} 

/*	private static void print(String name) {
		name = "부룱뷇붸헰";		
	}
*/
	private static void print(int... i) { // 자동으로 배열 형태로 만들어준다. i, 가변형 인자라고 한다!!! java5 부터 가능.
/*		for (int j = 0; j < i.length; j++) {
			System.out.print(i[j] + "\t");
		}
*/
		for (int j:i) { //java5 부터 가능, array list loop 돌릴 수 있다. i걸 j에 밀어 넣는다.
			System.out.print(j + "\t");
		}
	} // 메모리가 허용하는 한도 내에서 더 긴걸 보내도 상관 없겠지!!
	
/*	private static void print(int i, int j, int k) {
		System.out.println(i + "\t" + j + "\t" + k);		
	}

	private static void print(int i, int j) {
		System.out.println(i + "\t" + j);
	}

	private static void print(int i) {
		System.out.println(i);
	}
*/
	
	
//	메서드, 중복되는 것을 모듈화함!! main도 method다.
}
