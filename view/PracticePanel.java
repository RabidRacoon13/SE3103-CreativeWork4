package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.PracticeEventListener;

public class PracticePanel {
	
	private JFrame window;

	private JTextField wordField = new JTextField();
	private JButton nextButton = new JButton("Next");
	private JButton clearButton = new JButton("Clear");
	private JButton enterButton = new JButton("Enter");
	private JButton exitButton = new JButton("Exit");
	private PracticeCanvas canvas;

	public PracticePanel(JFrame window){
		this.window = window;
		window.setTitle("ASL Practice");
	}

	public void init(){
		Container cp = window.getContentPane();

		canvas = new PracticeCanvas(this);
		cp.add(BorderLayout.CENTER, canvas);

		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(3,2));

		JLabel wordLabel = new JLabel("Word: ");
		southPanel.add(wordLabel);
		southPanel.add(wordField);
		southPanel.add(clearButton);
		southPanel.add(enterButton); 
		southPanel.add(nextButton);
		southPanel.add(exitButton);

		cp.add(BorderLayout.SOUTH, southPanel);

		PracticeEventListener listener = new PracticeEventListener(this);
		nextButton.addActionListener(listener);
		clearButton.addActionListener(listener);
		enterButton.addActionListener(listener);
		exitButton.addActionListener(listener);
		
	}

	public JButton getNextButton() {
		return nextButton;
	}

	public JTextField getWordField() {
		return wordField;
	}

	public JButton getClearButton() {
		return clearButton;
	}

	public JButton getEnterButton() {
		return enterButton;
	}

	public JButton getExitButton() {
		return exitButton;
	}

	public PracticeCanvas getCanvas() {
		return canvas;
	}

	public JFrame getWindow() {
		return window;
	}
}
