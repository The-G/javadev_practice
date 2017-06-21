package oop.exam8;

class Calculator {
	public static final double pi = 3.141592;
} // 도 가능하다. ??? public은 이 class에서 하나만 가능하지!!

public class CalculatorTest {
	public static void main(String[] args) {
//		Calculator c = new Calculator();
//		System.out.println(c.pi);		
		System.out.println(Calculator.pi);
	}
}
