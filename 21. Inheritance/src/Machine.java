
public class Machine {
	
	// If you declared a variable as string,
	// You can only access it within the class.
	
	// protected means you can access this
	// anywhere within package and also child class.
	
	// Override methods only!
	protected String name = "Machine Type 1";
	
	public void start() {
		System.out.println("Machine started.");
	}
	
	public void stop() {
		System.out.println("Machine stopped.");
	}
}
