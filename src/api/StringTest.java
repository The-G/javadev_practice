package api;

public class StringTest {
	public static void main(String[] args) {
		String str = "A"; //문자열 instance 인거다!! string type의 instance
		str += "B";
		str += "C";
		
//		이럴 경우 메모리에서 일어나는 일
//		stack => arg 쌓기 -> str 쌓기 heap 연결 -> str heap 연결 
//		heap  => 		  -> A 생성 -> B생성    -> AB생성 
		
//      문자열 자르고 붙이는 작업 하면 memory 많이 차지한다 복제해서 사용하니!! 메모리 누수
//		그것을 방지하기 위한 것이 StringBuffer type 이다!!
		
		StringBuffer str2 = new StringBuffer();
		PrintString(str2);
		str2.append("Afdioanfioewni");PrintString(str2);
		str2.append("Bfmdioanfmeoiwanfoidsanlfdsa");PrintString(str2);
		str2.append("Cfmdiaosfnmeiwoafds");PrintString(str2);
//		StringBuffer는 누적되는게 남지 않는다. str이 append 되면 str은 남지 않는 거지 String은 남기는데!!
//		미리 일정용량을 할당받고 사용하다가 부작하면 다시 미리 할당받고 소모시킨다!
//		**문자열 조작 할 때 or 긴 문자열 사용에는 StringBuffer를 사용하지**
	}

	private static void PrintString(StringBuffer str2) {
		System.out.println(str2.length() + " : " + str2.capacity() + " : " + str2);
	}
}
