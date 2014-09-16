import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class MostFrequentWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SortedMap<String, Integer> words = new TreeMap<String, Integer>();
		ArrayList<String> maxWords = new ArrayList<String>();
		
		String[] tokens = input.nextLine().split("[!.?:;, )(]+");
		
		for (String word : tokens) {
			Integer value = words.get(word.toLowerCase());
			
			if (!words.containsKey(word.toLowerCase())) {
				value = 0;
			}
			words.put(word.toLowerCase(), value + 1);
		}
		
		for (SortedMap.Entry<String,Integer> entry : words.entrySet()) {
			if (maxWords.size() == 0 || entry.getValue() == words.get(maxWords.get(0))) {
				maxWords.add(entry.getKey());
			}
			else if (entry.getValue() > words.get(maxWords.get(0))) {
				maxWords.clear();
				maxWords.add(entry.getKey());
			}
		}
		
		for (String word : maxWords) {
			System.out.println(word + " -> " + words.get(word) + " times");
		}
		input.close();

	}

}
