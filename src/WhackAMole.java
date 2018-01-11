import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
	private int a;
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton button1=new JButton();
	JButton button2=new JButton();
	JButton button3=new JButton();
	JButton button4=new JButton();
	JButton button5=new JButton();
	JButton button6=new JButton();
	JButton button7=new JButton();
	JButton button8=new JButton();
	JButton button9=new JButton();
	JButton button10=new JButton();
	JButton button11=new JButton();
	JButton button12=new JButton();
	
	int drawButtons(int a) {
		frame.setVisible(true);
		frame.setSize(300, 150);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		panel.add(button11);
		panel.add(button12);
		return 0;
	}
	public static void main(String[] args) {
		WhackAMole b=new WhackAMole();
		b.drawButtons(0);
	}
}
