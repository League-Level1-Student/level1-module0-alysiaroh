import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	public static void main(String[] args) {
	Robot.setWindowColor(Color.black);
		a.setX(10);
	a.setY(500);
	a.miniaturize();
	a.penDown();
	a.setSpeed(255);
	drawPointyRoof("small",Color.red);
	drawPointyRoof("medium",Color.blue);
	drawPointyRoof("small",Color.CYAN);
	drawFlatRoof(Color.orange);
	drawFlatRoof(Color.red);
	drawPointyRoof("medium",Color.lightGray);

	} 

	//1. Have a robot start on the left side of the window near the bottom. 
	static Robot a = new Robot();
	
	//2. Draw a flat-topped house of height 100 with grass after it (see picture). 
static void drawFlatRoof(Color d) {
	a.setPenColor(d);
	a.move(250);
a.turn(90);
a.move(20);
a.turn(90);
a.move(250);
a.turn(270);
a.setPenColor(0,255,0);
a.move(20);
a.turn(270);
}
	
	static void drawPointyRoof(String height, Color c) {
	
		int b=0;
		if(height.equals("small")) {
	b=60;
	}
		else if(height.equals("medium")) {
			b=120;
	}
		else if(height.equals("large")) {
			b=250;
		}
a.setPenColor(c);
		a.move(b);
	a.turn(45);
	a.move(20);
	a.turn(90);
	a.move(20);
	a.turn(45);
	a.move(b);
	a.turn(270);
	a.setPenColor(0,255,0);
	a.move(20);
	a.turn(270);
	}
	//3. Extract the piece of code that draws the house into a method. Draw 10 houses. 

//	4. Change the method to take (int height) as a parameter. Draw 9 houses of different heights 
//
//	5. Make the method take a String instead of an int. 
//
//	        “small”                 60 
//
//	        “medium”             120 
//
//	        “large”                 250 
//
//	6. Make the method take a color as well as a height. The houses are drawn in that color. 
//
//	[optional] Set the scene to night by setting the background to black 
//
//	7. Give the houses peaked roofs 
//
//	8. Extract that roof code into a method “drawPointyRoof” and create a new method: “drawFlatRoof”. 
//
//	9. Make large houses have flat roofs 
	
}
