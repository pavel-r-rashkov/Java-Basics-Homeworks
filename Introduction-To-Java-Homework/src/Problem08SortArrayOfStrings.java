import java.util.Arrays;
import java.util.Scanner;

public class Problem08SortArrayOfStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = Integer.valueOf(input.nextLine());
		String[] cities = new String[n];
		
		for (int i = 0; i < n; i++) {
			cities[i] = input.nextLine();
		}
		Arrays.sort(cities);
		
		for (String city : cities) {
			System.out.println(city);
		}
		input.close();
	}

}
