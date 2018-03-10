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

        System.out.println("Start TimeTable testing ...");
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
                int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 5);
                int startYear=ValuesGenerator.getRandomIntBetween(random, 2010, 2020);
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
                int num2 = ValuesGenerator.getRandomIntBetween(random, 0, 1);
                int num3 = ValuesGenerator.getRandomIntBetween(random, 0, 1);
                LinkedList<Appt> apptlist = new LinkedList<Appt>();
                caldays.add(day1);
                startDay=ValuesGenerator.getRandomIntBetween(random, 1, 28);
                GregorianCalendar other_day = new GregorianCalendar(startYear,startMonth,startDay);
                CalDay day2 = new CalDay(other_day);

                day2.addAppt(appt);
                startHour=ValuesGenerator.getRandomIntBetween(random, 0, 23);
                startMinute=ValuesGenerator.getRandomIntBetween(random, 0,59);
                startDay=ValuesGenerator.getRandomIntBetween(random, 1, 28);
                startMonth=ValuesGenerator.getRandomIntBetween(random, 6, 11);
                //startYear=ValuesGenerator.RandInt(random);
                title=ApptRandomTest.RandomSelectTitle(random) ;
                Appt appt2 = new Appt(startHour,
                        startMinute ,
                        startDay ,
                        startMonth ,
                        startYear ,
                        title,
                        description);
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
                apptlist.add(appt);
                apptlist.add(appt2);

                for (int i = 0; i < NUM_TESTS; i++)
                {
                    if(methodName.equals("deleteAppt"))
                    {
                        if(num1 == 1)
                        {
                            appt = null;
                        }
                        else if(num3 == 1)
                        {
                            appt.setStartMinute(-1);
                        }
                        if(num2 == 1)
                        {
                            apptlist = null;
                        }

                        table1.deleteAppt(apptlist, appt2);
                        table1.deleteAppt(apptlist,appt);
                    }
                    else if(methodName.equals("getApptRange"))
                    {

                        int Day=ValuesGenerator.getRandomIntBetween(random, 1, 28);
                        int Month=ValuesGenerator.getRandomIntBetween(random, 1, 5);
                        int Year=ValuesGenerator.getRandomIntBetween(random, 2010, 2020);
                        GregorianCalendar day_1 = new GregorianCalendar(Year,Month,Day);
                        Day=ValuesGenerator.getRandomIntBetween(random, 1, 28);
                        Month=ValuesGenerator.getRandomIntBetween(random, 6, 11);
                        if(num3 == 1)
                        {
                            appt.setStartMinute(-1);
                            apptlist.add(appt);
                        }

                        GregorianCalendar day_2 = new GregorianCalendar(Year,Month,Day);
                        Appt appt3 = new Appt(startHour,
                                startMinute ,
                                Day,
                                Month ,
                                (Year +1) ,
                                title,
                                description);
                        apptlist.add(appt3);
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
