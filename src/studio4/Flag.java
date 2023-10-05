package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		double [] x = {0.2, 0.5, 0.2};
		double [] y = {0.7, 0.5, 0.3};
		double [] z = {0.8, 0.5, 0.8};
		StdDraw.clear();
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.2);
		StdDraw.setPenColor(Color.ORANGE);
		StdDraw.filledPolygon(x, y);
		StdDraw.filledPolygon(z, y);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledEllipse(0.5, 0.5, 0.1, 0.1);
		
	}
}