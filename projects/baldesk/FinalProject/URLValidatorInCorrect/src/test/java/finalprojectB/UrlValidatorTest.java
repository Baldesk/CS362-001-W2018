
package finalprojectB;

import junit.framework.TestCase;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


/*
    Class: UrlValidatorTest
    Methods:
        1)UrlValidatorTest() - Constructor
        2)testManualTest() - Manual test
        3)testYourFirstPartition - Partition Test
        4)testIsValid() - Programming Based Testing

    Results:
        * When the test completes, a summary of failures caused by the testIsValid() method
          is created and placed in target/TestReport.txt
        * This Summary shares some of the details of variable values to help in the debugging process.

*/

public class UrlValidatorTest extends TestCase
{
    // Input Partitions:
    //
    long num_partitions = 18;
    ResultPair[] input_array = {
            new ResultPair("http://www.google.com", 16), // 16
            new ResultPair("http://google.com", 16), // 16
            new ResultPair("https://www.google.com", 16), // 16
            new ResultPair("https://google.com", 16), // 16
            new ResultPair("ftp://www.google.com", 16), //16
            new ResultPair("ftp://google.com", 16), // 16
            new ResultPair("http://google", 8), // 8 FAILS unless LOCAL_URL is accepted
            new ResultPair("https://google.c", 0), // 0 -INVALID PATH
            new ResultPair("https//google.com", 0), // 0 -INVALID SCHEME
            new ResultPair("https:/google.com", 0), // 0 -INVALID SCHEME
            new ResultPair("google.com", 0), // 0  -INVALID SCHEME
            new ResultPair(".0.0.0", 0), // 0 -INVALID SCHEME
            new ResultPair("", 0), // 0 - INVALID SCHEME
            new ResultPair(null, 0), // 0 NOTHING PASSED IN
            new ResultPair("cs://www.google.com", 1), // 1 - Checking for ALLOW_ALL_SCHEMES
            new ResultPair("https://google.com//word", 2), // 2 - Checks ALLOW_2_SLASHES
            new ResultPair("http://www.google.com/other#fragment", 4), // 4 - Checking for NO_FRAGMENTS 4
            new ResultPair("https://localhost/", 8) // 8 - Checks for ALLOW_LOCAL_URL
    };



    // isValid Options Partitions using bit wise AND (&) then check to see if value is > 0
    // NOTE: This operation works for all but NO_FRAGMENTS since default is to allow fragments
    //       To fix this just negate the new value when
    //public long ALLOW_ALL_SCHEMES = 1;
    // public long ALLOW_2_SLASHES = 2;
    //public long NO_FRAGMENTS = 4;
    //public long ALLOW_LOCAL_URLS = 8;
    //public long DEFAULT = 16;


    public UrlValidatorTest(String testName) {

        super(testName);
    }


    // MANUAL TESTING
    public void testManualTest()
    {

        //USE DEFAULT OPTION
        UrlValidator urlVal = new UrlValidator(); // Default
        //assertTrue(urlVal.isValid("http://www.google.com")); // FAILURE: AssertionFailedError
        //assertTrue(urlVal.isValid("http://google.com")); // FAILURE: AssertionFailedError
        //assertTrue(urlVal.isValid("https://www.google.com")); FAILURE: AssertionFailedError
        //assertTrue(urlVal.isValid("https://google.com")); // FAILURE: AssertionFailedError
        assertFalse(urlVal.isValid("http://google")); // PASSED
        assertFalse(urlVal.isValid("https://google.c")); // PASSED
        assertFalse(urlVal.isValid("https//google.com")); //PASSED
        assertFalse(urlVal.isValid("https:/google.com")); // PASSED
        assertFalse(urlVal.isValid("google.com")); // PASSED
        assertFalse(urlVal.isValid("www.google.com")); // PASSED
        assertFalse(urlVal.isValid("300.0.0.0")); // PASSED
        assertFalse(urlVal.isValid(".0.0.0")); // PASSED
        assertFalse(urlVal.isValid("")); // PASSED
        assertFalse(urlVal.isValid(" ")); // PASSED
        assertFalse(urlVal.isValid(null)); // PASSED

        //-------------------------------------------------------------------------
        // USE DIFFERENT OPTION
        urlVal = new UrlValidator(1); // Allow all schemes

        assertTrue(urlVal.isValid("http://www.google.com")); // PASSED
        assertTrue(urlVal.isValid("http://google.com")); // PASSED
        //assertTrue(urlVal.isValid("https://www.google.com")); // FAILURE: Exception thrown: Regular expressions missing

        //assertTrue(urlVal.isValid("https://google.com")); // FAILURE: Exception thrown: Regular expressions missing
        //assertFalse(urlVal.isValid("http://google")); // FAILURE: Assertion Failed
        //assertTrue(urlVal.isValid("https://www.google.com")); // FAILURE: Exception thrown: Regular expressions missing
        //assertFalse(urlVal.isValid("https://google.c")); // FAILURE: Exception thrown: Regular expressions missing
        assertFalse(urlVal.isValid("https//google.com")); // PASSED
        assertFalse(urlVal.isValid("https:/google.com")); // PASSED
        assertFalse(urlVal.isValid("google.com")); // PASSED
        assertFalse(urlVal.isValid("www.google.com")); // PASSED
        assertFalse(urlVal.isValid("300.0.0.0")); // PASSED
        assertFalse(urlVal.isValid(".0.0.0")); // PASSED
        assertFalse(urlVal.isValid("")); // PASSED
        assertFalse(urlVal.isValid(" ")); // PASSED
        assertFalse(urlVal.isValid(null)); // PASSED

    }

