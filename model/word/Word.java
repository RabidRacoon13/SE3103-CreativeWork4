package model.word;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import model.image.ImageBank;

public abstract class Word implements IWord{
	
	private String word;
	private char[] arrayWord;
	private ArrayList<BufferedImage> letters = new ArrayList<>();
	
	public Word(String word){
		this.word = word.toUpperCase();
		arrayWord = word.toUpperCase().toCharArray();
		getImage();
	}

	public void getImage(){
		for(var w: arrayWord){
			if(w == 'A') letters.add(ImageBank.A);
			if(w == 'B') letters.add(ImageBank.B);
			if(w == 'C') letters.add(ImageBank.C);
			if(w == 'D') letters.add(ImageBank.D);
			if(w == 'E') letters.add(ImageBank.E);
			if(w == 'F') letters.add(ImageBank.F);
			if(w == 'G') letters.add(ImageBank.G);
			if(w == 'H') letters.add(ImageBank.H);
			if(w == 'I') letters.add(ImageBank.I);
			if(w == 'J') letters.add(ImageBank.J);
			if(w == 'K') letters.add(ImageBank.K);
			if(w == 'L') letters.add(ImageBank.L);
			if(w == 'M') letters.add(ImageBank.M);
			if(w == 'N') letters.add(ImageBank.N);
			if(w == 'O') letters.add(ImageBank.O);
			if(w == 'P') letters.add(ImageBank.P);
			if(w == 'Q') letters.add(ImageBank.Q);
			if(w == 'R') letters.add(ImageBank.R);
			if(w == 'S') letters.add(ImageBank.S);
			if(w == 'T') letters.add(ImageBank.T);
			if(w == 'U') letters.add(ImageBank.U);
			if(w == 'V') letters.add(ImageBank.V);
			if(w == 'W') letters.add(ImageBank.W);
			if(w == 'X') letters.add(ImageBank.X);
			if(w == 'Y') letters.add(ImageBank.Y);
			if(w == 'Z') letters.add(ImageBank.Z);
		}
	}

	public ArrayList<BufferedImage> getLetters() {
		return letters;
	}

	public String getWord() {
		return word;
	}

	public char[] getArrayWord() {
		return arrayWord;
	}
}
