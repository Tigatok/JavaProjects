import javax.swing.JFrame;

public class JokeDriver {
	public static void main(String[] args) {
		JFrame app = new JFrame();
		JokePanel rp = new JokePanel();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(rp);
		app.setSize(600, 200);
		app.setVisible(true);
	}
}