package atest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;
import java.util.StringTokenizer;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


import RandomSentences.Randomsentece;

class Test {
	
	
	private String[] article= {"the","a","one","some","any"};
    private String [] noun = {"boy","girl","dog","town","car"};
    private	String[] verb = { "drove", "jumped", "ran", "walked","skipped"};	   
    private String [] preposition = {"to", "from", "over", "under","on"};

	private Logger logger = Logger.getLogger(Randomsentece.class.toString());

	Randomsentece  wordGenerator;
	
	@BeforeEach
	void setUp() throws Exception {
		
		   
		wordGenerator = new Randomsentece();
	}

	@org.junit.jupiter.api.Test

		void testingObjectRefrence() {
		assertNotNull (wordGenerator);
			
		}
	
	@org.junit.jupiter.api.Test

		void articleArrayTest(){
		
			assertNotNull(wordGenerator.getArticle());
			assertEquals("the",wordGenerator.getArticle()[0]);
			assertEquals("a",wordGenerator.getArticle()[1]);
			assertEquals("one",wordGenerator.getArticle()[2]);
			assertEquals("some",wordGenerator.getArticle()[3]);
			assertEquals("any",wordGenerator.getArticle()[4]);

			
		}

	@org.junit.jupiter.api.Test

		void nounArrayTest(){
		
			assertNotNull(wordGenerator.getNoun());
			assertEquals("boy",wordGenerator.getNoun()[0]);
			assertEquals("girl",wordGenerator.getNoun()[1]);
			assertEquals("dog",wordGenerator.getNoun()[2]);
			assertEquals("town",wordGenerator.getNoun()[3]);
			assertEquals("car",wordGenerator.getNoun()[4]);

			
		}

	@org.junit.jupiter.api.Test

		void verbArrayTest(){
		
			assertNotNull(wordGenerator.getVerb());
			assertEquals("drove",wordGenerator.getVerb()[0]);
			assertEquals("jumped",wordGenerator.getVerb()[1]);
			assertEquals("ran",wordGenerator.getVerb()[2]);
			assertEquals("walked",wordGenerator.getVerb()[3]);
			assertEquals("skipped",wordGenerator.getVerb()[4]);
			
		}

	@org.junit.jupiter.api.Test

		void prepositionArrayTest(){
		
			assertNotNull(wordGenerator.getpreposition());
			assertEquals("to",wordGenerator.getpreposition()[0]);
			assertEquals("from",wordGenerator.getpreposition()[1]);
			assertEquals("over",wordGenerator.getpreposition()[2]);
			assertEquals("under",wordGenerator.getpreposition()[3]);
			assertEquals("on",wordGenerator.getpreposition()[4]);

			
		}
	
	@org.junit.jupiter.api.Test

	void getSentence() {
		for (int i =0; i < 20; i++) {
		String sentence = generateSentence();
		StringTokenizer  tokenizer = new StringTokenizer(sentence);
		assertEquals(6,tokenizer.countTokens());
		System.out.println( sentence);
		
	}	
	}
	
	@org.junit.jupiter.api.Test

	String generateSentence() {
		String space = " ";
		Random indexgenerator = new Random();
		int index = indexgenerator.nextInt(5);
		
		String word = article[index];
		char firstLetter =	Character.toUpperCase(word.charAt(0));	
		word = word.replace(word.charAt(0), firstLetter);
		StringBuilder sentence = new StringBuilder(word);
		
		sentence.append(space);	
		index = indexgenerator.nextInt(5);
		word = noun[index];
		sentence .append(word);
		sentence.append(space);	

		
		sentence.append(space);	
		index = indexgenerator.nextInt(5);
		word = verb[index];
		sentence .append(word);
		
		sentence.append(space);	
		index = indexgenerator.nextInt(5);
		word = preposition[index];
		sentence .append(word);
		
		sentence.append(space);	
		index = indexgenerator.nextInt(5);
		word = article[index];
		sentence .append(word);
		
		
		sentence.append(space);	
		index = indexgenerator.nextInt(5);
		word = noun[index];
		sentence .append(".");
		
		
		return sentence.toString();
		
		}
	}