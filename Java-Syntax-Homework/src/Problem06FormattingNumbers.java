import java.util.Scanner;


public class Problem06FormattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		System.out.printf("|%1$-10X|%2$s|%3$10.2f|%4$-10.3f|",
				a, "0000000000".substring(Integer.toBinaryString(a).length()) + Integer.toBinaryString(a), b, c);
		
		input.close();
	}

}
