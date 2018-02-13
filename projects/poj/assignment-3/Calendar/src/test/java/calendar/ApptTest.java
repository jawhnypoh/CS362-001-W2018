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

		int[] recurDaysNullArray = null;
		assertEquals(0, appt.getRecurDays().length);
		assertEquals(2, appt.getRecurIncrement());

		appt.setRecurrence(recurDaysNullArray, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);
		assertEquals(0, appt.getRecurDays().length);
		assertEquals(1, appt.getRecurBy());
		assertEquals(2, appt.getRecurIncrement());
		assertEquals(1000, appt.getRecurNumber());

		int[] recurDaysArray2 = {3, 4};
		appt.setRecurrence(recurDaysArray2, 1, 1, 1);
		assertNotEquals(0, appt.getRecurDays().length);

		assertEquals(1, appt.getRecurBy());
		assertEquals(1, appt.getRecurIncrement());
		assertEquals(1, appt.getRecurNumber());
	}

	/* Check to see that toString() works */
	@Test
	public void test05() throws Throwable {
		int startHour=1;
		int startMinute=1;
		int startDay=1;
		int startMonth=1;
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
		assertEquals("\t1/1/2018 at 1:1am ,Birthday Party, This is my birthday party.\n", appt.toString());

		appt.setStartHour(0);
		assertEquals("\t1/1/2018 at 12:1am ,Birthday Party, This is my birthday party.\n", appt.toString());

		appt.setStartHour(20);
		assertEquals("\t1/1/2018 at 8:1pm ,Birthday Party, This is my birthday party.\n", appt.toString());

		appt.setStartHour(12);
		assertEquals("\t1/1/2018 at 12:1pm ,Birthday Party, This is my birthday party.\n", appt.toString());

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

		appt = new Appt(21, 30, 15, 01, 2018, "Birthday Party", "This is my birthday party.");
		assertEquals(0, appt.compareTo(appt));
		assertNotEquals("x",appt.toString());
		assertEquals("\t1/15/2018 at 9:30pm ,Birthday Party, This is my birthday party.\n", appt.toString());
		assertNotNull(appt.compareTo(appt));
		appt.setStartHour(10);
		assertEquals("\t1/15/2018 at 10:30am ,Birthday Party, This is my birthday party.\n", appt.toString());
		appt.setStartDay(-1);
		assertNull(appt.toString());
		appt.setStartHour(0);
		assertEquals(0, appt.compareTo(appt));
		assertNotNull(appt.compareTo(appt));

		Appt appt1 = new Appt(21, 30, 15, 01, 2018, "Birthday Party", "This is my birthday party.");
		assertEquals(-37, appt.compareTo(appt1));
		appt.setStartHour(10);
		assertEquals(-27, appt.compareTo(appt1));
		appt.setStartMinute(0);
		assertEquals(-57, appt.compareTo(appt1));
		appt.setStartMonth(12);
		assertEquals(-46, appt.compareTo(appt1));
		appt.setStartYear(2000);
		assertEquals(-64, appt.compareTo(appt1));
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

		int newHour = 25;
		int newMinute = 10;
		int newDay = 15;
		int newMonth = 05;
		int newYear = 2019;
		String newTitle = "Another Party";
		String newDescription ="This is another party.";

		appt.setStartHour(newHour);
		appt.setStartMinute(newMinute);
		appt.setStartDay(newDay);
		appt.setStartMonth(newMonth);
		appt.setStartYear(newYear);
		appt.setTitle(newTitle);
		appt.setDescription(newDescription);

		assertEquals(25, appt.getStartHour());
		assertEquals(10, appt.getStartMinute());
		assertEquals(15, appt.getStartDay());
		assertEquals(05, appt.getStartMonth());
		assertEquals(2019, appt.getStartYear());
		assertEquals("Another Party", appt.getTitle());
		assertEquals("This is another party.", appt.getDescription());

		appt.toString();
		String dateFormat = "\t" + startMonth + "/" + startDay + "/" + startYear + " at " + startHour + ":" + startMinute + "am " + "," + title + ", " + description + "\n";

		// Assertion
		assertFalse(appt.getValid());

		appt.setStartHour(startHour);
		appt.setStartMinute(61);
		assertFalse(appt.getValid());

		/* StartMinute */
		appt.setStartMinute(-10);
		assertFalse(appt.getValid());

		appt.setStartMinute(60);
		assertFalse(appt.getValid());

		appt.setStartMinute(50);
		assertTrue(appt.getValid());

		appt.setStartMinute(0);
		assertTrue(appt.getValid());

		appt.setStartMinute(startMinute);
		assertTrue(appt.getValid());


		/* StartHour */
		appt.setStartHour(25);
		assertFalse(appt.getValid());

		appt.setStartHour(-20);
		assertFalse(appt.getValid());

		appt.setStartHour(24);
		assertFalse(appt.getValid());

		appt.setStartHour(20);
		assertTrue(appt.getValid());

		appt.setStartHour(0);
		assertTrue(appt.getValid());

		appt.setStartHour(startHour);
		assertTrue(appt.getValid());


		/* StartDay */
		appt.setStartDay(99);
		assertFalse(appt.getValid());

		appt.setStartDay(-99);
		assertFalse(appt.getValid());

		appt.setStartDay(0);
		assertFalse(appt.getValid());

		appt.setStartDay(1);
		assertTrue(appt.getValid());

		appt.setStartDay(startDay);
		assertFalse(appt.isRecurring());


		appt.setStartDay(90);
		appt.setStartYear(-2018);
		assertFalse(appt.getValid());

		appt.setStartMonth(12);
		assertFalse(appt.getValid());

		appt.setStartMonth(1);
		assertFalse(appt.getValid());

	}
	
}