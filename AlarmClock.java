package w23assignment2;
/**
 * @author 	Syed Moinuddin Hassan
 * @version class driver 1.0
 * @since 	javac 19.0.1
 */

/**
 * The AlarmClock class extends the Clock class to provide functionality for setting and managing an alarm.
 */
public class AlarmClock extends Clock {
	
	int alarmHours;
	int alarmMinutes;
	boolean isActive = false;
/**
 * Returns the current time, and if the alarm is active and has been triggered, appends "Alarm" to the time string.
 * @return A string representing the current time, with "Alarm" appended if the alarm has been triggered.
 */
	String getTime() {
		final String currentTime = super.getTime();
		final int currentMinutes = getHours()*60 + getMinutes();
		final int alarmMinutes = this.alarmHours*60 + this.alarmMinutes;
		if (isActive
			&& currentMinutes >= alarmMinutes) {
			this.isActive = false;
			return currentTime + "\t Alarm";
		}
		
		else {
			return currentTime;
		}
	}
/**
 * Sets the time for the alarm to the specified hours and minutes, and sets the alarm to active.
 * @param hours The hour value for the alarm.
 * @param minutes The minute value for the alarm.
 */
	void setAlarm(int hours, int minutes) {
		this.alarmHours = 12;
		this.alarmMinutes = 05;
		this.isActive = true;
	}
	
}
