import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Problem07DaysBetweenTwoDates {

	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");	
		Date start = formatter.parse(input.nextLine());
		Date end = formatter.parse(input.nextLine());
		
		long diff = end.getTime() - start.getTime();
		System.out.println (TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		input.close();
	}
}
