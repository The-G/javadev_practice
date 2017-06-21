package oop.exam7;

public class Point3D extends Point2D {
	int z;

	public Point3D() { // 없으면 자동으로 만들어 주지.
//		super(); // 생략가능
		this(100,200,300); //pt3에서 잘 작동!!
		System.out.println("Point3D()"); // 실행순서 확인하기 위해서
	}

	public Point3D(int x, int y, int z) {
		super(x,y); // 이거 없으면 pt4에서 1,1,3 / 있으면 1,2,3 이 출력된다.
					// super x,y값 넘겨주네!!!
		this.z = z; 
		System.out.println("Point3D(x,y,z)");
	}
}
