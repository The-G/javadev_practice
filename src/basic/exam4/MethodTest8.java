package basic.exam4;

public class MethodTest8 {
	public static void main(String[] args) {
		int a = 10;
		testFunction(a);	// call by value 
		System.out.println("main : " + a);		
		
	}

	private static void testFunction(int a) { // 여기 a는 main의 a와 다르지!! 
		a++;
		System.out.println("testFuction : " + a);
	} 
	
//	stack 쌓이는걸 보면
//	
//	a		10		-- 이 a를 변경한다 해도 main의 a는 변경되지 않는다..
//	a		10
//	args	null
//	
//	stack 구조는 LIFO : Last In First Out 인거다!!
}
