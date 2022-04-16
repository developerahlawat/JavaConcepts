package com.javaconcept.java8.datetime.dateformatter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateFormatterTest {

	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.of(2015, Month.JANUARY, 25, 6, 30);
		System.out.println(localDateTime);

		String format = localDateTime.format(DateTimeFormatter.ISO_DATE);
		System.out.println(format);

		String format2 = localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(format2);

		String format3 = localDateTime
				.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.UK));
		System.out.println(format3);

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ddyyyymm");
		String strDate = formatter.format(date);
		System.out.println(strDate);
		
		//long millis = getMillisFromServer();
		Date date1 = new Date(1609419075029L);
		DateFormat format1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		format1.setTimeZone(TimeZone.getTimeZone("Europe/London"));
		String formatted = format1.format(date1);
		System.out.println(formatted);
		
		
		
		Date date21 = new Date();
		DateFormat format21 = new SimpleDateFormat("dd/MM/yyyy");
		format21.setTimeZone(TimeZone.getTimeZone("Asia/Calcutta"));
		String formattedd = format21.format(date21);
		System.out.println(formattedd);
		
		long millisInDay = 60 * 60 * 24 * 1000;
		long currentTime = new Date().getTime();
		long dateOnly = (currentTime / millisInDay) * millisInDay;
		Date clearDate = new Date(dateOnly);
		System.out.println(clearDate);
		


	}

}
