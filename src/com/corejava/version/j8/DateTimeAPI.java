package com.corejava.version.j8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		String fDate = date.format(DateTimeFormatter.ISO_DATE);

		System.out.println(fDate);
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		System.out.println(date.getDayOfWeek());
		
		LocalTime time = LocalTime.now();
		String fTime = time.format(DateTimeFormatter.ISO_TIME);

		System.out.println(fTime);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(time.getNano());
	}

}
