package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;
import sun.util.calendar.Gregorian;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {

		 TimeTable timeTable = new TimeTable();

		 LinkedList<Appt> appts = new LinkedList<Appt>();

		 GregorianCalendar firstDay = new GregorianCalendar(2018, 01, 10);
		 GregorianCalendar lastDay = new GregorianCalendar(2018, 01, 20);

		 int startHour = 10;
		 int startMinute = 10;
		 int startDay = 10;
		 int startMonth = 10;
		 int startYear = 10;
		 String title = "Title";
		 String description = "Description";

		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);

		 // Assertions
		 assertNotNull(timeTable.getApptRange(appts, firstDay, lastDay));
		 assertNotNull(timeTable.deleteAppt(appts, appt));
	 }

	 @Test
	  public void test02()  throws Throwable  {
		 
	 }
//add more unit tests as you needed
}
