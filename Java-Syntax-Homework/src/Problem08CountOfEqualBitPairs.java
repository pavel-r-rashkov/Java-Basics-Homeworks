import java.util.Scanner;


public class Problem08CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long number = input.nextLong();
		int pairsCount = 0;
		int numberLenght = (int)(Math.log(number) / Math.log(2)) + 1;
				
		for (int i = 0; i < numberLenght; i++) {
			if ((number >> i & 3) == 3 || (number >> i & 3) == 0) {
				pairsCount++;
			}
		}
		System.out.println(pairsCount);
		input.close();

	}

}
