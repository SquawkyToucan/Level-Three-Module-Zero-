package IntroToHashMaps;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements MouseListener {
	//Hashmap for the program
	HashMap<Integer, String> names = new HashMap<Integer, String>();
	//GUI variables
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addNames = new JButton();
	JButton search = new JButton();
	JButton viewList = new JButton();
	JButton remove = new JButton();
	LogSearch() {
		//Set the text of all of the buttons before you use them
		addNames.setText("Add a name"); addNames.addMouseListener(this);
		search.setText("Search for a name"); search.addMouseListener(this);
		viewList.setText("View the names"); viewList.addMouseListener(this);
		remove.setText("Remove a name"); remove.addMouseListener(this);
		//Add buttons to panel
		panel.add(addNames);
		panel.add(search);
		panel.add(viewList);
		panel.add(remove);
		//Add to frame, visibility, etc.
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new LogSearch();
	}
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		Object button = e.getSource();
		if(button == addNames) {
			String ID = JOptionPane.showInputDialog("Please enter in an Integer ID for the name you're adding.");
			int id = Integer.parseInt(ID);
			String name = JOptionPane.showInputDialog("Enter the name of the person being assigned to the ID " + id);
			names.put(id, name);
		}
		else if(button == search) {
			String idToSearch = JOptionPane.showInputDialog("Enter in the ID you'd like to search for.");
			int id = Integer.parseInt(idToSearch);
			if(names.get(id) != null) {
				JOptionPane.showMessageDialog(null, "Your search returned this result:\n" + names.get(id));
			}
			else {
				JOptionPane.showMessageDialog(null, "Sorry, but this name couldn't be found.");
			}
		}
		else if(button == viewList) {
			JOptionPane.showMessageDialog(null, names.values());
		}
		else if(button == remove) {
			String removeID = JOptionPane.showInputDialog("What is the ID that you want to remove?");
			int id = Integer.parseInt(removeID);
			if(names.get(id) != null) {
				names.remove(id);
				JOptionPane.showMessageDialog(null, "This has been removed.");
			}
			else {
				JOptionPane.showMessageDialog(null, "Sorry, this name could not be found.");
			}
		}
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
