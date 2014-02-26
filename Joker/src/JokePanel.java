import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JokePanel extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L; // Alan, what does this do?

	private int count = 0;
	private Joke[] jokes;

	private JLabel title = new JLabel("The Joker", JLabel.CENTER);
	private JLabel jokeQuestion = new JLabel("Click Next to start the Joker",
			JLabel.CENTER);
	private JLabel jokeAnswer = new JLabel(" ", JLabel.CENTER);

	private JButton previousButton = new JButton("Previous");
	private JButton nextButton = new JButton("Next");
	private JButton randomButton = new JButton("Random");
	private JButton punchlineButton = new JButton("Punchline");

	private JPanel buttonPanel = new JPanel();
	GridLayout gl = new GridLayout(4, 1);

	public JokePanel() {
		setLayout(gl);

		title.setBackground(Color.BLACK);
		title.setOpaque(true);
		title.setForeground(Color.WHITE);
		add(title);

		jokeQuestion.setForeground(Color.BLACK);
		jokeQuestion.setOpaque(true);
		jokeQuestion.setBackground(Color.ORANGE);
		add(jokeQuestion);

		jokeAnswer.setOpaque(true);
		jokeAnswer.setBackground(Color.ORANGE);
		add(jokeAnswer);

		buttonPanel.setBackground(Color.ORANGE);
		buttonPanel.add(previousButton);
		buttonPanel.add(nextButton);
		buttonPanel.add(randomButton);
		buttonPanel.add(punchlineButton);
		add(buttonPanel);

		nextButton.addActionListener(this);
		previousButton.addActionListener(this);
		randomButton.addActionListener(this);
		punchlineButton.addActionListener(this);

		punchlineButton.setEnabled(false);
		randomButton.setEnabled(false);
		previousButton.setEnabled(false);

		loadJokes();

		System.out.println(count);

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g); // Does not really matter.
	}

	private void loadJokes() {
		String jokeFile = "C:\\COSC121\\jokes.txt";
		JokeList jl = new JokeList(jokeFile);
		jokes = jl.getJokeArray();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		int endCount = 0;
		int firstIndex = 0;
		for (int i = firstIndex; i < jokes.length; i++) {
			endCount++;
		}

		punchlineButton.setEnabled(true);
		randomButton.setEnabled(true);
		previousButton.setEnabled(true);

		if (nextButton == ae.getSource()) {
			jokeAnswer.setText("");

			if (count == endCount) {
				count = firstIndex;
			}

			jokeQuestion.setText((count + 1) + ". " + jokes[count].getSetup());
			count++;

			if (count == endCount) {
				count = firstIndex;
			}

			// System.out.println(count);

		} else if (previousButton == ae.getSource()) {
			jokeAnswer.setText("");

			if (count == firstIndex) {
				jokeQuestion.setText((count + 9) + ". " + jokes[9].getSetup());
				count = endCount;
			}

			if (count == firstIndex + 1) {
				count = endCount + 1;
			}

			jokeQuestion.setText((count - 1) + ". "
					+ jokes[count - 2].getSetup());

			count--;
			// System.out.println(count);

		} else if (randomButton == ae.getSource()) {

			jokeAnswer.setText("");
			int ranCount = ((int) (Math.random() * 10) + 1);
			jokeQuestion.setText((ranCount) + ". "
					+ jokes[ranCount - 1].getSetup());
			// System.out.println(ranCount);
			count = ranCount;

		} else if (punchlineButton == ae.getSource()) {

			if (count == firstIndex) {
				jokeAnswer.setText(jokes[endCount - 1].getPunchline());
				return;
			}

			jokeAnswer.setText(jokes[count - 1].getPunchline());
		}
	}
}