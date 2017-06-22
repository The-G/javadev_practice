package oop.exam10;

public class OrangeSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("OrangeSpeaker bang bang up");
	}

	@Override
	public void soundDown() {
		System.out.println("OrangeSpeaker dong dong down");
	}

}
