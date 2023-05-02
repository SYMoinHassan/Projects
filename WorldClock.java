package w23assignment2;
/**
 * @author 	Syed Moinuddin Hassan
 * @version class driver 1.0
 * @since 	javac 19.0.1
 */

import java.time.ZoneId;

/**
 * The WorldClock class extends the Clock class and provides functionality for displaying the time in a specific time zone, based on an offset from GMT.
 */
public class WorldClock extends Clock {
	private int offset;
	
	
/**
 * Constructs a new WorldClock object with the specified offset from GMT.
 * @param offset The offset in hours for the time zone represented by this WorldClock instance.	
 */
	public WorldClock(int offset) {
		this.offset = offset;
	}
	
	@Override
/**
 * Returns the hour value for the current time in the time zone represented by this WorldClock object, based on the offset from GMT.
 * @return An integer representing the hour value for the current time in the time zone represented by this WorldClock object.
 */
	int getHours() {
		final int hoursGMT = java.time.LocalTime.now(ZoneId.of("GMT")).getHour();
		int offsetHours = (hoursGMT + (offset % 24));
		if (offsetHours < 0) offsetHours += 24;
		return offsetHours;
	}
}
