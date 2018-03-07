package date;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class TestDate{
	public static void main(String[]arg) {
		Date d1 = new Date();
		System.out.println(d1);//print: "Tue Jan 05 09:51:48 CST 2016"
		Date d2 = new Date(5000);
		System.out.println(d2);//print:"Tue Jan 01 08:00:05 CST 1970"
		
		//System.currentTimeMillis() == new Date().getTime()
		//return a long value
		System.out.println(System.currentTimeMillis());
		
		//Date-->String  
		//import SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		Date d3 = new Date();
		System.out.println(sdf.format(d3));//print as string
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(d3));
		
		//String-->Date
		//yyyy/MM/dd HH:mm:ss
		//StringDateFormat.parse(String)
		//must use try{exception}
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd.MM.yyyy");
		String str = "2016/1/5 12:12:12";
		String str2 = "01.12.1998";
		try {
			Date d = sdf2.parse(str);
			Date dd = sdf3.parse(str2);
			System.out.printf("time: %s",d);//default: d.toString()
		}catch(ParseException e) {
			e.printStackTrace();
		}
	}
}