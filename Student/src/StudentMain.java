
import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int total = 0;//initialize the sum of grades entered by the user 
		int counter = 1; //initialized to keep the track of how many grades are entered
		int c = 5;
		System.out.println("post increment of c" + c++); // prints 5
		System.out.println("After post increment of c" + c);
		c = 5;
		System.out.println("prefix increment of c" +  ++c); // prints 5
		System.out.println("After prefix of c" + c);
		//using a counter controlled while loops 
		while(counter <=10)
		{
			System.out.print("Enter the grade: ");
			int grade = input.nextInt();
			total = total + grade;
			counter +=1; // increment by 1
			
		}
		double average = total/counter;
		System.out.printf("%nTotal all of ten grade is %d%n", total );
		System.out.printf("Average of ten grade is %.2f%n", average );
		StudentClass student = new StudentClass("Daniela Amelia", 1.6);
		
		System.out.printf("%s's Letter grade is : %s%n", student.getName(), student.getLetterGrade());
		
		int numTotal = 0;
		int gradeCounter =0;
		System.out.print("Enter the grade or -1 to quit: " );
		int grades = input.nextInt();
		while(grades != -1)
		{
			numTotal = numTotal + grades;
			gradeCounter += 1;
			//prompt for input and the read next grade from user
			System.out.print("Enter the grade or -1 to quit: " );
		    grades = input.nextInt();
			
		}
		if (gradeCounter != 0)
		{
			double averageGrades = (double) numTotal /gradeCounter;
			System.out.printf("%nTotal all of %d grade is %d%n", gradeCounter,numTotal );
			System.out.printf("Average of ten grade is %.2f%n", averageGrades );
		}else
		{
			System.out.print("No grade was entered ");
		}
			

	}

}
