public class Car extends Machine{
	
	
	// If you really want to check this method is overridden.
	// Use Override annotation.
	@Override 
	public void start() {
		System.out.println("Car started");
	}

	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}
	
	public void showInfo() {
		System.out.println("Car name: " + name);
	}
	
	
}
