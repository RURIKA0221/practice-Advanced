package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Chapter3_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate d = LocalDate.parse("2021/10/23", f);
		// 10日後を計算する
		d = d.plusDays(10);
		String str = d.format(f);
		System.out.println(str);
	}

}
