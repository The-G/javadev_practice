package basic.enumeration;

import static basic.enumeration.PowerState.*;

public class Computer extends ElectricDevice {

//	private int state = 0; // 0:off, 1:on, 2:suspend
	private PowerState state = OFF;
	
	@Override
	public void turnOn() {
//		state = 1;
		state = ON; // type을 맞춰줘야한다!!
	}

	@Override
	public void turnOff() {
//		state = 0;
		state = OFF;
	}

	public void suspend() {
//		state = 2;
		state = SUSPEND;
	}
	
//	public void setstate(int state) {
	public void setstate(PowerState state) {
		switch (state) {
//		case 1:
		case ON:
//			System.out.println("Power On");
			turnOn();
			break;
//		case 0:
		case OFF:
//			System.out.println("Power Off");
			turnOff();
			break;
//		case 2:
		case SUSPEND:
//			System.out.println("Power Suspend");
			suspend();
			break;
		default:
			break;
		}
		System.out.println(state); //state.toString() 이지!!!
	}
	
}
