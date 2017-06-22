package oop.exam10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TVUser {
	public static void main(String[] args) throws Exception {

		// TV tv = new AppleTV(); // 처음부터 up-casting을 해서 사용하는 거다!!
//		TV tv = new SamsungTV();
//		tv.setSpeaker(new HarmanSpeaker()); // 사용자가 speaker를 선택하네!!!
											// 이렇게해서 samsungTV와 harman speaker
											// 사이의 결합도가 낮춰준다!!!!!

		// 문제. AppleTV에 xiaomi speaker 연결
//		TV tv = new AppleTV();
//		tv.setSpeaker(new XiaomiSpeaker());
		
		// 문제. SonyTV에 OrangeSpeaker 연결		
		
//////////////////// pull 해 update 필요하다!!! new를 쓰지 않고 하는 방법이네...
		/// 설정파일만 바꿔서 compile 안하고 변경을 할 수 있어서!! 이렇게하는게 심하게 결합도를 없애는 거다.
//		실전에서 이렇게 바꾸는 것은 거의 없을 거다. 보통 프레임워크(spring 등...)에 맡기지!!!

		/*Properties p = new Properties();
		p.load(new FileInputStream("product.properties"));
		Class clazz1 = Class.forName(p.getProperty("tv"));
		Class clazz2 = Class.forName(p.getProperty("speaker"));
		TV tv = (TV) clazz1.newInstance(); //최상위로 upcastring 한다.
		Speaker speaker = (Speaker) clazz2.newInstance();
		tv.setSpeaker(speaker);
*/
////////////////////		
		
		TV tv = new SonyTV();
		tv.setSpeaker(new OrangeSpeaker());
		

		tv.powerOn();
		tv.channelUp();
		tv.channelDown();
		tv.soundUp();
		tv.soundDown();

	}
}
