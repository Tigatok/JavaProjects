/*
 * TO-DO:
 * 1. Add size of the brush to the panel --Done Tyler
 * 2. perhaps make buttons into an array of buttons?\
 * 3. Make it so that the border on the bottom gets repainted so we cant go out of the border.
 * 4. Add save functionality
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Paint extends JPanel implements MouseListener,
		MouseMotionListener, ActionListener {

	private static final long serialVersionUID = 1L;
	private int x, y, xSize = 5, ySize = 5;
	private Color color;
	private JButton blackButton = new JButton("Black");
	private JButton blueButton = new JButton("Blue");
	private JButton eraseButton = new JButton("Eraser");
	private JButton redButton = new JButton("Red");
	private JButton greenButton = new JButton("Green");
	private JButton yellowButton = new JButton("Yellow");
	private JButton smallButton = new JButton("Small");
	private JButton medButton = new JButton("Medium");
	private JButton largeButton = new JButton("Large");
	private JLabel title = new JLabel();
	private JPanel sizePanel = new JPanel(new GridLayout(1, 1, 1, 1));
	private JPanel colorPanel = new JPanel(new GridLayout(1, 1, 1, 1));
	private JPanel northPanel = new JPanel(new GridLayout(1, 1, 1, 1));
	private JPanel header = new JPanel(new GridLayout());
	private JMenuBar menubar = new JMenuBar();
	private JMenu file = new JMenu("File");
	private JMenuItem exit = new JMenuItem("Exit");
	private JMenuItem clearAll = new JMenuItem("Clear");

	public Paint() {
		// Adds the menu bar
		add(header);
		header.add(menubar);
		menubar.add(file);
		file.add(exit);
		file.add(clearAll);
		clearAll.setToolTipText("Clears the Window");
		exit.setToolTipText("Exit Paint");

		// Adds the header
		add(northPanel);
		northPanel.add(title);
		northPanel.setBackground(Color.WHITE);
		northPanel.setPreferredSize(new Dimension(500, 400));
		northPanel.addMouseMotionListener(this);
		northPanel.addMouseListener(this);

		// Colour Buttons
		add(colorPanel);
		colorPanel.add(blackButton);
		colorPanel.add(blueButton);
		colorPanel.add(redButton);
		colorPanel.add(greenButton);
		colorPanel.add(yellowButton);
		colorPanel.add(eraseButton);

		// TO-DO: Size Buttons
		add(sizePanel);
		sizePanel.add(smallButton);
		sizePanel.add(medButton);
		sizePanel.add(largeButton);

		// Adds the listeners for the buttons, and the File Menu
		// Colour actions
		blackButton.addActionListener(this);
		blueButton.addActionListener(this);
		redButton.addActionListener(this);
		eraseButton.addActionListener(this);
		greenButton.addActionListener(this);
		yellowButton.addActionListener(this);

		// Size actions
		smallButton.addActionListener(this);
		medButton.addActionListener(this);
		largeButton.addActionListener(this);

		// File actions
		exit.addActionListener(this);
		clearAll.addActionListener(this);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

	}

	public void setColor(Color c) {
		color = c;
	}

	public Color getColor() {
		return color;
	}

	public void setXSize(int x) {
		xSize = x;
	}

	public void setYSize(int y) {
		ySize = y;
	}

	public int getXSize() {
		return xSize;
	}

	public int getYSize() {
		return ySize;
	}

	public void mouseClicked(MouseEvent me) {
		Graphics g = getGraphics();
		x = me.getX() - 10;
		y = me.getY();
		g.setColor(getColor());
		g.fillOval(x + 5, y + 28, getXSize(), getYSize());
		colorPanel.repaint();
		sizePanel.repaint();

	}

	public void mouseDragged(MouseEvent me) {
		Graphics g = getGraphics();
		x = me.getX() - 10;
		y = me.getY();
		g.setColor(getColor());
		g.fillOval(x + 5, y + 28, getXSize(), getYSize());
		colorPanel.repaint();
		sizePanel.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		Graphics g = getGraphics();

		// Color actions
		if (blackButton == ae.getSource()) {
			setColor(Color.BLACK);
		} else if (blueButton == ae.getSource()) {
			setColor(Color.BLUE);
		} else if (redButton == ae.getSource()) {
			setColor(Color.RED);
		} else if (greenButton == ae.getSource()) {
			setColor(Color.GREEN);
		} else if (yellowButton == ae.getSource()) {
			setColor(Color.YELLOW);
		} else if (eraseButton == ae.getSource()) {
			setColor(Color.WHITE);
		}
		// File actions
		else if (clearAll == ae.getSource()) {
			repaint();
		} else if (exit == ae.getSource()) {
			System.exit(0);
		}

		// Size actions
		else if (smallButton == ae.getSource()) {
			setXSize(5);
			setYSize(5);
		} else if (medButton == ae.getSource()) {
			setXSize(15);
			setYSize(15);
		} else if (largeButton == ae.getSource()) {
			setXSize(25);
			setYSize(25);
		}
	}

	public void mousePressed(MouseEvent me) {
	}

	public void mouseReleased(MouseEvent me) {
	}

	public void mouseEntered(MouseEvent me) {
	}

	public void mouseExited(MouseEvent me) {
	}

	public void mouseMoved(MouseEvent me) {
	}

}