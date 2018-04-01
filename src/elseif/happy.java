package elseif;

import javax.swing.JOptionPane;

public class happy {
	public static void main(String[] args) {
		String one = JOptionPane.showInputDialog("Are you happy?");
		if (one.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
		else if (one.equals("no")) {
			String two = JOptionPane.showInputDialog("Do you want to be happy?");
			if (two.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}
			else if (two.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
		}
	}
}
