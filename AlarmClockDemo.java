package w23assignment2;
/**
 * @author 	Syed Moinuddin Hassan
 * @version class driver 1.0
 * @since 	javac 19.0.1
 */

public class AlarmClockDemo {
/**
 * Tests the AlarmClock, Clock and WorldClock Classes.
 */	
	public static void main(String[] args) {
		
		AlarmClock alarm = new AlarmClock();
		Clock clock = new Clock();
		WorldClock worldClock = new WorldClock(-4);
		alarm.setAlarm(1, 0);
		
		Clock[] array = {alarm, clock, worldClock};
		
		for (int i = 0; i < array.length; i++) {
			final Clock c = array[i];
			System.out.println(c.getTime());
		}
	}

}
