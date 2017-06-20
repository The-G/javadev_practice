package oop.exam6;

public class ShapeTest {
	public static void main(String[] args) {
		// Circle c = new Circle();
		// printArea(c);
		// printArea(new Circle()); // 이렇게도 가능하네...

		// 각 도형별로 method 호출해서 사용하면 번거롭지... 그래서 모듈화를 해보겠다!!
		printArea(new Circle());
		printArea(new Rectangle());
		printArea(new Triangle());

	}

	private static void printArea(Shape s) { // up casting을 통해서 한거다!!
		s.area();
//		down casting 으로 도형 이름 가져오기
		
		if (s instanceof Circle){
			Circle c = (Circle) s;
			System.out.println(c.name + "의 넓이는 " + c.res);		
		} else if (s instanceof Triangle){
			Triangle c = (Triangle) s;			
			System.out.println(c.name + "의 넓이는 " + c.res);		
		} else if (s instanceof Rectangle){
			Rectangle c = (Rectangle) s;						
			System.out.println(c.name + "의 넓이는 " + c.res);		
		} else {
			Shape c = s;
			System.out.println("what the...");		
		}
	}

	
}
