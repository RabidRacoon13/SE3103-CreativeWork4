package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.word.Word;
import model.word.WordBank;
import view.MenuScreen;
import view.QuizPanel;

public class QuizEventListener implements ActionListener{

	private QuizPanel panel;

	public QuizEventListener(QuizPanel panel){
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == panel.getExitButton()){
			JFrame window = panel.getWindow();
			window.getContentPane().removeAll();
			var menu = new MenuScreen(window);
			menu.init();
			window.pack();
			window.revalidate();
		}

		if(e.getSource() == panel.getStartButton()){
			if(panel.getCanvas().getWordIndex() == -1){
				panel.getCanvas().setWordIndex(0);
				panel.getCanvas().setImageIndex(0);
				panel.getCanvas().setLetterIndex(0);
				panel.getCanvas().repaint();
			} else if(panel.getCanvas().getWordIndex() >= 0){
				return;
			}
		}

		if(e.getSource() == panel.getNextButton()){
			panel.getCanvas().incrementImageIndex();
			panel.getCanvas().incrementLetterIndex();
			if(panel.getCanvas().getWordIndex() == -1){
				return;
			}
			else if(panel.getCanvas().getImageIndex() > panel.getCanvas().getWord().getWord().length() - 1){
				panel.getCanvas().setLetterIndex(0);
				panel.getCanvas().setImageIndex(0);
			}
			panel.getCanvas().repaint();
		}
		
		if(e.getSource() == panel.getEnterButton()){
			if( panel.getAnswerTextField().getText().toString().length() > 0) {
				String answer = panel.getAnswerTextField().getText().toString().toUpperCase().trim();
				Word word = WordBank.QUIZ_WORDS.get(panel.getCanvas().getWordIndex());
				if(word.getWord().equals(answer)){
					JOptionPane.showMessageDialog(panel.getWindow(), "Correct!");
					panel.getCanvas().incrementWordIndex();
					panel.getCanvas().setImageIndex(0);
					panel.getCanvas().setLetterIndex(0);
					if(panel.getCanvas().getWordIndex() > WordBank.QUIZ_WORDS.size() - 1){
						panel.getCanvas().setWordIndex(0);
					}
					panel.getAnswerTextField().setText("");
				} else {
					JOptionPane.showMessageDialog(panel.getWindow(), "Sorry, that is Incorrect.");
					panel.getAnswerTextField().setText("");
				}
			}
			else{
				return;
			}
			
			panel.getCanvas().repaint();
		}
		
	}
	
}
