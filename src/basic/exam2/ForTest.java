package basic.exam2;

public class ForTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i*10 + ":김지혁");
		}
		System.out.println("종료"); // for문 끝나면서 i 메모리 회수하네!!!
	}
}
