package oop.exam8;

public class Car {
	// 필드
	String company = "Tesla";
	String model;
	String color;
	int maxSpeed;

	// 생성자
	Car() {

	}

	Car(String model) {
//		this.model = model;
		this(model, "은색", 250); // 호출, default 값을 넣어두었네...
	}

	Car(String model, String color) {
//		this.model = model;
//		this.color = color;
		this(model, color, 250); // 호출
	}

	Car(String model, String color, int maxSpeed) { // 공통실행부분
		this.model = model;
		this.color = color;				
		this.maxSpeed = maxSpeed; 
	}
}
