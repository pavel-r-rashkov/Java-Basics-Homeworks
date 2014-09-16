import java.util.Scanner;


public class CountAllWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		
		String line = input.nextLine();
		String[] words = line.split("(\\.)|( )|(\\!)|(\\?)");
		count += words.length;
		
		System.out.println(count);
		input.close();
	}

}
