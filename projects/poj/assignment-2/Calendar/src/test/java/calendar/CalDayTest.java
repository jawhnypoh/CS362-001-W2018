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

	 	GregorianCalendar gregorianCalendar = new GregorianCalendar(2011, 11, 11);

	 	CalDay calDay = new CalDay(gregorianCalendar);

	 	// Assertions
	 	assertNotNull(calDay.toString());
	 	assertTrue(calDay.isValid());

		 Appt appt = new Appt(05, 30, 15, 01, 2018, "Birthday Party", "This is my birthday party.");

		 appt.setStartDay(-1);

		calDay.addAppt(appt);

		// Assertions
		assertNotNull(calDay.getSizeAppts());
		assertEquals(11, calDay.getDay());
		assertEquals(11, calDay.getMonth());
		assertEquals(2011, calDay.getYear());

	 }

	@Test
	public void test02() throws Throwable  {
		int date, month, year;

		GregorianCalendar gregorianCalendar = new GregorianCalendar(2011, 11, 11);

		CalDay calDay = new CalDay(gregorianCalendar);
		CalDay calDay2 = new CalDay();

		date = calDay.getDay();
		month = calDay.getMonth() + 1;
		year = calDay.getYear();


		// Set and create appointments
		Appt appt = new Appt(05, 30, 15, 01, 2018, "Birthday Party", "This is my birthday party.");
		Appt appt2 = new Appt(23, 40, 25, 04, 2018, "Birthday Party", "This is my birthday party.");

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
	public void test03() throws Throwable {
		GregorianCalendar gregorianCalendar = new GregorianCalendar(2011, 11, 11);

		CalDay calDay = new CalDay(gregorianCalendar);

		Appt appt = new Appt(01, 30, 15, 01, 2018, "Birthday Party", "This is my birthday party.");
		Appt appt2 = new Appt(03, 20, 18, 04, 2018, "Birthday Party", "This is my birthday party.");

		calDay.addAppt(appt);
		calDay.addAppt(appt2);

		// Assertion
		assertEquals(appt, calDay.getAppts().get(0));
	}
}
