import java.util.HashMap;
import java.util.Stack;
import java.util.HashSet;
/*In this problem, we find the height for 
 * the closest preceding smallest peek
 * similar to analyzing daily temperature over several days with interest
 * in finding the last cooler day you examined.
 * Interested in just seeking for small number before the next in an array
 * This done by using stack data structure by push peaks into our stack
 **/
public class FindTheShorterPeak {
   public static int[] findTheSmallestElement(int[]arr)
   {
	   //create an array to store result and initialize it with the length of the array
	   int[] result = new int[arr.length];
	   
	   //create stack to keep track of the smallest elements encountered
	   Stack<Integer>stack = new Stack<>();
	   //loop through the array
	   for (int i = 0; i < arr.length; i++)
	   {
		   //check if we encounter any element in the stack that is greater 
		   //or equal to current item in array, we pop that element
		   while (!stack.empty() && stack.peek()>= arr[i])
		   {
			   stack.pop();
		   }
		   //if stack is empty we initialize result with -1 or the top element in stack
		   result[i] = stack.empty() ? -1 : stack.peek();
		   //Before moving on, we push current element in the array on stack
		   stack.push(arr[i]);
	   }
	   return result;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 7, 1, 5, 4, 3};
        int[] result = findTheSmallestElement(arr);
        for (int n : result) {
            System.out.print(n + " ");
        }

	}

}
