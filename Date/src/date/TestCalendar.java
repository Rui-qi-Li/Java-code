package date;

import java.util.Calendar;
import java.util.Date;

//Calendar is a Singleton pattern
public class TestCalendar{
	public static void main(String[]arg) {
		//getInstance()
		Calendar c = Calendar.getInstance();
		//convert into Date
		Date d = c.getTime();
		//set a calendar
		Date d1 = new Date(0);
		c.setTime(d1);//set to 1970.1.1 08:00:00
	}
}