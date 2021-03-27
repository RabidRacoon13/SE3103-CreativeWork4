package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuScreen {
	
	private JFrame window;

	public MenuScreen(JFrame window){
		this.window = window;
	}

	public void init(){
		Container cp = window.getContentPane();

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(400, 200));
		panel.setLayout(new GridLayout(2, 1));

		JButton practiceButton = new JButton("Practice Mode");
		JButton quizButton = new JButton ("Quiz Mode");

		panel.add(practiceButton);
		panel.add(quizButton);

		cp.add(BorderLayout.CENTER, panel);

		practiceButton.addActionListener(e ->{
			window.getContentPane().removeAll();
			var menu = new PracticePanel(window);
			menu.init();
			window.pack();
			window.revalidate();
		});

		quizButton.addActionListener(e ->{
			window.getContentPane().removeAll();
			var menu = new QuizPanel(window);
			menu.init();
			window.pack();
			window.revalidate();
		});
	}
}
