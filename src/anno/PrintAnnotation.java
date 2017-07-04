package anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})		// 메소드에만 장착 가능
@Retention(RetentionPolicy.RUNTIME) // 수행중 특정 CLASS의 매타정보를 얻을 거니까 runtime
									// runtime시까지 어노테이션 정보를 유지하도록 했다.
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
