package basic.exception;

public class ExceptionTest01 {
	public static void main(String[] args) {
		
		String str = null;
		try {
			System.out.println(str.toString());		
			// throw new NullPointerExcepition();
		} catch (NullPointerException | NumberFormatException e) {
			// TODO: handle exception
			System.out.println("인스턴스가 할당이 안됐음");
//			e.printStackTrace();
			// "종료"가 먼저 찍히고 예외처리 하는 경우도 있다. 먼저 처리되고 그런게 아니라 thread로 처리하기 때문에 순서가 달라질 때도 있다!!

		} catch (Exception e) {
			e.printStackTrace();
			// multi catch문 가능, 순서는 당연히 subclass가 아래쪽으로 있어야지!!
			// message 안에서는 순차적으로!!!
		} finally { 
			System.out.println("꼭 실행!!");
		} // JAVA7 이후로 finally가 잘 안쓰이고 있다. try()[AutoCloseable] 있어서
		System.out.println("***종료***");			

		//		AutoCloseable // shift + F2 검색
	}
}
