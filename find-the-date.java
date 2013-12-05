package javaconcepts;

import java.util.GregorianCalendar;
import java.util.Calendar;

// This class demonstrates the use of the GregorianCalendar class to print the current date & weekday, 
// the date & weekday, 100 days from today, the weekday of your birthday, and the date 10,000 days from 
// your birthday.

public class FindTheDate 
{
	
	public static void maim(String[]args)
	{
		// Print top of page info
		System.out.println("Mac Kiser");
		System.out.println("Find The Date Program");
		System.out.println("Due Date: November 14, 2013");
		System.out.println("");
		
		// The GregorianCalendar class describes a point in time, as measured by the GregorianCalendar
		
		//Set calendar to today's date an print
		GregorianCalendar cal = new GregorianCalendar();
		
		// Construct GregorianCalendar object
		int month = cal.get(Calendar.NOVEMBER);
		int dayOfMonth = cal.get(14);
		int year = cal.get(2013);
		int weekday = cal.get(Calendar.THURSDAY);
		
		System.out.println("Today's date is" + (month + 1) + "/" + dayOfMonth + "/" + year + ".");
		System.out.println("It is day" + weekday + "of the week.");
		System.out.println("");
		
			// Set calendar 100 days from today and print
			cal.add(Calendar.DAY_OF_MONTH,100);
			int month100 = cal.get(Calendar.JANUARY);
			int dayOfMonth100 = cal.get(22);
			int year100 = cal.get(2014);
			int weekday100 = cal.get(Calendar.SATURDAY);
		
			System.out.println("100 days from now is" + month100 + "/" + dayOfMonth100 + "/" + year100 + ".");
			System.out.println("It is day" + weekday100 + "of the week.");
			System.out.println("");
			
				// Set calendar to Mac's birthday and print the weekday of birth
				GregorianCalendar macsBirthday = new GregorianCalendar(2013, Calendar.NOVEMBER, 19);
				
				// Construct GregorianCalendar object
				int monthBirthday = macsBirthday.get(Calendar.NOVEMBER);
				int dayOfMonthBirthday = macsBirthday.get(19);
				int yearBirthday = macsBirthday.get(2013);
				int weekdayBirthday = macsBirthday.get(Calendar.TUESDAY);
				
				System.out.println("Mac's birthday is" + monthBirthday + "/" + dayOfMonthBirthday + "/" + yearBirthday + ".");
				System.out.println("It is day" + weekdayBirthday + "of the week.");
				System.out.println("");
				
					// Set date that is 10,000 days from Mac's Birthday
					cal.add(Calendar.DAY_OF_MONTH,10000);
					int month10000 = cal.get(Calendar.APRIL);
					int dayOfMonth10000 = cal.get(6);
					int year10000 = cal.get(2041);
					int weekday10000 = cal.get(Calendar.SATURDAY);
				
					System.out.println("10,000 days from Mac's birthday is" + month10000 + "/" + dayOfMonth10000 + "/" + year10000 + ".");
					System.out.println("It is day" + weekday10000 + "of the week.");
					System.out.println("");
				
				
	}
	

}
