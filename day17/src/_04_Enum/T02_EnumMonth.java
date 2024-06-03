package _04_Enum;

import java.util.Calendar;

public class T02_EnumMonth {

	public static void main(String[] args) {

		Month today = null;
		
		Calendar cal = Calendar.getInstance();
		// 요일 0~11
		int month = cal.get(cal.MONTH);
		System.out.println(month);
		
		switch(month) {
			case 0: today = Month.JANUARY; break;
			case 1: today= Month.FABURATY; break;
			case 2: today = Month.MARCH; break;
			case 3: today = Month.APRIL; break;
			case 4: today = Month.MAY; break;
			case 5: today = Month.JUNE; break;
			case 6: today = Month.JULY; break;
			case 7: today = Month.AUGUST; break;
			case 8: today = Month.SEPTEMBER; break;
			case 9: today = Month.OCTOBER; break;
			case 10: today = Month.NOVEMBER; break;
			case 11: today = Month.DECEMBER;
			
		}
		if(today == Month.MAY) {
			System.out.println("가정의 달");
		}
		else {
			System.out.println("5월이 아닌 달");
		}
		
	}

}