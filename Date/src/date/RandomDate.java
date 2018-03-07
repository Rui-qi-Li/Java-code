package date;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class RandomDate{
	//using throws avoid using try inside code block
	public static void main(String[]arg) throws ParseException{
		Date[]date = new Date[9];
		
		for(int i=0;i<9;i++)
			date[i] = create();
		
		sorting(date);
	}
	public static Date create()throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		long d1 = sdf.parse("1970").getTime();
		long d2 = sdf.parse("2001").getTime();//[1970,2001)  
		//access to the end of year 2000
		long range = d1 - d2 -1;
		long time = (long)(Math.random()*range + d1);
		//parameterized constructor of Date using long value
		return new Date(time);
	}
	public static void sorting(Date[]date)throws ParseException {
		//Date actually is long value
		SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
		for(int i=0;i<9-1;i++) {
			for(int j=i;j<9-1;j++) {
				//you want to get the long number like "191210"
				String temp = sdf.format(date[j]);
				int dI  = Integer.parseInt(temp);
				int dII = Integer.parseInt(sdf.format(date[j+1]));
				if(dI>dII) {
					Date d = date[j];//remember, Date is long
					date[j] = date[j+1];
					date[j+1] = d;
				}
			}
		}
	}
}