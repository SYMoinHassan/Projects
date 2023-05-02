package w23assignment2;
/**
 * @author 	Syed Moinuddin Hassan
 * @version class driver 1.0
 * @since 	javac 19.0.1
 */

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
/**
   Part I: Implement a class Clock whose getHours, getMinutes and
   getTime methods return the current time at your location.
   Return the time as a string.

   Here is how to retrieve the current time as a String:
    With Java 8, you can use 3 classes in the java.time package:
      Instant, LocalDateTime and ZoneId. Here's how you do it:
      String timeString = LocalDateTime.ofInstant(Instant.now(),
                              ZoneId.systemDefault()).toString()

   you'll need to extract the hours and minutes as a substring.
*/
public class Clock{
	int getHours(){
		final String time = java.time.LocalTime.now().toString();
		return Integer.parseInt(time.substring(0, 2));
	}
	
	int getMinutes(){
		final String time = java.time.LocalTime.now().toString();
		return Integer.parseInt(time.substring(3, 5));
	}
   
	String getTime() {
		return String.format("%02d:%02d", getHours(), getMinutes());
	}
	











}
