package _01_localDateTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class T03_LocalTime {

	public static void main(String[] args) {

		LocalDateTime today = LocalDateTime.now();
		
		System.out.println(today);
		
		/*System.out.println(time.getHour() + "시");
		System.out.println(time.getMinute() + "분");
		System.out.println(time.getSecond() + "초");
		*/
		LocalDateTime startDay = LocalDateTime.of(2024, 5, 7, 10, 0, 0);
		LocalDateTime endDay = LocalDateTime.of(2024, 11, 25, 18, 30, 0);
		
		System.out.println(startDay);
		System.out.println(endDay);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a hh:mm:ss");
		System.out.println("시작일 : " + startDay.format(dtf));
		System.out.println("종료일 : " + endDay.format(dtf));
		
		if(today.isBefore(endDay)) {
			System.out.println("수업 진행중 입니다");
		}
		else if(today.isAfter(endDay)) {
			System.out.println("종료한 수업 입니다");
		}
		else if(today.isEqual(endDay)) {
			System.out.println("수업 종료일 입니다");
		}
		
		Duration duration = Duration.between(today, endDay);
		System.out.println(duration.getSeconds());
		
		System.out.println("종료일까지 " + today.until(endDay, ChronoUnit.MONTHS) + "개월 남음");
		System.out.println("종료일까지 " + today.until(endDay, ChronoUnit.DAYS) + "일 남음");
		System.out.println("종료일까지 " + today.until(endDay, ChronoUnit.HOURS) + "시간 남음");
		System.out.println();
		
		LocalDateTime endTime = LocalDateTime.of(2024, 05, 28, 18, 30, 0);
		//LocalTime endTimd = LocalTime.of(18, 30, 0);
		System.out.println("끝나기까지 " + today.until(endTime, ChronoUnit.HOURS) + "시간");
		/*		int a = (int)today.until(endTimd, ChronoUnit.HOURS);
				int H = a/60;
				int m = a%60;
				System.out.printf("끝나기까지 %d시간 %d분 남음", H, m);*/
		System.out.println();
		
		System.out.println(today.plusYears(3).format(dtf));
		System.out.println(today.plusMonths(5).format(dtf));
		System.out.println(today.plusDays(15).format(dtf));
		System.out.println("-------------------------------");
		
		System.out.println(today.minusYears(3).format(dtf));
		System.out.println(today.minusMonths(5).format(dtf));
		System.out.println(today.minusDays(15).format(dtf));
		System.out.println("-------------------------------");
		
		//withDayOfMonth()
	}

}