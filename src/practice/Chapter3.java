package practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Chapter3 {

	public static void main(String[] args) {
		
		// 当日のインスタンスを取得したあと、その月の1日のインスタンスを得る
		LocalDate d = LocalDate.now().withDayOfMonth(1);
		// その月の最後の日を取得
		int lastday = d.lengthOfMonth();
		
		for(int i = 1; i <= lastday; i++) {
			//曜日を所得
			DayOfWeek day = d.getDayOfWeek();
			//曜日の文字列を所得
			String str = day.getDisplayName(TextStyle.SHORT, Locale.getDefault());
			System.out.print(d.getDayOfMonth() + "(" + str + ")");
			if(day == DayOfWeek.SATURDAY) {
				System.out.println();
			}
			d = d.plusDays(1);
		}
	}

}
