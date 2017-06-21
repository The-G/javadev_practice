package oop.exam9;
/*

*/

public class Singleton {

	private static Singleton s = new Singleton(); // 2.자기 자신을 참조하는 변수

	private Singleton() {
	} // 1. 외부 인스턴스 생성을 막기 위해서

	public static Singleton getInstance() { // 3.
		return s;
	}

	@Override // 존재했던건지 오타 체크에 좋다. annotation
	public String toString() {
		// TODO Auto-generated method stub
		return "포기하는 그 순간 시합 종료다";
	}
}
