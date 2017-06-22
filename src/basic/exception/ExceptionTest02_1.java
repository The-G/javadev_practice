package basic.exception;

public class ExceptionTest02_1 {
	public static void main(String[] args) throws Exception { // 이것은 예외처리를 안한 것이다. main에서는 try catch로 예외처리 해주는게 좋다!!
															  // 서버단에서 예외 다 처리하게 했다면 이렇게 던져도 되기는 한다!!
		throwException();
		System.out.println("종료");
	}

	private static void throwException() throws Exception { // 나를 호출한 쪽에서 예외처리를 해라!!!!!
															// Exception으로 던졌기 때문에 받을때 Exception 이상으로 받아야 한다!!
		 String str = null;
		 System.out.println(str.toString());
		 System.out.println("throwException 종료"); // 안찍히네!!
	}
}
