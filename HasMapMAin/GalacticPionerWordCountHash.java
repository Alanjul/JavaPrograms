import java.util.Scanner;
import java.util.HashMap;
/*Listen up, Galactic Pioneer! We have quite a mission ahead. 
 * Imagine you're a wordsmith astronaut needing to catalog 
 * words in alien languages. We'd create a tool - a HashMap! 
 * It maps unique words in any sentence to their frequency of 
 * appearance. 
 * Just like you'd document "blorp" shows up 3 times to know it's a
 *  common word. Here's a friendly rubric: Create a function taking
 *   a sentence as input (a string of English words separated by spaces,
 *    could be empty) and returning a HashMap. 
 *    Each key is a unique word (case insensitive),
 *  and its value is the count of how often it appeared. Impressive, eh?*/
public class GalacticPionerWordCountHash {
	
 public static HashMap<String, Integer>CreateWords(String sentence)
 {
	 //creating a hashmap of words to store words frequencies
	 HashMap<String,Integer>index = new HashMap<>();
	 //checking if the sentence is empty
	 
		 if (sentence == null ||  sentence.isEmpty())
		 {
			 return index;//return empty map
		 }
		 //handles case sentences and splits the words and handling case sensitivity
		 String []words = sentence.toLowerCase().split("\\s+");
		 for (String word: words)
		 {
			 //Skip the string if it is empty
			 if(!word.isEmpty())
			 {
				 //adds the word to the map and their frequency
				 index.put(word, index.getOrDefault(word, 0)+1);
			 }
		 }
	 
	 
	 
	 return index; // return the hashmap
 }
 public static void main(String[]args)
 {
	 String sentence1= "Hello Hello world world world";//first sentence
	 HashMap<String,Integer> index1 = CreateWords(sentence1);
	 index1.forEach((k,v) -> System.out.println("(" + k + " -> " + v + " )"));
	 System.out.println("--------");
	 
	 String sentence2 = " "; //testing with an empty string
	 HashMap<String, Integer>index2 = CreateWords(sentence2);
	 index2.forEach((k,v) -> System.out.println("(" + k + " -> " + v +  " )" ));
	 System.out.println("2nd Test--------");
	 
	 String sentence3 = "Quick Quick brown fox jumps over the lazy dog";
     HashMap<String, Integer> index3 = CreateWords(sentence3);
     index3.forEach((k, v) -> System.out.println("(" + k + " -> " + v + ")")); 
     
     System.out.println("3rd----");
 }
}
