package lesson1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Lp62 {

	public static void main(String[] args) {
		LocalDateTime l1 = LocalDateTime.now();
		System.out.println(l1);

		ZonedDateTime z1 = l1.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l2 = z1.toLocalDateTime();
		System.out.println(l2);

//		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm.s±hh:mm");
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分　 時差±hh時間");
		DateTimeFormatter fj = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分");
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
		ZonedDateTime date1 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		ZonedDateTime date2 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

		System.out.println("日本："+date1.format(fj));
		System.out.println("ヨーロッパ："+date2.format(f));

		OffsetDateTime odt = OffsetDateTime.now();
		System.out.println(odt.format(f));

		LocalDate d1 = LocalDate.of(2012,1,1);
	    LocalDate d2 = LocalDate.of(2012,1,4);

	    // 3日間を表すPeriodを2通りの方法で生成
	    Period p1 = Period.ofDays(3);
	    Period p2 = Period.between(d1, d2);

	    // d2のさらに3日後を計算する
	    LocalDate d3 = d2.plus(p2);
	    // d1のさらに3日後を計算する
	    LocalDate d4 = d2.plus(p1);



	    System.out.println(d3.format(f3));
	    System.out.println(d4.format(f3));
	}

}
