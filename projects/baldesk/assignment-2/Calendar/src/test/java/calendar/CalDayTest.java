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
//add more unit tests as you needed	
}
