import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener {
	JLabel calculatedanswer=new JLabel();
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
		frame.setSize(240, 250);
		panel.add(first);
		panel.add(second);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
panel.add(calculatedanswer);
		calculatedanswer.setSize(150, 150);
	first.setPreferredSize(big);
	second.setPreferredSize(big);
	add.addActionListener(this);
	sub.addActionListener(this);
mul.addActionListener(this);
	div.addActionListener(this);
	}
	
public static void main(String[] args) {
SimpleCalculator a=new SimpleCalculator();
a.buildGUI();


	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
if (buttonPressed.equals(add)) {
add();
}
if (buttonPressed.equals(sub)) {
	sub();
}
if (buttonPressed.equals(mul)) {
	mul();
}
if (buttonPressed.equals(div)) {
	div();
}


}
void add(){
	String one=first.getText();
	String two=second.getText();
		int firstanswer=Integer.parseInt(one);
		int secondanswer=Integer.parseInt(two);
int answer=firstanswer+secondanswer;
calculatedanswer.setText(Integer.toString(answer));
}
void sub() {
	String one=first.getText();
	String two=second.getText();
	int firstanswer=Integer.parseInt(one);
	int secondanswer=Integer.parseInt(two);
int answer=firstanswer-secondanswer;
calculatedanswer.setText(Integer.toString(answer));
}
void mul() {
	String one=first.getText();
	String two=second.getText();
	int firstanswer=Integer.parseInt(one);
	int secondanswer=Integer.parseInt(two);
	int answer=firstanswer*secondanswer;
	calculatedanswer.setText(Integer.toString(answer));
}
void div() {
	String one=first.getText();
	String two=second.getText();
	int firstanswer=Integer.parseInt(one);
	int secondanswer=Integer.parseInt(two);
	double answer=firstanswer/secondanswer;

	 calculatedanswer.setText(Double.toString(answer));
}



}



