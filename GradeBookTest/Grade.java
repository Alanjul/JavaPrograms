
public class Grade {
	private String courseName; //representing the name of the course
	private int grades[]; // An integer array of grades
	
	//constructor to initialize the instance variables
	public Grade(String courseName, int[]grades)
	{
		// instance variable  initialized
		this.courseName = courseName; 
		this.grades = grades;
	}
	//method to set the name of the course
	public void setName(String courseName)
	{
		this.courseName = courseName;
	}
    //get the courseName to retrieve the name of course
	public String getCourseName()
	{
		return this.courseName;
	}
	
	//processing the grade
	public  void processGrade()
	{
		//display the grades array
		displayGrade();
		
		//call getAverage message to display class average grade
		System.out.printf("The class average grade is %.2f%n", getAverage());
		
		//Display the lowest and highest by calling getMax and GetMin grade
		System.out.printf("Lowest grade: %d%nHighest: %d%n%n", getMin(), getMax());
		
		//display bar chart distribution of grades
		
		displayBarChar();
		
	}
	//get minimum grade
	public int getMin()
	{
		//assign the first element in array as lowest
		int lowest = grades[0];
		for (int grade : grades)
		{
			if (lowest > grade)
			{
				lowest = grade;
			}
		}
		return lowest;
	}
	//get highest grade
	public int getMax()
	{
		int high = grades[0]; //assign the first element as highest
		//loop through grades array
		for (int grade : grades)
		{
			if (high < grade)
			{
				high = grade;
			}
		}
		return high;
	}
	//getAverage to find the average of of all grades
	public double getAverage()
	{
		int total = 0; //calculate total grades
		 //track number of grades in arry
		for (int i =0; i < grades.length; i++)
		{
			total += grades[i];
		}
		//return average
		
		return (double) total/grades.length;
		
	}
	public void displayGrade()
	{
		System.out.println("Grades:") ;
		
		for (int student = 0; student < grades.length; student++)
		{
			//print student number and their grades
			System.out.printf("%d : %d%n", student+1, grades[student]);
		}
	}
	//display grade distribution bar char
	public void displayBarChar()
	{
		int[]frequency = new int[11]; //array frequency initialized with 11 elements
		
		System.out.println("Grade Distribution bar");
		//for each grade increment appropriate frequency
		for (int grade : grades)
		{
			++frequency[grade/10];
		}
		for (int count = 0; count < frequency.length;count++)
		{
			
			if(count == 10)
			{
				System.out.printf("%5d ", 100);
			}
			else
			{
				System.out.printf("%02d - %02d "  ,count*10, count *10 +9);
			}
			//display bar chart of asteriks
			for (int i = 0; i < frequency[count]; i++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
	
}//end of class grade
