package model.word;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class PracticeWord extends Word{

	public PracticeWord(String word){
		super(word);
	}

	@Override
	public void render(Graphics2D g2, int imageIndex, int letterIndex) {
		g2.drawImage(getLetters().get(imageIndex), null, 0, 0);
		g2.setColor(Color.YELLOW);
		g2.setFont(new Font("Calibri", Font.BOLD, 125));
		String letter = Character.toString(getWord().charAt(letterIndex));
		g2.drawString(letter, 200, 475);
	}
	
}
