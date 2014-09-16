import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem10OrderOfProducts {

	public static void main(String[] args) {
		File file = new File("resource//Problem10-Order-Of-Products//Products.txt");
		try {
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {
				String line = input.nextLine();
				String[] tokens = line.split(" ");
				Product product = new Product(tokens[0], Double.valueOf(tokens[1]));
			}				
			input.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
		Product.printTotalPriceInFile();
	}
}


