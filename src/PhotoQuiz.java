/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
        String a = "https://www.incimages.com/uploaded_files/image/970x450/getty_855098134_353411.jpg";
		// 2. create a variable of type "Component" that will hold your image
        Component component;
		// 3. use the "createImage()" method below to initialize your Component
        component = createImage(a);
		// 4. add the image to the quiz window
        quizWindow.add(component);
		// 5. call the pack() method on the quiz window
        quizWindow.pack();
		// 6. ask a question that relates to the image
        String answer = JOptionPane.showInputDialog("What is the best thing from the image?");
		// 7. print "CORRECT" if the user gave the right answer
        int score=0;
        if(answer.equals("blueberries")) {
        	System.out.println("CORRECT");
        	score++;
        }
		// 8. print "INCORRECT" if the answer is wrong
        else {
        	System.out.println("INCORRECT");
        }
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
        quizWindow.remove(component);
		// 10. find another image and create it (might take more than one line of code)
        String b = "https://amp.businessinsider.com/images/5a7dc169d03072af008b4bf2-750-562.jpg";
        Component c;
        c = createImage(b);
		// 11. add the second image to the quiz window
        quizWindow.add(c);
		// 12. pack the quiz window
        	quizWindow.pack();
		// 13. ask another question
        	String answer2 = JOptionPane.showInputDialog("What is this food?");
		// 14+ check answer, say if correct or incorrect, etc.
        	if(answer2.equals("cheeseburger")) {
        		System.out.println("CORRECT");
        		score++;
        	}
        	else {
        		System.out.println("INCORRECT");
        	}
        
System.out.println(score);
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz

	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





