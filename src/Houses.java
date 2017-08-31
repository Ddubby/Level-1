

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	

	static Robot dan=new Robot();
	public static void main(String[] args) {
	
dan.setSpeed(10);
dan.turn(-90);
	dan.move(400);
	dan.turn(-90);
	dan.move(200);
	dan.turn(-90);
	String height=JOptionPane.showInputDialog("How tall would you like your houses? Small, Medium, or Large?");
	
	
	for (int i = 0; i < 10; i++) {
	 	
	
	drawPointyRoof(height);
	}	
	






}
	static void drawPointyRoof(String height){
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
	dan.setRandomPenColor();
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
}
