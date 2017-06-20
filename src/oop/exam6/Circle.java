package oop.exam6;

public class Circle extends Shape {
	String name = "원형";
	int r = 10;

	public void area() {
		res = r * r * 3.14;
	}
}
