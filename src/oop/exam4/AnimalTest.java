package oop.exam4;

public class AnimalTest {
	public static void main(String[] args) {
		 Animal animal = new Animal();
		// System.out.println(animal);

		// sub type 인스턴스는 super type으로 참조 가능
		// 자동형변환(묵시적형변환) ※ Up casting
		Animal animal2 = new Bird(); 
		// animal이라는 그릇이 Animal이라는 리모컨을 가지고 있는데 그것의 버튼이 Bird에 대한 것만 활성화 되어 있다.
		System.out.println(animal2);

		
//		Bird bird = new Animal(); // 에러 발생하지
//		Bird bird = (Bird)new Animal(); // 강제 형변환으로 가능하기는 하지만... 
//		System.out.println(bird);
		
//		Bird bird = animal; //에러 발생하지...
//		Bird bird = (Bird) animal; //강제형변환하지 //RuntimeException
//		Q. 왜 강제형변환 하면 안되지???
//		System.out.println(bird);
	
		
//		down casting은 원 인스턴스의 타입이 캐스팅 하려는 타입이거나 캐스팅 타입의 서브타입이어야 함.
//		ex) Eagle type을 Animal type으로 참조하고 있는 것을 Bird나 Eagle type을 down casting은 가능하지만, Condor로 down casting 할 수 없다. 
		Animal eagle = new Eagle(); // 에러 발생하지는 않음, 이거 up casting임.
//		Condor condor2 = condor; //에러 발생한다.

//		Bird eagle2 = (Bird) eagle; // down casting 시에는 당연히 강제형변환 해야지.
//		Eagle eagle4 = (Eagle) eagle; 
//		Condor eagle3 = (Condor) eagle;

//		System.out.println(eagle2);
//		System.out.println(eagle4);
//		System.out.println(eagle3);
		
//		Q. 어느 부분에서 에러가 발생할까요?!
//		A. Eagle의 sub class 인 Condor로 down casting 한 부분에서 Error가 발생한다.
		
		
//		up casting은 자동 형변환이 가능하다. down casting은 반듯이 재참조이다.
//		독수리 넌 동물이야. 그리고 넌 새야!!  근데 넌 Condor야.. 이건 말이 안되지...

		
		// up casting과 down casting은 상속관계에서만 가능하다!!
		Tiger tiger = (Tiger) eagle;
		System.out.println(tiger);
		
		
		
	}
}
