interface Executable { // functional interface
	// interface with only one method == functional interface!
	int execute(int a, int b);
}

interface StringExecutable { // functional interface
	int execute(String a);
}

class Runner {
	public void run(Executable e) {
		System.out.println("Executing code block ...");
		int value = e.execute(12, 30);
		System.out.println("Return value is: " + value);
	}
	
	/*
	public void run(StringExecutable e) {
		System.out.println("Executing code block ...");
		int value = e.execute("Hello");
		System.out.println("Return value is: " + value);
	}
	*/
}

/*
 * Lambda () -> {
 * System.out.println("This is code passed in a lambda expression");
 * System.out.println("Hello there"); }
 */

/*
 * () -> { System.out.println("This is code passed in a lambda expression");
 * System.out.println("Hello there"); return 8; }
 */

// {return 8;}

// () -> 8

// (int a) -> 7 + a

/*(int a) -> {
			System.out.println("Hello there.");
			return 7 + a;
		}
*/

/*(a) -> {
			System.out.println("Hello there.");
			return 7 + a;
		}
*/

/*
(a, b) -> {
			System.out.println("Hello there.");
			return a + b;
		}
*/

public class App {
	

	public static void main(String[] args) {
		
		int c = 100;
		
		// Must not do this: c = 8;
		
		int d = 77;
		
		Runner runner = new Runner();
		runner.run(new Executable() {
			public int execute(int a, int b) {
				System.out.println("Hello there");
				// Can do this in methods of ananymous classes int d = 8;
				return c + a + b;
			}
		});

		System.out.println("=======================");

		// Lambda is associated with interfaces that have single method.
		runner.run( (a, b) -> {
			System.out.println("Hello there.");
			// Can't do this! no new scope.. int d = 99;
			return a + b + c;
		});
		
		Executable ex = (a, b) -> {
			System.out.println("Hello there.");
			// Can't do this! no new scope.. int d = 99;
			return a + b + c;
		};
		
		runner.run(ex);
		
		
		Object codeBlock = (Executable)(a, b) -> {
			System.out.println("Hello there.");
			// Can't do this! no new scope.. int d = 99;
			return a + b + c;
		};
		
		

	}

}
