package calendar;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.Random;
import java.util.GregorianCalendar;
import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest
{

	/**
	 * Generate Random Tests that tests TimeTable Class.
	 */

	private static final long TestTimeout = 20 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	public static String RandomSelectMethod(Random random)
	{
		String[] methodArray = new String[] {"deleteAppt", "getApptRange"};// The list of the of methods to be tested in the Appt class

		int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

		return methodArray[n] ; // return the method name
	}


	@Test
	public void radnomtest()  throws Throwable
	{

		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		System.out.println("Start Appt testing ...");
		try
		{
			for (int iteration = 0; elapsed < TestTimeout; iteration++)
			{
				long randomseed =System.currentTimeMillis();
				Random random = new Random(randomseed);
				String methodName = TimeTableRandomTest.RandomSelectMethod(random);
				TimeTable table1 = new TimeTable();
				int startHour=ValuesGenerator.getRandomIntBetween(random, 0, 23);
				int startMinute=ValuesGenerator.getRandomIntBetween(random, 0,59);
				int startDay=ValuesGenerator.getRandomIntBetween(random, 1, 28);
				int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				int startYear=ValuesGenerator.RandInt(random);
				String title=ApptRandomTest.RandomSelectTitle(random) ;
				String description=ApptRandomTest.RandomSelectDesc(random);
				GregorianCalendar today = new GregorianCalendar(startYear,startMonth,startDay);

				CalDay day1 = new CalDay(today);
				Appt appt = new Appt(startHour,
						startMinute ,
						startDay ,
						startMonth ,
						startYear ,
						title,
						description);
				day1.addAppt(appt);
				LinkedList<CalDay> caldays = new LinkedList<CalDay>();
				int num1 = ValuesGenerator.getRandomIntBetween(random, 0, 1);
				LinkedList<Appt> apptlist = new LinkedList<Appt>();
				if(num1 != 0)
				{
					caldays.add(day1);
					startDay=ValuesGenerator.getRandomIntBetween(random, 1, 28);
					GregorianCalendar other_day = new GregorianCalendar(startYear,startMonth,startDay);
					CalDay day2 = new CalDay(other_day);

					day2.addAppt(appt);
					startHour=ValuesGenerator.getRandomIntBetween(random, 0, 23);
					startMinute=ValuesGenerator.getRandomIntBetween(random, 0,59);
					startDay=ValuesGenerator.getRandomIntBetween(random, 1, 28);
					startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					startYear=ValuesGenerator.RandInt(random);
					title=ApptRandomTest.RandomSelectTitle(random) ;
					description=ApptRandomTest.RandomSelectDesc(random);

					apptlist.add(appt);
					appt = new Appt(startHour,
							startMinute ,
							startDay ,
							startMonth ,
							startYear ,
							title,
							description);
					day2.addAppt(appt);
					caldays.add(day2);
					apptlist.add(appt);
				}

				for (int i = 0; i < NUM_TESTS; i++)
				{
					if(methodName.equals("deleteAppt"))
					{
						table1.deleteAppt(apptlist, appt);
					}
					else if(methodName.equals("getApptRange"))
					{
						int Day=ValuesGenerator.getRandomIntBetween(random, 1, 15);
						int Month=ValuesGenerator.getRandomIntBetween(random, 1, 11);
						int Year=ValuesGenerator.getRandomIntBetween(random, 0, 2025);
						GregorianCalendar day_1 = new GregorianCalendar(startYear,startMonth,startDay);
						Day=ValuesGenerator.getRandomIntBetween(random, 15, 28);
						Month=ValuesGenerator.getRandomIntBetween(random, 1, 11);
						Year=ValuesGenerator.RandInt(random);
						GregorianCalendar day_2 = new GregorianCalendar(startYear,startMonth,startDay);
						table1.getApptRange(apptlist, day_1, day_2);

					}
				}

				elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				if((iteration%10000)==0 && iteration!=0 )
				{
					System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
				}
			}
		}catch(NullPointerException e){

		}



	}


}
