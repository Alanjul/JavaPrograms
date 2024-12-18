import java.util.Scanner;
public class JavaWelcome {
	public static  void main(String[]args)
	{
		System.out.print("welcome" );
		System.out.println(" \nto Java \nprogramming!");
		System.out.printf("%s%n%s%n", "Welcome to", "Java programming");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integer1: ");
		int integer1 = input.nextInt();
		System.out.print("Enter integer2: ");
		int integer2 = input.nextInt();
		if(integer1 == integer2)
		{
			System.out.printf("%d == %d%n", integer1, integer2);
		}
		if(integer1 != integer2)
		{
			System.out.printf("%d != %d%n", integer1, integer2);
			
		}
		if(integer1 >= integer2)
		{
			System.out.printf("%d >= %d%n", integer1, integer2);
			
		}
		if(integer1 <= integer2)
		{
			System.out.printf("%d <= %d%n", integer1, integer2);
			
		}
		
		int total = integer1 + integer2;
		System.out.println("The total is " + total);
	}

}
