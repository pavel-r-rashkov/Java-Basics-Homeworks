import java.util.Scanner;

public class Problem01SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();
		
		for (int i = start; i <= end; i++) {
			String number = Integer.toString(i); 
			boolean symmetric = true;
			
			for (int j = 0 ; j < number.length() / 2 ; j++) {
				if (number.charAt(j) != number.charAt(number.length() - 1 - j)) {
					symmetric = false;
					break;
				}
			}
			
			if (symmetric) {
				System.out.println(number);
			}
		}
		input.close();
	}

}