    // PARTITION TESTING ON INPUTS AND DEFAULT UrlValidator
    public void testYourFirstPartition()
    {

        UrlValidator urlVal = new UrlValidator();
        //assertTrue(urlVal.isValid("http://www.google.com")); // 16
        // RESULT: FAILED - Assertion Failed
        //assertTrue(urlVal.isValid("http://google.com")); // 16
        // RESULT: FAILED - Assertion Failed
        assertTrue(urlVal.isValid("https://www.google.com")); // 16
        // RESULT: FAILED - Assertion Failed
        assertTrue(urlVal.isValid("https://google.com")); // 16
        // RESULT:
        assertTrue(urlVal.isValid("ftp://www.google.com")); //16
        // RESULT:
        assertTrue(urlVal.isValid("ftp://google.com")); // 16
        // RESULT:
        assertFalse(urlVal.isValid("http://google")); // 8 FAILS unless LOCAL_URL is accepted
        // RESULT:
        assertFalse(urlVal.isValid("https://google.c")); // 0 -INVALID PATH
        // RESULT:
        assertFalse(urlVal.isValid("https//google.com")); // 0 -INVALID SCHEME
        // RESULT:
        assertFalse(urlVal.isValid("https:/google.com")); // 0 -INVALID SCHEME
        // RESULT:
        assertFalse(urlVal.isValid("google.com")); // 0  -INVALID SCHEME
        // RESULT:
        assertFalse(urlVal.isValid(".0.0.0")); // 0 -INVALID SCHEME
        // RESULT:
        assertFalse(urlVal.isValid("")); // 0 - INVALID SCHEME
        // RESULT:
        assertFalse(urlVal.isValid(null)); // 0 NOTHING PASSED IN
        // RESULT:
        assertFalse(urlVal.isValid("cs://www.google.com")); // 1 - Checking for ALLOW_ALL_SCHEMES
        // RESULT:
        assertFalse(urlVal.isValid("https://google.com//word")); // 2 - Checks ALLOW_2_SLASHES
        // RESULT:
        assertTrue(urlVal.isValid("http://www.google.com/other#fragment")); // 4 - Checking for NO_FRAGMENTS 4
        // RESULT:
        assertFalse(urlVal.isValid("https://localhost/")); // 8 - Checks for ALLOW_LOCAL_URL
        // RESULT:
    }

    // PROGRAMMING BASED TESTING
    public void testIsValid()
    {
        //You can use this function for programming based testing
        System.out.println("Begin Programming Based Testing");


        // loop through each option - 16 options (1-16)
        UrlValidator urlVal;
        long num_failures = 0;
        List<String> failures = new ArrayList<String>();
        for (int i = 1; i < 17; i++)
        {
            if(i == 16)
            {
                urlVal = new UrlValidator();
            }
            else
            {
                urlVal = new UrlValidator(i);
            }
            // loop through each input partition 18 partitions (0-17)
            for (int j = 0; j < num_partitions; j++)
            {
                long num = i & input_array[j].option;
                boolean option16 = ((num > 0) || (input_array[j].option == 16));
                if(input_array[j].option == 4) // NEGATE when the input option is 4 since default is to accept
                {
                    option16 = !option16;
                }
                if(option16 != urlVal.isValid(input_array[j].item))
                {
                    String fail_str = "Failed at i = " + i + " and j = " + j +"." + System.lineSeparator() +
                            "   Value of input_array[j].option = " + input_array[j].option +". Value of num = " + num + System.lineSeparator() +
                            "   Value of urlVal.isValid(input_array[j].item) = " + urlVal.isValid(input_array[j].item);
                    failures.add(fail_str);
                    num_failures++;
                }
                // EVERYTHING IS GOOD DO NOTHING
            }
        }
        String message1 = "There were " + num_failures + " failures.";
        System.out.println(message1);

        Path report_file = Paths.get("target/TestReport.txt");
        try {
            Files.write(report_file, failures, Charset.forName("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
