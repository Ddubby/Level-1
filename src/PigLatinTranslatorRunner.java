import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslatorRunner implements ActionListener {
	
	private JButton translate=new JButton();
	 private JFrame frame=new JFrame();
	private JPanel panel=new JPanel();
	private JTextField field1=new JTextField(10);
	private JTextField field2=new JTextField(10);

	public static void main(String[] args) {
	PigLatinTranslatorRunner a=new PigLatinTranslatorRunner ();
	a.buildGUI();
}
void buildGUI(){
frame.add(panel);
frame.setVisible(true);
frame.setSize(600, 200);
panel.add(field1);
panel.add(translate);
panel.add(field2);
translate.setText("translate");
translate.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed.equals(translate)) {
		if (!field1.getText().equals(null)) {
			String first=field1.getText();		
String translation=PigLatinTranslator.pigWord(first);
field2.setText(translation);
		}
		else {
		field1.setText("Nothing is here");	
		}
		if(field1.getText().contains(" ")) {
			String first=field1.getText();
			String sentence=PigLatinTranslator.translate(first);
		field2.setText(sentence);
		}
	}
		}
		
	}




