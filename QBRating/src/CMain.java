import java.util.Scanner;

public class CMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Asking the user for numerical inputs for data
		
		System.out.print("Enter the number of passes completed: ");
		double pass_completion = input.nextDouble();
		System.out.print("Enter the number of passes attempted: ");
		double attempts = input.nextDouble();
		System.out.print("Enter the total yardage made by the QB: ");
		double total_yard = input.nextDouble();
		System.out.print("Enter the number of touchdowns made: ");
		double touchdowns = input.nextDouble();
		System.out.print("Enter the number of interceptions given up: ");
		double interceptions = input.nextDouble();
		
		double completion_rate = ((pass_completion / attempts) - .3) * 5;
		double yard_per = ((total_yard / attempts) - 3) * .25;
		double touchdown_rate = (touchdowns / attempts) * 20;
		double interception_rate = 2.375 - ((interceptions / attempts) * 25);
		
		double rating = ((completion_rate + yard_per + touchdown_rate + interception_rate) / 6) * 100;
		
		System.out.print("This quarterback's rating is " + rating);
		
		input.close();

	}

}
