import java.util.Scanner;

public class Problem02Generate3LetterWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String letters = input.nextLine();
		
		for (int i = 0; i < letters.length(); i++) {
			
			for (int j = 0; j < letters.length(); j++) {
				
				for (int k = 0; k < letters.length(); k++) {
					
					System.out.print(letters.charAt(i));
					System.out.print(letters.charAt(j));
					System.out.print(letters.charAt(k));
					System.out.println();
				}
			}
		}
		
		input.close();
	}

}
