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
		ChuckleClicker a= new ChuckleClicker();
		a.makeButtons();
}
void makeButtons(){
	frame.setVisible(true);
	frame.setSize(400, 200);
	frame.add(panel);
	panel.add(button);
	panel.add(button2);
	button.setText("joke");
	button2.setText("punchline");
	button.addActionListener(this);
	button2.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed.equals(button)) {
		JOptionPane.showMessageDialog(null, "I used to think the brain was the most important organ");
	}
	else if(buttonPressed.equals(button2)) {
		JOptionPane.showMessageDialog(null, "Then I thought, look what's telling me that");
		
	}
}
}

