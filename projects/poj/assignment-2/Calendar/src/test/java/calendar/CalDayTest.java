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

	 	GregorianCalendar gregorianCalendar = new GregorianCalendar(2011, 11, 11);

	 	CalDay calDay = new CalDay();

	 	int startHour = 01;
	 	int startMinute = 01;
	 	int startDay = 01;
	 	int startMonth = 01;
	 	int startYear = 2001;
	 	String title = "String";
	 	String description = "Description";

	 	// Construct a new Appt object with the data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);
		appt.setStartDay(-1);
		calDay.addAppt(appt);


	 	// Assertions
		assertNotNull(calDay.toString());
		assertTrue(calDay.isValid());
		assertNotNull(calDay.iterator());
		assertNotNull(calDay.toString());

	 }

	@Test
	public void test02()  throws Throwable  {

		GregorianCalendar gregorianCalendar = new GregorianCalendar(2011, 11, 11);

		CalDay calDay = new CalDay();

		int startHour = 02;
		int startMinute = 02;
		int startDay = 02;
		int startMonth = 02;
		int startYear = 2020;
		String title = "String";
		String description = "Description";

		// Construct a new Appt object with the data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);
		appt.setStartDay(-1);
		calDay.addAppt(appt);

		// Assertions
		assertNotNull(calDay.toString());
		assertTrue(calDay.isValid());
		assertNotNull(calDay.iterator());
		assertNotNull(calDay.toString());

	}

	@Test
	public void test03()  throws Throwable  {

		GregorianCalendar gregorianCalendar = new GregorianCalendar(2011, 11, 11);

		CalDay calDay = new CalDay();

		int startHour = 0;
		int startMinute = 0;
		int startDay = 0;
		int startMonth = 0;
		int startYear = 0;
		String title = "null";
		String description = "null";

		// Construct a new Appt object with the data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);
		appt.setStartDay(-1);
		calDay.addAppt(appt);


		// Assertions
		assertNotNull(calDay.toString());
		assertTrue(calDay.isValid());
		assertNotNull(calDay.iterator());
		assertNotNull(calDay.toString());

	}

	@Test
	public void test04()  throws Throwable  {

		GregorianCalendar gregorianCalendar = new GregorianCalendar(2011, 11, 11);

		CalDay calDay = new CalDay();

		int startHour = 23;
		int startMinute = 59;
		int startDay = 31;
		int startMonth = 12;
		int startYear = 2015;
		String title = "String";
		String description = "Description";

		// Construct a new Appt object with the data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);
		appt.setStartDay(-1);
		calDay.addAppt(appt);


		// Assertions
		assertNotNull(calDay.toString());
		assertTrue(calDay.isValid());
		assertNotNull(calDay.iterator());
		assertNotNull(calDay.toString());

	}

	@Test
	public void test05()  throws Throwable  {

		GregorianCalendar gregorianCalendar = new GregorianCalendar(2011, 11, 11);

		CalDay calDay = new CalDay();

		int startHour = 100;
		int startMinute = 100;
		int startDay = 100;
		int startMonth = 100;
		int startYear = 3000;
		String title = "asdfghjkl;";
		String description = "qwertyuiopasdfghjklzxcvbnm";

		// Construct a new Appt object with the data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);
		appt.setStartDay(-1);
		calDay.addAppt(appt);


		// Assertions
		assertNotNull(calDay.toString());
		assertTrue(calDay.isValid());
		assertNotNull(calDay.iterator());
		assertNotNull(calDay.toString());

	}

	@Test
	public void test06()  throws Throwable  {

		GregorianCalendar gregorianCalendar = new GregorianCalendar(2000, 10, 10);

		CalDay calDay = new CalDay();

		int startHour = 10;
		int startMinute = 10;
		int startDay = 10;
		int startMonth = 10;
		int startYear = 2010;
		String title = "asdfghjkl;";
		String description = "qwertyuiopasdfghjklzxcvbnm";

		// Construct a new Appt object with the data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);
		appt.setStartDay(-1);
		calDay.addAppt(appt);


		// Assertions
		assertNotNull(calDay.toString());
		assertTrue(calDay.isValid());
		assertNotNull(calDay.iterator());
		assertNotNull(calDay.toString());

	}

	@Test
	public void test07()  throws Throwable  {

		GregorianCalendar gregorianCalendar = new GregorianCalendar(2011, 11, 11);

		CalDay calDay = new CalDay();

		int startHour = -1;
		int startMinute = -1;
		int startDay = -1;
		int startMonth = -1;
		int startYear = -2000;
		String title = null;
		String description = null;

		// Construct a new Appt object with the data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);
		appt.setStartDay(-1);
		calDay.addAppt(appt);


		// Assertions
		assertNotNull(calDay.toString());
		assertTrue(calDay.isValid());
		assertNotNull(calDay.iterator());
		assertNotNull(calDay.toString());

	}

	@Test
	public void test08()  throws Throwable  {

		GregorianCalendar gregorianCalendar = new GregorianCalendar(2011, 11, 11);

		CalDay calDay = new CalDay();

		int startHour = 14;
		int startMinute = 30;
		int startDay = 03;
		int startMonth = 05;
		int startYear = 2018;
		String title = "Test title";
		String description = "Test description";

		// Construct a new Appt object with the data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);
		appt.setStartDay(-1);
		calDay.addAppt(appt);


		// Assertions
		assertNotNull(calDay.toString());
		assertTrue(calDay.isValid());
		assertNotNull(calDay.iterator());
		assertNotNull(calDay.toString());

	}

	@Test
	public void test09()  throws Throwable  {

		GregorianCalendar gregorianCalendar = new GregorianCalendar(2011, 11, 11);

		CalDay calDay = new CalDay();

		int startHour = 2;
		int startMinute = 10;
		int startDay = 01;
		int startMonth = 0;
		int startYear = 2000;
		String title = "asdfghjkl;";
		String description = "qwertyuiopasdfghjklzxcvbnm";

		// Construct a new Appt object with the data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);
		appt.setStartDay(-1);
		calDay.addAppt(appt);


		// Assertions
		assertNotNull(calDay.toString());
		assertTrue(calDay.isValid());
		assertNotNull(calDay.iterator());
		assertNotNull(calDay.toString());

	}

	@Test
	public void test10()  throws Throwable  {

		GregorianCalendar gregorianCalendar = new GregorianCalendar(2011, 11, 11);

		CalDay calDay = new CalDay();

		int startHour = 24;
		int startMinute = 60;
		int startDay = 31;
		int startMonth = 02;
		int startYear = 2018;
		String title = " ";
		String description = " ";

		// Construct a new Appt object with the data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);
		appt.setStartDay(-1);
		calDay.addAppt(appt);


		// Assertions
		assertNotNull(calDay.toString());
		assertTrue(calDay.isValid());
		assertNotNull(calDay.iterator());
		assertNotNull(calDay.toString());

	}
//add more unit tests as you needed	
}
