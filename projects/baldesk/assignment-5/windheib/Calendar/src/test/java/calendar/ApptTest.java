package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
    @Test
    public void test01()  throws Throwable  {
        int startHour=21;
        int startMinute=30;
        int startDay=15;
        int startMonth=01;
        int startYear=2018;
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
        // assertions
        assertTrue(appt.getValid());
        assertEquals(21, appt.getStartHour());
        assertEquals(30, appt.getStartMinute());
        assertEquals(15, appt.getStartDay());
        assertEquals(01, appt.getStartMonth());
        assertEquals(2018, appt.getStartYear());
        //assertEquals(1, appt.getRecurBy());
        assertEquals(0, appt.getRecurNumber());
        assertEquals(0, appt.getRecurIncrement());
        assertEquals("Birthday Party", appt.getTitle());
        assertEquals("This is my birthday party.", appt.getDescription());
        //assert(appt.getValid());
    }
    /*
        Tests that an appointment that starts at hour 25 is invalid
    */
    @Test
    public void test02()  throws Throwable  {
        int startHour=25;
        int startMinute=30;
        int startDay=15;
        int startMonth=01;
        int startYear=2018;
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
        // assertions
        assertTrue(!(appt.getValid()));
    }
	/*
	Tests that a appt with start minute = -1 is invalid
	 */

    @Test
    public void test03()  throws Throwable  {
        int startHour=23;
        int startMinute=-2;
        int startDay=15;
        int startMonth=01;
        int startYear=2018;
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
        // assertions
        assertTrue(!(appt.getValid()));
    }

    @Test
    public void test04()  throws Throwable  {
        int startHour=25; // Invalid value
        int startMinute=30;
        int startDay=15;
        int startMonth=01;
        int startYear=2018;
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
        appt.compareTo(appt);
        // assertions
        assertTrue(!(appt.getValid()));
    }


    @Test
    public void test05()  throws Throwable  {
        int startHour=23;
        int startMinute=2;
        int startDay=-1;
        int startMonth=01;
        int startYear=2018;
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
        // assertions
        assertTrue(!(appt.getValid()));
    }
    @Test
    public void test06()  throws Throwable  {
        int startHour=23;
        int startMinute=2;
        int startDay=-1;
        int startMonth=01;
        int startYear=2018;
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
        // assertions
        assertTrue(!(appt.getValid()));
        appt.setTitle(null);
        appt.setDescription(null);
        appt.setRecurrence(null,2,3,0);
        assertEquals("",appt.getTitle());
        assertEquals("",appt.getDescription());

    }
    @Test
    public void test07()  throws Throwable {
        int startHour = -1; // Invalid
        int startMinute = 2;
        int startDay = 15;
        int startMonth = 01;
        int startYear = 2018;
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
        // assertions
        assertEquals(null, appt.toString());
        assertTrue(!(appt.getValid()));
    }
    @Test
    public void test08()  throws Throwable {
        int startHour = -1; // Invalid
        int startMinute = 2;
        int startDay = 15;
        int startMonth = 01;
        int startYear = 2018;
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
        // assertions
        assertTrue(!(appt.getValid()));
    }
    @Test
    public void test09()  throws Throwable {
        int startHour = 2; // Invalid
        int startMinute = 2;
        int startDay = 15;
        int startMonth = 01;
        int startYear = 2018;
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
        // assertions
        //assertTrue(!(appt.getValid()));
    }
    @Test
    public void test10()  throws Throwable {
        int startHour = 2;
        int startMinute = 2;
        int startDay = 15;
        int startMonth = 01;
        int startYear = 2018;
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
        appt.setStartHour(-1);
        assert(!appt.getValid());
        appt.setStartHour(1);
        assert(appt.getValid());
        //appt.setStartMonth(-1);
        //assert(!appt.getValid());

        // assertions
        //assertTrue(!(appt.getValid()));
    }

}