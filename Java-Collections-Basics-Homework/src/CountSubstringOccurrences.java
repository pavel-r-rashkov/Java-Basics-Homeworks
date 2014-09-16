import java.util.Scanner;


public class CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		
		String line = input.nextLine();
		String word = input.nextLine();
		int index = line.toLowerCase().indexOf(word.toLowerCase(), 0);
		
		while (index != -1) {
			count++;
			index = line.toLowerCase().indexOf(word.toLowerCase(), index + 1);
		}
		
		System.out.println(count);
		input.close();
	}

}
