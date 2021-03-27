package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.QuizEventListener;


public class QuizPanel {

	private JFrame window;

	private QuizCanvas canvas;

	private JButton startButton = new JButton("Start");
	private JButton nextButton = new JButton("Next");
	private JButton enterButton = new JButton("Enter");
	private JButton exitButton = new JButton("Exit");
	
	private JLabel answerLabel = new JLabel("Answer: ");
	private JTextField answerTextField = new JTextField();

	public QuizPanel(JFrame window){
		this.window = window;
		window.setTitle("ASL Quiz");
	}
	
	public void init(){
		Container cp = window.getContentPane();

		canvas = new QuizCanvas(this);
		cp.add(BorderLayout.CENTER, canvas);

		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(3, 2));

		cp.add(BorderLayout.SOUTH, southPanel);

		southPanel.add(startButton);
		southPanel.add(nextButton);
		southPanel.add(answerLabel);
		southPanel.add(answerTextField);
		southPanel.add(exitButton);
		southPanel.add(enterButton);

		QuizEventListener listener = new QuizEventListener(this);
		startButton.addActionListener(listener);
		nextButton.addActionListener(listener);
		exitButton.addActionListener(listener);
		enterButton.addActionListener(listener);
	}

	public JButton getEnterButton() {
		return enterButton;
	}

	public JButton getNextButton() {
		return nextButton;
	}

	public JTextField getAnswerTextField() {
		return answerTextField;
	}

	public JButton getExitButton() {
		return exitButton;
	}

	public JButton getStartButton() {
		return startButton;
	}

	public JFrame getWindow() {
		return window;
	}

	public QuizCanvas getCanvas() {
		return canvas;
	}
}
