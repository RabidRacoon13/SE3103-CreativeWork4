package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import model.word.PracticeWord;
import view.MenuScreen;
import view.PracticePanel;

public class PracticeEventListener implements ActionListener{
	
	private PracticePanel panel;

	public PracticeEventListener(PracticePanel panel){
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

		if(e.getSource() == panel.getEnterButton()){
			if(panel.getWordField().getText().toString().length() > 0){
				PracticeWord word = new PracticeWord(panel.getWordField().getText().toString());
				panel.getCanvas().setWord(word);
				panel.getCanvas().setLetterIndex(0);
				panel.getCanvas().setImageIndex(0);
				panel.getCanvas().repaint();
			}
		}

		if(e.getSource() == panel.getClearButton()){
			panel.getWordField().setText("");
			panel.getCanvas().setLetterIndex(-1);
			panel.getCanvas().setImageIndex(-1);
			panel.getCanvas().setWord(null);
			panel.getCanvas().repaint();
		}

		if(e.getSource() == panel.getNextButton()){
			if(panel.getCanvas().getLetterIndex() == -1){
				return;
			}
			panel.getCanvas().incrementLetterIndex();
			panel.getCanvas().incrementImageIndex();
			if(panel.getCanvas().getLetterIndex() > panel.getCanvas().getWord().getWord().length() - 1){
				panel.getCanvas().setLetterIndex(0);
				panel.getCanvas().setImageIndex(0);
			}
			panel.getCanvas().repaint();
		}
		
	}
}
