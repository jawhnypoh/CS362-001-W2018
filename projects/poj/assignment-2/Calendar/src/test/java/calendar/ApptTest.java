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

	 @Test
	  public void test02()  throws Throwable  {
		 int startHour = 17;
		 int startMinute = 15;
		 int startDay = 30;
		 int startMonth = 05;
		 int startYear = 2014;
		 String title = "Appointment";
		 String description = "Dentist's appointment on this day.";

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
		 assertEquals(17, appt.getStartHour());
		 assertEquals(15, appt.getStartMinute());
		 assertEquals(30, appt.getStartDay());
		 assertEquals(05, appt.getStartMonth());
		 assertEquals(2014, appt.getStartYear());
		 assertEquals("Appointment", appt.getTitle());
		 assertEquals("Dentist's appointment on this day.", appt.getDescription());
	 }
//add more unit tests as you needed

	// This results in failure
	@Test
	public void test03()  throws Throwable  {
		int startHour = 22;
		int startMinute = 59;
		int startDay = 30;
		int startMonth = 12;
		int startYear = 2013;
		String title = " ";
		String description = " ";

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
		assertEquals(22, appt.getStartHour());
		assertEquals(59, appt.getStartMinute());
		assertEquals(30, appt.getStartDay());
		assertEquals(12, appt.getStartMonth());
		assertEquals(2013, appt.getStartYear());
		assertEquals(" ", appt.getTitle());
		assertEquals(" ", appt.getDescription());
	}

	@Test
	public void test04()  throws Throwable  {
		int startHour = 06;
		int startMinute = 45;
		int startDay = 25;
		int startMonth = 02;
		int startYear = 2012;
		String title = "Rent Due";
		String description = "Rent is due today!";

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
		assertEquals(06, appt.getStartHour());
		assertEquals(45, appt.getStartMinute());
		assertEquals(25, appt.getStartDay());
		assertEquals(02, appt.getStartMonth());
		assertEquals(2012, appt.getStartYear());
		assertEquals("Rent Due", appt.getTitle());
		assertEquals("Rent is due today!", appt.getDescription());
	}

	@Test
	public void test05()  throws Throwable  {
		int startHour = 17;
		int startMinute = 17;
		int startDay = 17;
		int startMonth = 07;
		int startYear = 2017;
		String title = "Laundry";
		String description = "Do laundry today!";

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
		assertEquals(17, appt.getStartHour());
		assertEquals(17, appt.getStartMinute());
		assertEquals(17, appt.getStartDay());
		assertEquals(07, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Laundry", appt.getTitle());
		assertEquals("Do laundry today!", appt.getDescription());
	}

	@Test
	public void test06()  throws Throwable  {
		int startHour = 06;
		int startMinute = 16;
		int startDay = 06;
		int startMonth = 06;
		int startYear = 2016;
		String title = "Text";
		String description = "Text";

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
		assertEquals(06, appt.getStartHour());
		assertEquals(16, appt.getStartMinute());
		assertEquals(06, appt.getStartDay());
		assertEquals(06, appt.getStartMonth());
		assertEquals(2016, appt.getStartYear());
		assertEquals("Text", appt.getTitle());
		assertEquals("Text", appt.getDescription());
	}

	@Test
	public void test07()  throws Throwable  {
		int startHour = 10;
		int startMinute = 15;
		int startDay = 20;
		int startMonth = 12;
		int startYear = 2020;
		String title = "Eyes";
		String description = "Eye doctor today!";

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
		assertEquals(10, appt.getStartHour());
		assertEquals(15, appt.getStartMinute());
		assertEquals(20, appt.getStartDay());
		assertEquals(12, appt.getStartMonth());
		assertEquals(2020, appt.getStartYear());
		assertEquals("Eyes", appt.getTitle());
		assertEquals("Eye doctor today!", appt.getDescription());
	}

	@Test
	public void test08()  throws Throwable  {
		int startHour = 01;
		int startMinute = 01;
		int startDay = 01;
		int startMonth = 01;
		int startYear = 2001;
		String title = "New year";
		String description = "Happy new year!";

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
		assertEquals(01, appt.getStartHour());
		assertEquals(01, appt.getStartMinute());
		assertEquals(01, appt.getStartDay());
		assertEquals(01, appt.getStartMonth());
		assertEquals(2001, appt.getStartYear());
		assertEquals("New year", appt.getTitle());
		assertEquals("Happy new year!", appt.getDescription());
	}

	@Test
	public void test09()  throws Throwable  {
		int startHour = 12;
		int startMinute = 15;
		int startDay = 28;
		int startMonth = 02;
		int startYear = 2012;
		String title = "Car";
		String description = "Fix car";

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
		assertEquals(12, appt.getStartHour());
		assertEquals(15, appt.getStartMinute());
		assertEquals(28, appt.getStartDay());
		assertEquals(02, appt.getStartMonth());
		assertEquals(2012, appt.getStartYear());
		assertEquals("Car", appt.getTitle());
		assertEquals("Fix car", appt.getDescription());
	}

	@Test
	public void test10()  throws Throwable  {
		int startHour = 10;
		int startMinute = 10;
		int startDay = 10;
		int startMonth = 10;
		int startYear = 2010;
		String title = "Ten";
		String description = "Day of Ten";

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
		assertEquals(10, appt.getStartHour());
		assertEquals(10, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(10, appt.getStartMonth());
		assertEquals(2010, appt.getStartYear());
		assertEquals("Ten", appt.getTitle());
		assertEquals("Day of Ten", appt.getDescription());
	}
	
}
