import java.util.*;
/*
 * n this task, you’re commanding a fleet represented by a Java Queue of integers, 
 * and you're tasked with simulating a journey where every alternate ship, 
 * starting from the first (Index 0), hides in hyperspace. 
 * The goal is to create two new queues: one for the ships 
 * that travel into hyperspace (every alternate ship) and another 
 * for the remaining ships. You start by polling the ships from the 
 * original queue and checking whether their index is even or odd. 
 * Ships at even indices will go into the hyperspace queue, while ships at
 *  odd indices will go into the second queue. At the end, you’ll have two queues,
 *   one holding every alternate ship (e.g., [1, 3, 5]) 
 *  and the other holding the ships that were left behind (e.g., [2, 4, 6])*/
public class Solution {
	
	public static Queue<Integer> everyAlter(Queue<Integer> queue) {
        Queue<Integer> newQueue = new LinkedList<>();
        Queue<Integer> new2 = new LinkedList<>();
        int i = 0;
        

        // TODO: fill in new queue
       
        while(!queue.isEmpty()) //taking every alternating element
        {
            Integer current = queue.poll();//remove and get every head in the queue
            if ( i % 2 == 0)
            {
                newQueue.add(current);
            }
            i++; //increment i
            }
            return newQueue;
        }


	public static void main(String[] args) {
		//test cases
		 Queue<Integer> queue1 = new LinkedList<>();
	        queue1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
	        queue1 = everyAlter(queue1);
	        System.out.println(queue1); // Expected Output: [1, 3, 5]
	
	        // test case 2
	        Queue<Integer> queue2 = new LinkedList<>();
	        queue2.addAll(Arrays.asList(1, 2));
	        queue2 = everyAlter(queue2);
	        System.out.println(queue2); // Expected Output: [1]

	        // test case 3
	        Queue<Integer> queue3 = new LinkedList<>();
	        queue3.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
	        queue3 = everyAlter(queue3);
	        System.out.println(queue3); // Expected Output: [1, 3, 5, 7]
	}

}
