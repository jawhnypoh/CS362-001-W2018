package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	@Test
	public void test01()  throws Throwable  {
		int startHour=21;
		int startMinute=30;
		int startDay=15;
		int startMonth=01;
		int startYear=2018;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertTrue(appt.getValid());
		assertEquals(21, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(15, appt.getStartDay());
		assertEquals(01, appt.getStartMonth());
		assertEquals(2018, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}

	/* Check to see that setRecurrence() works properly */
	@Test
	public void test02()  throws Throwable  {
		int recurDays[] = new int[10];
		int recurBy = 1;
		int recurIncrement = 2;
		int recurNumber = 3;

		int startHour=21;
		int startMinute=30;
		int startDay=15;
		int startMonth=01;
		int startYear=2018;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		appt.setRecurrence(recurDays, recurBy, recurIncrement, recurNumber);

		String nullTitle = null;
		String nullDescription = null;

		appt.setTitle(nullTitle);
		appt.setDescription(nullDescription);

		// Assertions
		assertTrue(appt.getValid());
		assertEquals(3, appt.getRecurNumber());
		assertEquals(2, appt.getRecurIncrement());
		assertNotNull(appt.getRecurDays());
		assertEquals(1, appt.getRecurBy());
		assertEquals("", appt.getTitle());
		assertEquals("", appt.getDescription());

	}

	/* Check to see that setRecurrence() works properly with null input */
	@Test
	public void test03()  throws Throwable  {
		int recurDays[] = null;
		int recurBy = 1;
		int recurIncrement = 2;
		int recurNumber = 3;

		int startHour=21;
		int startMinute=30;
		int startDay=15;
		int startMonth=01;
		int startYear=2018;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		appt.setRecurrence(recurDays, recurBy, recurIncrement, recurNumber);

		// Assertions
		assertEquals(3, appt.getRecurNumber());
		assertEquals(2, appt.getRecurIncrement());
		assertEquals(0, appt.getRecurDays().length);
		assertEquals(1, appt.getRecurBy());

	}

	/* Check to see that toString() works */
	@Test
	public void test05() throws Throwable {
		int startHour=21;
		int startMinute=30;
		int startDay=15;
		int startMonth=01;
		int startYear=2018;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		appt.toString();

		// Assertions
		assertNotNull(appt.toString());
	}

	/* Check to see that compareTo() works */
	@Test
	public void test06() throws Throwable {
		int startHour=21;
		int startMinute=30;
		int startDay=15;
		int startMonth=01;
		int startYear=2018;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt compareAppt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		compareAppt.compareTo(compareAppt);

		// Assertions
		assertNotNull(compareAppt.compareTo(compareAppt));

	}

	/* Check to see that set methods work */
	@Test
	public void test07() throws Throwable {
		int startHour=21;
		int startMinute=30;
		int startDay=15;
		int startMonth=01;
		int startYear=2018;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(21, 30, 15, 01, 2018, "Birthday Party", "This is my birthday party.");

		appt.setStartHour(startHour);
		appt.setStartMinute(startMinute);
		appt.setStartDay(startDay);
		appt.setStartMonth(startMonth);
		appt.setStartYear(startYear);
		appt.setTitle(title);
		appt.setDescription(description);

		// Assertions
		assertTrue(appt.getValid());
		assertEquals(21, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(15, appt.getStartDay());
		assertEquals(01, appt.getStartMonth());
		assertEquals(2018, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());

	}

	/* Check to see that isValid() works */
	@Test
	public void test08() throws Throwable {
		Appt appt = new Appt(25, 30, 15, 01, 2018, "Birthday Party", "This is my birthday party.");

		// Assertion
		assertFalse(appt.getValid());
	}

	/* Check to see that recurDays() works */
	@Test
	public void test09() throws Throwable {
		Appt appt = new Appt(25, 30, 15, 01, 2018, "Birthday Party", "This is my birthday party.");

		Appt appt2 = new Appt(12, 59, 15, 01, 2018, "Birthday Party", "This is my birthday party.");

		int[] recurDaysArray = {2, 3, 4};

		appt2.setRecurrence(recurDaysArray, appt.RECUR_BY_WEEKLY, 2, appt.RECUR_NUMBER_FOREVER);

		// Assertion
		assertEquals(appt.RECUR_NUMBER_FOREVER, appt2.getRecurNumber());
		assertEquals(recurDaysArray, appt2.getRecurDays());
		assertEquals(appt.RECUR_BY_WEEKLY, appt2.getRecurBy());
		assertEquals(appt.RECUR_BY_WEEKLY, appt2.getRecurBy());
		assertTrue(appt2.isRecurring());

		assertEquals("\t1/15/2018 at 12:59pm ,Birthday Party, This is my birthday party.\n", appt2.toString());
	}

	/* Check to see that representationAppt() works */
	@Test
	public void test10() throws Throwable {
		int startHour=01;
		int startMinute=30;
		int startDay=15;
		int startMonth=01;
		int startYear=2018;
		String title="Birthday Party";
		String description="This is my birthday party.";

		Appt appt = new Appt(01, 30, 15, 01, 2018, "Birthday Party", "This is my birthday party.");

		appt.toString();
		String dateFormat = "\t" + startMonth + "/" + startDay + "/" + startYear + " at " + startHour + ":" + startMinute + "am " + "," + title + ", " + description + "\n";

		// Assertion
		assertEquals(dateFormat, appt.toString());
	}
	
}
