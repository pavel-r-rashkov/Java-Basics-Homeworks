
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class Problem09GeneratePDF {

	public static void main(String[] args) throws DocumentException, IOException  {
		String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", 
				"10", "J", "Q", "K", "A", " "};
		char[] suits = {'\u2660', '\u2665', '\u2663', '\u2666'};
		
		Document document = new Document();	
		String FONT = "fonts/Symbola.otf";	
		PdfWriter.getInstance(document,
                new FileOutputStream("Cards.pdf"));

        document.open();
        
        PdfPTable table = new PdfPTable(8);
        table.setWidthPercentage(95);
        
        BaseFont bf = BaseFont.createFont(FONT, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
        Font fontBlack = new Font(bf, 18);
        fontBlack.setColor(BaseColor.BLACK);
        Font fontRed = new Font(bf, 18);
        fontRed.setColor(BaseColor.RED);
        Font font;
        
		for (int face = 0; face < faces.length; face++) {
			for (int suit = 0; suit < suits.length; suit++) {
		    	
				if (suit % 2 == 0) {
		    		font = fontBlack;
		    	} else {
		    		font = fontRed;
		    	}
		    	
				PdfPCell cell = new PdfPCell(new Paragraph((faces[face] + suits[suit]), font));		
				cell.setPaddingTop(40);
				cell.setPaddingBottom(40);
				cell.setPaddingLeft(20);
				
				if (face == 8) {
					cell.setPaddingLeft(15);
				}
				table.addCell(cell);
			}
		}
		document.add(table);
		document.close();
	}
}
