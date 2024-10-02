package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color background = new Color(139, 239, 250);
		
		StdDraw.setPenColor(background);
		StdDraw.filledRectangle(0.5, 0.5, 4, 2);
		
		Color cookie = new Color(153, 76, 0);
		
		StdDraw.setPenColor(cookie);
		StdDraw.filledCircle(0.5, 0.5, 0.5);
		
		Color chocolatechip = new Color(102, 51, 0);
		
		StdDraw.setPenColor(chocolatechip);
		StdDraw.filledCircle(0.55, 0.2, 0.1);
		StdDraw.filledCircle(0.3, 0.2, 0.1);
		StdDraw.filledCircle(0.7, 0.4, 0.1);
		StdDraw.filledCircle(0.4, 0.8, 0.1);
		StdDraw.filledCircle(0.6, 0.7, 0.1);
		StdDraw.filledCircle(0.5, 0.5, 0.1);
		StdDraw.filledCircle(0.2, 0.6, 0.1);

		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.9, 0.5, 0.005, 0.025);
		StdDraw.filledRectangle(0.7, 0.2, 0.025, 0.005);
		StdDraw.filledRectangle(0.4, 0.4, 0.005, 0.025);
		StdDraw.filledRectangle(0.7, 0.6, 0.025, 0.005);
		
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(0.5, 0.9, 0.005, 0.025);
		StdDraw.filledRectangle(0.3, 0.4, 0.025, 0.005);
		StdDraw.filledRectangle(0.8, 0.2, 0.005, 0.025);
		StdDraw.filledRectangle(0.7, 0.3, 0.025, 0.005);
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.2, 0.8, 0.005, 0.025);
		StdDraw.filledRectangle(0.4, 0.8, 0.025, 0.005);
		StdDraw.filledRectangle(0.3, 0.7, 0.005, 0.025);
		StdDraw.filledRectangle(0.7, 0.4, 0.025, 0.005);
		
		Color sprinkle = new Color(255, 102, 178);
		StdDraw.setPenColor(sprinkle);
		StdDraw.filledRectangle(0.8, 0.8, 0.005, 0.025);
		StdDraw.filledRectangle(0.2, 0.2, 0.025, 0.005);
		StdDraw.filledRectangle(0.5, 0.3, 0.005, 0.025);
		StdDraw.filledRectangle(0.8, 0.5, 0.025, 0.005);
		
		StdDraw.setPenColor(0,0,0);
		StdDraw.rectangle(0,0,1,1);
	}
}