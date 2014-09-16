import java.util.Scanner;

public class Problem06SumTwoNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("Sum: " + (a + b));
		
		input.close();
	}
}
