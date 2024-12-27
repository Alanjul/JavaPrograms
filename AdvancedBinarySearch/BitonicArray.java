
//Bitonic array starts at steadily at beginning until the peak, then flows
public class BitonicArray {
	public static int findPeak(int[]temp)
	{
		int low = 0;
		int high = temp.length-1;
		//traverse through the array
		while(low < high)
		{
			//find mid element in arry
			int mid = low + (high - low)/2;
			//checking if the mid element is greater by the successive element
			if (temp[mid] > temp[mid+1])
			{
				high = mid;//peak on the left side of the array or mid
			}
			else
			{
				low = mid + 1; //peak on the right side
			}
			
		}
		return low; // returns the index of peak temperature
	}
	//modified binary tree method to if the array is ascending or descending
	public static int BinarySearch(int[]temp, int low, int high, int targetTemp,boolean ascending)
	{
		
		while (low <= high)
		{
			int mid = low + (high - low)/2;
			if (temp[mid]== targetTemp)
			{
				return mid;
			}
		
			//checking if ascending is false or true
			if( ascending ? temp[mid]< targetTemp : temp[mid] > targetTemp)
			{
				low = mid+1;
			}
			else
			{
				high = mid -1;
			}
			/*The binary search for ascending and descending
			 * if (ascending)
			 *    if(temp[mid] < targetTemp)
			 *    { low = mid+1;
			 *    }else
			 *    { high = mid -1;}
			 * else {
			 *      if(temp[mid] > targetTemp){
			 *      low = mid+1;
			 *      }else{high = mid-1;}
			 * }*/
			
			
			
		}
		return -1; //no result found
		
	}
    public static int binarySearchBitonic(int[]temp,int targetTemp)
    {
    	int peakTemp = findPeak(temp);//find peak temp
    	//apply the binary search after finding the peek to call binary search in ascending order
    	int searchResult = BinarySearch(temp,0,peakTemp,targetTemp,true);
    	if (searchResult != -1)
    	{
    		return searchResult;
    		
    	}else
    	{//binarySearch is called in descending order
    		return BinarySearch(temp, peakTemp+1,temp.length-1, targetTemp, false );
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []temp = {1,2,4,5,12,6,3};
		int target = 5 ;
		int result = binarySearchBitonic(temp,target);
		System.out.println("The result is " + result);

	}

}
