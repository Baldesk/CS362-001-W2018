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


		//====================================================
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

	}
	@Test
	public void test02()  throws Throwable  {
		//====================================================
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
		timeTable.deleteAppt(listAppts, appt2);
	}
	@Test
	public void test03()  throws Throwable  {
		//====================================================
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
		assertNull(timeTable.deleteAppt(null, null));
	}
	@Test
	public void test04()  throws Throwable  {
		//====================================================
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
		int pv[] = {0,2};
		timeTable.permute(listAppts, pv);

	}
	@Test
	public void test05()  throws Throwable  {
		//====================================================
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


	}
	@Test
	public void test06()  throws Throwable  {
		//====================================================
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

		timeTable.deleteAppt(listAppts, appt2);
	}
	@Test
	public void test07()  throws Throwable  {
		//====================================================
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
		int[] recurDaysArr={2,3,4};
		appt2.setRecurrence(recurDaysArr, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);
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


	}
	@Test
	public void test08()  throws Throwable  {
		//====================================================
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
		int[] recurDaysArr={};
		appt2.setRecurrence(recurDaysArr, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);
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


	}
	@Test
	public void test09()  throws Throwable  {
		//====================================================
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
		int[] recurDaysArr={1,2,3,4};
		appt2.setRecurrence(recurDaysArr, 2, 2, Appt.RECUR_NUMBER_FOREVER);
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


	}
	@Test
	public void test010()  throws Throwable  {
		//====================================================
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
		int[] recurDaysArr={3,4,5};
		appt2.setRecurrence(recurDaysArr, 3, 3, Appt.RECUR_NUMBER_FOREVER);
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


	}

//add more unit tests as you needed
}
