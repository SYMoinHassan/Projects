package w23assignment2;
/**
 * @author 	Syed Moinuddin Hassan
 * @version class driver 1.0
 * @since 	javac 19.0.1
 */

/**
 * Tests the Clock class.
 */
public class ClockDemo
{
   public static void main(String[] args)
   {
      //test Clock
      System.out.println("Testing Clock class");
      Clock clock = new Clock();
      System.out.println("Hours: " + clock.getHours());
      System.out.println("Minutes: " + clock.getMinutes());
      System.out.println("Time: " + clock.getTime());
   }
}
