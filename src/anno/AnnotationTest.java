package anno;

import java.util.List;

public class AnnotationTest {

	// @Override
	// @Deprecated // api의 사용을 더 이상 권장하지 않겠다!, 기존 방법이 아닌 새로운 버전의 방법을 사용하라고 할 때
	// @SuppressWarnings // heap의 누수가 심해지는 것을 막음?!
	// @FunctionalInterface

	@SafeVarargs // 사용자가 메모리 누수 생기지 않는다고 확인해주는 거다!
	public AnnotationTest(List<String>... list) { // 가변형 처리!! 경고메세지 뜨네, Type safety: Potential heap pollution via varargs parameter list
												  // heap에 부담을 준다는 것이다!!
	}
	
	@SafeVarargs // 안전한 가변형 매개변수야!! 알려주는 거다.
	public static String test(List<String>... list){
		return null;
		
	}

}
