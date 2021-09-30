import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;


public class Dates {

	public static void main(String[] args) {
		
		LocalDate lclD = LocalDate.now();
		System.out.println("LocalDate: " + lclD);
		LocalTime lclT = LocalTime.now();
		System.out.println("LocalTime: " + lclT);
		LocalDateTime ldt =  LocalDateTime.now();
		System.out.println("LocalDateTime: " + ldt);
		System.out.println("LocalDateTimeYear: " + ldt.getYear());
		Date date = new Date();
		System.out.println("Date: " + date.toString());
		
		SimpleDateFormat newFormat = new SimpleDateFormat("YYYY, MMM, DD", Locale.ENGLISH);
		System.out.println("SimpleDateFormat: " + newFormat.format(date));
		
		
	}
}
