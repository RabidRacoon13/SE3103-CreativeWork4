package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import model.word.Word;
import model.word.WordBank;


public class QuizCanvas extends JPanel{

	private QuizPanel panel;

	private Word word;

	private int wordIndex = -1;
	private int imageIndex = -1;
	private int letterIndex = -1;

	public QuizCanvas(QuizPanel panel){
		this.panel = panel;
		setPreferredSize(new Dimension(500, 500));
		setBackground(Color.BLACK);
	}

	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		if(wordIndex < 0){
			g2.setColor(Color.YELLOW);
			g2.setFont(new Font("Calibri", Font.BOLD, 35));
			g2.drawString(">>Press start to begin<<", 75, 175);;
		} else {
			word = WordBank.QUIZ_WORDS.get(wordIndex);
			word.render(g2, imageIndex, letterIndex);
		}
	}

	public void difficulty(){
		try {
			java.util.concurrent.TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void incrementImageIndex(){
		imageIndex++;
	}

	public void incrementWordIndex(){
		wordIndex++;
	}

	public int getWordIndex() {
		return wordIndex;
	}

	public void setWordIndex(int wordIndex) {
		this.wordIndex = wordIndex;
	}

	public int getLetterIndex() {
		return letterIndex;
	}

	public void setLetterIndex(int letterIndex) {
		this.letterIndex = letterIndex;
	}

	public void incrementLetterIndex(){
		letterIndex++;
	}

	public int getImageIndex() {
		return imageIndex;
	}

	public void setImageIndex(int imageIndex) {
		this.imageIndex = imageIndex;
	}
	
	public Word getWord() {
		return word;
	}
}
