package oop.exam6;

import org.junit.Test;

public class Circle extends Shape {
	int r = 10;
	public void size() {
		res = r * r * 3.14;
	}
	@Test // main method 없이 method 테스트 해보기!!
	public void testCircle() {
		Circle c = new Circle();
		c.size();
		System.out.println(c.res);
	}
	@Override
	public void area() {
		size();
	}
}
