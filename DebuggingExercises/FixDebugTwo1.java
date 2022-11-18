public class FixDebugTwo1
{
   public static void main(String[] args)
   {
      int oneInt = 315; // variable type specified is int but the value was decimal.
      double oneDouble = 12.4;
      char oneChar = 'A';
      System.out.print("The int is "); //print doesn't move the cursor to the new line, so
      System.out.println(oneInt); // this will be printed beside the first print message. But this is println, so
      System.out.print("The double is "); // the next message will be printed in next line.
      System.out.println(oneDouble);
      System.out.print("The char is ");
      System.out.println(oneChar);
   }
}