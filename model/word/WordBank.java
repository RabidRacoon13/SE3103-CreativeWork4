package model.word;

import java.util.ArrayList;

public class WordBank {

	public static final ArrayList<QuizWord> QUIZ_WORDS = new ArrayList<>();
	
	public static QuizWord how;
	public static QuizWord now;
	public static QuizWord brown;
	public static QuizWord cow;
	public static QuizWord the;
	public static QuizWord cat;
	public static QuizWord jumped;
	public static QuizWord over;
	public static QuizWord moon;

	static{
		QUIZ_WORDS.add(how = new QuizWord("how"));
		QUIZ_WORDS.add(now = new QuizWord("now"));
		QUIZ_WORDS.add(brown = new QuizWord("brown"));
		QUIZ_WORDS.add(cow = new QuizWord("cow"));
		QUIZ_WORDS.add(the = new QuizWord("the"));
		QUIZ_WORDS.add(cat = new QuizWord("cat"));
		QUIZ_WORDS.add(jumped = new QuizWord("jumped"));
		QUIZ_WORDS.add(over = new QuizWord("over"));
		QUIZ_WORDS.add(moon = new QuizWord("moon"));
	}	

	public static ArrayList<QuizWord> getQuizWords() {
		return QUIZ_WORDS;
	}

}
