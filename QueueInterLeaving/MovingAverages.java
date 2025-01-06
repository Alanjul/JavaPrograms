import java.util.Queue;
import java.util.LinkedList;
/*sliding window problem for the moving averages
 * This problems demostrates quick decision like stock trader
 * analyzing price movement for quick buying and selling
 * The class Moving averages calculates the averages of the
 * last k items in a stream of data
 * It can also be used by a user tracking average heart rate reading over last 
 * ten minutes*/
public class MovingAverages {
	private int size; //holds the size
	private Queue<Integer> window; // tracking the numbers
	private double sum ; //holds the sums
	//constructor to initialize the attributes
	public MovingAverages(int size)
	{
		this.size = size;
		this.window = new LinkedList<>();
		this.sum =0.0;
	}
	//calculate next after reaching the maximum
	public double next(int value)
	{
		if (window.size() == size)
		{
			//remove the oldest element and subtract it from sum
			sum-= window.poll();//poll removes and returns the first element in queue
			}
		//add new value
		this.window.add(value);
		this.sum += value; 
		//return average
		return (this.sum/ window.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovingAverages m = new MovingAverages(3);
        System.out.println(m.next(1)); // returns 1.0 (like a single heart rate reading)
        System.out.println(m.next(10)); // returns 5.5 (the average after a short burst of activity)
        System.out.println(m.next(3)); // returns 4.66667 (normalizing after the burst)
        System.out.println(m.next(5)); // returns 6.0 (the most recent average, taking 
        //into account the last three readings)
	}

}
