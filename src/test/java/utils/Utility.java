package utils;
import java.util.Date;

public class Utility {
	
	public static String getDate() {
		Date d = new Date();
		String date =  d.toString().replace(" ", "_").replace(":", "_");
		System.out.println(date);
		return date;
	}
}