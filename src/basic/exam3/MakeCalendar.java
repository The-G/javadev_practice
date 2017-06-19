package basic.exam3;

import java.util.Calendar;
import java.util.Scanner;

public class MakeCalendar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 : "); int year = sc.nextInt();
		System.out.print("월 : "); int month = sc.nextInt();
		
		Calendar c = Calendar.getInstance(); //여기서 new를 제거한 이유는, 
//		이 안에 new가 있는 거다!!
//		추상 클래스 이다. 
		
		c.set(year, month - 1, 1);
		int week = c.get(Calendar.DAY_OF_WEEK); // 1일이 몇 요일 인지
		int end_day = c.getActualMaximum(Calendar.DATE); // 몇 일 까지 있는지.
		
		System.out.println(year + "년 " + month + "월 ");
		System.out.println("-------------------------");
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("-------------------------");
		for (int d = 1; d < week; d++) {
			System.out.print("   ");
		}
		for (int d = 1, w = week; d <= end_day; d++, w++) {
			System.out.print(d < 10 ? " " + d + " " : d + " " ); // 십의자리 구분을 위한 조건문
			if (w % 7 == 0) System.out.println(); //enter를 해주네!! 토요일이면!!
		}
		
		
//		Calendar now = Calendar.getInstance();
//		
//		System.out.println("- 달력 만들기");
//		System.out.println("일 월 화 수 목 금 토");
////		이 달의 1일이 몇요일 인지 구하기\
//		now.set(Calendar.DATE, 1); // 그 달의 1일이 무슨 요일인지 알아 낼 수 있다.
//		int year = now.get(Calendar.YEAR);
//		int month = now.get(Calendar.MONTH) + 1; // "+1" 주의
//		int day = now.get(Calendar.DATE);
//		int week = now.get(Calendar.DAY_OF_WEEK); // 1~7(일~토)로 출력된다.
//		System.out.print(year + "년 ");
//		System.out.print(month + "월 ");
//		System.out.println(day + "일 ");
//		System.out.println(week + "요일");
//		System.out.println("마지막 날 : " + now.getActualMaximum(Calendar.DATE));
//		repeat(" ", (week - 1));
//		for (int i = day; i <= now.getActualMaximum(Calendar.DATE); i++) {
//			System.out.println(i + ' ');
	}

//	public static void repeat(String str, int times){
//	    for(int i = 0;i < times;i++){
//	        System.out.print(str);
//	    }
//	  }
	
}
