package calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
	public static String RandomSelectMethod(Random random){
		String[] methodArray = new String[] {"deleteAppt()", "getApptRange()"};// The list of the of methods to be tested in the Appt class

		int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

		return methodArray[n] ; // return the method name
	}

	/**
	 * Return a randomly selected appointments to recur Weekly,Monthly, or Yearly !.
	 */
	public static int RandomSelectRecur(Random random){
		int[] RecurArray = new int[] {Appt.RECUR_BY_WEEKLY,Appt.RECUR_BY_MONTHLY,Appt.RECUR_BY_YEARLY};// The list of the of setting appointments to recur Weekly,Monthly, or Yearly

		int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
		return RecurArray[n] ; // return the value of the  appointments to recur
	}
	/**
	 * Return a randomly selected appointments to recur forever or Never recur  !.
	 */
	public static int RandomSelectRecurForEverNever(Random random){
		int[] RecurArray = new int[] {Appt.RECUR_NUMBER_FOREVER,Appt.RECUR_NUMBER_NEVER};// The list of the of setting appointments to recur RECUR_NUMBER_FOREVER, or RECUR_NUMBER_NEVER

		int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
		return RecurArray[n] ; // return appointments to recur forever or Never recur
	}

    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {


		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


		 System.out.println("Start testing...");

		 try {
			 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				 long randomseed = System.currentTimeMillis(); //10
				 //System.out.println(" Seed:"+randomseed );
				 Random random = new Random(randomseed);

				 int startHour = ValuesGenerator.RandInt(random);
				 int startMinute = ValuesGenerator.RandInt(random);
				 int startDay = ValuesGenerator.RandInt(random);
				 int startMonth = ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 int startYear = ValuesGenerator.RandInt(random);
				 String title = "Birthday Party";
				 String description = "This is my birthday party.";
				 //Construct a new Appointment object with the initial data
				 Appt appt = new Appt(startHour,
						 startMinute,
						 startDay,
						 startMonth,
						 startYear,
						 title,
						 description);

				 int startHour1 = ValuesGenerator.getRandomIntBetween(random, -1, 26);
				 int startMinute1 = ValuesGenerator.getRandomIntBetween(random, -1, 61);
				 int startDay1 = ValuesGenerator.getRandomIntBetween(random, -1, 35);
				 int startMonth1 = ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 int startYear1 = ValuesGenerator.RandInt(random);
				 String title1 = "Birthday Party";
				 String description1 = "This is my birthday party.";
				 //Construct a new Appointment object with the initial data
				 Appt appt1 = new Appt(startHour1,
						 startMinute1,
						 startDay1,
						 startMonth1,
						 startYear1,
						 title1,
						 description1);

				 int startHour2 = ValuesGenerator.getRandomIntBetween(random, 1, 24);
				 int startMinute2 = ValuesGenerator.getRandomIntBetween(random, 1, 59);
				 int startDay2 = ValuesGenerator.getRandomIntBetween(random, 1, 31);
				 int startMonth2 = ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 int startYear2 = ValuesGenerator.RandInt(random);
				 String title2 = "Birthday Party";
				 String description2 = "This is my birthday party.";
				 //Construct a new Appointment object with the initial data
				 Appt appt2 = new Appt(startHour2,
						 startMinute2,
						 startDay2,
						 startMonth2,
						 startYear2,
						 title2,
						 description2);

				 int startHour3 = ValuesGenerator.RandInt(random);
				 int startMinute3 = ValuesGenerator.RandInt(random);
				 int startDay3 = ValuesGenerator.RandInt(random);
				 int startMonth3 = ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 int startYear3 = ValuesGenerator.RandInt(random);
				 String title3 = "Birthday Party";
				 String description3 = "This is my birthday party.";
				 //Construct a new Appointment object with the initial data
				 Appt appt3 = new Appt(startHour3,
						 startMinute3,
						 startDay3,
						 startMonth3,
						 startYear3,
						 title3,
						 description3);

				 if(!appt.getValid())continue;
				 for(int i=0; i<NUM_TESTS; i++) {
					 String methodName = TimeTableRandomTest.RandomSelectMethod(random);
					 if(methodName.equals("deleteAppt()")) {
					 	String newTitle = (String) ValuesGenerator.getString(random);
					 	appt.setTitle(newTitle);

					 	int day = ValuesGenerator.RandInt(random);
					 	int month = ValuesGenerator.getRandomIntBetween(random, 1, 11);
					 	int year = ValuesGenerator.RandInt(random);

						 GregorianCalendar today = new GregorianCalendar(year, month, day);
						 CalDay calday = new CalDay(today);
						 calday.addAppt(appt);
						 calday.addAppt(appt1);
						 calday.addAppt(appt2);
						 calday.addAppt(appt3);

						 TimeTable timetable = new TimeTable();
						 LinkedList<Appt> linkedAppts = new LinkedList<Appt>();
						 linkedAppts.add(appt);
						 linkedAppts.add(appt1);
						 linkedAppts.add(appt2);
						 linkedAppts.add(appt3);

						 timetable.deleteAppt(linkedAppts, appt3);
						 timetable.deleteAppt(linkedAppts, appt);
						 timetable.deleteAppt(linkedAppts, null);
						 timetable.deleteAppt(null, appt);
						 assertEquals(null, timetable.deleteAppt(null, appt1));
					 }
					 else if(methodName.equals("getApptRange()")) {
						 String newTitle = (String) ValuesGenerator.getString(random);
						 appt.setTitle(newTitle);

						 int day = ValuesGenerator.RandInt(random);
						 int month = ValuesGenerator.getRandomIntBetween(random, 1, 11);
						 int year = ValuesGenerator.RandInt(random);

						 GregorianCalendar today = new GregorianCalendar(year, month, day);
						 GregorianCalendar tmrw = new GregorianCalendar(year, month, day+2);
						 CalDay calday = new CalDay(today);
						 calday.addAppt(appt);
						 calday.addAppt(appt1);
						 calday.addAppt(appt2);
						 calday.addAppt(appt3);

						 TimeTable timetable = new TimeTable();
						 LinkedList<Appt> linkedAppts = new LinkedList<Appt>();
						 linkedAppts.add(appt);
						 linkedAppts.add(appt1);
						 linkedAppts.add(appt2);
						 linkedAppts.add(appt3);

						 timetable.getApptRange(linkedAppts, today, tmrw);
					 }
				 }

				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				 if((iteration%10000)==0 && iteration!=0 )
					 System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 }


		 } catch(NullPointerException e) {

		 }

		 System.out.println("Done testing...");
		 
	 }

}
