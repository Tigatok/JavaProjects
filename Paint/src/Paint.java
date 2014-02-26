import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Paint extends JPanel implements MouseListener,
MouseMotionListener {
    
    private int x=0, y=0, xSize, ySize;
    private Color color, bg;
    private JButton blackButton;
    


    public Paint(){

        bg = Color.WHITE;      //Sets bg to white
        color = color.BLACK; //sets default to black
        
    
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        addMouseMotionListener(this);
        addMouseListener(this);
        setBackground(bg);
    }

    public void setColor(Color c) {
        color = c;
    }
    
    public void setXSize(int x) {
        xSize = x;
    }

    public void setYSize(int y) {
        ySize = y;
    }

    public Color getColor() {
        return color;
    }
    
    public int getXSize() {
        return xSize;
    }

    public int getYSize() {
        return ySize;
    }

    public void mouseClicked(MouseEvent me) {
        Graphics g = getGraphics();
        x = me.getX();
        y = me.getY();
        g.setColor(getColor());
        g.fillRect(x, y, getXSize(), getYSize());
    }

    public void mouseDragged(MouseEvent me) {
        Graphics g = getGraphics();
        x = me.getX();
        y = me.getY();
        g.setColor(getColor());
        g.fillRect(x, y, getXSize(), getYSize());
    }

    public void mousePressed(MouseEvent me) { }
    public void mouseReleased(MouseEvent me) { }
    public void mouseEntered(MouseEvent me) { }
    public void mouseExited(MouseEvent me) { }
    public void mouseMoved(MouseEvent me) { }
}