import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class checkpoint implements KeyListener{
	public static void main(String[] args) {
		new checkpoint().createUI();
	}
	JFrame frame = new JFrame();
	
	private void createUI() {
		frame.addKeyListener(this);
		frame.setVisible(true);
	}
//1. Make a program that says “ouch” every time a key is pressed. You can use the speak() method below.

static void speak(String words) {
     try {
          Runtime.getRuntime().exec("say " + words).waitFor();
     } 
     catch (Exception e) {
          e.printStackTrace();
          }
     }

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	JFrame keyPressed = (JFrame)e.getSource();
	if(keyPressed==frame) {
		speak("ouch");
	}
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}