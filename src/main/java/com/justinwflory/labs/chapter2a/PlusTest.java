// *******************************************************************
//   PlusTest.java
// 
//   Demonstrate the different behaviors of the + operator
// *******************************************************************

public class PlusTest
{
    // -------------------------------------------------
    // main prints some expressions using the + operator
    // -------------------------------------------------
    public static void main (String[] args)
    {

      // Strings can't extend past the end of a line, but you can make long Strings by using +
      // and having the + be the last thing on the line, and adding more String(s) on the next line
      //
      System.out.println ("This is a long string that is the " +
                          "concatenation of two shorter strings.");

      System.out.println ("The first computer was invented about " + 55 +
                          " years ago.");

      System.out.println ("8 plus 5 is " + 8 + 5);

      System.out.println ("8 plus 5 is " + (8 + 5));

      System.out.println (8 + 5 + " equals 8 plus 5.");
    }
}