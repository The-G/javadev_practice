package basic.exception;

public class ExceptionTest02 {
	public static void main(String[] args) {
		try {
			throwException();
		} catch (Throwable e) { // 여기서 받지.. //throw new Error();를 Exception으로는 못받고 Throwable로 받을 수 있네. 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("종료");
	}

	private static void throwException() throws Exception { // 나를 호출한 쪽에서 예외처리를 해라!!!!!
															// Exception으로 던졌기 때문에 받을때 Exception 이상으로 받아야 한다!!
////		try {
//			String str = null;
//			System.out.println(str.toString());
//			System.out.println("throwException 종료"); // 안찍히네!!
////		} catch (Exception e) {
////			e.printStackTrace(); //
////		}
			
			
		throw new Error(); // 예외를 강제로 발생시킴... 왜? 예외상황 테스트 하기 위해서!!!
	}
}
