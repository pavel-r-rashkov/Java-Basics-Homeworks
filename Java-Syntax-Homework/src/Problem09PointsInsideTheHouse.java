import java.util.Scanner;


public class Problem09PointsInsideTheHouse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double aX = input.nextDouble();
		double aY = input.nextDouble();
		
		if (insideTop(aX, aY) || insideRight(aX, aY) || insideLeft(aX, aY)) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
		input.close();
	}
	
	public static boolean insideLeft(double aX, double aY) {
		if (aX >= 12.5 && aX <= 17.5 && aY>= 8.5 && aY <= 13.5) {
			return true;
		}
		return false;
	}
	
	public static boolean insideTop(double aX, double aY) {
		double positionMN = (12.5-17.5)*(aY-3.5) - (8.5-3.5)*(aX-17.5);
		double positionNP = (22.5-12.5)*(aY-8.5) - (8.5-8.5)*(aX-12.5);
		double positionPM = (17.5-22.5)*(aY-8.5) - (3.5-8.5)*(aX-22.5);
		
		if (positionMN >= 0 && positionNP >= 0 && positionPM >= 0) {
			return true;
		}
		else if (positionMN <= 0 && positionNP <= 0 && positionPM <= 0) {
			return true;
		}
		return false;
	}
	
	public static boolean insideRight(double aX, double aY) {
		if (aX >= 20 && aX <= 22.5 && aY>= 8.5 && aY <= 13.5) {
			return true;
		}
		return false;
	}
}
