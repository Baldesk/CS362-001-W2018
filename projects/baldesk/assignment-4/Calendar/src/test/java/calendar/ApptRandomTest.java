package calendar;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;



import static org.junit.Assert.*;



/**
 * Random Test Generator  for Appt class.
 */

public class ApptRandomTest
{
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;



	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random)
	{
        String[] methodArray = new String[] {"setTitle","setRecurrence", "setStart",
											"getStart", "toString", "compareTo"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
	}


	/**
	 * Return a randomly selected appointments to recur Weekly,Monthly, or Yearly !.
	 */
    public static int RandomSelectRecur(Random random)
	{
        int[] RecurArray = new int[] {Appt.RECUR_BY_WEEKLY,Appt.RECUR_BY_MONTHLY,Appt.RECUR_BY_YEARLY};// The list of the of setting appointments to recur Weekly,Monthly, or Yearly

    	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return the value of the  appointments to recur
	}

	/**
	 * Return a randomly selected appointments to recur forever or Never recur  !.
	 */
    public static int RandomSelectRecurForEverNever(Random random)
	{
        int[] RecurArray = new int[] {Appt.RECUR_NUMBER_FOREVER,Appt.RECUR_NUMBER_NEVER};// The list of the of setting appointments to recur RECUR_NUMBER_FOREVER, or RECUR_NUMBER_NEVER

    	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return appointments to recur forever or Never recur 
	}

	public static String RandomSelectTitle(Random random) {
		String[] titleArray = new String[]{"Birthday Party", "Lunch", " ", "",
				"The best day of my life"};// The list of the of titles to be tested in the Appt class

		int n = random.nextInt(titleArray.length);// get a random number between 0 (inclusive) and  titleArray.length (exclusive)

		return titleArray[n];
	}
	public static String RandomSelectDesc(Random random) {
		String[] descArray = new String[]{"could be fun", "Dave will be there", "Eh who cares", "",
				" "};// The list of the of descriptions to be tested in the Appt class

		int n = random.nextInt(descArray.length);// get a random number between 0 (inclusive) and  descArray.length (exclusive)

		return descArray[n];
	}


// TESTS
	/**
    * Generate Random Tests that tests Appt Class.
    */
	 @Test
	  public void radnomtest()  throws Throwable
	 {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		try
		{
			for (int iteration = 0; elapsed < TestTimeout; iteration++)
			{
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				 int startHour=ValuesGenerator.RandInt(random);
				 int startMinute=ValuesGenerator.RandInt(random);
				 int startDay=ValuesGenerator.RandInt(random);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startYear=ValuesGenerator.RandInt(random);
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
			 	if(!appt.getValid())
			 	{
					continue;
				}
				startHour=ValuesGenerator.RandInt(random);
				startMinute=ValuesGenerator.RandInt(random);
				startDay=ValuesGenerator.RandInt(random);;
				startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				startYear=ValuesGenerator.RandInt(random);
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
				if(!appt2.getValid())
				{
					continue;
				}
			 	for (int i = 0; i < NUM_TESTS; i++)
				{
					String methodName = ApptRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("setTitle"))
					   {
						   String newTitle=(String) ValuesGenerator.getString(random);
						   appt.setTitle(newTitle);						   
					   }
					   else if (methodName.equals("setRecurrence"))
					   {
						   int sizeArray=ValuesGenerator.getRandomIntBetween(random, 0, 8);
						   int[] recurDays=ValuesGenerator.generateRandomArray(random, sizeArray);
						   int recur=ApptRandomTest.RandomSelectRecur(random);
						   int recurIncrement = ValuesGenerator.RandInt(random);
						   int recurNumber=ApptRandomTest.RandomSelectRecurForEverNever(random);
						   appt.setRecurrence(recurDays, recur, recurIncrement, recurNumber);
						   appt.isRecurring();
						   recurDays = null;
						   appt.setRecurrence(recurDays, recur, recurIncrement, recurNumber);
					   }
					   else if (methodName.equals("setStart"))
					   {
						   int rando = ValuesGenerator.RandInt(random);
						   appt.setStartMinute(rando);
						   rando = ValuesGenerator.RandInt(random);
						   appt.setStartHour(rando);
						   rando = ValuesGenerator.getRandomIntBetween(random, 0,59);
						   appt.setStartMinute(rando);
						   rando = ValuesGenerator.getRandomIntBetween(random, 0,23);
						   appt.setStartHour(rando);
						   rando = ValuesGenerator.getRandomIntBetween(random, 1, 31);
						   appt.setStartDay(rando);
						   rando = ValuesGenerator.getRandomIntBetween(random, 1, 12);
						   appt.setStartMonth(rando);
						   rando = ValuesGenerator.RandInt(random);
						   appt.setStartYear(rando);
					   }
					   else if(methodName.equals("getStart"))
					   {
						   int rando = ValuesGenerator.RandInt(random);
						   appt.getStartDay();
						   appt.getStartHour();
						   appt.getStartMinute();
						   appt.getStartMonth();
						   appt.getStartYear();
					   }
					   else if(methodName.equals("toString"))
					   {
							appt.toString();
							appt2.toString();
					   }
					   else if(methodName.equals("compareTo"))
					   {
					   		appt.compareTo(appt2);
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
	 
		 System.out.println("Done testing...");
	 }


	
}
