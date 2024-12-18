
import java.util.Scanner;
public class Welcom {
	//method counts that calculates tripple sum to zero
	public static int counts (int []a)
	{
		int n = a.length;
		int count =0;
		//a tripple for loops that checks each trip i j, k
		for ( int i = 0; i < n ; ++i)
		{
			for (int j = i +1; j < n; ++j)
			{
				for (int k = j + 1; k < n; ++k)
				{
					if (a[i] + a[j] + a[k] == 0)
					{
					
						count ++;
					}
				}
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.printf("%s%n%s%n", "Welcome to", "Java programing");
		//anything starting with a capital letter is class name
		Scanner input = new Scanner(System.in);
		int num1; //first number to add
		int num2; //second number to add
		int sum; // sum of two numbers 
		System.out.print("Enter the first number: "); // prompts users
		num1 = input.nextInt();
		System.out.print("Enter the second number: ");
		num2 = input.nextInt();
		sum = num1 + num2; //add two numbers and store them into sum
		System.out.printf("Sum is %d%n", sum);
		
		if(num1 == num2)
		{
			System.out.printf("%d == %d%n",num1, num2);
		}else if (num1 != num2)
		{
			System.out.printf("%d != %d%n",num1, num2);
		}
		int []a = {30,-20,-10,-40,0,40,10,10};
		int result = counts(a);
		
		System.out.println("The sum of the three tripple is " +result);
		
	}

}
