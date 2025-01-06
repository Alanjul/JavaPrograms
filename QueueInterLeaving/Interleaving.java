//import packages
import java.util.LinkedList;
import java.util.Queue;
/*Queues are excellent for managing sequential process
 * and managing streaming data
 * The class interLeaving involves computational task to
 * perform alternating pattern such as merging from two lanes into a single lane
 *  ensuring each car takes its turn on the righ lane
 *  Demostrated using two auxiliary queue,
 *   we dequene two queues and enqueue them into a single original queue*/
public class Interleaving {

	public static void main(String[] args) {
		//origin numbers of cars
		Queue<Integer>queue = new LinkedList<>();
		for (int i = 1; i < 15; i++)
		{
			queue.add(i);
		}
		
		//first half holding the 1st lane of cars numbered as integers
		Queue<Integer>lane1 = new LinkedList<>();
		Queue<Integer>lane2 = new LinkedList<>();
		
		//distributing all cars from the origin queue into two different queues 
		int n = queue.size();
		while(queue.size() >n/2)
		{
			lane1.add(queue.remove());
		}
		System.out.println("cars in 1st lane" + lane1);
		//checking if queue is empty
		while(!queue.isEmpty())
		{
			lane2.add(queue.remove());
		}
		System.out.println("cars in 1st lane" + lane2);
	//after both group of cars are lined up in their respective lanes
	//we merge them into one lane
	while ( !lane1.isEmpty() || !lane2.isEmpty())
	{
		//puting the car in lane 1
		if (!lane1.isEmpty())
		{
			queue.add(lane1.remove()); //merge car in lane1 into queue
		}
		if (!lane2.isEmpty())
		{
			queue.add(lane2.remove());//add car in lane2  to the queue
		}
	}
	System.out.println("my new lane is " + queue);
		


	}

}
