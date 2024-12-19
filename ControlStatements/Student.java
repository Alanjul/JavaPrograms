//student class that stores the name and grade average
public class Student {
	private String name;
	
	private int counter;
	private  double total;
	
	//constructor to initialize the instance variables
	public Student(String name)
	{
		this.name = name;
		this.counter = 0;
		this. total = 0;
		
		//validate that the average is great than 0
		
		
	}
	//set the name of the student
	public void setName(String name)
	{
		this.name = name;
	}
	
	//return the name
	public String getName()
	{
		return name;
	}
	
	//set average
	
	public void addGrade(int grade)
	{
		total += grade;
		counter++;
	}
	//return the average
	public double getAverage()
	{
		return total / counter;
	}
  //determine and return the grade letter
	public String getLetterGrade()
	{
		double average = getAverage();
		String gradeLetter = "";
		if (average >= 90.0 )
		{
			gradeLetter = "A";
		}
		else if (average >= 80.0)
		{
			gradeLetter = "B";
		}
		else if (average >= 70.0)
		{
			gradeLetter = "C";
			
		}
		else if (average >= 60.0)
		{
			gradeLetter = "D";
		}
		else
		{
			gradeLetter = "F";
		}
		return gradeLetter;
	}
}
