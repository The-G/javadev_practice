package oop.exam1;

public class PointTest {
	public static void main(String[] args) {
//		reference가 없으면 지워진다!! 
		Point3D pt = new Point3D(); // 리모컨 생각해 보자.. 그릇에 리모컨 생기고 instance 생기고 서로 연결 이었나?!?!
		System.out.println(pt.toString());
		// @ 뒷부분이 hash code 이다!!
		System.out.println(pt.hashCode()); // 같은거다. 진수가 다른거지. 16진법으로 바꾸면?! 같다.

		pt.setX(100);
		pt.setY(200);
		pt.setZ(300);
		
		pt.print();
			
	}
}
