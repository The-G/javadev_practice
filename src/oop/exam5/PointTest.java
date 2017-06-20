package oop.exam5;

public class PointTest {
	public static void main(String[] args) {
		Point2D up = new Point3D();
		up.x = 100;
		up.y = 200;
		// up.z = 300;
		// 참조변수 Point2D의 것을 접근 할 수 있지.
//		Q.단 overriding이 method가 있다면 그래도 3D가 아닌 2D것을 사용하지??
		
		
		Point3D dn = (Point3D) up;
		dn.x = 1000;
		dn.y = 2000;
		dn.z = 3000;
	}
}
