package oop.exam10;

public interface TV {
	public void powerOn();	   // interface 안은 다 추상 method 이다!! 그래도 명시적으로 abstract 써주면 좋겠다. 
	public void powerOff();    // 안써줘도 되기도 하고
	public void channelUp();
	public void channelDown();
	public void soundUp();
	public void soundDown();
	
	public void setSpeaker(Speaker speaker);
}
