package api;

public class StringTest2 {
	public static void main(String[] args) {
		String str1 = "z";
		String str2 = "z";
				
		if (str1 == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다.");		
		}
		
		if (str1.equals(str2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다.");		
		}

		String str3 = new String("z");
		String str4 = new String("z"); // 둘은 hashcode가 다르다!!
				
		if (str3 == str4) {
			System.out.println("같다");
		} else {
			System.out.println("다르다.");		
		}		
		
		// 내용이 같은지를 볼때는 equals를 쓰는 거다
		if (str3.equals(str4)){
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}

	}
}
