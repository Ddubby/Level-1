

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	

static Color color;


	
	static Robot dan=new Robot();
	public static void main(String[] args) {
	
dan.setSpeed(10);
dan.turn(-90);
	dan.move(400);
	dan.turn(-90);
	dan.move(200);
	dan.turn(-90);
	String height=JOptionPane.showInputDialog("How tall would you like your houses? Small, Medium, or Large?");
	String answer=JOptionPane.showInputDialog("What color would you like? Red, Blue, or Green?");
	if (answer.equals("red")) {
	color=new Color(255,0,0);
	}
	if (answer.equals("blue")) {
		color=new Color(0,0,255);
	}
	if (answer.equals("green")) {
		color=new Color(0,230,40);
	}
	if (height.equalsIgnoreCase("large")) {
		
	
	
	for (int j = 0; j < 10; j++) {
		drawFlatRoof(height, color);
	}
	}
	else {
	for (int i = 0; i < 10; i++) {
		drawPointyRoof(height, color);
		}
	}



}
	static void drawPointyRoof(String height, Color color){
		int h=0;
		if (height.equalsIgnoreCase("small")) {
			
			 h=60;
		}
		if (height.equalsIgnoreCase("medium")) {

			 h=120;
		}
		if (height.equalsIgnoreCase("large")) {
		
			 h=250;
		}
		 
		
		dan.setPenWidth(5);
	dan.penDown();
	dan.setPenColor(color);
	dan.turn(-90);
	dan.move(h);
	dan.turn(45);
	dan.move(20);
	dan.turn(90);
	dan.move(20);
	dan.turn(45);
	dan.move(h);
	dan.setPenColor(0,255,0);
	dan.turn(-90);
	dan.move(30);
	
	}

static void drawFlatRoof(String height, Color color) {
	int h= 250;
	dan.setPenWidth(5);
	dan.penDown();
	dan.setPenColor(color);
	dan.turn(-90);
	dan.move(h);
	dan.turn(90);
	dan.move(40);
	dan.turn(90);
	dan.move(h);
	dan.turn(-90);
	dan.move(5);
	dan.setPenColor(0,255,0);
	dan.move(30);










}





}

