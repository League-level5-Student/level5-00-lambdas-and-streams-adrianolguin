package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaButtons {
	Random rand = new Random();
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");

	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);

		addNumbers.addActionListener(e -> {
			int i = rand.nextInt(10) + 1;
			int j = rand.nextInt(10) + 1;
			System.out.println(i + " + " + j + " = " + (i + j));
		});
		randNumber.addActionListener(e -> {
			System.out.println(rand.nextInt(10) + 1);
		});
		tellAJoke.addActionListener(e -> {
			System.out.println("look in the mirror");
		});

		// 1. Call the addActionListener methods for each button. Use lambdas
		// to define to functionality of the buttons.

		window.setVisible(true);
		window.pack();
	}

	public static void main(String[] args) {
		new LambdaButtons();
	}

}
