package api;

public class StringTest3 {
	public static void main(String[] args) {
		String str1 = "언제부터 그렇게 잘했나?";
		String str2 = "언제부터 그렇게 잘했나?"; // 둘다 같은 것을 참조하고 있었지.
		
		System.out.println(str1.replace("잘했나?", "good 했나?"));
		
		if(str1==str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}

		System.out.println(str1 = str1.replace("잘했나?", "good 했나?"));
		// 원본 데이터가 바뀌는 것이 아니고 
		// heap에서 str1의 값이 복제가 되고 그 다음 
		// replace를 한다음에 stack의 str1을 다시 그 값에 연결시킨다. 그래서 str1과 str2는 다른 것을 가르키지!!!

		if(str1==str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
	}
}
