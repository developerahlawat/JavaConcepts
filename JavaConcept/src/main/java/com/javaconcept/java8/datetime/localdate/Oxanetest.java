package com.javaconcept.java8.datetime.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Oxanetest {

	public static void main(String[] args) {
		// method to convert a month into first date and last date.
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		//String day = "01 ";
		String month = "Feb 2020";
		String date = "01 ".concat(month);
		String current ="2020-03-01";
		LocalDate today = LocalDate.parse(current, dateTimeFormatter);
		LocalDate fromDate = today.withDayOfMonth(1);
		LocalDate toDate = today.withDayOfMonth(today.lengthOfMonth());

		System.out.println(date);
		System.out.println(today);
		System.out.println("First day: " + fromDate);
		System.out.println("Last day: " + toDate);
		
		System.out.println("------------------------------------------");
		
		LocalDateTime now = LocalDateTime.now();
		String format1 = now.format(DateTimeFormatter.ISO_DATE_TIME);
		String format2 = now.atZone(ZoneId.of("GMT")).format(DateTimeFormatter.RFC_1123_DATE_TIME);
		String format3 = now.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss", Locale.ENGLISH));
		String format4 = now.format(DateTimeFormatter.ofPattern("MMM yyyy"));
		//DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("MMM uuuu");
		//LocalDate format4 = LocalDate.parse(now, dateTimeFormatter1);
		
		
		System.out.println(format1);
		System.out.println(format2);
		System.out.println(format3);
		System.out.println(format4);
	

	}

}
