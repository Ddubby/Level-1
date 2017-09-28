import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "download.jpg";
	String secondImage = "";
	String thirdImage = "";

	JFrame window = new JFrame();
	
	private void startQuiz() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the size of the window so that you can only see part of the image.
			
		//window.setSize(300, 300);
			
		// Make an int variable to hold the score.
int score=0;
		// Ask the user who this person is and store their answer
String answer=JOptionPane.showInputDialog("Who is this?");
		// If they got the answer right:
		// -- Tell them they are correct.
		// -- Increase the score by 1
if (answer.equalsIgnoreCase("Messi")) {
	JOptionPane.showMessageDialog(null, "Correct!");
score=+1;
}
		// Otherwise:
		// -- Tell them they are wrong
else {
	JOptionPane.showMessageDialog(null, "Wrong!");
}
		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
JOptionPane.showMessageDialog(null, "Your score is, "+score);	
showNextImage();
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
		window.repaint();
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) 
			throws MalformedURLException
	{
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null)
		{
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel=new JLabel();
		try {
			imageLabel = loadImage(firstImage);imageList.add(imageLabel);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		imageList.add(imageLabel);
		try {
			imageLabel = loadImage(secondImage);imageList.add(imageLabel);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		imageList.add(imageLabel);
		try {
			imageLabel = loadImage(thirdImage);imageList.add(imageLabel);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}


