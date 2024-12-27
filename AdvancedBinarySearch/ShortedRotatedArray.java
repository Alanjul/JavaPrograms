/*Looking for an oldest book from a 
 * collection of books arranged by publish date with some shifted to right*/
public class ShortedRotatedArray {
	public static int findBook(int []publishDate)
	{
		int left =0, right = publishDate.length-1;
		//using binary search to find the element
		while(left < right)
		{
			//checking if the smallest element is at right of the mid
			//if the element at the mid is great than the right most element
			int mid = left+ (right -left)/2;
			if (publishDate[mid] > publishDate[right])
			{
				left = mid+1;
			}else
			{
				//otherwise smallest element is at the left or mid
				right = mid;
			}
		}//end of while loop
		//at the end of the loop, when left = right, which is the index  of the smallet element
		return publishDate[left];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []bookDate = {5,6,7,12,2,3,4};
		int answer = findBook(bookDate);
		System.out.println("The oldest published book was on " + answer);

	}

}
