package basic.exam4;

public class MethodTest2 {
	int i; // property
	public static void main(String[] args) {
		print("yb"); // print() method를 만듬!! "yb"는 실 매개변수
		print("d1");
		print("d2");
	}

	private static void print(String name) { // behavior, name은 형식매개변수, void니까 return이 없지.
//		void 위치에 return 되는 것의 data type이 들어가기도 하지.
		System.out.println("*************");
		System.out.println(" *hello " + name + " *" );
		System.out.println("*************");		
	}
}
