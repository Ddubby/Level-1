import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
JFrame frame=new JFrame();
JPanel panel=new JPanel();
JButton button=new JButton();
JButton button2=new JButton();
	public static void main(String[] args) {
	
}
void makeButtons(){
	frame.setVisible(true);
	frame.setSize(400, 200);
	frame.add(panel);
	panel.add(button);
	panel.add(button2);
	button.setText("joke");
	button.setText("punchline");
	button.addActionListener(this);
	button2.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed.equals(button)) {
		JOptionPane.showMessageDialog(null, "hi");
	}
	else if(buttonPressed.equals(button2)) {
		JOptionPane.showMessageDialog(null, "hi");
	}
}
}

