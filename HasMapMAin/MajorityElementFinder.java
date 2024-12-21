import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
/*Major elelemt  finder  to find the most integer or elements that or 
 * element that appearing more than n/2 times
 * application know the majority of products sold to 
 * streamline marketing strategies and inventory management
 * Tracking inventory */

//buidling a search feature with a hash map to quickly retrieve word documents
public class MajorityElementFinder {
	public static int findElement(int[]arr)
	{
		HashMap<Integer, Integer>countProducts = new HashMap();
		int majorityThreshold = arr.length/2; //setting the majority
		//iterate through the array
		for (int num : arr)
		{
			//recording the counts
			countProducts.put(num, countProducts.getOrDefault(num,0)+1);
			//checking if any element exceeds the threshhol
			if(countProducts.get(num)> majorityThreshold)
			{
				return num;
			}
			
		}
		return -1;
		
		
	}
	public static HashMap<String, List<Integer>>BuildWordIndex(String []docs)
	{
		//Hashmap  to store word indices
		HashMap<String, List<Integer>>index = new HashMap<>();
		//iterate over each document in the array
		//and dissecting document into individual words
		for (int i = 0; i < docs.length; i++)
		{
			String [] words= docs[i].split(" ");
			for(String word: words)
			{
				// for every word we encounter ,we add it to the list or create a new one
				if(!word.isEmpty())
				{
					List<Integer>docIndices = index.getOrDefault(word, new ArrayList<>());
					//add the current document to the list
					docIndices.add(i);
					//put the word and its document back to the map
					index.put(word, docIndices);
				}
			}
			
		}
		return index;
	}

	public static void main(String[] args) {
		int arr[] = {2, 5, 6, 7, 8, 9,10,2};
				int majority = findElement(arr);
				if(majority != -1)
				{
					System.out.println("The majority element is "+ majority);
				}
				else
				{
					System.out.println("No majority element found");
				}
				
				System.out.println();
				//sample document array
		     String [] docs =
		    	 {
		    			 "You will be throw out",
		    			 "you still need some form of education to understand things",
		    			 "Just read alot of things"
		    	 };
		     //getting the index 
		     HashMap<String, List<Integer>>wordCount =  BuildWordIndex(docs);
		     System.out.println(wordCount);
		     
		
		}

}
