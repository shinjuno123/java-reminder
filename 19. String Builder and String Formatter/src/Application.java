
public class Application {

	public static void main(String[] args) {

		// Inefficient
		// Creates new combined String
		// and Reassign the string to a variable again
		String info = "";

		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";

		System.out.println(info);

		// More efficient!
		// This just modifies the content of the existing string builder.
		StringBuilder sb = new StringBuilder("");

		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");

		System.out.println(sb.toString());

		StringBuilder s = new StringBuilder();

		s.append("My name is Roger.").append(" ").append("I an a skydiver.");

		System.out.println(s.toString());

		////// Formatting

		System.out.println("Here is some text.\tThat was a tab.\nThat was a newline.");
		System.out.println("More text.");
		
		// Formatting integers
		System.out.printf("Total cost: %-10d; quantitiy is %d\n", 5, 120);
		
		for (int i = 0; i < 20; i++) {
			System.out.printf("%-2d: %s\n",i,"Here is some text");
		}
		
		// Formatting floating point value.
		// This rounds up the value automatically.
		System.out.printf("Total value: %.2f\n", 5.6856);
		System.out.printf("Total value: %-6.1f\n", 343.25423);
	}

}
