import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Problem09ListOfProducts {

	public static void main(String[] args) {
		File file = new File("resource//Problem09-List-Of-Products//Input.txt");
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
		
		Product.printProductsInFile();
	}

}

class Product {
	
	private static SortedMap<Double, String> products = new TreeMap<Double, String>();
	private static HashMap<String, Double> productsByName = new HashMap<String, Double>();
	
	private double price;
	private String name;
	
	public Product (String name, double price) {
		this.name = name;
		this.price = price;
		products.put(this.price, this.name);
		productsByName.put(this.name, this.price);//Used in Problem10
	}
	
	public static void printProductsInFile() {
		try {
			PrintStream printFile = new PrintStream("resource//Problem09-List-Of-Products//Output.txt");
			
			for (Map.Entry<Double, String> entry : products.entrySet()) {
				printFile.println(entry.getKey() + " " + entry.getValue());
			}
			printFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
	
	// Used in Problem10
	private static HashMap<String, Double> readOrderFromFile() {
		HashMap<String, Double> order = new HashMap<String, Double>();
		File file = new File("resource//Problem10-Order-Of-Products//Order.txt");
		
		try {
			Scanner input = new Scanner(file);
			
			while (input.hasNextLine()) {
				String line = input.nextLine();
				String[] tokens = line.split(" ");
				Double value = order.get(tokens[1]);
				
				if (!order.containsKey(tokens[1])) {
					value = 0.0;
				}
				value += Double.valueOf(tokens[0]);
				order.put(tokens[1], value);
			}				
			input.close();			
					
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
		return order;
	}
	
	// Used in Problem10
	public static void printTotalPriceInFile() {
		HashMap<String, Double> order = readOrderFromFile();
		double sum = 0;
		
		try {
			PrintStream printFile = new PrintStream("resource//Problem10-Order-Of-Products//Output.txt");
			
			for (Entry<String, Double> entry : order.entrySet()) {
				sum += productsByName.get(entry.getKey()) * entry.getValue();
			}
			printFile.println(sum);
			printFile.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
}
