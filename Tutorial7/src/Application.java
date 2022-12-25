import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		// Output the prompt
		System.out.println("Enter a floating point value: ");
		
		double value = 0d;
		
		// Wait for the user to enter something;
		while (!input.hasNextDouble()) {
			System.out.println("That is not a double!");
			input.next();
		}
		
		value = input.nextDouble();
		
		
		// Tell them what they entered.
		System.out.println("You entered: " + value);
	}

}
