import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;

public class Painter extends JComponent {
	private static final long serialVersionUID = 1L;
	Image image;// The image that we draw on.
	Graphics2D g2D;// This is what we use to draw on.
	int currentX, currentY, oldX, oldY; // mouse coords

	// Constructors:
	public Painter() {
		setDoubleBuffered(false);
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				// If the mouse is pressed, it sets the old x and old y
				// coordinates as the mouses x and y
				oldX = e.getX();
				oldY = e.getY();
			}// End mouse Pressed
		});// End MouseListener
			// while the mouse is dragged it sets CurrentX and currentY as the
			// mouses x and y
			// then it draws a line at the coordinates
			// it repaints it and sets oldX and oldY as currentX and currentY\

		addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
				currentX = e.getX();
				currentY = e.getY();
				g2D.drawLine(oldX, oldY, currentX, currentY);
				repaint();
				oldX = currentX;
				oldY = currentY;
			}// End MouseDragged

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub

			}// End MouseMoved
		}); // End MouseMotionListener
	}// End Painter

	// This is the painting bit
	// if it has nothing on it then
	// it creates an image the size of the window
	// sets the value of Graphics as the image
	// sets the rendering
	// runs the clear() method
	// then it draws the image
	public void paintComponent(Graphics g) {
		if (image == null) {
			image = createImage(getSize().width - 20, getSize().height - 20);
			g2D = (Graphics2D) image.getGraphics();
			g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			clear();
		}
		g.drawImage(image, 0, 0, null);
	}

	// This is the clear
	// it sets the color to white
	// then it fills the window with white
	// then it sets the color back to black
	public void clear() {
		g2D.setPaint(Color.white);
		g2D.fillRect(0, 0, getSize().width, getSize().height);
		g2D.setPaint(Color.black);
		repaint();
	}// end clear

	// this is the red paint
	public void red() {
		g2D.setPaint(Color.red);
		repaint();
	}// end red paint

	// black paint
	public void black() {
		g2D.setPaint(Color.black);
		repaint();
	}// end black paint

	// magenta paint
	public void magenta() {
		g2D.setPaint(Color.magenta);
		repaint();
	}// End magenta paint

	// blue paint
	public void blue() {
		g2D.setPaint(Color.blue);
		repaint();
	}// end blue paint

	// Green paint
	public void green() {
		g2D.setPaint(Color.green);
		repaint();
	}// end green paint

	// Yellow paint
	public void yellow() {
		g2D.setPaint(Color.yellow);
		repaint();
	}// end Yellow Paint

}// end class