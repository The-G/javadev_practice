package basic.exam;

public class PrimitiveTest {
	public static void main(String[] args) {
		// boolean : true or false를 나타내는 1비트(1바이트 할당됨 실제로는)
		//*/
		boolean b = true;
		System.out.println("b = " + b);
		
		//*/
		// byte : -128 ~ +127 1byte
		byte b2 = 127;
		System.out.println("b2 = " + b2);
		//*/
		
		//*/
		// int : -2147483648 ~ +2147483647
		int i = 2147483647;
		System.out.println("i = " + i);
		//*/
		
		//*/
		// short -32768 ~ +32767
		short s = 32767;
		System.out.println("s = " + s);
		//*/
	
		//*/
		// long : 900경
		long l1 = 2147483648L; 
		System.out.println("l1 =" + l1);
		//*/

		//*/
		// char : 2byte
		char c = '뷁'; //char는 반듯이 single quate 이어야 한다고 함
		System.out.println("c = " + c);
		//*/

		//*/
		// 8byte 실수 double 
		double d = 3.141564851686156846;
		System.out.println("d = " + d);
		//*/
		
		//*/
		// 4byte 실수 float
		float f = 3.1415926535f; //중간에 짤리네..
		System.out.println("f = " + f);
		//*/
		
		// escape sequence
		System.out.println("가\t나\t다");
		System.out.println("가	나	다");
		System.out.println("안녕하세요\n딸기밭이여 영원하라");
		System.out.println("하이\\하이");
		System.out.println("\"야호~~~\""); // '"'출력
		System.out.print("A"); //라인복사 ctrl art ↓
		System.out.print("B");
	}
}
