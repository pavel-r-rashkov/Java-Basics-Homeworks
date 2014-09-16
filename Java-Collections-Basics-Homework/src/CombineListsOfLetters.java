import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CombineListsOfLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] l1 = input.nextLine().split(" ");
		String[] l2 = input.nextLine().split(" ");
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(l1));
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(l2));
		ArrayList<String> itemsToAdd = new ArrayList<String>();
		
		for (int i = 0 ; i < list2.size() ; i++) {
			if (!list1.contains(list2.get(i))) { 
				itemsToAdd.add(list2.get(i));
			}
		}
		list1.addAll(itemsToAdd);
		
		for (String element : list1) {
			System.out.print(element + " ");
		}
		input.close();
	}
}
