package oop.exam1;

public class Point2D {
	private int x;
	private int y;

	//	setter	
	//	getter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	//	이렇게 인캡슐레이션이 되었고, 정보은폐가 된거다!!

	public void print() {
		System.out.println("x = " + this.getX());
		System.out.println("y = " + this.getY());
	}
}
