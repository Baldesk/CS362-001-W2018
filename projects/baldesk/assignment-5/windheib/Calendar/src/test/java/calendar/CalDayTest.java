package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;



import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

    @Test
    public void test01()  throws Throwable  {
        Calendar rightnow = Calendar.getInstance();
        int thisMonth, thisYear, thisDay;
        thisMonth = rightnow.get(Calendar.MONTH)+1;
        thisYear = rightnow.get(Calendar.YEAR);
        thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
        int startHour=15;
        int startMinute=30;
        int startDay=thisDay+1;
        int startMonth=thisMonth;
        int startYear=thisYear;
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
        LinkedList<Appt> listAppts = new LinkedList<Appt>();
        listAppts.add(appt);
        //=-=======================================================================

        startHour=10;
        startMinute=2;
        startDay=thisDay+3;
        startMonth=thisMonth;
        startYear=thisYear;
        String title2="Bake sale";
        String description2="Pastryssssssssss";
        //Construct a new Appointment object with the initial data
        Appt appt2 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title2,
                description2);
        listAppts.add(appt2);

        GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
        GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
        tomorrow.add(Calendar.DAY_OF_MONTH,1);
        String todatDate=today.get(Calendar.MONTH)+ "/"+ today.get(Calendar.DAY_OF_MONTH)+"/"+today.get(Calendar.YEAR);
        String tomorrowDate=tomorrow.get(Calendar.MONTH)+ "/"+ tomorrow.get(Calendar.DAY_OF_MONTH)+"/"+tomorrow.get(Calendar.YEAR);

        TimeTable timeTable=new TimeTable();
        //Create a linked list of calendar days to return
        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
        calDays = timeTable.getApptRange(listAppts, today, tomorrow);

        for (int i = 0; i < calDays.size(); i++)
            System.out.println(calDays.get(i).toString());
    }
    @Test
    public void test02()  throws Throwable  {
        Calendar rightnow = Calendar.getInstance();
        int thisMonth, thisYear, thisDay;
        thisMonth = rightnow.get(Calendar.MONTH)+1;
        thisYear = rightnow.get(Calendar.YEAR);
        thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
        int startHour=15;
        int startMinute=30;
        int startDay=thisDay+1;
        int startMonth=thisMonth;
        int startYear=thisYear;
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
        GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
        CalDay day1 = new CalDay(today);
        day1.addAppt(appt);
    }
    @Test
    public void test03()  throws Throwable  {
        Calendar rightnow = Calendar.getInstance();
        int thisMonth, thisYear, thisDay;
        thisMonth = rightnow.get(Calendar.MONTH)+1;
        thisYear = rightnow.get(Calendar.YEAR);
        thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
        int startHour=15;
        int startMinute=30;
        int startDay=thisDay+1;
        int startMonth=thisMonth;
        int startYear=thisYear;
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
        LinkedList<Appt> listAppts = new LinkedList<Appt>();
        listAppts.add(appt);
        //=-=======================================================================

        startHour=9;
        startMinute=2;
        startDay=thisDay;
        startMonth=thisMonth;
        startYear=thisYear;
        String title2="Bake sale";
        String description2="Pastryssssssssss";
        //Construct a new Appointment object with the initial data
        Appt appt2 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title2,
                description2);
        listAppts.add(appt2);

        GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
        GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
        tomorrow.add(Calendar.DAY_OF_MONTH,1);
        String todatDate=today.get(Calendar.MONTH)+ "/"+ today.get(Calendar.DAY_OF_MONTH)+"/"+today.get(Calendar.YEAR);
        String tomorrowDate=tomorrow.get(Calendar.MONTH)+ "/"+ tomorrow.get(Calendar.DAY_OF_MONTH)+"/"+tomorrow.get(Calendar.YEAR);

        TimeTable timeTable=new TimeTable();
        //Create a linked list of calendar days to return
        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
        calDays = timeTable.getApptRange(listAppts, today, tomorrow);

        for (int i = 0; i < calDays.size(); i++)
            System.out.println(calDays.get(i).toString());
    }
    @Test
    public void test04()  throws Throwable  {
        Calendar rightnow = Calendar.getInstance();
        int thisMonth, thisYear, thisDay;
        thisMonth = rightnow.get(Calendar.MONTH)+1;
        thisYear = rightnow.get(Calendar.YEAR);
        thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
        int startHour=15;
        int startMinute=30;
        int startDay=thisDay+1;
        int startMonth=thisMonth;
        int startYear=thisYear;
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
        LinkedList<Appt> listAppts = new LinkedList<Appt>();
        listAppts.add(appt);

        //=-=======================================================================

        startHour=1;
        startMinute=2;
        startDay=thisDay;
        startMonth=thisMonth;
        startYear=thisYear;
        String title2="Bake sale";
        String description2="Pastryssssssssss";
        //Construct a new Appointment object with the initial data
        Appt appt2 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title2,
                description2);
        listAppts.add(appt2);
        listAppts.add(appt);

        GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
        GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
        tomorrow.add(Calendar.DAY_OF_MONTH,1);
        String todatDate=today.get(Calendar.MONTH)+ "/"+ today.get(Calendar.DAY_OF_MONTH)+"/"+today.get(Calendar.YEAR);
        String tomorrowDate=tomorrow.get(Calendar.MONTH)+ "/"+ tomorrow.get(Calendar.DAY_OF_MONTH)+"/"+tomorrow.get(Calendar.YEAR);

        TimeTable timeTable=new TimeTable();
        //Create a linked list of calendar days to return
        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
        calDays = timeTable.getApptRange(listAppts, today, tomorrow);

        for (int i = 0; i < calDays.size(); i++)
            System.out.println(calDays.get(i).toString());
    }
    @Test
    public void test05()  throws Throwable  {
        Calendar rightnow = Calendar.getInstance();

        int thisMonth, thisYear, thisDay;
        thisMonth = rightnow.get(Calendar.MONTH)+1;
        thisYear = rightnow.get(Calendar.YEAR);
        thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
        int startHour=15;
        int startMinute=30;
        int startDay=thisDay+1;
        int startMonth=thisMonth;
        int startYear=thisYear;
        GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
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
        LinkedList<Appt> listAppts = new LinkedList<Appt>();
        listAppts.add(appt);
        CalDay day1 = new CalDay(today);
        //=-=======================================================================


    }
    @Test
    public void test06()  throws Throwable  {
        Calendar rightnow = Calendar.getInstance();
        int thisMonth, thisYear, thisDay;
        thisMonth = rightnow.get(Calendar.MONTH)+1;
        thisYear = rightnow.get(Calendar.YEAR);
        thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
        int startHour=15;
        int startMinute=30;
        int startDay=thisDay;
        int startMonth=thisMonth;
        int startYear=thisYear;
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
        LinkedList<Appt> listAppts = new LinkedList<Appt>();
        listAppts.add(appt);

        //=-=======================================================================

        startHour=1;
        startMinute=2;
        startDay=thisDay;
        startMonth=thisMonth;
        startYear=thisYear;
        String title2="Bake sale";
        String description2="Pastryssssssssss";
        //Construct a new Appointment object with the initial data
        Appt appt2 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title2,
                description2);
        listAppts.add(appt2);
        listAppts.add(appt);

        GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
        GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
        tomorrow.add(Calendar.DAY_OF_MONTH,1);
        String todatDate=today.get(Calendar.MONTH)+ "/"+ today.get(Calendar.DAY_OF_MONTH)+"/"+today.get(Calendar.YEAR);
        String tomorrowDate=tomorrow.get(Calendar.MONTH)+ "/"+ tomorrow.get(Calendar.DAY_OF_MONTH)+"/"+tomorrow.get(Calendar.YEAR);

        TimeTable timeTable=new TimeTable();
        //Create a linked list of calendar days to return
        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
        calDays = timeTable.getApptRange(listAppts, today, tomorrow);

        for (int i = 0; i < calDays.size(); i++)
            System.out.println(calDays.get(i).toString());
    }
    @Test
    public void test07()  throws Throwable  {
        Calendar rightnow = Calendar.getInstance();
        int thisMonth, thisYear, thisDay;
        thisMonth = rightnow.get(Calendar.MONTH)+1;
        thisYear = rightnow.get(Calendar.YEAR);
        thisDay = rightnow.get(Calendar.DAY_OF_MONTH);



        GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);


        CalDay day1 = new CalDay(today);
        day1.iterator();
    }
    @Test
    public void test08()  throws Throwable  {


        CalDay day1 = new CalDay();
        day1.iterator();
    }
    @Test
    public void test09()  throws Throwable {
        Calendar rightnow = Calendar.getInstance();
        int thisMonth, thisYear, thisDay;
        thisMonth = rightnow.get(Calendar.MONTH) + 1;
        thisYear = rightnow.get(Calendar.YEAR);
        thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
        int startHour = 15;
        int startMinute = 30;
        int startDay = thisDay + 1;
        int startMonth = thisMonth;
        int startYear = thisYear;
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
        GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
        CalDay day1 = new CalDay(today);
        day1.addAppt(appt);
        int size_appts = day1.getSizeAppts();
        assertEquals(1, size_appts);
    }

    // Test to make sure that new CalDay is initialized with correct values
    @Test
    public void test10()  throws Throwable {

        Calendar rightnow = Calendar.getInstance();
        int thisMonth, thisYear, thisDay;
        thisMonth = rightnow.get(Calendar.MONTH) + 1;
        thisYear = rightnow.get(Calendar.YEAR);
        thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
        GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
        CalDay new_day = new CalDay(today);
        assertEquals(new_day.getDay(),thisDay);
        assertEquals(new_day.getMonth(),thisMonth);
        assertEquals(new_day.getYear(),thisYear);


    }
    @Test
    public void test11()  throws Throwable {

        Calendar rightnow = Calendar.getInstance();
        int thisMonth, thisYear, thisDay;
        thisMonth = rightnow.get(Calendar.MONTH) + 1;
        thisYear = rightnow.get(Calendar.YEAR);
        thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
        int startHour = 15;
        int startMinute = 30;
        int startDay = thisDay + 1;
        int startMonth = thisMonth;
        int startYear = thisYear;
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
        GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
        CalDay new_day = new CalDay(today);
        LinkedList<Appt> listAppts = new LinkedList<Appt>();
        listAppts.add(appt);
        new_day.addAppt(appt);
        assertEquals(listAppts, new_day.getAppts());
        //assertEquals(1, new_day.iterator());


    }

    @Test
    public void test12()  throws Throwable {

        Calendar rightnow = Calendar.getInstance();
        int thisMonth, thisYear, thisDay;
        thisMonth = rightnow.get(Calendar.MONTH)+1;
        thisYear = rightnow.get(Calendar.YEAR);
        thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
        GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
        CalDay day1 = new CalDay(today);
        day1.iterator();
        int startHour=15;
        int startMinute=30;
        int startDay=thisDay;
        int startMonth=thisMonth;
        int startYear=thisYear;
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
        LinkedList<Appt> listAppts = new LinkedList<Appt>();


        //=-=======================================================================

        startHour=1;
        startMinute=2;
        startDay=thisDay;
        startMonth=thisMonth;
        startYear=thisYear;
        String title2="Bake sale";
        String description2="Pastryssssssssss";
        //Construct a new Appointment object with the initial data
        Appt appt2 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title2,
                description2);
        listAppts.add(appt2);
        listAppts.add(appt);
        day1.addAppt(appt);
        day1.addAppt(appt2);
        assertEquals(listAppts, day1.getAppts());

    }
    @Test
    public void test13()  throws Throwable {

        Calendar rightnow = Calendar.getInstance();
        int thisMonth, thisYear, thisDay;
        thisMonth = rightnow.get(Calendar.MONTH) + 1;
        thisYear = rightnow.get(Calendar.YEAR);
        thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
        GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
        CalDay new_day = new CalDay(today);
        LinkedList<Appt> listAppts = new LinkedList<Appt>();
        //assertEquals(0,app);
        assertEquals(listAppts, new_day.getAppts());

    }
}