package com.itheima;
import java.time.*;
public class Example23 {
	public static void main(String[] args) {
		// 1��Clock��ʹ��
		Clock clock = Clock.systemUTC();
		System.out.println("��ȡUTCʱ��ת���ĵ�ǰʱ�䣺" + clock.instant());
		System.out.println("��ȡUTCʱ��ת���ĵĺ�������" + clock.millis());
		// 2��Duration��ʹ��
		Duration d = Duration.ofDays(1);
		System.out.println("һ�����" + d.toHours() +"Сʱ");
		System.out.println("һ�����" + d.toMinutes() +"����");
		System.out.println("һ�����" + d.toMillis() +"��");
		// 3��Instant��ʹ��
		Instant instant = Instant.now();
		System.out.println("��ȡUTCʱ���ĵ�ǰʱ��Ϊ��" + instant);
		System.out.println("��ǰʱ��һСʱ���ʱ��Ϊ��" 
		                 + instant.plusSeconds(3600));
		System.out.println("��ǰʱ��һСʱǰ��ʱ��Ϊ��" 
		                 + instant.minusSeconds(3600));
		// 4��LocalDate��ʹ��
		LocalDate localDate = LocalDate.now();
		System.out.println("��Ĭ��ʱ����ϵͳʱ�ӻ�õ�ǰ���ڣ�" + localDate);
		// 5��LocalTime��ʹ��
		LocalTime localTime = LocalTime.now();
		System.out.println("��Ĭ��ʱ����ϵͳʱ�ӻ�ȡ��ǰʱ�䣺" + localTime);
		// 6��LocalDateTime��ʹ��
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("��Ĭ��ʱ����ϵͳʱ�ӻ�ȡ���ڡ�ʱ�䣺" 
							+ localDateTime);
		LocalDateTime times = localDateTime.plusDays(1)
				            .plusHours(3).plusMinutes(30);
		System.out.println("��ǰ�����ڡ�ʱ�����1��3Сʱ30��֮��" + times);
		// 7��Year��YearMonth��MonthDay��ʹ��
		Year year = Year.now();
		System.out.println("��ǰ���Ϊ��" + year);
		YearMonth yearMonth = YearMonth.now();
		System.out.println("��ǰ����Ϊ��" + yearMonth);
		MonthDay monthDay = MonthDay.now();
		System.out.println("��ǰ����Ϊ��" + monthDay);
		// 8�� ��ȡϵͳĬ��ʱ��
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println("��ǰϵͳĬ��ʱ��Ϊ��" + zoneId);
	}
}
