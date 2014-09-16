import java.util.ArrayList;
import java.util.Scanner;

public class LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = input.nextLine().split(" ");
		
		ArrayList<String> maxSequence = new ArrayList<String>();
		ArrayList<String> sequence = new ArrayList<String>();	
		
		for (int i = 0 ; i < words.length ; i++) {
			String nextWord = words[i];
					
			if (sequence.size() == 0 || nextWord.equals(sequence.get(0))) {
				sequence.add(nextWord);
			}
			else {
				if (sequence.size() > maxSequence.size()) {
					maxSequence = new ArrayList<String>(sequence);					
				}
				sequence.clear(); 
				sequence.add(nextWord);				
			}	
		}

		if (sequence.size() > maxSequence.size()) {
			maxSequence = new ArrayList<String>(sequence);					
		}
		
		for (String word : maxSequence ) {
			System.out.print(word + " ");			
		}
		input.close();
	}

}
