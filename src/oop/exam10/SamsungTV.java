package oop.exam10;

public class SamsungTV implements TV {
	
//	private Speaker speaker = new HarmanSpeaker(); // 결합도를 낮춰야 한다..
//												   // new 가 있어서 class 사이의 결합도가 높아진다!!
	private Speaker speaker;
	
	public void setSpeaker(Speaker speaker) { // TV Interface에 설계하는 것이 좋다. 해줌!!
		this.speaker = speaker;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV : TV를 켭니다.");
	}

	public void powerOff() {
		System.out.println("SamsungTV : TV를 끕니다.");
	}

	public void channelUp() {
		System.out.println("SamsungTV : 채널을 올립니다.");
	}

	public void channelDown() {
		System.out.println("SamsungTV : 채널을 내립니다.");
	}
	
	public void soundUp(){
		if (speaker == null) {
			System.out.println("SamsungTV : 소리를 키웁니다.");
		} else {
			speaker.soundUp();
		}
	}

	public void soundDown(){
		if (speaker == null) {
			System.out.println("SamsungTV : 소리를 줄입니다.");
		} else {
			speaker.soundDown();
		}
	}

}
