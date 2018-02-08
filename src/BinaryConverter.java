import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements MouseListener {
	JTextField field=new JTextField(20);
	JLabel label=new JLabel();
	public static void main(String[] args) {
	BinaryConverter bc=new BinaryConverter();
	bc.buildGUI();
	}
void buildGUI() {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton button=new JButton();
	frame.setVisible(true);
	frame.setSize(400, 70);
	panel.add(field);
	frame.add(panel);
	panel.add(button);
	panel.add(label);
	button.setText("Convert");
	label.setText("A");
	button.addMouseListener(this);
	frame.setTitle("Convert 8 bits of binary to ASCII");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
static String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	String h=field.getText();
	Integer.parseInt(h);
	String a=convert(h);
	label.setText(a);
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}

