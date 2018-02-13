package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.sql.Time;
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
		assertNotNull(linkedAppts);

		LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		calDays = timeTable.getApptRange(linkedAppts, today, tmrw);

		assertNotNull(calDays);

		appt.setRecurrence(null, 1, 2, 1000);
		timeTable.getApptRange(linkedAppts, today, tmrw);

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
		calDays = timeTable.getApptRange(linkedAppts, today, tmrw);
		assertNotNull(calDays);

		int[] pv = {1, 0};
		linkedAppts = timeTable.permute(linkedAppts, pv);
		assertNotNull(linkedAppts);

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
		appt.setRecurrence(null, 1, 2, 1000);

		calDays = timeTable.getApptRange(linkedAppts, today, tmrw);
		assertNotNull(calDays);

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
		appt.setRecurrence(null, 1, 0, 1000);

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
		appt.setRecurrence(null, 2, 2, 1000);

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
		appt.setRecurrence(recurDaysArray, 3, 2, 1000);

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
		appt.setStartHour(-1);
		appt.setRecurrence(null, 3, 2, 1000);
		linkedAppts.add(appt);

		GregorianCalendar occurDay = new GregorianCalendar(appt.getStartYear(), appt.getStartMonth(), appt.getStartDay());
		linkedAppts = timeTable.deleteAppt(linkedAppts, linkedAppts.get(1));
		assertNotNull(linkedAppts);

		LinkedList<Appt> linkedApptsNull = new LinkedList<Appt>();
		linkedApptsNull = null;
		linkedApptsNull = timeTable.deleteAppt(linkedApptsNull, linkedAppts.get(1));
		assertNull(linkedApptsNull);

		linkedAppts.get(1).setStartHour(-1);

		linkedAppts = timeTable.deleteAppt(linkedAppts, linkedAppts.get(1));
		assertNull(linkedAppts);

		LinkedList<Appt> linkedApptOthers = new LinkedList<Appt>();

		startHour=11;
		startMinute=50;
		startDay=10;
		startMonth=04;
		startYear=2018;
		title="Birthday Party";
		description="This is my birthday party.";

		//Construct a new Appointment object with the initial data
		appt = new Appt(11, 50, 10, 04, 2018, "Birthday Party", "This is my birthday party.");

		linkedApptOthers.add(appt);
		int[] pv1 = {0};
		linkedApptOthers = timeTable.permute(linkedApptOthers, pv1);
		assertNotNull(linkedApptOthers);
	}

	@Test
	public void test02()  throws Throwable  {
		TimeTable timeTable = new TimeTable();
		GregorianCalendar today = new GregorianCalendar(2018, 2, 10);
		GregorianCalendar tmrw = new GregorianCalendar(2018, 2, 11);

		LinkedList<Appt> linkedAppts = new LinkedList<Appt>();

		LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		calDays = timeTable.getApptRange(linkedAppts, today, tmrw);
		assertNotNull(calDays);

		Appt appt = new Appt(21, 30, 15, 01, 2018, "Birthday Party", "This is my birthday party.");
		linkedAppts.add(appt);

		calDays = timeTable.getApptRange(linkedAppts, today, tmrw);
		assertNotNull(calDays);

		int[] pv = {0};
		linkedAppts = timeTable.permute(linkedAppts, pv);
		assertNotNull(linkedAppts);

		LinkedList<Appt> linkedDeletedAppts = timeTable.deleteAppt(linkedAppts, linkedAppts.get(0));
		assertNull(linkedDeletedAppts);

		appt = new Appt(11, 50, 10, 04, 2018, "Birthday Party", "This is my birthday party.");
		linkedAppts.add(appt);

		int[] pv1 = {1, 0};
		linkedAppts = timeTable.permute(linkedAppts, pv1);
		assertNotNull(linkedAppts);

		int[] pv2 = {0, 1};
		linkedAppts = timeTable.permute(linkedAppts, pv2);
		assertNotNull(linkedAppts);

		appt = new Appt(11, 50, 10, 04, 2018, "Birthday Party", "This is my birthday party.");

		int[] recurDaysArray = {2, 3, 4};
		appt.setRecurrence(recurDaysArray, 1, 2, 1000);
		linkedAppts.add(appt);

		calDays = timeTable.getApptRange(linkedAppts, today, tmrw);
		assertNotNull(calDays);

		int[] pv3 = {0, 2, 1};
		linkedAppts = timeTable.permute(linkedAppts, pv3);
		assertNotNull(linkedAppts);

		linkedAppts = timeTable.deleteAppt(linkedAppts, linkedAppts.get(1));
		assertNotNull(linkedAppts);

		calDays = timeTable.getApptRange(linkedAppts, today, tmrw);

		appt = new Appt(11, 50, 10, 04, 2018, "Birthday Party", "This is my birthday party.");
		linkedAppts.add(appt);

		appt = new Appt(11, 50, 10, 04, 2018, "Birthday Party", "This is my birthday party.");
		linkedAppts.add(appt);

		linkedAppts = timeTable.deleteAppt(linkedAppts, linkedAppts.get(2));
		assertNotNull(linkedAppts);

	}

	@Test
	public void test04() throws Throwable {
		TimeTable timeTable = new TimeTable();
		GregorianCalendar today = new GregorianCalendar(2018, 2, 10);
		GregorianCalendar tmrw = new GregorianCalendar(2018, 2, 11);

		LinkedList<Appt> linkedAppts = new LinkedList<Appt>();

		LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		calDays = timeTable.getApptRange(linkedAppts, today, tmrw);
		assertNotNull(calDays);

		Appt appt = new Appt(11, 50, 10, 04, 2018, "Birthday Party", "This is my birthday party.");
		linkedAppts.add(appt);

		calDays = timeTable.getApptRange(linkedAppts, today, tmrw);
		assertNotNull(calDays);
	}

	@Test
	public void test05() throws Throwable {
		TimeTable timeTable = new TimeTable();
		GregorianCalendar today = new GregorianCalendar(2018, 2, 10);
		GregorianCalendar tmrw = new GregorianCalendar(2018, 2, 11);

		LinkedList<Appt> linkedAppts = new LinkedList<Appt>();

		LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		calDays = timeTable.getApptRange(linkedAppts, today, tmrw);
		assertNotNull(calDays);

		Appt appt = new Appt(11, 50, 10, 04, 2018, "Birthday Party", "This is my birthday party.");
		appt.setStartHour(-1);
		linkedAppts.add(appt);
		appt.setRecurrence(null, 1, 2, 1000);
		calDays = timeTable.getApptRange(linkedAppts, today, tmrw);
		assertNotNull(calDays);

	}

	@Test
	public void test06() throws Throwable {
		TimeTable timeTable = new TimeTable();
		GregorianCalendar today = new GregorianCalendar(2018, 2, 10);
		GregorianCalendar tmrw = new GregorianCalendar(2018, 2, 11);

		LinkedList<Appt> linkedAppts = new LinkedList<Appt>();

		LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		calDays = timeTable.getApptRange(linkedAppts, today, tmrw);
		assertNotNull(calDays);

		Appt appt = new Appt(11, 50, 10, 04, 2018, "Birthday Party", "This is my birthday party.");
		appt.setStartHour(-1);
		appt.setRecurrence(null, 3, 2, 1000);
		linkedAppts.add(appt);

		LinkedList<Appt> linkedApptsOther = new LinkedList<Appt>();
		appt = new Appt(11, 50, 10, 04, 2018, "Birthday Party", "This is my birthday party.");

		linkedApptsOther.add(appt);

		int[] pv= {0};
		linkedApptsOther = timeTable.permute(linkedApptsOther, pv);
		assertNotNull(linkedApptsOther);
		assertEquals(10, linkedApptsOther.get(0).getStartDay());

		TimeTable nullTable = new TimeTable();
		int[] emptyPV = new int[0];

		LinkedList<Appt> linkedApptsEmpty = new LinkedList<Appt>();
		assertNotNull(timeTable.permute(linkedApptsEmpty, emptyPV));
		assertNull(nullTable.deleteAppt(linkedAppts, null));
	}
//add more unit tests as you needed
}
