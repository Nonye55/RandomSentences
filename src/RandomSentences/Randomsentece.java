package RandomSentences;

import java.util.StringTokenizer;


//create a sentence from each arry
//generate a rndm number
//firstword should begin with a cpital letter
//add words to sentence
//separate with space
//end it with a priod
//generate 20 words

public class Randomsentece {
   private String[] article= {"the","a","one","some","any"};
   private String [] noun = {"boy","girl","dog","town","car"};
   private	String[] verb = { "drove", "jumped", "ran", "walked","skipped"};	   
   private String [] preposition = {"to", "from", "over", "under","on"};
   
   private String sentence = "tolu lope";
   
   
	public String [] getArticle() {
	
		return article;
	}


	public String[] getNoun() {
		
		return noun;
	}


	public String[] getVerb() {
		return verb;
	}


	public String[] getpreposition() {
		return preposition;
	}


	public String getSentence() {
		return sentence;
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
