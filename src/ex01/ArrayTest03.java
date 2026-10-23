package ex01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ArrayTest03 {

	public static void main(String[] args) {
		// 배열 3번째 예제
		LocalDateTime today = LocalDateTime.now();
		//날짜 가져온 것
		System.out.println("오늘 날짜:"+ today);
		//getDisplayName으로 가져온 것
		System.out.println("요일 한자:" + getYoil() );
		//배열로 불러온 것
		System.out.println("요일 한자:" + getArratYoil()+ "曜日");

	}

	private static String getYoil() {
		//getDisplayName에서 요일을 한국에서 사용하는 한자로 바꿔서 들고오는 부분(일본어 외 중국어는 표현방식이 다름)
		String yoil;
		
		LocalDate now = LocalDate.now();
		yoil = (now.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.JAPAN));

		return yoil;
	}

	private static String getArratYoil() {
		// 배열에 직접 입력하여 요일 가져오는 곳
		String [] y = new String[] {
			"月", "火", "水", "木" ,"金" ,"土" ,"日"	
		};
		LocalDate now = LocalDate.now();
		int wk = now.getDayOfWeek().getValue();
		 
		return y[wk-1];
	}

}
