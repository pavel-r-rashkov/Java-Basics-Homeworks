import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell ;
import org.apache.poi.ss.usermodel.Row ;
import org.apache.poi.ss.usermodel.Sheet ;
import org.apache.poi.ss.usermodel.Workbook ;
import org.apache.poi.ss.usermodel.WorkbookFactory ;

public class Problem11Excel {
	
	// xmlbeans-2.4.0.jar must be included
	public static void main(String[] args) {
		
		try
        {
            FileInputStream file = new FileInputStream(new File("resource//Problem11-Excel//Incomes-Report.xlsx"));
           
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheetAt(0);
            
            SortedMap<String, Double> offices = new TreeMap<String, Double>();
            
            Iterator<Row> rowIterator = sheet.iterator();
            
            while (rowIterator.hasNext()) {
            	Row row = rowIterator.next();
            	
            	if (row.getRowNum() == 0) {
            		continue;
            	}
            	Cell officeName = row.getCell(0);
            	Cell totalIncome = row.getCell(5);
            	
            	String name = officeName.getStringCellValue();
            	Double income = totalIncome.getNumericCellValue();
            	Double incomeTemp = offices.get(name);
            	
            	if (!offices.containsKey(name)) {
            		incomeTemp = 0.0;
            	}
            	offices.put(name, incomeTemp + income);
            }
            
            double total = 0;
            
            for (Entry<String, Double> entry : offices.entrySet()) {
				System.out.printf("%1$s Total -> %2$.2f", entry.getKey(), entry.getValue());
				System.out.println();
				total += entry.getValue();
            }
            System.out.printf("Grand Total -> %1$.2f", total);
            
            file.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }		
	}
}
