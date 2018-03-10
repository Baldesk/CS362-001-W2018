package calendar;


import org.junit.Test;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {

	/**
	 * Generate Random Tests that tests CalDay Class.
	 */
	private static final long TestTimeout = 20 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	public static String RandomSelectMethod(Random random)
	{
		String[] methodArray = new String[] {"addAppt", "toString"};// The list of the of methods to be tested in the Appt class

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
				String methodName = CalDayRandomTest.RandomSelectMethod(random);
				int startDay=ValuesGenerator.getRandomIntBetween(random, 1, 28);
				int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				int startYear=ValuesGenerator.RandInt(random);
				GregorianCalendar today = new GregorianCalendar(startYear,startMonth,startDay);

				CalDay day1 = new CalDay(today);
				int startHour=ValuesGenerator.RandInt(random);
				int startMinute=ValuesGenerator.RandInt(random);
				startDay=ValuesGenerator.RandInt(random);
				startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				startYear=ValuesGenerator.RandInt(random);
				String title=ApptRandomTest.RandomSelectTitle(random) ;
				String description=ApptRandomTest.RandomSelectDesc(random);
				//Construct a new Appointment object with the initial data
				Appt appt = new Appt(startHour,
						startMinute ,
						startDay ,
						startMonth ,
						startYear ,
						title,
						description);
				startHour=ValuesGenerator.RandInt(random);
				startMinute=ValuesGenerator.RandInt(random);
				title=ApptRandomTest.RandomSelectTitle(random) ;
				description=ApptRandomTest.RandomSelectDesc(random);
				//Construct a new Appointment object with the initial data
				Appt appt2 = new Appt(startHour,
						startMinute ,
						startDay ,
						startMonth ,
						startYear ,
						title,
						description);

				for (int i = 0; i < NUM_TESTS; i++)
				{
					if(methodName.equals("addAppt"))
					{
						day1.addAppt(appt);
						day1.addAppt(appt2);
						CalDay invalid = new CalDay();
					}
					else if(methodName.equals("toString"))
					{
						day1.toString();
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
