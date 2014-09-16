import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Problem08ExtractEmails {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String emailPattern = "[a-zA-Z\\d][-._a-zA-Z\\d]+[a-zA-Z\\d]@[a-zA-Z][-.a-zA-Z]+[a-zA-Z]";
		Pattern email = Pattern.compile(emailPattern);
		
		Matcher match = email.matcher(text);
		
		while(match.find()) {
			System.out.println(match.group());
		}
	}

}
