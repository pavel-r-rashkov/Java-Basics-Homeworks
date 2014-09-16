import java.util.Scanner;

public class Problem07CountOfBitsOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long number = input.nextLong();
		int oneCount = 0;
		
		for (int i = 0; i < 64; i++) {
			if ((number >> i & 1) == 1) {
				oneCount++;
			}
		}
		System.out.println(oneCount);
		input.close();
	}

}
