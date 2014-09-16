import java.util.Scanner;

public class Problem05AngleUnitConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] output = new String[n]; 
		
		for (int i = 0; i < n; i++) {
			double angle = input.nextDouble();
			String measure = input.nextLine(); 
			
			if (measure.equals(" deg")) {		
				output[i] = String.format("%1$.6f rad", degreesToRadiants(angle));
			}
			else {
				output[i] = String.format("%1$.6f deg", radiantsToDegrees(angle));
			}
		}
		
		for (String i : output) {
			System.out.println(i);
		}
		input.close();
	}
	
	public static double radiantsToDegrees (double angle) {
		return angle * (180 / Math.PI);
	}
	
	public static double degreesToRadiants (double angle) {
		return angle * (Math.PI / 180);
	}

}
