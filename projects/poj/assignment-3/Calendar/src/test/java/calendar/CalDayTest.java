package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
		int day = 10;
		int month = 02;
		int year = 2018;

		GregorianCalendar Day = new GregorianCalendar(year, month, day);

		CalDay today = new CalDay(Day);
		assertEquals(10, today.getDay());
		assertEquals(02, today.getMonth());
		assertEquals(2018, today.getYear());

		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(21, 30, 15, 01, 2018, null, null);

		 int startHour2=11;
		 int startMinute2=50;
		 int startDay2=10;
		 int startMonth2=04;
		 int startYear2=2018;
		 String title2="Birthday Party";
		 String description2="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt2 = new Appt(11, 50, 10, 04, 2018, null, null);

		 assertTrue(today.getAppts().isEmpty());

		 // Add an appointment
		 today.addAppt(appt);
		 today.addAppt(appt2);
		 today.iterator();
		 assertFalse(today.getAppts().isEmpty());
		 assertEquals(2, today.getSizeAppts());
		 assertNotNull(today.getAppts().toString());
		 assertNotNull(today.iterator());
		 assertNotEquals(0, today.getSizeAppts());

		 // Create a temporary day to test getAppts()
		 int tempDay = 02;
		 int tempMonth = 06;
		 int tempYear = 2018;

		 GregorianCalendar tempCalDay = new GregorianCalendar(year, month, day);

		 CalDay tempToday = new CalDay(tempCalDay);
		 tempToday.addAppt(appt);
		 tempToday.addAppt(appt2);
		 assertEquals(tempToday.getAppts(), today.getAppts());

		 // Test toString()
		 StringBuilder sb = new StringBuilder();

		 String todayDate = (month + "/" + day + "/" + year);
		 sb.append("\t --- " + todayDate + " --- \n");
		 sb.append(" --- -------- Appointments ------------ --- \n");
		 Iterator<Appt> iterator = today.appts.iterator();
		 while(iterator.hasNext()) {
		 	Object element = iterator.next();
		 	sb.append(element + " ");
		 }
		 sb.append("\n");

		 assertEquals(sb.toString(), today.toString());
	 }

	@Test
	public void test02()  throws Throwable  {

		GregorianCalendar gregorianCalendar = new GregorianCalendar(2011, 11, 11);

		CalDay calDay = new CalDay(gregorianCalendar);

		// Assertions
		assertNotNull(calDay.toString());
		assertTrue(calDay.isValid());

		Appt appt = new Appt(05, 30, 15, 01, 2018, null, null);

		appt.setStartDay(-1);

		calDay.addAppt(appt);

		// Assertions
		assertNotNull(calDay.getSizeAppts());
		assertEquals(11, calDay.getDay());
		assertEquals(11, calDay.getMonth());
		assertEquals(2011, calDay.getYear());

	}

	@Test
	public void test03() throws Throwable  {
		int date, month, year;

		GregorianCalendar gregorianCalendar = new GregorianCalendar(2011, 11, 11);

		CalDay calDay = new CalDay(gregorianCalendar);
		CalDay calDay2 = new CalDay();

		date = calDay.getDay();
		month = calDay.getMonth() + 1;
		year = calDay.getYear();


		// Set and create appointments
		Appt appt = new Appt(05, 30, 15, 01, 2018, null, null);
		Appt appt2 = new Appt(23, 40, 25, 04, 2018, null, null);

		calDay.addAppt(appt);
		assertEquals(1, calDay.getSizeAppts());

		calDay.addAppt(appt2);
		assertEquals(2, calDay.getSizeAppts());
		assertNull(calDay2.iterator());

		// Returns a string representation of the date in the proper format
		StringBuilder sb = new StringBuilder();

		String todayDate = date + "/" + month + "/" + year;
		sb.append("\t --- " + todayDate + " --- \n");
		sb.append(" --- -------- Appointments ------------ --- \n");
		Iterator<Appt> itr = calDay.appts.iterator();
		while(itr.hasNext()) {
			Object element = itr.next();

			sb.append(element + " ");
		}

		sb.append("\n");

		assertNotNull(calDay.toString());
		assertNotEquals(sb.toString(), calDay.toString());

	}

	@Test
	public void test04() throws Throwable {
		GregorianCalendar gregorianCalendar = new GregorianCalendar(2011, 11, 11);

		CalDay calDay = new CalDay(gregorianCalendar);

		assertEquals(11, calDay.getDay());
		assertEquals(11, calDay.getMonth());
		assertEquals(2011, calDay.getYear());

		Appt appt = new Appt(01, 30, 15, 01, 2018, null, null);

		calDay.addAppt(appt);
		appt.setStartHour(-1);
		assertEquals(-1, calDay.getAppts().get(0).getStartHour());
		calDay.addAppt(appt);

		Appt appt2 = new Appt(03, 20, 18, 04, 2018, null, null);

		calDay.addAppt(appt2);
		assertEquals(3, calDay.getAppts().get(1).getStartHour());

		Appt appt3 = new Appt(03, 20, 18, 04, 2018, null, null);

		calDay.addAppt(appt3);
		appt3.setStartHour(1);
		assertEquals(1, calDay.getAppts().get(2).getStartHour());
		calDay.addAppt(appt3);

		Appt appt4 = new Appt(05, 20, 18, 04, 2018, null, null);
		calDay.addAppt(appt4);

		assertEquals(1, calDay.getAppts().get(3).getStartHour());

	}

	@Test
	public void test05() throws Throwable {
	 	CalDay calDay = new CalDay();
	 	assertFalse(calDay.isValid());
		assertNull(calDay.iterator());
		assertEquals("", calDay.toString());
	}
//add more unit tests as you needed	
}
