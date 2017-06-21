package oop.exam9;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1 + " : " + s1.hashCode());

		Singleton s2 = Singleton.getInstance(); // instance 하나를 공유하네..
		System.out.println(s2 + " : " + s2.hashCode());
		// hashCode가 다르면 다른 instance 인거다. 단, 문자열은 제외인 경우가 있다.
	}
}
