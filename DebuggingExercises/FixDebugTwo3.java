public class FixDebugTwo3
// Demonstrates remainder and output
{
   public static void main(String[] args)
   {
      int a = 99, b = 8, remainder;
      long c = 7_777_777_777_777L;
      remainder = a % b;
      System.out.println("Divide " + a + " by " + b);
      System.out.println("remainder is " + remainder);
      System.out.print("c is a very large number: ");
      System.out.println(c);
    }
}