package com.shubham.basic;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;
import java.time.temporal.ChronoUnit;
public class Cipher {
	public static void Cip(String inp)
	{

		int temp;
		for(int i=0;i<inp.length();i++)
		{
			temp=inp.charAt(i)+3;
			if(temp>65 && temp<93 || temp>97 && temp<125)
			{
				if(temp >90 || temp>122)
					temp-=26;		
			}
			System.out.print((char)(temp));




		}

	}
	private static void time() {
		// TODO Auto-generated method stub
		//TimeZone timeZone1 = TimeZone.getTimeZone("America/Los_Angeles");
		//TimeZone timeZone2 = TimeZone.getTimeZone("Europe/Copenhagen");
		/*
		Calendar calendar = new GregorianCalendar();

		long timeCPH = calendar.getTimeInMillis();
		System.out.println("timeCPH  = " + timeCPH);
		System.out.println("hour     = " + calendar.get(Calendar.HOUR_OF_DAY));

		calendar.setTimeZone(timeZone1);

		long timeLA = calendar.getTimeInMillis();
		System.out.println("timeLA   = " + timeLA);
		System.out.println("hour     = " + calendar.get(Calendar.HOUR_OF_DAY));
		 */
		Calendar currentdate = Calendar.getInstance();
		DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		TimeZone obj = TimeZone.getTimeZone("CST");
		formatter.setTimeZone(obj);
		System.out.println("Local:: " +currentdate.getTime());
		System.out.println("CST:: "+ formatter.format(currentdate.getTime()));

		//By sir
		TimeZone tz =TimeZone.getTimeZone("Pacific/Galapagos");
		Calendar cal =new GregorianCalendar(tz);
		int hh=cal.get(Calendar.HOUR);
		int mm=cal.get(Calendar.MINUTE);
		int ss=cal.get(Calendar.SECOND);
		System.out.println(hh+":"+mm+":"+ss);

		//Day Of Week
		int year=2010;
		int month=9;
		int date=10;
		
		Calendar c=Calendar.getInstance();
		c.set(year, month, date);
	
		
		System.out.println(c.DAY_OF_YEAR);
	}
	private static void age() {
		// TODO Auto-generated method stub
		//method1 using java 8
		LocalDate birthdate =LocalDate.of(1996, 1, 25);
		LocalDate now = LocalDate.now();
		System.out.println(Period.between(birthdate, now).getYears());
		
	}
	private static void countdowndays() {
		// TODO Auto-generated method stub
		LocalDate dateBefore = LocalDate.of(2018, Month.MAY, 30);
        //29-July-2017, change this to your desired End Date
		LocalDate dateAfter = LocalDate.of(2018, Month.JULY, 29);
		long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
		System.out.println(noOfDaysBetween);
		////////////////////////////////
		
		Calendar cal1 = new GregorianCalendar();
		Calendar cal2 = new GregorianCalendar();
		cal1.set(2014, 3, 3);
		cal2.set(2014, 3, 6);

		//System.out.println("Days= "+ ((cal2.getTime().getTime() – cal1.getTime().getTime()) / (1000 * 60 * 60 * 24)));
	}
	public static void date()
	{
		Date d= new Date();
		SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(df.format(d));
		LocalDateTime now = LocalDateTime.now();  
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
		System.out.println("After Formatting: " +  now.format(format));  
	}
	public static void main(String[] args) {
		Cip("Shubham");
		date();
		time();//Display current time of other country
		age();
		countdowndays();
	}
	
	
}
