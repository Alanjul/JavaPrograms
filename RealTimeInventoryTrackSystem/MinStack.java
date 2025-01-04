import java.util.Stack;
/*Min stack class to keep track of dailing inventories in the store
 * and keep record the lightest item for easy retrieval*/
public class MinStack {
	//stack to keep track of inventor
	private Stack<Float>inventory = new Stack <>();
	//stock to store the lightest item
	private Stack<Float>min_item = new Stack<>();
	//Stores the lightest element brought in the store
	public void Push(float weight)
	{
		//push the item to min_item if it is empty and weight is less than or equal the
		// weight of the item on top
		if( min_item.empty() || weight <= min_item.peek())
		{
			min_item.push(weight);
		}
		//weight of incoming item is pushed to the inventor 
		inventory.push(weight);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack myStack = new MinStack();      
		myStack.Push(-2);
		myStack.Push(0);
		myStack.Push(-3);
        System.out.println(myStack.getMin());  // Expected Output: -3.0
        myStack.Pop();
        System.out.println(myStack.Top());    // Expected Output: 0
        System.out.println(myStack.getMin());  // Expected Output: -2.0

        myStack.Push(10);
        System.out.println(myStack.getMin());  // Expected Output:-2.0
        myStack.Push(-1);
        System.out.println(myStack.getMin());  // Expected Output: -2.0
		

	}
	public void Pop()
	{
		//when stack is not empty and the current element in stack is equal to item weight
		// min_item we pop it
		if (!inventory.isEmpty() && inventory.peek().equals(min_item.peek()))
				{
			       min_item.pop();
				}
		//pop the current item
		if (!inventory.isEmpty())
		{
			inventory.pop();
		}
	}
	//return the weight of top element
	//if empty return -1
	public float Top()
	{
		return inventory.isEmpty()?-1 : inventory.peek();
	}
	public float getMin()
	{
		//return min weight of the top element in min_item stack
		return min_item.isEmpty() ? -1 : min_item.peek();
	}

}
