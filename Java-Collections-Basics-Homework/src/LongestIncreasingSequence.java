import java.util.ArrayList;
import java.util.Scanner;


public class LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		String[] numbers = line.split(" ");
		Integer[] nums = new Integer[numbers.length];
		
		for (int i = 0 ; i < nums.length ; i++) {
			nums[i] = Integer.valueOf(numbers[i]);
		}
		
		int number = nums[0];
		System.out.print(number);
		
		ArrayList<Integer> sequence = new ArrayList<Integer>();
		ArrayList<Integer> maxSequence = new ArrayList<Integer>();
		sequence.add(number);
		
		for (int i = 1 ; i < nums.length ; i++) {
			int nextNumber = nums[i];

			if (nextNumber > number) {
				System.out.print(" " + nextNumber);
				sequence.add(nextNumber);
			}
			else {
				System.out.println();
				System.out.print(nextNumber);
				if (sequence.size() > maxSequence.size()) {
					maxSequence = new ArrayList<Integer>(sequence);
				}
				sequence.clear();
				sequence.add(nextNumber);
			}
			number = nextNumber;
		}	
		
		if (sequence.size() > maxSequence.size()) {
			maxSequence = new ArrayList<Integer>(sequence);
		}
		
		System.out.println();
		System.out.print("Longest: ");
		
		for (int num : maxSequence) {
			System.out.print(num + " ");
		}
			
		input.close();
	}
}
