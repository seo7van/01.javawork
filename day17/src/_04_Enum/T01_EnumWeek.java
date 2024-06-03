package _04_Enum;

import java.util.Calendar;

public class T01_EnumWeek {

	public static void main(String[] args) {

		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		// 요일 1~7
		int week = cal.get(cal.DAY_OF_WEEK);
		System.out.println(week);
		
		switch(week) {
			case 1: today = Week.SUNDAY; break;
			case 2: today = Week.MONDAY; break;
			case 3: today = Week.TUESDAY; break;
			case 4: today = Week.WENSDAY; break;
			case 5: today = Week.THURSDAY; break;
			case 6: today = Week.FRIDAY; break;
			case 7: today = Week.SATURDAY;
		}
		if(today == Week.FRIDAY) {
			System.out.println("금요일!!!");
		}
		else {
			System.out.println("자바 공부중...");
		}
		
	}

}