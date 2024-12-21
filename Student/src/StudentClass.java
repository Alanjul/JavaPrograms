//Student class that stores student name and average
public class StudentClass {
  private String name;
  private double average;
  
  //constructor initializes the average and names
  public StudentClass(String name, double average)
  {
	  this.name = name;
	  //validate that average is > 0
	  if (average > 0.0)
		  if (average <= 100)
			  this.average = average;
  }
  public void setName(String name)
  {
	  this.name = name;
  }
  public void setAverage(double average)
  {
	  if (average < 0 && average <= 100)
	  {
		  this.average = average; //assign to instance
	  }
  }
  public String getName()
  {
	  return name;
  }
  public double getAverage()
  {
	  return average;
  }
  public String getLetterGrade()
  {
	  String letterGrade = ""; //initialize empty string
	  if (average >= 90.0)
	  {
		  letterGrade = "A";
	  }else if(average >= 80.0)
	  {
		  letterGrade = "B";
	  }else if( average >= 70.0)
	  {
		  letterGrade = "C";
	  }
	  else if (average >= 60.0)
	  {
		  letterGrade = "D";
	  }else
	  {
		  letterGrade = "F";
	  }
	  return letterGrade;
  }
}
