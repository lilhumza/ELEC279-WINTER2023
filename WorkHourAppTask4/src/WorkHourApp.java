import java.util.Scanner;
public class WorkHourApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); //Create Scanner instance
		
		int hoursPerDay = 0, numDays = 0; //Declare and initialize integer variables
		
		System.out.println("Please enter the number of hours per day: "); //Prompt user for hours
		hoursPerDay = input.nextInt(); //Assign value of hours to int
		
		System.out.println("Please enter the number of days: "); //Prompt user for day
		numDays = input.nextInt(); //Assign value of days to int
		
		input.close(); //Close scanner
		
		//For loop to print out cumulative sum of hours worked as days iterate
		for (int i = 1; i <= numDays; i++) {
			System.out.println("Day "+i+": Total Hours Worked = " +i*hoursPerDay);
		}
		
		
		

	}

}
