import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener{
JButton trick=new JButton();
JButton treat=new JButton();
JFrame frame=new JFrame();
JPanel panel=new JPanel();
public static void main(String[] args) {
NastySurprise a=new NastySurprise();
a.buildGUI();
}
void buildGUI(){
	frame.setVisible(true);
	frame.add(panel);
	panel.add(trick);
	panel.add(treat);
	trick.setText("Trick");
	treat.setText("Treat");
	trick.addActionListener(this);
	treat.addActionListener(this);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonpressed= (JButton) e.getSource();
	if (buttonpressed.equals(trick)) {
		showPictureFromTheInternet("http://cdn1-www.dogtime.com/assets/uploads/2011/03/puppy-development-300x200.jpg");
	}
	if (buttonpressed.equals(treat)) {
		showPictureFromTheInternet("http://i0.kym-cdn.com/photos/images/original/000/545/114/d44.jpeg");
	}
}
private void showPictureFromTheInternet (String imageUrl) {
	try {
		URL url= new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel= new JLabel(icon);
		JFrame frame = new JFrame();
		frame.add(imageLabel);
		frame.setVisible(true);
		frame.pack();
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
}
}
