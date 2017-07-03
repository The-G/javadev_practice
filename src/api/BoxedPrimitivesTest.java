package api;

public class BoxedPrimitivesTest {
	public static void main(String[] args) {
		Integer i = new Integer(10); // 이렇게 사용하면 불편하다.. 그래서
		Integer i2 = 10; // java5에서 가능해 졌다. auto boxing
		int i3 = i; 	 // java5부터 가능해짐     auto unboxing
		
		Object i4 = 10;  // java5부터 가능해짐	   auto boxing
		 
		int i5 = (int) i4; //에러 발생 down casting 필요해서 함!! // java7 부터 가능해짐					
		int i6 = (Integer) i4; // boxed premitive를 거쳐야 한다.
							   // java 5,6 에서
		
		int i7 = Integer.parseInt("100");
		long i8 = Long.parseLong("100L");
		
		
	}
}
