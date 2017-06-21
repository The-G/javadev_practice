package oop.exam7;

public class Point2D {
	int x;
	int y;
	
//  **생성자가 없으면
//	public Point2D(){} // 생성자를 만들어 준다. compile 하는 순간 JVM이 만들어줌!
//					      default constructor 라고 한다.

	// generate constructor using fields

//	public Point2D(){}
	public Point2D(int x, int y) {
		super(); // 상속받은 super class의 생성자를 수행하고 온다. 그리고 지워도 된다?!?!
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x, y)"); // 실행순서 확인하기 위해서
	}
	
	
//	Q. default 값으로 x=1, y=1 어떻게 줄까?!
	public Point2D(){
		this(1, 1); // Point2D에서 Point2D(x,y) 를 불러서 사용함. 2중작업을 막기 위해서!!
		System.out.println("Point2D()"); // 실행순서 확인하기 위해서
	}

}
