import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Paint {
	public static void main(String[] args) {
		// Image icons
		ImageIcon blackIcon = new ImageIcon("bin\\iconColours\\blackIcon.gif");
		ImageIcon redIcon = new ImageIcon("bin\\iconColours\\redIcon.gif");
		ImageIcon greenIcon = new ImageIcon("bin\\iconColours\\greenIcon.gif");
		ImageIcon yellowIcon = new ImageIcon("bin\\iconColours\\yellowIcon.gif");
		ImageIcon magentaIcon = new ImageIcon(
				"bin\\iconColours\\magentaIcon.gif");
		ImageIcon blueIcon = new ImageIcon("bin\\iconColours\\blueIcon.gif");
		ImageIcon clearIcon = new ImageIcon("bin\\iconColours\\clearIcon.gif");
		// End Image Icons

		JFrame frame = new JFrame("Paint 2.0"); // sets title

		Container content = frame.getContentPane(); // Creates a Container

		content.setLayout(new BorderLayout()); // content layout style

		final Painter painter = new Painter(); // creates the paint program

		content.add(painter, BorderLayout.CENTER); // centers painter

		//
		// Creates the buttons with their events.

		JButton clearButton = new JButton(clearIcon);
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painter.clear();
			}// End actionPerformed
		});// end actionListener

		JButton redButton = new JButton(redIcon);
		redButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painter.red();
			}// End actionPerformed
		});// end actionListener

		JButton magentaButton = new JButton(magentaIcon);
		magentaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painter.magenta();
			}// End actionPerformed
		});// end actionListener

		JButton blueButton = new JButton(blueIcon);
		blueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painter.blue();
			}// End actionPerformed
		});// end actionListener

		JButton greenButton = new JButton(greenIcon);
		greenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painter.green();
			}// End actionPerformed
		});// end actionListener

		JButton yellowButton = new JButton(yellowIcon);
		yellowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painter.yellow();
			}// End actionPerformed
		});// end actionListener

		JButton blackButton = new JButton(blackIcon);
		blackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painter.black();
			}// End actionPerformed
		});// end actionListener

		// END BUTTON EVENTS
		//

		// set button sizes:
		clearButton.setPreferredSize(new Dimension(16, 16));
		blackButton.setPreferredSize(new Dimension(16, 16));
		magentaButton.setPreferredSize(new Dimension(16, 16));
		redButton.setPreferredSize(new Dimension(16, 16));
		blueButton.setPreferredSize(new Dimension(16, 16));
		greenButton.setPreferredSize(new Dimension(16, 16));
		yellowButton.setPreferredSize(new Dimension(16, 16));
		// End set button sizes

		// creates a JPanel
		JPanel panel = new JPanel();
		// Setting the size of the panel.
		panel.setPreferredSize(new Dimension(32, 68));
		panel.setMinimumSize(new Dimension(32, 68));
		panel.setMaximumSize(new Dimension(32, 68));
		// end Jpanel settings

		// adds the buttons to the panel
		panel.add(clearButton);
		panel.add(redButton);
		panel.add(magentaButton);
		panel.add(blueButton);
		panel.add(greenButton);
		panel.add(yellowButton);
		panel.add(blackButton);
		// end adding buttons

		// frame settings
		content.add(panel, BorderLayout.WEST); // sets the panel to the left.
		frame.setSize(700, 600); // sets the size of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes
		frame.setVisible(true);// Enables visible
		// end frame settings

	}// End main
}// End class
