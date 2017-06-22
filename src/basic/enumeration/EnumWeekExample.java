package basic.enumeration;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null; // 열거 타입 변수 선언

		Calendar cal = Calendar.getInstance();
		//cal.set(Calendar.DAY_OF_MONTH, 19);
		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		System.out.println(week);
		System.out.println("오늘 요일: " + today.name()); //기본적으로 .name이 달려있는 거다!!  
		System.out.println(today.ordinal());
		System.out.println(today.compareTo(Week.FRIDAY));

		if (today == Week.SUNDAY) {
			System.out.println("열심히 웹사이트 관리를 합니다.");
		} else {
			System.out.println("일요일에는 코딩을 합니다!!");
		}
		Week[] weeks = Week.values();
		for (Week w:weeks) {
			System.out.println(w);
		}

	}
}
