package basic.exam4;

public class MethodTest9 {
	public static void main(String[] args) {
		int[] n = {100, 200}; //100, 200 heap에 생성이 된다.
		
		swapFunction(n);
		System.out.println();
		System.out.println();
	}

	private static void swapFunction(int[] n2) { 
//      여기의 int[] n 은 main int[] n 의 주소를 복사해서 같은 heap을 가르키고 있네!!!
//		이런걸 call by reference 라고 한다.
		int temp = n2[0];
		n2[0] = n2[1];
		n2[1] = temp;
	}
}
