import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.io.IOException;
import java.util.Scanner;

import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.batik.dom.GenericDOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DOMImplementation;

public class Problem10HouseAsSVG {
	
	public void paintDot(Graphics2D g2d, double x, double y, boolean inside) {
		
		Stroke stroke = new BasicStroke(0.5f);
        g2d.setStroke(stroke);
		g2d.setPaint(Color.BLACK);
		
		Ellipse2D.Double circle = new Ellipse2D.Double(x, y, 5, 5);
		g2d.draw(circle);
		
		g2d.setPaint(Color.gray);
		if (inside) {
			g2d.setPaint(Color.black);
		}
		
		g2d.fill(circle);
	}

    public void paintHouse(Graphics2D g2d) {
    	float[] dashingPattern1 = {2f, 2f};
    	Stroke stroke1 = new BasicStroke(0.5f, BasicStroke.CAP_BUTT,
    	        BasicStroke.JOIN_MITER, 1.0f, dashingPattern1, 2.0f);
    	
    	g2d.setStroke(stroke1);
        g2d.setPaint(Color.CYAN);

        g2d.draw(new Line2D.Double(20, 0, 20, 290));
        g2d.draw(new Line2D.Double(70, 0, 70, 290));
        g2d.draw(new Line2D.Double(120, 0, 120, 290));
        g2d.draw(new Line2D.Double(170, 0, 170, 290));
        g2d.draw(new Line2D.Double(220, 0, 220, 290));
        g2d.draw(new Line2D.Double(270, 0, 270, 290));
        
        g2d.draw(new Line2D.Double(0, 20, 290, 20));
        g2d.draw(new Line2D.Double(0, 70, 290, 70));
        g2d.draw(new Line2D.Double(0, 120, 290, 120));
        g2d.draw(new Line2D.Double(0, 170, 290, 170));
        g2d.draw(new Line2D.Double(0, 220, 290, 220));
        g2d.draw(new Line2D.Double(0, 270, 290, 270));
        
        Stroke stroke2 = new BasicStroke(2f);
        g2d.setStroke(stroke2);
        Color color = new Color(0.1f, 0.1f, 0.1f, 0.7f); 
        g2d.setPaint(color);
        
        g2d.draw(new Line2D.Double(70, 120, 270, 120));
        g2d.draw(new Line2D.Double(70, 120, 170, 20));
        g2d.draw(new Line2D.Double(170, 20, 270, 120));
        g2d.draw(new Line2D.Double(70, 120, 70, 220));
        g2d.draw(new Line2D.Double(70, 220, 170, 220));
        g2d.draw(new Line2D.Double(170, 220, 170, 120));
        g2d.draw(new Line2D.Double(220, 220, 220, 120));
        g2d.draw(new Line2D.Double(270, 220, 270, 120));
        g2d.draw(new Line2D.Double(220, 220, 270, 220));
    }

    public static void main(String [] args) throws IOException {
        
    	// Get a DOMImplementation
        DOMImplementation domImpl =
            GenericDOMImplementation.getDOMImplementation();
        String svgNamespaceURI = "http://www.w3.org/2000/svg";

        // Create an instance of org.w3c.dom.Document
        Document document = 
            domImpl.createDocument(svgNamespaceURI, "svg", null);
       
        // Create an instance of the SVG Generator
        SVGGraphics2D svgGenerator = new SVGGraphics2D(document);

        // Render into the SVG Graphics2D implementation
        Problem10HouseAsSVG test = new Problem10HouseAsSVG();
        test.paintHouse(svgGenerator);
        
        Scanner input = new Scanner(System.in);
		int n = Integer.valueOf(input.nextLine());
		
		for (int i = 0 ; i < n ; i++) {
			double aX = input.nextDouble();
			double aY = input.nextDouble();
			
			if (insideTop(aX, aY) || insideRight(aX, aY) || insideLeft(aX, aY)) {
				test.paintDot(svgGenerator, (aX - 10) * 20 + 17.5, (aY - 3.5) * 20 + 17.5, true);
			}
			else {
				test.paintDot(svgGenerator, (aX - 10) * 20 + 17.5, (aY - 3.5) * 20 + 17.5, false);
			}
		}
		input.close();
            
        svgGenerator.stream("output//house.svg"); 
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
