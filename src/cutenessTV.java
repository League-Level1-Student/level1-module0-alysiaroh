import java.awt.Window;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV {
public static void main(String[] args) {
//	1. Make a user interface with 3 buttons that will play different videos depending on which button is clicked. 
//    If you need help, take a look at the instructions for the Fortune Cookie recipe. 
JFrame frame = new JFrame();
JPanel panel = new JPanel();
frame.add(panel);
JButton button = new JButton();
JButton button1= new JButton();
JButton button2= new JButton();
panel.add(button2);
panel.add(button);
panel.add(button1);
panel.setVisible(true);
frame.pack();

//2. Use the methods below to play the cutest videos ever. 
}
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

}
