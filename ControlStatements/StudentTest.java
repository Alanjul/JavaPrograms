import java.util.Scanner;
//create and test student object
public class StudentTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Student account1 = new Student("Alan ");
		Student student2 = new Student("Daniel");
		
		
		int counter = 1;
		System.out.println("Enter grade for " + account1.getName() + ". ");
		while (counter <= 4)
		{
			System.out.print("Enter Grade: ");
			int grade = input.nextInt(); // input next grade
			account1.addGrade(grade);
			counter = counter + 1; // increment by 1
		}
		
		
		System.out.printf("%s's grade average %.2f letter grade is : %s%n", account1.getName(),account1.getAverage(), account1.getLetterGrade());
		
		//adding grade to daniela account
		System.out.println("Enter grade for " + student2.getName() + ". ");
		
		int counter2 = 1;
		while (counter2 <= 5)
		{
			System.out.print("Enter Grade: ");
			int grade = input.nextInt(); // input next grade
			student2.addGrade(grade);
			counter2= counter2 + 1; // increment by 1
		}
		
		
		System.out.printf("%s's grade average %.2f letter grade is : %s%n", student2.getName(),student2.getAverage(), student2.getLetterGrade());
		

	}

}
