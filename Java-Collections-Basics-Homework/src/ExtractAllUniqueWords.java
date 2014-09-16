import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SortedSet<String> words = new TreeSet<String>();
		
		String[] tokens = input.nextLine().split("(\\.)|(:)|( )|(\\!)|(\\?)|(\\()|(\\)|(\\,))");
		
		for (String word : tokens) {
			words.add(word.toLowerCase());
		}
		
		for (String word : words) {
			System.out.print(word + " ");
		}
		input.close();
	}

}
