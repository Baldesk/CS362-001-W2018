
package finalprojectB;

import junit.framework.TestCase;

//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!





public class UrlValidatorTest extends TestCase
{
   // Input Partitions:
   ResultPair[] test_scheme = {
           new ResultPair("http://", true),
           new ResultPair("https://", true),
           new ResultPair("ftp://", true),
           new ResultPair("3ht://", false),
           new ResultPair("http:/", false),
           new ResultPair("http:", false),
           new ResultPair("http/", false),
           new ResultPair("://", false),
           new ResultPair("", true)
   };



   // isValid Options Partitions
   public long ALLOW_ALL_SCHEMES = 1;
   public long ALLOOW_2_SLASHES = 2;
   public long NO_FRAGMENTS = 4;
   public long ALLOW_LOCAL_URLS = 8;



   public UrlValidatorTest(String testName) {

      super(testName);
   }



   public void testManualTest()
   {
//You can use this function to implement your manual testing



      UrlValidator urlVal = new UrlValidator(); // Default
      //assertTrue(urlVal.isValid("http://www.google.com")); // FAILURE: AssertionFailedError
      //assertTrue(urlVal.isValid("http://google.com")); // FAILURE: AssertionFailedError
      //assertTrue(urlVal.isValid("https://www.google.com")); FAILURE: AssertionFailedError
      //assertTrue(urlVal.isValid("https://google.com")); // FAILURE: AssertionFailedError
      assertFalse(urlVal.isValid("http://google")); // PASSED
      //assertTrue(urlVal.isValid("https://www.google.com")); // FAILURE: AssertionFailedError
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



      ///////////////////////////////////////////////////////////////////////
      urlVal = new UrlValidator(null, null, 1); // Allow all schemes

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


   public void testYourFirstPartition()
   {
      //You can use this function to implement your First Partition testing

      UrlValidator urlVal = new UrlValidator(); // Default
      //assertTrue(urlVal.isValid("http://www.google.com")); // FAILURE: AssertionFailedError
      //assertTrue(urlVal.isValid("http://google.com")); // FAILURE: AssertionFailedError
      //assertTrue(urlVal.isValid("https://www.google.com")); FAILURE: AssertionFailedError
      //assertTrue(urlVal.isValid("https://google.com")); // FAILURE: AssertionFailedError
      assertFalse(urlVal.isValid("http://google")); // PASSED
      //assertTrue(urlVal.isValid("https://www.google.com")); // FAILURE: AssertionFailedError
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



      ///////////////////////////////////////////////////////////////////////
      urlVal = new UrlValidator(null, null, 1); // Allow all schemes

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

   // String builder?
   public void testURLBuilder(String scheme, String path)
   {

   }




   public void testIsValid()
   {
      //You can use this function for programming based testing
      System.out.print("Begin Random Testing");
      // loop through each option

            // loop through each input partition
                  //if allowed option == current option then should be true



   }



}
