package oop.exam10;

public class SonyTV implements TV {

	private Speaker speaker;

	@Override
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	@Override
	public void powerOn() {
		System.out.println("SonyTV : TV를 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("SonyTV : TV를 끕니다.");
	}

	@Override
	public void channelUp() {
		System.out.println("SonyTV : TV를 채널 up.");
	}

	@Override
	public void channelDown() {
		System.out.println("SonyTV : TV를 채널 down.");
	}

	@Override
	public void soundUp() {
		if (speaker == null) {
			System.out.println("SonyTV : TV를 소리질러~ up");						
		} else {
			speaker.soundUp();
		}
	}

	@Override
	public void soundDown() {
		if (speaker == null) {
			System.out.println("SonyTV : TV를 소리줄여~ down");			
		} else {
			speaker.soundDown();
		}
	}

}
