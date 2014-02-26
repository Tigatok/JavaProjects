import javax.swing.JFrame;
public class PaintDriver {
    public static void main(String[] args) {
        JFrame myApp = new JFrame();
        Paint np = new Paint();
        myApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        myApp.add(np);
        myApp.setSize(300,150);
        myApp.setVisible(true);
    }
}
