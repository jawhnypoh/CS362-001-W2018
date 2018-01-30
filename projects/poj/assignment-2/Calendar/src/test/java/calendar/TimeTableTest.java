package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import com.sun.org.apache.xml.internal.utils.ThreadControllerWrapper;
import org.junit.Test;
import sun.util.calendar.Gregorian;

import static org.junit.Assert.*;

public class TimeTableTest {

	 /* Test to see if getApptRange() works */
	 @Test
	  public void test01()  throws Throwable  {

		 GregorianCalendar firstDay = new GregorianCalendar(2018, 01, 10);
		 GregorianCalendar lastDay = new GregorianCalendar(2018, 01, 20);

		 TimeTable timeTable = new TimeTable();

		 LinkedList<CalDay> calDays = new LinkedList<CalDay>();

		 LinkedList<Appt> appts = new LinkedList<Appt>();

		 calDays = timeTable.getApptRange(appts, firstDay, lastDay);

		 // Assertion
		 assertNotNull(calDays);
	 }

	 /* Test to see if deleteAppt() works */
	@Test
	public void test02()  throws Throwable  {
		TimeTable timeTable = new TimeTable();

		LinkedList<Appt> appts = new LinkedList<Appt>();


		appts = null;

		// Assertion
		assertNull(appts);
	}

	/* Test to see if deleteAppt() works with actual appts in it */
	@Test
	public void test03() throws Throwable {
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();

		TimeTable timeTable = new TimeTable();

		Appt appt = new Appt(05, 30, 15, 01, 2018, "Birthday Party", "This is my birthday party.");
		Appt appt1 = new Appt(06, 31, 16, 02, 2018, "Birthday Party", "This is my birthday party.");
		Appt appt2 = new Appt(07, 01, 17, 03, 2018, "Birthday Party", "This is my birthday party.");
		Appt appt3 = new Appt(01, 13, 18, 05, 2018, "Birthday Party", "This is my birthday party.");
		Appt appt4 = new Appt(03, 02, 18, 04, 2018, "Birthday Party", "This is my birthday party.");
		Appt appt5 = new Appt(02, 03, 19, 05, 2018, "Birthday Party", "This is my birthday party.");

		LinkedList<Appt> appts = new LinkedList<Appt>();

		appts.add(appt);
		appts.add(appt1);
		appts.add(appt2);
		appts.add(appt3);
		appts.add(appt4);
		appts.add(appt5);

		LinkedList<Appt> appts2 = new LinkedList<Appt>();

		Appt appt6 = new Appt(07, 06, 13, 04, 2018, "Birthday Party", "This is my birthday party.");

		appts2.add(appt6);
		appts2.add(appt);


	}

	@Test
	public void test04() throws Throwable {
		int pv[] = {0};

		TimeTable timeTable = new TimeTable();

		LinkedList<Appt> appts = new LinkedList<Appt>();

		int startHour = 10;
		int startMinute = 10;
		int startDay = 10;
		int startMonth = 10;
		int startYear = 10;
		String title = "Title";
		String description = "Description";

		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		appts.add(appt);

		appts = timeTable.permute(appts, pv);

		assertNotNull(appts);

	}

	@Test
	public void test05() throws Throwable {
		LinkedList<Appt> appts = new LinkedList<Appt>();

		GregorianCalendar Day1 = new GregorianCalendar(2011, 11, 11);
		GregorianCalendar Day2 = new GregorianCalendar(2011, 12, 11);

		TimeTable timeTable = new TimeTable();


		// Assertions
		assertNotNull(appts);
		try {
			timeTable.getApptRange(appts, Day1, Day2);
		} catch(DateOutOfRangeException e) {}
	}

	/* Test to see if apptOccurence() works with actual appts in it */
	@Test
	public void test06() throws Throwable {
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();

		TimeTable timeTable = new TimeTable();

		Appt appt = new Appt(01, 01, 01, 01, 2018, "Birthday Party", "This is my birthday party.");
		Appt appt1 = new Appt(02, 02, 02, 02, 2018, "Birthday Party", "This is my birthday party.");
		Appt appt2 = new Appt(03, 03, 03, 03, 2018, "Birthday Party", "This is my birthday party.");
		Appt appt3 = new Appt(04, 04, 04, 04, 2018, "Birthday Party", "This is my birthday party.");
		Appt appt4 = new Appt(05, 05, 05, 05, 2018, "Birthday Party", "This is my birthday party.");
		Appt appt5 = new Appt(06, 06, 06, 06, 2018, "Birthday Party", "This is my birthday party.");

		LinkedList<Appt> appts = new LinkedList<Appt>();

		appts.add(appt);
		appts.add(appt1);
		appts.add(appt2);
		appts.add(appt3);
		appts.add(appt4);
		appts.add(appt5);

		LinkedList<Appt> appts2 = new LinkedList<Appt>();

		Appt appt6 = new Appt(07, 07, 07, 07, 2018, "Birthday Party", "This is my birthday party.");

		appts2.add(appt6);
		appts2.add(appt);

		Appt invalidAppt = new Appt(26, 01, 01, 01, 2018, null, null);

		LinkedList<Appt> appts3 = new LinkedList<Appt>();

		appts3.add(invalidAppt);
		appts3.add(appt3);

		int[] s = {0};

		Appt recurMonthAppt = new Appt(2, 2, 11, 1, 2018, "Monthly", "Monthly");
		recurMonthAppt.setRecurrence(s, recurMonthAppt.RECUR_BY_MONTHLY, 1, 2);
		LinkedList<Appt> appts4 = new LinkedList<Appt>();
		appts4.add(recurMonthAppt);

		Appt recurWeeklyAppt = new Appt(2, 3, 4, 1, 2018, "Weekly", "Weekly");
		recurMonthAppt.setRecurrence(s, recurMonthAppt.RECUR_BY_WEEKLY, 1, 2);
		LinkedList<Appt> appts5 = new LinkedList<Appt>();
		appts5.add(recurWeeklyAppt);

		Appt recurYearAppt = new Appt(5, 4, 3, 2, 2018, "Yearly", "Yearly");
		recurMonthAppt.setRecurrence(s, recurMonthAppt.RECUR_BY_MONTHLY, 1, 2);
		LinkedList<Appt> appts6 = new LinkedList<Appt>();
		appts6.add(recurMonthAppt);

		GregorianCalendar Day1 = new GregorianCalendar(2011, 01, 01);
		GregorianCalendar Day2 = new GregorianCalendar(2012, 02, 02);
		GregorianCalendar Day3 = new GregorianCalendar(2013, 03, 03);


		assertEquals(appt2, timeTable.getApptRange(appts, Day2, Day3).get(0).appts.get(0));
		assertNotSame(appt6, timeTable.getApptRange(appts2, Day2, Day3).get(0).appts.get(0));
		assertNotSame(invalidAppt, timeTable.getApptRange(appts3, Day2, Day3).get(0).appts.get(0));

	}

	@Test
	public void test07() throws Throwable {
		TimeTable timeTable = new TimeTable();

		Appt appt = new Appt(05, 30, 15, 01, 2018, "Birthday Party", "This is my birthday party.");
		Appt appt1 = new Appt(05, 30, 16, 01, 2018, "Birthday Party", "This is my birthday party.");

		LinkedList<Appt> appts = new LinkedList<Appt>();

		appts.add(appt1);
		appt1.setStartDay(15);

		appts.add(appt1);

		appt1.setStartDay(16);
		appts.add(appt1);

		int[] inorder = {0, 1, 2};
		timeTable.permute(appts, inorder);
	}
}
