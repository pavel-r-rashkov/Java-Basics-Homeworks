import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem08SumNumbersFromATextFile {

	public static void main(String[] args) {
		File file = new File("resource//numbers.txt");
		int sum = 0;
		
		try {
			Scanner fileRead = new Scanner(file);
			
			while (fileRead.hasNextLine()) {
				sum += fileRead.nextInt();
				fileRead.nextLine();
			}
			System.out.println(sum);
			fileRead.close();
			
		} catch (FileNotFoundException e) {			
			System.out.println("Error");
		}	
	}

}
