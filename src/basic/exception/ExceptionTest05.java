package basic.exception;

public class ExceptionTest05 {

	public static void main(String[] args) {
		try {
			System.out.println("a() 호출전");
			a();
			System.out.println("a()호출후");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("메인 메서드의 catch블럭");
			e.printStackTrace();
		} finally {
			System.out.println("메인 메서드의 finally블럭");
		}
		System.out.println("수행완료");
	}

	public static void a() {
		try {
			System.out.println("b() 호출전");
			b();
			System.out.println("b()호출후");
		} catch (ClassCastException e) {
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("a메서드의 catch블럭");
			e.printStackTrace();
		} finally {
			System.out.println("a메서드의 finally블럭");
		}
	}

	public static void b() {
		try {
			System.out.println("c() 호출전");
			int x = 1;
			int y = 0;
			int z;
			z = x / y;	// 여기서 error가 발생했는데, 어떻게 해야 이 예외를 잡을 수 있을까?!
			System.out.println(z);
			c();
			System.out.println("c()호출후");
		} catch (NumberFormatException e) { // catch에 걸리지 않았다. nullException이었어야 하는데... 
											// 걸리지 않아서 c,d가 실행 안됨.
											// exception이나 arresmain 해야 한다!!!!
			e.printStackTrace(); 

		} finally {
			System.out.println("b메서드의 finally블럭");
		}
	}

	public static void c() {
		try {
			System.out.println("d() 호출전");
			d();
			System.out.println("d()호출후");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("c블럭");
		}
	}

	public static void d() {
		try {
			System.out.println("나누기전");
			int x = 1;
			int y = 1;
			System.out.println(x / y);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("d블럭");
		}
	}
}
