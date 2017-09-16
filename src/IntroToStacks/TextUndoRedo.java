package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	/* 
	 * Create a JFrame with a JPanel and a JLabel. <COMPLETED>
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel text = new JLabel();
	Stack<Character> history = new Stack<Character>(); 
	public void createGUI() {
		panel.add(text);
		frame.addKeyListener(this);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		TextUndoRedo tur = new TextUndoRedo();
		tur.createGUI();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
			text.setText(text.getText() + e.getKeyChar());
			frame.pack();
		}
		else if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			char a = text.getText().charAt(text.getText().length()-2);
			history.add(a);
			JOptionPane.showMessageDialog(null, history);
		}
		else {
			System.out.println("The logic is wrong");
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
