package basic.exam3;

import java.util.Calendar;

//운영체제의 시간대를 기준으로 Calendar 얻기
public class CalendarExample { 
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // "+1" 주의
		int day = now.get(Calendar.DATE);
//		월~일 요일을 출력하고 싶은 거다!! 책 539p 내용이네!!
		int week = now.get(Calendar.DAY_OF_WEEK); // 1~7(일~토)로 출력된다.
		String strWeek = null;
		
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;
		default:
			strWeek = "???";
		}
		
		int am_pm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (am_pm == Calendar.AM){
			strAmPm = "오전";
		} else {
			strAmPm = "오후";			
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println("- Calendar 얻기");
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
//		System.out.println("요일 : " + week);
		System.out.print(strWeek + "요일");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초");
		
		// 날짜 변동하기!! 1
		System.out.println("- 날짜 변동하기!! 1");
		now.set(2017, 5, 18); // MONTH 주의해야 한다!!
		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH) + 1; // "+1" 주의
		day = now.get(Calendar.DATE);

		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");

		// 날짜 변동하기!! 2
		System.out.println("- 날짜 변동하기!! 2");
		now.add(Calendar.DATE, 1);
		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH) + 1; // "+1" 주의
		day = now.get(Calendar.DATE);
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
	
	}
	
}
