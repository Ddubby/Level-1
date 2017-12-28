import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class MyTwitter implements ActionListener{
	private JButton search=new JButton();
	 private JFrame frame=new JFrame();
	private JPanel panel=new JPanel();
	private Dimension big=new Dimension(100,30);
	private JTextField field=new JTextField();
	private JTextArea area=new JTextArea();
	private String getLatestTweet(String searchingFor) {
		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken(
				"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
				"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			return result.getTweets().get(0).getText();
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}
	}
	void buildGUI() {
		frame.add(panel);
	
		panel.add(search);
		panel.add(field);
		frame.setSize(400, 200);
		frame.setVisible(true);
		panel.add(area);
		field.setPreferredSize(big);
		search.addActionListener(this);
		search.setText("Search the Twitterverse");
		frame.pack();
	}
public static void main(String[] args) {
MyTwitter a=new MyTwitter();
a.buildGUI();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed.equals(search)) {
	String s=	field.getText();
	String tweet= getLatestTweet(s);
		System.out.println(tweet);
		System.out.println("tweet tweet");
		System.out.println(tweet.length());
		area.setText(tweet);
		frame.pack();
	}
}
}
