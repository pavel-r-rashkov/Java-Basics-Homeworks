import java.util.Scanner;


public class CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		
		String line = input.nextLine();
		String word = input.nextLine();
		String[] words = line.split("(\\.)|( )|(\\!)|(\\?)|(\\()|(\\)|(\\,))");
		
		for (String element : words) {
			if (element.equalsIgnoreCase(word)) {
				count++;
			}
		}
		
		System.out.println(count);
		input.close();
	}

}
