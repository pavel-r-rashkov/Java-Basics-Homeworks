
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CardsFrequencies {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] cards = input.nextLine().split(" ");
		double cardsCount = cards.length;
		LinkedHashMap<String, Integer> cardFrequencies = new LinkedHashMap<String, Integer>();
		
		for (String card : cards) {
			String face = card.substring(0, card.length() - 1);
			Integer value = cardFrequencies.get(face);
			
			if (!cardFrequencies.containsKey(face)) {
				value = 0;
			}
			cardFrequencies.put(face, value + 1);
		}
		
		for (Map.Entry<String, Integer> entry : cardFrequencies.entrySet()) {
			System.out.printf("%1$s -> %2$.2f%%", entry.getKey(), (entry.getValue() * 100 / cardsCount));
			System.out.println();
		}
		input.close();
	}

}
