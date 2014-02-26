import java.awt.BorderLayout;
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
	private JLabel title = new JLabel();
	private JPanel buttonPanel = new JPanel(new GridLayout(1, 1));
	JPanel northPanel = new JPanel(new GridLayout(1, 1));
	JPanel header = new JPanel(new GridLayout());

	public Paint() {

		JMenuBar menubar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem exit = new JMenuItem("Exit");
		JMenuItem clearAll = new JMenuItem("Clear");
		clearAll.setToolTipText("Clears the Window");
		exit.setToolTipText("Exit Paint");
		header.add(menubar);
		menubar.add(file);
		file.add(exit);
		file.add(clearAll);
		menubar.add(file);
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		clearAll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				repaint();
			}
		});
		add(header, BorderLayout.BEFORE_FIRST_LINE);
		add(northPanel, BorderLayout.CENTER);
		northPanel.add(title);
		northPanel.setBackground(Color.WHITE);
		northPanel.setPreferredSize(new Dimension(500, 400));
		northPanel.addMouseMotionListener(this);
		northPanel.addMouseListener(this);

		add(buttonPanel);
		buttonPanel.add(blackButton);
		buttonPanel.add(blueButton);
		buttonPanel.add(redButton);
		buttonPanel.add(greenButton);
		buttonPanel.add(eraseButton);

		blackButton.addActionListener(this);
		blueButton.addActionListener(this);
		redButton.addActionListener(this);
		eraseButton.addActionListener(this);
		greenButton.addActionListener(this);
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

	}

	public void mouseDragged(MouseEvent me) {
		Graphics g = getGraphics();
		x = me.getX() - 10;
		y = me.getY();
		g.setColor(getColor());
		g.fillOval(x + 5, y + 28, getXSize(), getYSize());

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		Graphics g = getGraphics();
		setXSize(5);
		setYSize(5);
		if (blackButton == ae.getSource()) {
			setColor(Color.BLACK);
		} else if (blueButton == ae.getSource()) {
			setColor(Color.BLUE);
		} else if (redButton == ae.getSource()) {
			setColor(Color.RED);
		} else if (greenButton == ae.getSource()) {
			setColor(Color.GREEN);
		} else if (eraseButton == ae.getSource()) {
			setXSize(20);
			setYSize(20);
			setColor(Color.WHITE);
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