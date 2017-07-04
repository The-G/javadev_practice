package anno;

import java.lang.reflect.Method;

public class PrintAnnotaionExample {
	public static void main(String[] args) {
		//Service 클래스로부터 메소드 정보를 얻음
		Method[] declareMethods = Service.class.getDeclaredMethods();
		// Service 클래스에 선언된 메소드 얻기(리플랙션)
		System.out.println("Service 클래스 메소드 개수" + ":" + declareMethods.length);
		// private여도 읽어들이네!!		
		//Method 객체를 하나씩 처리
		
		for(Method method : declareMethods) {
			// PrintAnnotation이 적용되었는지 확인
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			
			// 메소드 이름 출력
			System.out.println("[" + method.getName() + "]"); // private 경우 getNmae 은 받아오는데, value값은 못받아 오네..
			// 구분선 출력
			for (int i = 0; i < printAnnotation.number(); i++) {
				System.out.print(printAnnotation.value());
			}
			System.out.println();
			
			try {
				method.invoke(new Service()); // Service 객체를 생성하고 Service 객체의 매소드를 호출하는 코드이다.
			} catch (Exception e) {
				System.out.println();
			}
			System.out.println();
			
			
//			Annotation을 조정해서 출력 형태를 runtime중(수행중) 에 조정했네.
			
		}
	}
}
