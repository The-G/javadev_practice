package oop.exam1;

public class Point3D extends Point2D {
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override //meta tag 이다. 
	public void print() {
		super.print(); // Point2D의 method를 사용하고 확장.
		System.out.println("z = " + getZ());
	}

}
