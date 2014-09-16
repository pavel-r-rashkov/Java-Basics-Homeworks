import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Problem06RandomHandsOf5Cards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Random rnd = new Random();
		
		char[] suits = {'\u2660', '\u2665', '\u2666', '\u2663'};
		String[] faces = {"2", "3", "4", "5", "6", "7", "8", 
				"9", "10", "J", "Q", "K", "A"};	
		
		for (int i = 0; i < n; i++) {
			String[] hand = new String[5];
			
			for (int card = 0; card < 5; card++) {
				char suit = suits[rnd.nextInt(4)];
				String face = faces[rnd.nextInt(13)];
				
				while (Arrays.asList(hand).contains(face + suit)) {
					face = faces[rnd.nextInt(13)];
				}
				hand[card] = face + suit;			
			}
			
			for (String card : hand) {
				System.out.print(card + " ");
			}
			System.out.println();
		}		
		input.close();
	}

}
