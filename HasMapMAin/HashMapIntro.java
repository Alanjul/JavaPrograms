import java.util.HashMap;
import java.util.Scanner;
//This program introduces the basis of hash maps
public class HashMapIntro {
	/*Importance of  hashmaps
	 * aids in handling pairs of data efficiently
	 * Transforms complex tasks into straightforward one
	 * Pratical applications: organizing a cookbook tallying votes, tracking inventory
	 * Analyzing word usage
	 * Develop a feature for text -edutor for feedback
	 * hashmap with it;s getOrDefault function*/

	public static void main(String[] args) {
		//scanner method
		Scanner input = new Scanner(System.in);
		
		//create keys
		//product to track inventories in the store
		HashMap<String, Integer>products= new HashMap<>();
		
		//word count to store words and their corresponding frequencies
		HashMap<String, Integer>wordCount = new HashMap<>();
		System.out.print("Enter a text and count how many words used: ");
		String text = input.nextLine();
		
		//break the text into different word
		String[] words = text.split(" ");
		
		//update the hashmap using the getorDefault to fetch the current count of the word and add 1
		//if the key is not in the map asiigns it with 0
		for (String word : words)
		{
			wordCount.put(word, wordCount.getOrDefault(word,0)+1);
		}
		System.out.println(wordCount);
		
		/*//adding values to hash Maps
		//myMap.put(1, "John");
		//myMap.put(3, "Alan");
		
		//displaying the hashmap
		System.out.println("The hash map displays " + myMap);
		
		//remove element from the hashmaps
		//myMap.remove(1);
		//System.out.println("The hash map displays after removing 1 elements " + myMap);*/
		
		//adding producs and their quantity to product hashmap
		products.put("Rice", 5);
		products.put("beans", 6);
		products.put("Greens", 10);
		products.put("Milk", 15);
		products.put("apple Juice", 20);
		int sum = 0;
		//iterating over product values to get the number of products in the store
		for(int value: products.values())
		{
			sum += value;
		}
	System.out.println(sum);//gives the number of producst

	}

}
