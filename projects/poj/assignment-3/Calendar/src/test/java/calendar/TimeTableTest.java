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

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		 TimeTable timeTable = new TimeTable();
		 GregorianCalendar today = new GregorianCalendar(2018, 2, 10);
		 GregorianCalendar tmrw = new GregorianCalendar(2018, 2, 11);

		 LinkedList<Appt> linkedAppts = new LinkedList<Appt>();

		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(21, 30, 15, 01, 2018, "Birthday Party", "This is my birthday party.");

		 linkedAppts.add(appt);

		 startHour=11;
		 startMinute=50;
		 startDay=10;
		 startMonth=04;
		 startYear=2018;
		 title="Birthday Party";
		 description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 appt = new Appt(11, 50, 10, 04, 2018, "Birthday Party", "This is my birthday party.");

		 linkedAppts.add(appt);

		 int[] recurDaysArray = {2, 3, 4};
		 appt.setRecurrence(recurDaysArray, 1, 2, 1000);

		 
	 }
	 @Test
	  public void test02()  throws Throwable  {
		 
	 }
//add more unit tests as you needed
}
