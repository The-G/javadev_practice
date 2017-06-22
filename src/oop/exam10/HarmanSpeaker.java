package oop.exam10;

public class HarmanSpeaker implements Speaker{

	@Override
	public void soundUp() {
		System.out.println("HarmanSpeaker 소리를 올림");
	}

	@Override
	public void soundDown() {
		System.out.println("HarmanSpeaker 소리를 내림");
	}

}
