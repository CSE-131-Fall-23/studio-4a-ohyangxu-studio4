package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setXscale(0, 10);
		StdDraw.setYscale(0, 10);
		
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.line(0.5, 0.5, 2.5, 0.5);
		StdDraw.line(0.5, 0.5, 0.5, 0.7);
		StdDraw.line(2.5, 0.7, 0.5, 0.7);
		StdDraw.line(2.5, 0.7, 2.5, 0.5);

	}
}