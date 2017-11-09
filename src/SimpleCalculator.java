import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JTextField first=new JTextField();
	JTextField second=new JTextField();
	Dimension big=new Dimension(100,30);
	JButton add=new JButton();
	JButton sub=new JButton();
	JButton mul=new JButton();
	JButton div=new JButton();
	void buildGUI() {
		add.setText("add");
		sub.setText("subtract");
		div.setText("division");
		mul.setText("multiplication");
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(1000, 500);
		panel.add(first);
		panel.add(second);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
	first.setPreferredSize(big);
	second.setPreferredSize(big);
	String one=first.getText();

	int firstanswer=Integer.parseInt(one);
	}
	
public static void main(String[] args) {
SimpleCalculator a=new SimpleCalculator();
a.buildGUI();


	
}
void add(){


}
}
