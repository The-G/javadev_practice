package oop.exam10;

public class XiaomiSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("XiaomiSpeaker bang bang up");
	}

	@Override
	public void soundDown() {
		System.out.println("XiaomiSpeaker dong dong down");
	}

}
