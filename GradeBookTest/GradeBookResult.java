//GradeBOOL Result creates and array of grades and 
//then invokes process grades methods
public class GradeBookResult {
	

	public static void main(String[] args) {
		//one dimension array to hold students grades
		int[]grades = {87,62,95,10,5,17,100, 26,79,90};
		Grade myGrade = new Grade("Introduction to python Programming", grades);
		System.out.printf("Welcome to grades for %n%s%n%n" , myGrade.getCourseName());
		myGrade.processGrade();//call process grade

	}

}
