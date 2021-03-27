package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import model.word.Word;

public class PracticeCanvas extends JPanel{
	
	private PracticePanel panel;
	private Word word;
	private int letterIndex = -1;
	private int imageIndex = -1;

	public PracticeCanvas(PracticePanel panel){
		this.panel = panel;
		setPreferredSize(new Dimension(500, 500));
		setBackground(Color.BLACK);
	}

	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		if(letterIndex < 0){
			g2.setColor(Color.YELLOW);
			g2.setFont(new Font("Calibri", Font.BOLD, 25));
			g2.drawString(">>Enter a word to see the signs<<", 75, 250);;
		} else {
			word.render(g2, imageIndex, letterIndex);
		}
	}

	public void setWord(Word word) {
		this.word = word;
	}

	public Word getWord() {
		return word;
	}

	public int getLetterIndex() {
		return letterIndex;
	}

	public void setLetterIndex(int letterIndex) {
		this.letterIndex = letterIndex;
	}

	public int getImageIndex() {
		return imageIndex;
	}

	public void setImageIndex(int imageIndex) {
		this.imageIndex = imageIndex;
	}

	public void incrementLetterIndex(){
		letterIndex++;
	}

	public void incrementImageIndex(){
		imageIndex++;
	}

}
