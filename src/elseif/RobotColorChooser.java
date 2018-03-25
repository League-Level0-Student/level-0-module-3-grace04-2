//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.security.SecurityPermission;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot Rob = new Robot();
		Rob.miniaturize();
		Rob.setSpeed(100);
		Rob.setPenWidth(10);
		Rob.penDown();
		//3. Ask the user what color they would like the robot to draw
		for (int i=0; i<8;i++) {
		String Ans = JOptionPane.showInputDialog("What color do you want?(red,green,blue)");
		//5. Use an if/else statement to set the pen color that the user requested
		if (Ans.equals("red")) {
			Rob.setPenColor(238, 0, 0);
		}
		else if (Ans.equals("green")){
			Rob.setPenColor(0, 170, 0);
		}
		else if (Ans.equals("blue")) {
			Rob.setPenColor(0, 0, 255);
		}
        //6. If the user doesn’t enter anything, choose a random color
		else {
			Rob.setRandomPenColor();
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
		for (int a=0;a<4;a++) {
		Rob.move(200);
		Rob.turn(90);
		}
		}
	}
	}