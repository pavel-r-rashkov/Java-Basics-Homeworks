import java.util.Scanner;

public class Problem04TheSmallestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		System.out.println(Math.min(a, Math.min(b, c)));
		input.close();
	}
}
