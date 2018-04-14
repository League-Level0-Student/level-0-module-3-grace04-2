import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {
	public static void main(String[] args) {
		//String B = JOptionPane.showInputDialog("What color do you want?");
		//if (B.equals("red")) {
		//	colorRed();
		//}
		//else if (B.equals("green")) {
		//	colorGreen();
		//}
		//else if (B.equals("blue")) {
		//	colorBlue();
		//}
		//else {
		//	JOptionPane.showMessageDialog(null, "Sorry, I can't color that.");
		//}
		String A = JOptionPane.showInputDialog("What shape do you want?");
		if (A.equals("square")) {
			drawSquare();
		}
		else if (A.equals("triangle")) {
			drawTriangle();
		}
		else if (A.equals("circle")) {
			drawCircle();
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I can't draw that.");
		}
	}
	public static void drawSquare() {
		Robot rob = new Robot();
		rob.miniaturize();
		rob.penDown();
		rob.setSpeed(100);
		for(int i=0;i<4;i++) {
		rob.move(50);
		rob.turn(90);
		}
	}
	public static void drawTriangle() {
		Robot rob = new Robot();
		rob.miniaturize();
		rob.penDown();
		rob.setSpeed(100);
		for(int i=0;i<3;i++) {
		rob.move(50);
		rob.turn(120);
		}
	}
	public static void drawCircle() {
		Robot rob = new Robot();
		rob.miniaturize();
		rob.penDown();
		rob.setSpeed(100);
		for(int i=0;i<360;i++) {
		rob.move(1);
		rob.turn(1);
		}
	}
	public static void colorRed() {
		Robot rob = new Robot();
		rob.miniaturize();
		rob.penDown();
		rob.setSpeed(100);
		rob.setPenColor(100, 0, 0);
	}
	public static void colorGreen() {
		Robot rob = new Robot();
		rob.miniaturize();
		rob.penDown();
		rob.setSpeed(100);
		rob.setPenColor(0, 100, 0);
	}
	public static void colorBlue() {
		Robot rob = new Robot();
		rob.miniaturize();
		rob.penDown();
		rob.setSpeed(100);
		rob.setPenColor(0, 0, 100);
	}
}
