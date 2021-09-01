package com.sudoheader.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class StringToDate {

	public static void main(String[] args) throws ParseException {

//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
//		String dateInString = "7-Jun-2013";
//		Date date1 = formatter.parse(dateInString);

		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH);
		String dateStr = "2019-05-21";
		Date date = format.parse(dateStr);

//		System.out.println(date1);
		System.out.println(date);
	}

}
