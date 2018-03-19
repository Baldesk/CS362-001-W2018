
package finalprojectB;

import junit.framework.TestCase;

//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!





public class UrlValidatorTest extends TestCase
{


   public UrlValidatorTest(String testName) {
      super(testName);
   }



   public void testManualTest()
   {
//You can use this function to implement your manual testing



      UrlValidator urlVal = new UrlValidator();
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
      urlVal = new UrlValidator(null, null, 1);

      assertTrue(urlVal.isValid("http://www.google.com")); // PASSED
      assertTrue(urlVal.isValid("http://google.com")); // PASSED
      //assertTrue(urlVal.isValid("https://www.google.com")); // FAILURE: Exception thrown: Regular expressions missing

      assertTrue(urlVal.isValid("https://google.com")); // FAILURE: Exception thrown: Regular expressions missing
      assertFalse(urlVal.isValid("http://google"));
      assertTrue(urlVal.isValid("https://www.google.com"));
      assertFalse(urlVal.isValid("https://google.c"));
      assertFalse(urlVal.isValid("https//google.com"));
      assertFalse(urlVal.isValid("https:/google.com"));
      assertFalse(urlVal.isValid("google.com"));
      assertFalse(urlVal.isValid("www.google.com"));
      assertFalse(urlVal.isValid("300.0.0.0"));
      assertFalse(urlVal.isValid(".0.0.0"));
      assertFalse(urlVal.isValid(""));
      assertFalse(urlVal.isValid(" "));
      assertFalse(urlVal.isValid(null));

   }


   public void testYourFirstPartition()
   {
      //You can use this function to implement your First Partition testing





   }

   public void testYourSecondPartition(){
      //You can use this function to implement your Second Partition testing






   }
   //You need to create more test cases for your Partitions if you need to

   public void testIsValid()
   {
      //You can use this function for programming based testing







   }



}
