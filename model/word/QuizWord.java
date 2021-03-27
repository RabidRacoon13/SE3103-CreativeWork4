package model.word;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class QuizWord extends Word{
	
	public QuizWord(String word){
		super(word);
	}

	@Override
	public void render(Graphics2D g2, int imageIndex, int letterIndex) {
		g2.drawImage(getLetters().get(imageIndex), null, 0, 0);
		g2.setColor(Color.YELLOW);
		g2.setFont(new Font("Calibri", Font.BOLD, 65));
		String position = "Position: " + Integer.toString(letterIndex + 1);
		g2.drawString(position, 100, 475);
	}
}
