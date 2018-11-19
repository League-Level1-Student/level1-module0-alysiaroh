import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener{
	public static void main(String[] args) {
		new cutenessTV().createUI();
	}
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	private void createUI() {
		frame.add(panel);
		panel.add(button);
		button.addActionListener(this);
		button.setText("Play duck song");
		panel.add(button1);
		button1.addActionListener(this);
		button1.setText("Play squeaking frog");
		panel.add(button2);
		button2.addActionListener(this);
		button2.setText("Play pink fluffy unicorns");
		frame.setVisible(true);
		frame.pack();
	}
//1. Make a user interface with 3 buttons that will play different videos depending on which button is clicked. 
//      If you need help, take a look at the instructions for the Fortune Cookie recipe. 
//
//2. Use the methods below to play the cutest videos ever. 

void showDucks() {
     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");

}

void showFluffyUnicorns() {
     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
     try {
          URI uri = new URI(videoID);
          java.awt.Desktop.getDesktop().browse(uri);
     } catch (Exception e) {
          e.printStackTrace();
     }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed==button) {
		showDucks();
	}
	if(buttonPressed==button1) {
		showFrog();
	}
	if(buttonPressed==button2) {
		showFluffyUnicorns();
	}
	frame.pack();
}
}