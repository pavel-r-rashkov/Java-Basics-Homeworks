import java.util.Scanner;

public class SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = input.next();
		System.out.print(word);
		
		while(input.hasNext()) {
			String nextWord = input.next();

			if (nextWord.equals(word)) {
				System.out.print(" " + nextWord);
			}
			else {
				System.out.println();
				System.out.print(nextWord);
			}
			word = nextWord;
		}			
		input.close();
	}
}
