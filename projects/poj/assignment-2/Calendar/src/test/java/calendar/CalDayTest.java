package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
	 	int day = 19;
	 	int month = 02;
	 	int year = 2001;

	 	GregorianCalendar gregorianCalendar = new GregorianCalendar(day, month, year);


		 CalDay calDay = new CalDay(gregorianCalendar);

	 	// Assertions
		assertEquals(19, calDay.getDay());
		assertEquals(02, calDay.getMonth());
		assertEquals(2001, calDay.getYear());

	 }
	 @Test
	  public void test02()  throws Throwable  {
		 
	 }
//add more unit tests as you needed	
}
