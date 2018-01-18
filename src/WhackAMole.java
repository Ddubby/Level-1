import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener{
	private int a;
	Random molegenerator=new Random();
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton molebutton;
	Date starttime;
	int numberofmoles=0;
	int misses=0;
	
	void intframe() {
		starttime=new Date();
		frame.setVisible(true);
		frame.setSize(300, 370);
		frame.add(panel);
	}
	
	void drawButtons() {
		int c=molegenerator.nextInt(24)+1;
			for (int i =1 ; i < 25; i++) {
			JButton button=new JButton();
			panel.add(button);
			button.addActionListener(this);
			if (i==c) {
				button.setText("mole!");
				molebutton=button;
			}
		}
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		WhackAMole b=new WhackAMole();
		b.intframe();
		b.drawButtons();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object buttonpressed=e.getSource();
		if (!buttonpressed.equals(molebutton)) {
			misses++;
			switch (misses%3)
			{
			case 0:
				speak("dork");
			break; 
			case 1:
				speak("idiot");
				break;
			case 2:
				speak("moron");
				break;
			}
			
			
		}
		else {
			panel.removeAll();
			drawButtons();
			playSound("pong.wav");
			numberofmoles++;
			if (numberofmoles==10) {
				endGame(starttime,numberofmoles);
			}
		}
	}
	void speak(String words) {
		try {
		Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
		+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		System.exit(0);
	}

}
